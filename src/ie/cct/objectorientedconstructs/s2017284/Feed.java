/**
 * @author Taras Boreyko 2017284
 */

package ie.cct.objectorientedconstructs.s2017284;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

import java.util.ArrayList;



public class Feed implements FeedInterface {

    //initialize new ArrayList of feedItems
    private static ArrayList<FeedItem> list = new ArrayList<FeedItem>();

    //constructor of feed
    public Feed(FeedItem item){
        list.add(item);

    }

        //getter for our array list that will be used in FeedList class
    public static ArrayList<FeedItem> getList() {
        return list;
    }

    @Override
    public ArrayList<String> listTitles() {

        //initialize new String array list where will be hold the titles
        ArrayList<String> arrayOfTitels = new ArrayList<>();


        //foreach loop that will go through the array and use method getTitle
        //from feedItem to add titles to the string array
        for (FeedItem feedItem :
                list) {
            arrayOfTitels.add(feedItem.getTitle());
        }
        return arrayOfTitels;
    }

    @Override
    public FeedItem getItem(String title) {


        //using as well foreach loop to check if list have title with word that passing
        //and by toLowerCase method change all strings to lower case and check if list contains this strings in title
        //if yes than return this item if found nothing will return null.
        for (FeedItem feedItem :
                list) {
            if (feedItem.getTitle().toLowerCase().contains(title.toLowerCase())) {

              return feedItem;
            }

        }
        return null;
    }

    @Override
    public int numItems() {

        return list.size(); //in this part just use method size which return integer with numbers of elements in list
    }

    @Override
    public ArrayList<FeedItem> findItems(String keyword) {

        ArrayList<FeedItem> arrayOfKeywords = new ArrayList<>();
        //In this method everything is similar to the getItem method but we will check and title and content
        //and after add it to arrayList of FeedItems if contains keyword and return this arrayList
        for (FeedItem feedItem:
             list) {
         if(feedItem.getTitle().toLowerCase().contains(keyword.toLowerCase())
                 || feedItem.getContent().toLowerCase().contains(keyword.toLowerCase())){
             arrayOfKeywords.add(feedItem);
         }
        }

       return arrayOfKeywords;
    }


}

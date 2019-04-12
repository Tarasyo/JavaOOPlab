/**
 * @author Taras Boreyko 2017284
 */



package ie.cct.objectorientedconstructs.s2017284;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;
import ie.cct.objectorientedconstructs.FeedListInterface;

import java.util.ArrayList;

public class FeedList implements FeedListInterface {


    private static ArrayList<Feed> feedList = new ArrayList<Feed>();



    @Override
    public void addFeed(FeedInterface f) {

        this.feedList.add((Feed) f); //adding new feed to uor list using casting to 'f' behave like feed object

    }

    @Override
    public boolean removeFeed(FeedInterface f) {


        //remove method actually returns boolean
        // so its will sent true if removed or false if note
        return feedList.remove(f);
        

    }

    @Override
    public ArrayList<String> listTitles() {
        ArrayList<String> arrayOfTitels = new ArrayList<>();

        //in general the listTitle is the same like in feed but
        //we need to create one more loop to go through feedList arrayList and
        //after through all feed arraysLists that are stored in feedList
        //Its why was created getter for list from feed of feedItems
        for (Feed feed :
                feedList) {
            for (FeedItem feedItem :
                    feed.getList()) {
                arrayOfTitels.add(feedItem.getTitle());
            }
        }
        return arrayOfTitels;
    }

    @Override
    public FeedItem getItem(String title) {

        //The same way like in feed just with one more foreach loop
        // and using getter from feed to get arrayList of feedItems
        for (Feed feed :
                feedList) {
            for (FeedItem feedItem :
                    feed.getList()) {

                if (feedItem.getTitle().toLowerCase().contains(title.toLowerCase())) {

                    return feedItem;
                }

            }

        }
        return null;
    }

    @Override
    public int numItems() {


        return feedList.size();
    }

    @Override
    public ArrayList<FeedItem> findItems(String keyword) {
        //And in this method as well all the same just with one more loop
        // and using getter to get list of feedItems
        ArrayList<FeedItem> arrayOfKeywords = new ArrayList<>();
        for(Feed feed :
                feedList)
        for (FeedItem feedItem:
                feed.getList()) {
            if(feedItem.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || feedItem.getContent().toLowerCase().contains(keyword.toLowerCase())){
                arrayOfKeywords.add(feedItem);
            }
        }

        return arrayOfKeywords;
    }
}

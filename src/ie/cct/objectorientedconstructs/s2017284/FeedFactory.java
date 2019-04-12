/**
 * @author Taras Boreyko 2017284
 */



package ie.cct.objectorientedconstructs.s2017284;


import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FeedFactory implements FeedFactoryInterface {



    @Override
    public Feed createFeed(BufferedReader in) throws IOException {


        Feed feed = null;
        String title;
        String content;

        //while loop to read from file line by line until its will be null, first title than content
        while (((title = in.readLine()) != null)  &&  ((content = in.readLine()) != null)) {

            //Create new instance of FeedIteam and passing title and content
            FeedItem item = new FeedItem(title, content);

            feed = new Feed(item);  //and new feed and passing feed

        }

        return feed;
    }

    @Override
    public FeedList createFeedList() {

        //new instance of feedList
        FeedList feedList = new FeedList();

        return feedList;
    }
}

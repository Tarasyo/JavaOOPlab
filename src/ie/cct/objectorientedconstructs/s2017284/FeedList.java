package ie.cct.objectorientedconstructs.s2017284;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;
import ie.cct.objectorientedconstructs.FeedListInterface;

import java.util.ArrayList;

public class FeedList implements FeedListInterface {
    @Override
    public void addFeed(FeedInterface f) {

    }

    @Override
    public boolean removeFeed(FeedInterface f) {
        return false;
    }

    @Override
    public ArrayList<String> listTitles() {
        return null;
    }

    @Override
    public FeedItem getItem(String title) {
        return null;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public ArrayList<FeedItem> findItems(String keyword) {
        return null;
    }
}

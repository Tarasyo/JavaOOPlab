package ie.cct.objectorientedconstructs.s2017284;


import ie.cct.objectorientedconstructs.FeedFactoryInterface;

import java.io.BufferedReader;
import java.io.IOException;

public class FeedFactory implements FeedFactoryInterface {
    @Override
    public Feed createFeed(BufferedReader in) throws IOException {
        return null;
    }

    @Override
    public FeedList createFeedList() {
        return null;
    }
}

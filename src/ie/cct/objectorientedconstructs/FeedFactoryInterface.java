/**
 * @author amilcar
 */

package ie.cct.objectorientedconstructs;

import java.io.BufferedReader;
import java.io.IOException;

// You must change these imports!
import ie.cct.objectorientedconstructs.s2017284.Feed;
import ie.cct.objectorientedconstructs.s2017284.FeedList;

public interface FeedFactoryInterface {
	
	
	/**
	 * This method returns an instance of your Feed class
	 *  
	 * @param  in - the buffered reader of to get the feedItems 
	 * 		   from a file
	 * @return the instance of the class Feed
	 * 
	 */
	public Feed createFeed(BufferedReader in) throws IOException;
  
	/** 
	 * This method returns an instance of your FeedList class
	 * 
	 * @return the instance of the class FeedList
	 * 
	 */
	public FeedList createFeedList();
}
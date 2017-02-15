package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by bos on 2/14/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public void addTweet(Tweet tweet){
        tweets.add(tweet);
        //should throw an illegalArgumentException when one tries to add a duplicate tweet
    }
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
        //should return true if there is a tweet that equals() another tweet
    }
    public Tweet getTweet(int position){
        return tweets.get(position);
    }
    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet tweet, Tweet t1) {
                return tweet.getDate().compareTo(t1.getDate());
            }
        });
        return tweets;
        //getTweets should return a list of tweets in chronological order
    }
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }
    public int getCount() {
        return tweets.size();
        //should accurately count up the tweets
    }
}

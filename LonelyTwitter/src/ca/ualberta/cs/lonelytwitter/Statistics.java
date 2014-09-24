package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Statistics
{
	private Integer numTweets;
	private Integer avgLength;
	private TimeUnit avgLatency;
	
	public Statistics(){
		super();
	}
	
	public void calcNumTweets(ArrayList<Tweet> tweets) {
		this.numTweets = tweets.size();
	}
	
	public void calcAvgLength(ArrayList<Tweet> tweets) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		while (tweets.iterator().hasNext()) {
			lengths.add(tweets.iterator().next().getTweetBody().length());
		}
		int sum = 0;
		for (int i : lengths)
			sum += i;
		this.avgLength = sum/tweets.size();
	}

	
	public Integer getNumTweets()
	{
	
		return numTweets;
	}

	
	public void setNumTweets(Integer numTweets)
	{
	
		this.numTweets = numTweets;
	}

	
	public Integer getAvgLength()
	{
	
		return avgLength;
	}

	
	public void setAvgLength(Integer avgLength)
	{
	
		this.avgLength = avgLength;
	}

	
	public TimeUnit getAvgLatency()
	{
	
		return avgLatency;
	}

	
	public void setAvgLatency(TimeUnit avgLatency)
	{
	
		this.avgLatency = avgLatency;
	}
	
	@Override
	public String toString() {
		return " Number of tweets: " + numTweets + "\nAverage length of tweets: " + avgLength;
	}
	
}

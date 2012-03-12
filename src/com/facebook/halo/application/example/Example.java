package com.facebook.halo.application.example;

import java.util.List;

import com.facebook.halo.application.types.User;
import com.facebook.halo.application.types.connection.Feed;
import com.facebook.halo.application.types.connection.Friends;
import com.facebook.halo.framework.common.AccessToken;
import com.facebook.halo.framework.core.Connection;


public class Example {
	static User user = new User();
	
	public static void main(String args[]) {
		
		//set accessToken
		AccessToken.setAccessToken("AAACEdEose0cBAPm7FGBQTWcINXZCdaWxygKmq8OAsBiH5lUZBXyxH3CWYWsO8HWMKOJUUYRvB08OGZCPeDJHS7KIiWQmBtGb1DzB6iDaGDg0LFbG7HY");
		
		//create instance of me
		user = user.createInstance("me");
		
		getMyFeeds();
		getMyFriends();
		getMyInfo();
		publishFeed();
		likeObject();
	}
	
	/**
	 * like specific object(photo, feed ..)
	 * like feed contains "test" string in my timeline.
	*/
	public static void likeObject() {
		//Get my Feeds and like contains "test" string
		Connection<Feed> feeds = user.feeds();
		for (List<Feed> myFeeds : feeds)
			for (Feed feed : myFeeds) 
				if (feed.getMessage() != null && feed.getMessage().contains("test")) {
					user.publishLikes(feed.getId());
					return;
				}
	}
	
	/**
	 * Get user information(my information)
	*/
	public static void getMyInfo() {
		//Get my Name, Gender and Birthday
		System.out.println("my Name : " + user.getFirstName());
		System.out.println("my Gender : " + user.getGender());
		System.out.println("my Birthday : " + user.getBirthday());
	}
	
	/**
	 * Get user connection
	 * get user's friends
	 */
	public static void getMyFriends() {
		//Get my Friends
		Connection<Friends> friends = user.friends();
		for (List<Friends> myFriends : friends)
			for (Friends users : myFriends)
				System.out.println("My friends: " + users.getName());
	}
	
	/**
	 * Get user connection
	 * get user's timeline feeds
	 */
	public static void getMyFeeds() {
		//Get my Feeds
		Connection<Feed> feeds = user.feeds();
		for (List<Feed> myFeeds : feeds)
			for (Feed feed : myFeeds) 
				if (feed.getMessage() != null)
					System.out.println("my Feeds :" + feed.getMessage());
	}
	
	/**
	 * publish Feed(Write to Mikyung Kang's timeline)
	*/
	public static void publishFeed() {
		//set feed inforamtion
		Feed feed = new Feed();
		feed.setMessage("Message Test");
		feed.setCaption("Caption Test");
		feed.setDescription("Description Test");
		feed.setPicture("http://220.67.124.66/test.jpg");
		
		//set target user Id(MiKyung Kang)
		String targetUserId = null;
		Connection<Friends> friends = user.friends();
		for (List<Friends> myFriends : friends)
			for (Friends users : myFriends)
				if(users.getName().equals("MiKyung Kang")) {
					targetUserId = users.getId();
				}
		
		user.publishFeed(targetUserId, feed);
	}
	
}

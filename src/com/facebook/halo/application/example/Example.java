package com.facebook.halo.application.example;

import java.util.List;

import com.facebook.halo.application.handler.Search;
import com.facebook.halo.application.types.Comment;
import com.facebook.halo.application.types.Event;
import com.facebook.halo.application.types.Post;
import com.facebook.halo.application.types.Post.Place;
import com.facebook.halo.application.types.User;
import com.facebook.halo.application.types.connection.Feed;
import com.facebook.halo.application.types.infra.FacebookType;
import com.facebook.halo.framework.annotation.SessionStore;
import com.facebook.halo.framework.core.Connection;

public class Example {
	public static void main(String args[]) {
//		Message msg = new Message();
//		msg = msg.createInstance("327730333904284_310");
//		System.out.println(msg.getCreatedTime());
		
		SessionStore.setAccessToken("AAAEmINgtKV8BALF5VAkJwa6t8zufPju2YOSWZBPZA5ZBH3btTbKBm44sl1lBAlJZCQHlzHdaon6DGMr3e35qvqT4wJvNfdyZCF1ulWnUAtAZDZD");
		User user = new User();
		user = user.createInstance("me"); 
		System.out.println(user.getFirstName());
		System.out.println(user.getUpdatedTime());
		
//		Feed feed = new Feed();
//		feed.setMessage("hello");
//		feed.setLink("http://www.facebook.com");
//		feed.setPicture("http://220.67.124.66/me.jpg");
//		feed.setDescription("硫띿땐��);
//		FacebookType type = user.publishFeed("100002274717846", feed);
//		System.out.println("FEED : " + type.getId());
		
//		boolean bLike = user.publishLikes("100001428910089_311469062244055");		// Return Boolean
//		System.out.println("Comments : " + bLike);
		
		
/*		

		
		Comments comments = new Comments();
		comments.setMessage("�뚯뒪�명듃�명듃");
		type = user.publishComments("100001428910089_311469062244055", comments);
		System.out.println("Comments : " + type.getId());
		
		boolean bLike = user.publishLikes("100001428910089_311469062244055");		// Return Boolean
		System.out.println("Comments : " + bLike);
		
		
		Links links = new Links();
		links.setMessage("naver 留곹겕");
//		links.setLink("http://www.naver.com");
		links.setName("�ㅼ씠踰�留곹겕 �뚯뒪��);
		FacebookType type = user.publishLinks(links);
		System.out.println("Links : " + type.getId());
		
		Albums albums = new Albums();
//		albums.setMessage("�좊━諛��ъ쭊2");
		albums.setName("�좊━諛�");
		FacebookType type = user.publishAlbums("me", albums);
		System.out.println("Albums : " + type.getId());
		
		Photos photos = new Photos();
		photos.setMessage("�뚯뒪��);
//		photos.setSource("http://220.67.124.66/me.jpg");
		photos.setSource("C:\\player\\IMG_1032.JPG");
		photos.setFileName("�뚯뒪���ъ쭊_�섑븯");
		FacebookType type = user.publishPhotos("311580792232882", photos);
		System.out.println("Photos : " + type.getId());
		
		Checkins checkins= new Checkins();
		checkins.setMessage("");
		List<String> tags = new ArrayList<String>();
		tags.add("100002274717846");
		tags.add("100001066448386");
		checkins.setTags(tags);
		checkins.setCoordinates("36.436406", "128.024883");
		checkins.setPlace("228600137193828");
		FacebookType type1 = user.publishCheckins(checkins);
		System.out.println("Checkins : " + type1.getId());
	
//		System.out.println(user.delete("100001428910089_312101915514103"));*/

 
//		https://graph.facebook.com/search?fields=name&q=conference&type=event
		
		// 댓글 불러오기
		Connection<Comment> commentList = user.comments("100000525744525_104035079727311");
		for (List<Comment> comments : commentList)
			for (Comment post : comments) 
				System.out.println("Comments : " + post.getId() + " / message : " + post.getMessage());
	
		
		Search search = new Search();
		Connection<Event> events = search.search("name, location","conference", "event", Event.class);
		
		for (List<Event> eventList : events)
			for (Event event : eventList) 
				System.out.println("Event: " + event.getName() + " / time : " + event.getLocation());
					
//		Places: https://graph.facebook.com/search?q=coffee&type=place&center=37.76,122.427&distance=1000
		Connection<Place> places = search.searchPlace(null, "coffee", "37.76", "122.427", 1000);
		for (List<Place> placeList : places)
			for (Place place : placeList) 
				System.out.println("Place: " + place.getName() + " / city : " + place.getLocation().getCity());
		
		
		/********************** FQL EXAMPLE **********************/

		//SELECT name FROM user WHERE uid = me() 
//		FQL fql = new FQL(new String[]{Fields.USER.name, Fields.USER.birthday}, "user", new String[]{"uid=me()"});
//		Search search = new Search();
//		List<User> users = search.search(fql, User.class);
//		System.out.println(users.get(0).getBirthday());
		
		
		
		
		
		/************************************
		Connection<Friends> friends = user.friends();
		
		for (List<Friends> myFriends : friends)
			for (Friends users : myFriends)
				out.println("friends: " + users.getName());
		
		
		//family
		Connection<Family> families = user.family();
		for (List<Family> myFamilies : families)
			for (Family family : myFamilies) 
				out.println("families: " + family.getName() + " / relation : " + family.getRelationship());
		
		
		//feed & likes
		Long likes = 0L;
<<<<<<< .mine
		Connection<Post> feeds = user.feeds();
		for (List<Post> myFeeds : feeds)
			for (Post feed : myFeeds) {
				if(feed.getLikesCount() != null) 
=======
		Connection<Feed> feeds = user.feeds();
		for (List<Feed> myFeeds : feeds)
			for (Feed feed : myFeeds) {
				if (feed.getLikesCount() != null)
>>>>>>> .r28
					likes += feed.getLikesCount();

				if (feed.getMessage() != null)
					out.println("feeds " + feed.getMessage());
			}

				
		
		//album
		Connection<Album> albums = user.albums();
		for (List<Album> myAlbums : albums )
			for (Album album : myAlbums) {
				out.println("album :  " + album.getName());
			}
		
		
		*************************************/
	}
	
}

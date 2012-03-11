package com.facebook.halo.framework.common;
/**
 * Facebook Query Language(FQL) Tables
 * @author immk
 */
public class Arguments {
	
	/**
	 *  feed Table
	 */
	public class FEED {
		public final static String MESSAGE = "message";
		public final static String PICTURE = "picture";
		public final static String LINK = "link";
		public final static String NAME = "name";
		public final static String CAPTION = "caption";
		public final static String DESCRIPTION= "description";
		public final static String SOURCE = "source";
	}
	
	/**
	 *  comments Table
	 */
	public class COMMENTS {
		public final static String MESSAGE = "message";
	}
	
	/**
	 *  links Table
	 */
	public class LINKS {
		public final static String LINK = "link";
		public final static String MESSAGE = "message";
		public final static String PICTURE = "picture";
		public final static String NAME = "name";
		public final static String CAPTION = "caption";
		public final static String DESCRIPTION= "description";
		
	}
	
	/**
	 *  albums Table
	 */
	public class ALBUMS{
		public final static String NAME = "name";
		public final static String MESSAGE = "message";
	}
	
	/**
	 *  photos Table
	 */
	public class PHOTOS {
		public final static String MESSAGE = "message";
		public final static String SOURCE = "source";
	}
	
	/**
	 *  checkin Table
	 */
	public class CHECKIN {
		public final static String MESSAGE = "message";
		public final static String PLACE = "place";
		public final static String TAGS = "tags";
		public final static String COORDINAGE = "coordinates";
	}
}

package com.facebook.halo.application.types.connection;

import static com.facebook.halo.framework.formatter.DateUtils.toDateFromLongFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.facebook.halo.application.types.Comment;
import com.facebook.halo.application.types.infra.FacebookType;
import com.facebook.halo.application.types.infra.NamedFacebookType;

/**
 * User Object connection type
 * @author JM
 *
 */
public class Achievement {
	private String id;
	private NamedFacebookType from;
	private String createTime;
	private NamedFacebookType application;
	private Achieved achievement;
	private Likes likes;
	private Comments comments;
	
	public String getId() {
		return id;
	}

	public NamedFacebookType getFrom() {
		return from;
	}
	
	public Date getCreateTime() {
		return toDateFromLongFormat(createTime);
	}

	public NamedFacebookType getApplication() {
		return application;
	}

	public Achieved getAchievement() {
		return achievement;
	}

	public Likes getLikes() {
		return likes;
	}

	public Comments getComments() {
		return comments;
	}

	
	/**
	 * User Object connection Achieved type
	 * @author immk
	 *
	 */
	public static class Achieved extends FacebookType{
		private String url;
		private String title;
		
		public final String getUrl() {
			return url;
		}
		public final String getTitle() {
			return title;
		}
		
	}
	
	/**
	 * User Object connection Likes type
	 * @author immk
	 *
	 */
	public static class Likes{
		private Long count;
		private List<NamedFacebookType> data = new ArrayList<NamedFacebookType>();

		public final Long getCount() {
			return count;
		}

		public final List<NamedFacebookType> getData() {
			return data;
		}
	}
	
	/**
	 * User Object connection Comments type
	 * @author immk
	 *
	 */
	public static class Comments {
		private Long count;
		private List<Comment> data = new ArrayList<Comment>();
		
		public final Long getCount() {
			return count;
		}
		public final List<Comment> getData() {
			return data;
		}
		
	}
}

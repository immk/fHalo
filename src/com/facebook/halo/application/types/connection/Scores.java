package com.facebook.halo.application.types.connection;

import java.util.ArrayList;
import java.util.List;

import com.facebook.halo.application.types.infra.NamedFacebookType;

/**
 * User Object connection type
 * @author JM
 *
 */
public class Scores {
	
	List<ScoresInfo> data = new ArrayList<ScoresInfo>();
	
	public final List<ScoresInfo> getData() {
		return data;
	}
	/**
	 * User Object connection ScoresInfo type
	 * @author immk
	 *
	 */

	public class ScoresInfo extends NamedFacebookType{
		private int score;
		private NamedFacebookType application;
		
		public final int getScore() {
			return score;
		}
		public final NamedFacebookType getApplication() {
			return application;
		}
	
	}
}

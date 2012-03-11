package com.facebook.halo.application.types.connection;

import java.util.ArrayList;
import java.util.List;

/**
 * User Objects connection type
 * @author JM
 *
 */
public class Likes {
	List<LikesInfo> data = new ArrayList<LikesInfo>();

	public final List<LikesInfo> getData() {
		return data;
	}
	
}

package com.facebook.halo.application.types.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User Object connection type
 * @author JM
 *
 */
public class Permission {
	List<Map> data = new ArrayList<Map>();

	public final List<Map> getData() {
		return data;
	}
	
}

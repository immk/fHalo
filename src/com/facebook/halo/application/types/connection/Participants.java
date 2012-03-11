package com.facebook.halo.application.types.connection;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Thread Object Connection type
 * @author immk
 *
 */
public class Participants {
	List<ThreadInfo> data = new ArrayList<ThreadInfo>();

	public final List<ThreadInfo> getData() {
		return data;
	}
}

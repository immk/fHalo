package com.facebook.halo.application.types.connection;

import java.util.ArrayList;
import java.util.List;

import com.facebook.halo.application.types.Thread.ThreadInfo;

/**
 * Thread Object Connection type
 * @author immk
 *
 */

public class Senders {
	
	List<ThreadInfo> data = new ArrayList<ThreadInfo>();

	public final List<ThreadInfo> getData() {
		return data;
	}
}

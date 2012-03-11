package com.facebook.halo.application.types.connection;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Thread object connection type
 * @author immk
 *
 */

public class FormerParticipants {
	List<ThreadInfo> data = new ArrayList<ThreadInfo>();

	public final List<ThreadInfo> getData() {
		return data;
	}
}

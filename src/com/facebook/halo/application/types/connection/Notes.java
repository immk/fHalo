package com.facebook.halo.application.types.connection;

import java.util.ArrayList;
import java.util.List;

import com.facebook.halo.application.types.Note;

/**
 * User Object Connection type
 * Page Object Connection type
 * @author JM
 *
 */
public class Notes {
	List<Note> data = new ArrayList<Note>();

	public final List<Note> getData() {
		return data;
	}
}

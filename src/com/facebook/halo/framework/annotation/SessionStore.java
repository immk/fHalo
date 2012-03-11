package com.facebook.halo.framework.annotation;

public class SessionStore {
	/**
	 *  Save the AccessToken
	 */
	private static String accessToken ;

	public static String getAccessToken() {
		return accessToken;
	}

	public static void setAccessToken(String accessToken) {
		SessionStore.accessToken = accessToken;
	}
}

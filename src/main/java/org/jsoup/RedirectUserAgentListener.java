package org.jsoup;


public interface RedirectUserAgentListener {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	/**
	 * Returns User agent based on the url being crawled
	 * 
	 * @param url
	 * @return return user agent
	 */
	public String getUserAgent(String url);
}

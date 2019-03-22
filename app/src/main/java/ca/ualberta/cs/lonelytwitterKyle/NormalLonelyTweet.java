package ca.ualberta.cs.lonelytwitterKyle;

import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isTweetValid()
	{
		final int length = tweetBody.trim().length();
		if (length == 0 || length > 10) {
			return false;
		}
		return true;
	}

}
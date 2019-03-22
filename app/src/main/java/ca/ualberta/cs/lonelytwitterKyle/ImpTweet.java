package ca.ualberta.cs.lonelytwitterKyle;

import java.util.Date;

public class ImpTweet extends Tweet{
    public ImpTweet() {}

    public ImpTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    public boolean isTweetValid()
    {
        int length = tweetBody.trim().length();
        if (length == 0 || length > 10) {
            return false;
        }
        return true;
    }
}

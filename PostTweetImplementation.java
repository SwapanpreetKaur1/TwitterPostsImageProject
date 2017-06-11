package com.postsimage.totwitter;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 * Created by swapanpreetkaur on 6/11/17.
 */
public class PostTweetImplementation {

	
	public void postsImage() throws IOException {

		// Read the key,secert key,token,tokensecert from twitter4j.properties file
		Properties properties = new Properties();
		String fileName = "twitter4j.properties";
		FileInputStream fileInput = new FileInputStream(fileName);
		properties.load(fileInput);
		String consumerKeyStr= properties.getProperty("consumerKeyStr");
		String consumerSecretStr=properties.getProperty("consumerSecretStr");
		String accessTokenStr= properties.getProperty("accessTokenStr");
		String accessTokenSecretStr= properties.getProperty("accessTokenSecretStr");
	    
	    try {
			Twitter twitter = new TwitterFactory().getInstance();
			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr );
			AccessToken accessToken = new AccessToken(accessTokenStr,accessTokenSecretStr);
			twitter.setOAuthAccessToken(accessToken);
			StatusUpdate statusUpdate = new StatusUpdate("My Quote posts as an Image");
			//attach an image of Quote
			statusUpdate.setMedia("https://www.pinterest.com/pin/225531893819180797/", new URL("https://s-media-cache-ak0.pinimg.com/736x/28/f7/a0/28f7a06a1f76a48011c3ef72193ee902.jpg").openStream());
				//tweet or update status(Optional)
			Status status = twitter.updateStatus(statusUpdate);


			System.out.println("Successfully posted the Quote as an Image in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to Upload an Image: " + te.getMessage());
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}


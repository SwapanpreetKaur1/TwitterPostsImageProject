Interacting with the Twitter API in Java(Posts Quote as an Image in Twitter)

Objective : PostsImageToTwitter project mainly aims at posting a quote as an image in Twitter every time by using  Twitter API Wrapper– Twitter4J .

Technology Used:

Maven (Building Tool),
Java (Language),
Intellij

1. Define a new Twitter application

* Go to http://dev.twitter.com and sign in with your Twitter account
* Go to My applications and create a new application (put any URL you want in the Website field)
* After your application is created, go to the Settings tab and ensure the access is set to Read and Write


You can provide your  Twitter Link : To see the output of my project.

2. Create a new Maven project

* Intellij
    * Go to File > New Project, then select Maven ,then set Artifact is and Group id.
    * After Maven integration is installed, go to File > New > Project, then select Maven and then Maven Project


3. Add the twitter4j dependency

* Intellij
    * Open pom.xml in the Project Files folder and insert the following XML between the <dependencies></dependencies> tags:  <dependency>
    *       <groupId>org.twitter4j</groupId>
    *       <artifactId>twitter4j-core</artifactId>
    *       <version>[2.2,)</version>
    *   </dependency>
    
    * Select Run > Clean and Build Project


* Intellij
    * Open pom.xml in the project root, then click the Dependencies tab at the bottom, then click Add next to the dependencies list on the leff

       Now ,can see the twitter4j-core-4.0.4.jar under ExternalLibraries.

4.	Create the  twitter4j.properties file.

* Go to your project folder in your computer's file system .
* Create a plain text file called twitter4j.properties and insert the following (these values can be found in your application details on the Twitter developer site, http://dev.twitter.com): oauth.consumerKey=[your app's consumer key]
*  oauth.consumerSecret=[your app's consumer secret]
*  oauth.accessToken=[your access token]
*  oauth.accessTokenSecret=[your access secret.
 
Instructions to Run a Project

Run  com.postsimage.totwitter  -> PostTweet.java class.

Working : Fetch the image and posts it in Twitter.

 


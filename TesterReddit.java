import java.io.*;

public class TesterReddit {
	public static void main(String[] args) 
	{
		
		RedditReader myReader=new RedditReader();
		RedditPost [] posts=myReader.getPostsReddit("RedditPosts");
		
		int [] numberUpVotes=myReader.getNumCommentsReddit("UpVotes");
		int [] numberComments=myReader.getNumCommentsReddit("NumberComments");
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		for (int i=0;i<numberUpVotes.length;i++)
		{
			if(myReader.detectRussia(posts[i].title))
			{
				System.out.println("Line: " +posts[i].title);
				System.out.println("Number of UpVotes: "+numberUpVotes[i]);
				sum1+=numberUpVotes[i];
				System.out.println("Number of Comments: "+numberComments[i]);
				sum2+=numberComments[i];
			}
			sum3+=numberUpVotes[i];
			sum4+=numberComments[i];
		}	
		double RussiaUpVoteAverage=sum1/157;
		double RussiaCommentsAverage=sum2/157;
		double TotalUpVoteAverage=sum3/6465;
		double TotalCommentsAverage=sum4/6465;
		System.out.println("Average Upvotes for lines containing the word Russia: " +RussiaUpVoteAverage);
		System.out.println("Average number of comments for lines containing the word Russia: " +RussiaCommentsAverage);
		System.out.println("Average Upvotes for all lines: " +TotalUpVoteAverage);
		System.out.println("Average number of comments for all lines: " +TotalCommentsAverage);
		System.out.println("Above are all of the lines from the RedditPosts files that contain the word Russia. \n "
				+ "From analysing the data, the Reddit Posts containing the term Russia recieved, on average, more Upvotes and Comments \n"
				+ "compared to all of the Reddit Posts. Therefore, posts about TheDonald that mentioned russia are more popular than those \n"
				+ "that did not mention Russia.");
	}
	
	
	}

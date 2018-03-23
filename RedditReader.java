import java.io.*;

public class RedditReader {
	String fileToAnalyze;
	
	RedditReader()
	{
		fileToAnalyze="";
		
	}
	boolean detectRussia(String linetoAnalyze)
	
	{
		String lineToAnalyzeLowerCase=linetoAnalyze.toLowerCase();
		if (lineToAnalyzeLowerCase.contains("russia"))
		{
			
			return true;
		}
		else 
		{

			return false;
		}
	}
	
	
	public int [] getNumCommentsReddit(String fileToRead)
	{
		int [] numCommentsArray=new int[6465];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int postCounter=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				int numCommentsPost=Integer.parseInt(line);
				
				numCommentsArray[postCounter]=numCommentsPost;
				postCounter+=1;
				
				
				
			}
			return numCommentsArray;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
		
		return numCommentsArray;
			
	}
	
	RedditPost [] getPostsReddit(String fileToRead)
	{
		RedditPost [] theDonaldPosts=new RedditPost[6465];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int postCounter=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				theDonaldPosts[postCounter]=new RedditPost(line);
				postCounter+=1;
				
				
				
			}
			return theDonaldPosts;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
		return theDonaldPosts;
			
	}
	void readRedditFileAndDetectRussia(String fileToRead)
	{
		System.out.println("ready to read:"+fileToRead);
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			while ((line=myBufferReader.readLine())!=null)
			{
				if (detectRussia(line)==true)
					
					System.out.println("line:"+line);
			}
			System.out.println("exited while:");
			
			
	
			
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
	}
	
	

}
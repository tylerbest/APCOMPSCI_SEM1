public class MagpiePart2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "say something";
		}
		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" LENGTH IS 0*/


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		/** should have added || findKeyword(statment, "father") >= 0*/
		
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "Tell me more about your pet";
		}
		else if (findKeyword(statement, "robinette") >= 0)
		{
			response = "Sounds like the dankest";
		}

		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		else
		{
			int psn = findKeyword(statement, "you", 0);
			
			if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
			
			{
				response = transformYouMeStatement(statement);
			}
			
			else if(psn >= 0 && findKeyword(statement, "Me", 0) >= 0)
			
			{
				response = transformIYouStatement(statement);
			}
			
			else
			
			{
			response = getRandomResponse();
			}
		}
		return response;
	}
	private String transformIWantToStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() - 1);
		
			if(lastChar.equals("."))
		{
			
			statement = statement.substring(0, statement.length() - 1);
		
		}
		int psn = findKeyword(statement, "I want to", statement.toLowerCase().indexOf("i want to"));
		String restOfStatement = statement.substring(psn + 9);
		return "What would it mean to " + restOfStatement + "?";
	}
	
	private String transformYouMeStatement(String statement)
	
	{
		String phrase = statement.trim().toLowerCase();
		
		String lastChar = phrase.substring(phrase.length() - 1);
		
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I" + restOfStatement + "you?";
	}
	
	private String transformIYouStatement(String statement)
	
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() - 1);
		
		if(lastChar.equals("."))
		{
		
			statement = statement.substring(0, statement.length() - 1);
		
		}
		int psnOfI = findKeyword(statement, "I");
		int psnOfYou = findKeyword(statement, "You", psnOfI);
		
		String restOfStatement = statement.substring(psnOfI + 1, psnOfYou);
		
		return "Why do you" + restOfStatement + "me?";
	}

}
# SPORTRADAR
SPORTRADAR - Coding Challange
Please find below the explanation

1. This is a Springboot simple application, where in memory saving is done in simple java List.
2. JSP's - there are 3 jsp's as explained below
	
	a.) startupPage.jsp - http://localhost:8090/ or http://localhost:8090/start
		Explanation : Application actually starts here . We see 3 links
			>Add Teams
			>Finish
			>Summary
			
	b.) finish.jsp  - http://localhost:8090/finish
		Explanation : Simply moves to finish page where either you can : 
			> reset the soreoard or
			> see the summary
			
	c.) AddScoreCard.jsp - http://localhost:8090/add
		Explnation : Add the score card entries
		
	d.) error.jsp - error is simply directed to this page
	
3. Model : Teams.java - This is a model, which hold the following details
	Team A - Score of Team A
	Team B - Score of Team B

4. Service :
	a.)	ScoreBoardService.java - Interface to provide an abstraction layer
	b.) FootballScoreboardService.java	- Football Specific implementation or score board

5. Controller : 
	5.1.) ScoreboardController.java - very basic MVC controller to call service and render jsp pages
		add , update , finish ,summary all methods are available
		
		a)	add - insert new record
		b)  update - updates an existing record
		c)  finish - clear the board , and show 2 links to reset or to see summary
		e) summary - simply see the summary
	
	


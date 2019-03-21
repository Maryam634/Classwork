<!--Day 11 Exercise (Messages)   -->
<?php
	include("functionsd.php");

	if (isset($_REQUEST["AgtFirstName"]))
	{
		//validate the form data
		//if data is okay
		//pass array to insertagent() function
		if (insertagent($_REQUEST))
		{
			print("Data inserted sucessfully");
		}
		else
		{
			print("Data insert failed, call tech support");
		}
	}
	else
	{
		//print("no form data received");
		header("Location: 11day.php");
	}
?>

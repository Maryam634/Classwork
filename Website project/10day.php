<!--Day 10 Exercise (New Agent Data)   -->
<?php
	include("functionsd.php");
?>

<!DOCTYPE html>
<html>
	<head>
		<title>Main Page</title>
	</head>
	<body>
		<?php
			$agent = array();
			$agent["AgtFirstName"] = "Jack";
			$agent["AgtMiddleInitial"] = "T";
			$agent["AgtLastName"] = "Kevin";
			$agent["AgtBusPhone"] = "587-4569-2546";
			$agent["AgtEmail"] = "JackTK@travelexperts.com";
			$agent["AgtPosition"] = "New Agent";
			$agent["AgencyId"] = 2;

			if (insertagent($agent))
			{
				print("Agent data inserted into database");
			}
			else
			{
				print("Insert failed. Call Tech Support.");
			}

		?>
	</body>
</html>

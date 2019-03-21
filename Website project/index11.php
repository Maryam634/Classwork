<!DOCTYPE html>
<html>
		<head>
			<?php
			//Day 1,2,3 Exercises
			include "headerd.php"; ?>
		</head>
		<body>

			<?php
			include "hero.php";
			//Day 9 Exercise   
			date_default_timezone_set('America/Vancouver');

			$hour=date('h');
			$am_pm=date('a');

			if ($am_pm=="am" && ($hour >= 0 && $hour < 12))
					{
						print("Good Morning". "<br/>");
					} else if ($am_pm=="pm" && (($hour >= 1 && $hour <= 5) || $hour==12))
					{
						print("Good Afternoon". "<br/>");
					} else
					{
						print("Good Evening". "<br/>");
					}
					print(date("l, Y/F/d h:i:s A, e"));
					$script_tz = date_default_timezone_get();
					include "section.php";
		  ?>
		</body>
		<footer style="margin-top:53%">
		<?php include "footerd.php"; ?>
		</footer>
</html>

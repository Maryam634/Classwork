<?php
// Day 12 Exercise
	session_cache_expire(30);
	session_start();

	if (!isset($_SESSION["logged-in"]) || !$_SESSION["logged-in"])
	{
		$_SESSION["returnpage"] = "day12.php";
		header("Location: login1.php");
	}
?>
<!DOCTYPE html>
<html>
	<head>
		<title>Secret Page</title>
	</head>
	<body>
		<h1>Super Secret Travel Information</h1>
		<?php
			if (isset($_SESSION["message"]))
			{
				print("<p>" . $_SESSION["message"] . "</p>");
				$_SESSION["message"] = "";
			}
		?>
		<p>This is the secret information...</p>
	</body>
</html>

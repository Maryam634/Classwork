<!--Day 12 Exercise   -->
<?php
  session_cache_expire(30);
	session_start();
  $_SESSION["returnpage"] = "day12.php";

	if (!isset($_REQUEST["CustUserId"]))
	{
		$_SESSION["message"] = "User Id and Password are required";
		header("Location: login1.php");
	}

	$dbh=mysqli_connect("localhost","Maryam1","1947@23","travelexperts");
  	if (mysqli_connect_errno())
	{
		die("Error: " . mysqli_connect_error());
	}
	$sql = "select CustPassword from customers where CustUserId=?";
	$stmt = mysqli_prepare($dbh, $sql);
	mysqli_stmt_bind_param($stmt, "s", $_REQUEST["CustUserId"]);
	if (!mysqli_stmt_execute($stmt))
	{
		$_SESSION["message"] = "Database lookup failed, call tech support";
		mysqli_close($dbh);
		header("Location: login1.php");
	}

	$result = mysqli_stmt_get_result($stmt);
	if (($password = mysqli_fetch_array($result)) && ($password[0] == $_REQUEST["CustPassword"]))
	{
		$_SESSION["logged-in"] = true;
		$returnpage = $_SESSION["returnpage"];
		unset($_SESSION["returnpage"]);
		mysqli_close($dbh);
		header("Location: $returnpage");
	}
	else
	{
		$_SESSION["message"] = "UserID or Password is incorrect";
		mysqli_close($dbh);
		header("Location: login1.php");
	}
?>

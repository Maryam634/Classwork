<!--Day 10 Exercise   -->
<?php
	include("variablesd.php");

	function dbconnect()
	{
		global $host, $user, $pwd, $dbname;
		$dbh = mysqli_connect($host, $user, $pwd, $dbname);
		if (!$dbh)
		{
			print("Connection failed, call tech support");
			exit();
		}
		return $dbh;
	}

	function updateproduct($product)
	{
		$dbh = dbconnect();
		$sql = "UPDATE `products` SET `ProdName`=? WHERE `ProductId`= ?";
		$stmt = mysqli_prepare($dbh, $sql);
		mysqli_stmt_bind_param($stmt, "si", $product["ProdName"], $product["ProductId"]);
		$result = mysqli_stmt_execute($stmt);
		if (!$result)
		{
			print(mysqli_stmt_error($stmt));
			mysqli_close($dbh);
			return false;
		}
		mysqli_close($dbh);
		return true;
	}

	function insertagent($agent)
	{
		$sql = "INSERT INTO `agents`(`AgtFirstName`, `AgtMiddleInitial`, `AgtLastName`, `AgtBusPhone`, `AgtEmail`, `AgtPosition`,
    `AgencyId`) VALUES (?,?,?,?,?,?,?)";
		$dbh = mysqli_connect("localhost", "Maryam1", "1947@23", "travelexperts");
		if (!$dbh)
		{
			print("Connection Error: " . mysqli_connect_errno() . ":" . mysqli_connect_error() . "<br />");
			$fh = fopen("logs.txt", "w");
			fwrite($fh, mysqli_connect_errno(). "\n");
			fwrite($fh, mysqli_connect_error(). "\n");
			fclose($fh);
			exit();
		}

		$stmt = mysqli_prepare($dbh, $sql);
		mysqli_stmt_bind_param($stmt, "ssssssi", $agent["AgtFirstName"], $agent["AgtMiddleInitial"], $agent["AgtLastName"],
    $agent["AgtBusPhone"], $agent["AgtEmail"], $agent["AgtPosition"], $agent["AgencyId"]);
		$result = mysqli_stmt_execute($stmt);
		if (!$result)
		{
			print(mysqli_stmt_error($stmt));
			$fh = fopen("logs.txt", "a");
			fwrite($fh, mysqli_stmt_error($stmt));
			fclose($fh);
			mysqli_close($dbh);
			return false;
		}
		mysqli_close($dbh);
		return true;
	}
?>

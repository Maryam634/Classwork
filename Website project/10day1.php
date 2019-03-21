<!--Day 10 Exercise (Agent Table Information from SQL after and before adding data)  -->
<?php
	$dbh = mysqli_connect("localhost", "Maryam1", "1947@23", "travelexperts");
	if (!$dbh)
	{
		print("Connection failed: " . mysqli_connect_errno() . "--" .mysqli_connect_error() . "<br />");
		exit();
	}
?>
<!DOCTYPE html>
<html>
	<head>
		<title>Main Page</title>
	</head>
	<body>
		<?php
			//$sql = "select AgtFirstName, AgtLastName from Agents";
			$sql = "select * from Agents";
			$result = mysqli_query($dbh, $sql);
			if (!$result)
			{
				print("Query failed: " . mysqli_errno() . "--" . mysqli_error() . "<br />");
				exit();
			}
			print("<table>");
			$firstrow = true;
			while ($row = mysqli_fetch_assoc($result))
			{
				if ($firstrow)
				{
					print("<tr>");
					$keys = array_keys($row);
					foreach ($keys as $key)
					{
						print("<th>$key</th>");
					}
					$firstrow = false;
					print("</tr>");
				}
				print("<tr>");
				$values = array_values($row);
				foreach ($values as $value)
				{
					print("<td>$value</td>");
				}
				print("</tr>");
			}
			print("</table>");
		?>
	</body>
</html>
<?php
	mysqli_close($dbh);
?>

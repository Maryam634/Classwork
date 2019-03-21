<!--Day 11 Exercise (Agent Entry)   -->
<!DOCTYPE html>
<html>
	<head>
		<title>Main Page</title>
		<?php
		include "headerd.php"; ?>
	</head>
	<body>
		<?php
		include "hero.php";
		?>
		<form method="post" action="11day-1.php" style="margin-left:39%;">
			<table>
				<tr>
					<td>First Name:</td>
					<td>
						<input type="text" name="AgtFirstName" />
					</td>
				</tr>
				<tr>
					<td>Middle Initial:</td>
					<td>
						<input type="text" name="AgtMiddleInitial" />
					</td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td>
						<input type="text" name="AgtLastName" />
					</td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td>
						<input type="text" name="AgtBusPhone" />
					</td>
				</tr>
				<tr>
					<td>Email:</td>
					<td>
						<input type="text" name="AgtEmail" />
					</td>
				</tr>
				<tr>
					<td>Position:</td>
					<td>
						<input type="text" name="AgtPosition" />
					</td>
				</tr>
				<tr>
					<td>Agency:</td>
					<td>
						<input type="text" name="AgencyId" />
					</td>
				</tr>
				<td>
					<input type="submit" value="Save" />
				</td>
			</table>
		</form>
		<?php include "footerd.php"; ?>
	</body>
</html>

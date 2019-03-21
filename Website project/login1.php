<?php
// Day 12 Exercise
include_once('headerd.php');
session_cache_expire(30);
session_start();
$handle = fopen("userlist5.txt", "w");
fwrite($handle, "user1," . password_hash("pass1", PASSWORD_DEFAULT) . "\n");
fwrite($handle, "user2," . password_hash("pass2", PASSWORD_DEFAULT) . "\n");
fwrite($handle, "user3," . password_hash("pass3", PASSWORD_DEFAULT) . "\n");
fclose($handle);
?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login Page</title>
  </head>
  <body>
    <?php
    include("hero.php")
    ?>
    <p>Enter Your User Id and Password</p>
    <form action="verifylogin1.php" method="post" style="margin-left:40%;">
      <table>
        <tr>
          <td>User Id:</td>
          <td><input type="text" name="CustUserId" required="required" /></td>
        </tr>
        <tr>
          <td>Password:</td>
          <td><input type="password" name="CustPassword"  required="required"/></td>
        </tr>
        <td><input type="submit" value="Log In"/></td>
      </table>
    </form>

    <p style="color:red">
      <?php
        if (isset($_SESSION["message"]))
        {
          print($_SESSION["message"]);
          $_SESSION["message"]="";
        }
        include("footerd.php")
      ?>
    </p>
  </body>
</html>

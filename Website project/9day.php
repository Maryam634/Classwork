<!-- Day (9) -->
<?php
include("variablesd.php"); ?>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <table border='1px'>
      <?php
      $i = 1;
foreach ($urls as $key=>$value)
{
  print("<tr>");
  print("<td>$i:</td><td><a href='$value'>$key</a></td>");
  print("</tr>");
  $i++;
}
 ?>
    </table>
  </body>
</html>

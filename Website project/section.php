<!--Day 7-2 Exercises   -->
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
<section>
  <br/><br/>
  <div style="float: left;">
      <img src="Images\c1.jpg" alt="Travel img1" style="width:200px;height:200px;margin-left:11%;margin-bottom:1%;" ><br/>
      <img src="Images\c2.jpg" class="img-responsive" alt="Travel img1" style="width:195px;height:170px;margin-left:11%;margin-bottom:1%;" > <br/>
      <a href="http://localhost/registerh.php" >
      <img src="Images\download.jpg" class="img-responsive" alt="Travel img1" style="width:200px;height:200px;margin-left:11%;margin-bottom:1%;" >
      </a><br/>
      <a href="http://localhost/contactd.php" >
      <img src="Images\images.jpg" class="img-responsive" alt="Travel img1" style="width:200px;height:200px;margin-left:11%;margin-bottom:1%;" >
      </a>
      <br/>
  </div>
  <div style="float: right;">
    <table>
      <script>
        for (i=0; i < travelDescs.length; i++)
        {
          document.write("<tr>");
          document.write("<td>" + travelDescs[i] + "</td>");
          document.write("<td> <img src=\"" + travelImages[i].src + "\" style='height: 150px; width: 150px;' onclick='showURL(\""  + i + "\");' /> </td>");
          //debugger;
          document.write("</tr>");
        }
      </script>
    </table>
    </div>

  </section>
<br/>


</body>
</html>

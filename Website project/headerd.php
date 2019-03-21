<!--Day 5,7-1 Exercises   -->
<head>
  <title> TRAVEL EXPERTS</title>
  <!--<link rel="stylesheet" type="text/css" media="screen" href="reset.css" />-->
  <link rel="stylesheet" type="text/css" media="screen" href="nav.css" />
  <link type="text/css" media="screen" herf="linksd.php" />
  <script>
  var travelImages = new Array();
  travelImages[0] = new Image();
  travelImages[0].src = "Images/lb.jpg";
  travelImages[1] = new Image();
  travelImages[1].src = "Images/ot.jpg";
  travelImages[2] = new Image();
  travelImages[2].src = "Images/tt.jpg";
  travelImages[3] = new Image();
  travelImages[3].src = "Images/bf.jpg";

  var travelDescs = ["Long Beach, Tofino, British Columbia",
    "The Muskoka Lakes, Ontario",
    "CN Tower, Toronto","Bay of Fundy, New Brunswick"];

  var travelURLs = ["http://www.tofino-bc.com/geography/long-beach-vancouver-island.php",
    "https://www.discovermuskoka.ca/",
    "https://www.cntower.ca/en-ca/home.html","https://www.tourismnewbrunswick.ca/See/BayOfFundy.aspx"
    ];

  var showURL = function (idx)
  {
    var win1 = open(travelURLs[idx]);
    var timer = setTimeout(function(){ win1.close(); }, 3000);
  }

</script>
</head>

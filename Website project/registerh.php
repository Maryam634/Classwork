<?php
// Day 4,6,9 Exercises
include('headerd.php') ?>
<!DOCTYPE html>
<html>
		<head>
			<title></title>
			<style media="screen">
				form{
					margin-left: 45%;

				}
				.tip {
					visibility: hidden;
					position: absolute;
					left: 30%;

					background-color: green;
					color: yellow;
				}

				#message {
					color: red;
				}
			</style>
			<script>
			function preSubmit(myform) {
				document.getElementById("message").innerHTML = "";
				var message = "";
//alert("Submit All Information");
				if (validateInfo(myform)) {
alert("valid");
					resetMissingInfoNotification();
					return confirm('Are you sure that you want to submit all information?');
				}
alert("not valid");
				return false;
			}
			function validateInfo(myform) {
//alert("validateinfo");

				resetMissingInfoNotification();

				if (myform.fname.value == null || myform.fname.value == "") {
					//elementDisplay("fnameMissing");
					return false;
				}

				if (myform.lname.value == null || myform.lname.value == "") {
					//elementDisplay("lnameMissing");
					return false;
				}

				if (myform.email.value == null || myform.email.value == "") {
					return false;
				}
				else
				{
					//		harv.peters@a-1.com.sait.ca		!#$%&'*+\/=?^_`{-
					var reg = /^[a-zA-Z][a-zA-Z0-9.!#$%&'*+\/=?^_`{-]+@([a-zA-Z][a-zA-Z0-9-]+\.)+[a-zA-Z]{2,6}$/;

					if (!reg.test(myform.email.value))
					{
						message += "Invalid Postal Code format: should be X9X 9X9<br />";
						myform.postal.focus();
						myform.postal.style.backgroundColor = "pink";
						//elementDisplay("invalidEmail");
						return false;
					}
				}

				if (myform.postalcode.value == null || myform.postalcode.value == "") {
					return false;
				}
				else
				{
					//var postalcodeEle = document.getElementById("postalcode");
					myform.postalcode.value = myform.postalcode.value.toUpperCase();
					var reg2 = /(^[A-Z]\d[A-Z] ?\d[A-Z]\d$)|(^\d{5}( ?\d{4})?$)/i;
					if (!reg2.test(myform.postalcode.value))
					{
						//elementDisplay("invalidPostalCode");
						return false;
					}

				}

				return true;
			}

			function resetMissingInfoNotification() {
				//elementHidden("fnameMissing");
				//elementHidden("lnameMissing");
				//elementHidden("invalidEmail");
				//elementHidden("invalidPostalCode");
			}

					/*if (message)
					{
						document.getElementById("message").innerHTML = message;
						return false;
					}
					else
					{
						return confirm("Continue Submitting?");
					}
				}*/
			</script>

		</head>
		<body>
			<?php
			include("hero.php")
			?>
			<h2>Customer Information</h2>
			<p id="message"></p>
			<p class="tip" id="tipfname">Enter First Name</p>
			<p class="tip" id="tiplname">Enter Last Name</p>
			<p class="tip" id="tipaddress">Enter Address</p>
			<p class="tip" id="tiphomephone">Enter Home Number<br />(999) 999-9999</p>
			<p class="tip" id="tipcellphone">Enter Cell Number<br />(999) 999-9999</p>
			<p class="tip" id="tipemail">Enter Email Id</p>
			<p class="tip" id="tipcity">Enter City Name</p>
			<p class="tip" id="tippostalcode">Enter Postal Code<br />X9X 9X9</p>
			<form id="form1" method="post" action="bouncer.php">
			First Name<br/>
			<input type="text" name="fname"
				onfocus="tipfname.style.visibility = 'visible'"
				onblur="tipfname.style.visibility = 'hidden'"
				required="required"
				></input>
			<br/>
			Last Name<br/>
			<input type="text" name="lname"
				onfocus="tiplname.style.visibility = 'visible'"
				onblur="tiplname.style.visibility = 'hidden'"
        required="required"
				></input>
			<br/>
			Email<br/>
			<input type="text" name="email"
				onfocus="tipemail.style.visibility = 'visible'"
				onblur="tipemail.style.visibility = 'hidden'"
				required="required"
				></input><br/>
			Address<br/>
			<textarea name="address" rows="8" cols="21"
				onfocus="tipaddress.style.visibility = 'visible'"
				onblur="tipaddress.style.visibility = 'hidden'"
				required="required"></textarea>
				<br/>
			Home Phone<br/>
			<input type="phone" name="homephone"
				onfocus="tiphomephone.style.visibility = 'visible'"
				onblur="tiphomephone.style.visibility = 'hidden'"
				></input><br />
			Cell Phone<br/>
			<input type="phone" name="cellphone"
				onfocus="tipcellphone.style.visibility = 'visible'"
				onblur="tipcellphone.style.visibility = 'hidden'"
				required="required"
				></input><br />
			City<br/>
			<input type="text" name="city"
			onfocus="tipcity.style.visibility = 'visible'"
			onblur="tipcity.style.visibility = 'hidden'"
 				required="required"
				></input><br />
			Province<br/>
			<select name="province" required="required">
				<option value="">Select a province</option>
				<option value="AB">Alberta</option>
				<option value="SK">Saskatchewan</option>
				<option value="BC">British Columbia</option>
				<option value="MB">Manitoba</option>
				<option value="ON">Ontario</option>
			</select><br />
			Postal Code<br/>
			<input type="text" name="postalcode"
			onfocus="tippostalcode.style.visibility = 'visible'"
			onblur="tippostalcode.style.visibility = 'hidden'"
				required="required"
				></input><br /><br/>
			<input type="submit" onclick="return preSubmit(this.form);" />
			<input type="reset" onclick="return confirm('Do you really want to reset?');" ></input><br/>
		 </form>
      <footer>
			<a href="http://localhost/index11.php"><-Back</a><br />
			<?php
			include('footerd.php'); ?>
		  </footer>
		</body>
</html>

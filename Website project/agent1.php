<!--Day 13 Exercise  -->
<?php
include("Agent.php");


$collectionAgent1=new Agent(2, "Tim", "Sam");
$collectionAgent =new Agent(3, "Sim", "Tam");
// $collectionAgent->setAgtFirstName($collectionAgent->setAgtFirstName);
// $collectionAgent->setAgtLastName($collectionAgent->setAgtLastName);

// $array()=(1,)
$stringbackformfunction = Agent::toString($collectionAgent1);
$stringbackformfunction1 = Agent::toString($collectionAgent);
var_dump($stringbackformfunction);
var_dump($stringbackformfunction1);


 ?>

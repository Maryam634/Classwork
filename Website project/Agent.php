<!--13 Exercise  -->
<?php
/**agents`(`AgentId`, `AgtFirstName`, `AgtMiddleInitial`,
`AgtLastName`, `AgtBusPhone`, `AgtEmail`, `AgtPosition`, `AgencyId`)
  *
 */
class Agent
{
  private $AgentId;
  private $AgtFirstName;
  private $AgtMiddleInitial;
  private $AgtLastName;
  private $AgtBusPhone;
  private $AgtEmail;
  private $AgtPosition;
  private $AgencyId;

  public function __construct($AgentId, $AgtFirstName, $AgtLastName)
  {
    $this->AgentId=$AgentId;
    $this->AgtFirstName=$AgtFirstName;
    $this->AgtLastName=$AgtLastName;
  }
  public function getAgentId()
  {
    return $this->AgentId;
  }
  public function setAgentId($AgentId)
  {
    $this->AgentId=$AgentId;
  }
  public function getAgtFirstName()
  {
    return $this->AgtFirstName;
  }
  public function setAgtFirstName($AgtFirstName)
  {
    // var_dump('setting agent 1st name');
    $this->AgtFirstName=$AgtFirstName;
  }
  public function getAgtLastName()
  {
    return $this->AgtLastName;
  }
  public function setAgtLastName($AgtLastName)
  {
    $this->AgtLastName=$AgtLastName;
  }
  public function toString($obj)
  {
      $obj->setAgtFirstName($obj->AgtFirstName);
        return $obj->AgtFirstName . "," .$obj->AgtLastName .",";
  }
}
 ?>

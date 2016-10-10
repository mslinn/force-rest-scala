object DeleteAccount extends App {
  val sObject = new SObject("Account")
  val objectId = "0012800000DR2Ko"
  sObject.deleteSObject(objectId)
}

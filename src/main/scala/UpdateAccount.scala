object UpdateAccount extends App {
  val sObject = new SObject("Account")
  val objectId = "0012800000EuoVB"
  val jsonData = """{"name":"Account1.1"}"""
  sObject.patchSObject(objectId, jsonData)
}

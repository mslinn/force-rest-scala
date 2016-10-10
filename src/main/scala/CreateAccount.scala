object CreateAccount extends App {
	val sObject = new SObject("Account")
	val json = """{"name":"Account1"}"""
	sObject.createSObject(json)
}

object AccountList extends App {
	val sObject = new SObject("Account")
	val body = sObject.getList
	println(body)
}

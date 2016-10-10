import com.google.gson.Gson

object JsonParserGson extends App {
  val jsonString =
    """{
      |  "access_token":"00D28000000VdSh!ARAAQM7jt24pLjr_hfldPmiL.Fq3wi_0wtUY_99g.cMf3nYVXqLNjeViSoEJuffTolFHFU1nQSRDEzradwLF2yLZ2_P8a2rR",
		  |  "instance_url":"https://rajdeep-dev-ed.my.salesforce.com",
		  |  "id":"https://login.salesforce.com/id/00D28000000VdShEAK/00528000000NtIgAAK",
		  |  "token_type":"Bearer",
		  |  "issued_at":"1452077571111",
		  |  "signature":"MyVUU6xy3X4y3vfkGwRwyLufjkpJwzJb2k+TGQ6l89w="
      |}""".stripMargin
  try {
    println("CONVERTING JSON BACK TO OBJECT")
    val gson = new Gson
    val dude = gson.fromJson(jsonString, classOf[Token])
    println("access_token: " + dude.access_token)
  } catch {
    case e: Exception => e.printStackTrace()
  }
}

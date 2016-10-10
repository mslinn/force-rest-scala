import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.{BasicResponseHandler, DefaultHttpClient, HttpClients}
import com.google.gson.Gson
import com.typesafe.config._;

case class Token(
  access_token: String,
  instance_url: String,
  id: String,
  token_type: String,
  issued_at: String,
  signature: String
)

object accessToken {
  val apply: String = {
    // fixme: login is never used, this must be an error
    val login = "https://login.salesforce.com/services/oauth2/token"

    try {
      val conf = ConfigFactory.load()
      val UserName     = conf.getString("force.UserName")
      val PassWord     = conf.getString("force.PassWord")
      val LoginURL     = conf.getString("force.LoginURL")
      val GrantService = conf.getString("force.GrantService")
      val ClientID     = conf.getString("force.ClientID")
      val ClientSecret = conf.getString("force.ClientSecret")

      val loginURL = LoginURL  +
        GrantService +
        "&client_id=" + ClientID +
        "&client_secret=" + ClientSecret +
        "&username=" + UserName +
        "&password=" + PassWord

      val post = new HttpPost(loginURL)
      val handler = new BasicResponseHandler()
      val response = HttpClients.createDefault.execute(post)
      println("response:" + response)

      val body = handler.handleResponse(response)
      println(response)

      val gson = new Gson
      val jsonObject = gson.fromJson(body, classOf[Token])
      val access_token = jsonObject.access_token
      println("access_token: " + access_token)
      access_token
    } catch {
      case e: Exception =>
        sys.error(e.getMessage)
    }
  }
}

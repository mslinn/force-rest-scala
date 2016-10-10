object ListApiServices extends App {
  try {
    val content = get("https://ap2.salesforce.com/services/data")
    println(content)
  } catch {
    case e: Exception =>
      sys.error(e.getMessage)
  }

  def get(url: String) = scala.io.Source.fromURL(url).mkString.trim
}

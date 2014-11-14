
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

/**
 * Created by chandrasekharkode on 11/14/14.
 */


object App extends JSApp {
  @JSExport
  override def main(): Unit = {
    jQuery("#useme").text("Scala JS Rocks")
  }
}

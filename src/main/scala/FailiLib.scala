import java.io.{BufferedWriter, File, FileWriter}
import scala.io.Source
import scala.util.Try

object FailiLib {
  /**
   * Atgriež faila saturu vai tukšumu,
   * ja kaut kas neizdodās, tāpat atdod tukšumu
   */
  def read(filename: String): String = {
    val source = Try(Source.fromFile(filename))
    val sourceText = source.map { file =>
      val text = file.toList.mkString("")
      file.close()
      text
    }
    sourceText.getOrElse("")
  }

  /**
   * Izveido un ieraksta failā saturu,
   * ja tas neizdodās, ļoti bēdājās
   */
  def write(filename: String, text: String): Unit = {
    val file = new File(filename)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(text)
    bw.close()
  }

  /**
   * Izdzēš vai ignorē failu,
   * ja tas neizdodās, ļoti bēdājās
   */
  def remove(filename: String): Unit = {
    val file = new File(filename)
    file.delete()
  }

}

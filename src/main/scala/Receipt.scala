//import main.Receipt
import scala.collection.mutable.Buffer
object Receipt {

/*
  var tonnikala =  3
  var tomaatti  =  3
  var maito     =  3
  var leipä     =  3
  var kanamuna  =  3
  var taikina   =  30
  var juusto    =  5
  var pesto     =  5
  var olioljy   =  4

 */

   val pizza =
    "<html>Liuota hiiva kädenlämpöiseen veteen. Lisää suola, jauhot ja öljy. ..\n" +
    "<br/>.Kauli kohonnut taikina ohueksi levyksi. Mikäli taikina on todella löysää, käytä reilusti jauhoja apuna. ...Täytä pizza haluamillasi täytteillä ja\n"+
    " paista 250-asteisessa uunissa 10-15 minuuttia. Ripottele pinnalle halutessasi oreganoa </html>"
    val Omlette = "<html>LRiko munien rakenne kulhossa ja lisää vesi tai maito, suola ja pippuri.Kuumenna rasva " +
      "<html>Lpaistinpannussa ja kaada munakasseos kuumaan pannuun. Laske lämpöä. " +
      "<html>LVedä munakasmassaa lastalla pohjaa pitkin reunoilta keskelle, " +
      "kunnes munakas on lähes hyytynyt. Pinta saa jäädä kosteaksi<br/>"

  val puuro = "<html>Kiehauta vesi ja suola kattilassa. Sekoita joukkoon kaurahiutaleet. Keitä muutama min.\n" +
"<html>Lisää maito. Kypsennä vielä 5 min välillä sekoittaen"+
"<html>Nosta kattila sivuun ja anna vetäytyä 5 min"+
"Tarjoa voisilmän, sokeriripauksen ja maidon kanssa<br/>"
  val pasta = "<html>Valuta ruokalusikallinen öljyä uunivuoan pohjalle. Nosta vuokaan kokonainen fetajuusto ja sen ympärille tomaatit" +
    "<html>Lisää fetan päälle hienonnetut valkosipulinkynnet ja chili. " +
    "<html>Valuta tomaattien päälle loppu öljy ja pyöräytä tomaatit öljyisiksi. " +
    "<html>Ripottele päälle mustapippuri.Nosta vuoka 225-asteiseen uuniin ylätasolle 20–25 minuutiksi. Käännä lopuksi grillivastus hetkeksi päälle, " +
    "<html>niin että tomaatit reilusti paahtuvat, mutta varo polttamasta.Vuoan ollessa " +
    "<html>uunissa keitä valitsemasi pasta pakkauksen ohjeen mukaan kypsäksi. " +
    "<html>Valuta pasta. Ota vuoka uunista ja riko feta muutamaan osaan. " +
    "html>Kumoa vuoan sisältö kokonaisuudessaan pastan joukkoon. Sekoita. " +
    "<html>Tarkista maku ja lisää suolaa tarvittaessa.Tarjoa uunifetapastan " +
    "kanssa basilikaa ja halutessasi parmesaaniraatetta<br/>"

 val tikkamasala =   "<html>Sekoita mausteseoksen ainekset keskenään ja sekoita puolet" +
   "<html>seoksesta jogurtin joukkoon. Kääntele broilerit jogurtissa " +
   "<html> ja anna maustua noin puoli tuntia huoneenlämmössä.<br/>"

 val veganpizza = "edris"


   val Vegankuvauset = Map ("Vegan"-> veganpizza)
   val kuvaukset   =     Map("pizza" -> pizza , "omlette" -> Omlette,  "puuro" -> puuro, "fetapasta" -> pasta,
     "tikkamasala"-> tikkamasala)
   val ruokakaappi    =   collection.mutable.Map ("tonnikala" -> 360, "tomaatti" -> 2, "maito" -> 1000,"kanamuna" -> 500 ,
     "juusto" -> 500, "kana"-> 1000,"pizzakastiketta" -> 1200, "punasipuli" -> 200, "pizzapohja" -> 300, "öljy"-> 1000
   , "suola"-> 100, "mustapippuri" -> 10, "inkivääri"-> 90, "vettä" -> 10000, "kaurahiutaleita" -> 900, "pasta" -> 1000,
     "Kirsikkatomaatteja" -> 800, "Basilikaa"-> 50, "feta"-> 200)
   val pizzaresepti =    Map ("pizzakastiketta" -> 400, "juusto" -> 100 , "pizzapohja" -> 150, "tonnikala" -> 360)
  val omeletteresepti =  Map ("kanamuna" -> 240 ,"suola"-> 10, "mustapippuri" -> 10, "öljy"-> 200 )
  val tikkamaslaresepti = Map("kana"-> 400, "suola"-> 20,"punasipuli" -> 50, "inkivääri"-> 30, "öljy"-> 100 )
  val puuroo = Map ("vettä" -> 500, "kaurahiutaleita" -> 400 , "maito"-> 500, "suola"-> 10 )
  val pastaa = Map ("pasta" -> 200 , "feta"-> 200, "öljy"-> 100 , "Kirsikkatomaatteja" -> 400, "Basilikaa"-> 20, "suola"-> 10,  "mustapippuri" -> 10)
  val reseptit = Map("pizza"->pizzaresepti,"omlette" -> omeletteresepti, "puuro" -> puuroo,"fetapasta"-> pastaa
  , "tikkamasala"-> tikkamaslaresepti)

  def makefood (ruoka: String)={

    for {
      (reseptinAine, reseptinMaara) <- reseptit(ruoka)
    } {
      if (ruokakaappi(reseptinAine) >= reseptinMaara) {
        ruokakaappi(reseptinAine) = ruokakaappi(reseptinAine)- reseptinMaara

      println( reseptinAine + " " +" määrä on sopivan määrä")
    }
      else{
       val puuttuu =   reseptinMaara - ruokakaappi(reseptinAine)
      println("Loppunut" + " " + reseptinAine + "  " + "ja tarvitaan vähintään" + " " +  reseptinAine+ " " + puuttuu + "g")
}
    }
  }





/*


   def calcuate ( ruoka: String, tomat: Int, taik: Int, juus : Int, kanamun: Int)={
     if(ruoka=="pizza"){
     if ( tomaatti > tomat && taikina > taik && juusto > juus) {
      tomaatti =  tomaatti -tomat
     taikina = taikina- taik
       juusto = juusto-juus
       println("OK")
     }

     else println("raaka-aineet ovat loppuneet se tarkoittaa, että et voi käyttää tätä reseptiä")
     }

       else if (ruoka=="omlette"){
       if ( tomaatti > tomat && kanamuna> kanamun) {
       tomaatti =  tomaatti -tomat
     kanamuna = kanamuna- kanamun
       println("OK")
     }
       else println("raaka-aineet ovat loppuneet se tarkoittaa, että et voi käyttää tätä reseptiä")
     }

   }

 */






/*
  def calcuate (tomat: Int, taik: Int, juus : Int): Unit ={
    for (i <-  0 to 3){
      if(i == k(1))
    }
  }
*/





  //val food = mutable.Buffer(pizza,Omlette)

  //def see(s:String){
  ///for (x <- food){
  //if("pizza"==x) {


  //else if("pizza")



}
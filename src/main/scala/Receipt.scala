import main.receipt
import scala.collection.mutable.Buffer
class Receipt()  {
  var tonnikala =  3
  var tomaatti  =  0
  var maito     =  3
  var leipä     =  3
  var kanamuna  =  3
  var taikina   =  30
  var juusto    =  5
  var pesto     =  5
  var olioljy   =  4

   val pizza =
    "<html>Liuota hiiva kädenlämpöiseen veteen. Lisää suola, jauhot ja öljy. ..\n" +
    "<br/>.Kauli kohonnut taikina ohueksi levyksi. Mikäli taikina on todella löysää, käytä reilusti jauhoja apuna. ...Täytä pizza haluamillasi täytteillä ja\n"+
    " paista 250-asteisessa uunissa 10-15 minuuttia. Ripottele pinnalle halutessasi oreganoa </html>"
    val Omlette = "<html>LRiko munien rakenne kulhossa ja lisää vesi tai maito, suola ja pippuri.Kuumenna rasva " +
      "<html>Lpaistinpannussa ja kaada munakasseos kuumaan pannuun. Laske lämpöä. " +
      "<html>LVedä munakasmassaa lastalla pohjaa pitkin reunoilta keskelle, " +
      "kunnes munakas on lähes hyytynyt. Pinta saa jäädä kosteaksi<br/>"

  val puuro = "<html>Kiehauta vesi ja suola kattilassa. Sekoita joukkoon kaurahiutaleet. Keitä muutama min." +
"<html>Lisää maito. Kypsennä vielä 5 min välillä sekoittaen"+
"<html>Nosta kattila sivuun ja anna vetäytyä 5 min"+
"Tarjoa voisilmän, sokeriripauksen ja maidon kanssa<br/>"
  val pasta = " <html>Valuta ruokalusikallinen öljyä uunivuoan pohjalle. Nosta vuokaan kokonainen fetajuusto ja sen ympärille tomaatit. " +
    "<html>Lisää fetan päälle hienonnetut valkosipulinkynnet ja chili. Valuta tomaattien päälle loppu öljy ja pyöräytä tomaatit öljyisiksi. " +
    "<html>Ripottele päälle mustapippuri.Nosta vuoka 225-asteiseen uuniin ylätasolle 20–25 minuutiksi. Käännä lopuksi grillivastus hetkeksi päälle, " +
    "<html>niin että tomaatit reilusti paahtuvat, mutta varo polttamasta.Vuoan ollessa uunissa keitä valitsemasi pasta pakkauksen ohjeen mukaan kypsäksi. " +
    "<html>Valuta pasta. Ota vuoka uunista ja riko feta muutamaan osaan. " +
    "Kumoa vuoan sisältö kokonaisuudessaan pastan joukkoon. Sekoita. Tarkista maku ja lisää suolaa tarvittaessa.Tarjoa uunifetapastan kanssa basilikaa ja halutessasi parmesaaniraatetta.<br/>"
   val k = Buffer(pizza,Omlette, puuro, pasta)

   def pizzacalcuate ( tomat: Int, taik: Int, juus : Int)={
     if ( tomaatti > tomat && taikina > taik && juusto > juus) {
       tomaatti= tomaatti -tomat

     taikina= taikina- taik
       juusto = juusto-juus
     }

     else "raaka-aineet ovat loppuneet"
   }







  //val food = mutable.Buffer(pizza,Omlette)

  //def see(s:String){
  ///for (x <- food){
  //if("pizza"==x) {


  //else if("pizza")



}
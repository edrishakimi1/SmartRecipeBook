//import main.edris

import main.listenTo
import scala.collection.mutable.Buffer
import javax.swing.border.EmptyBorder
import java.awt.Image.SCALE_SMOOTH
import java.net.URL
import javax.swing.ImageIcon
import scala.swing._
import scala.swing.event.ButtonClicked


object main extends SimpleSwingApplication {

  val Pizza = new URL("https://public.keskofiles.com/f/recipe/napolilainenpizza_21?w=2400&fit=crop)")
  val omlette = new URL("https://www.jessicagavin.com/wp-content/uploads/2020/09/how-to-make-an-omelette-american-12-1200.jpg")
  val Puuro = new URL("https://www.foreverclub.fi/wp-content/uploads/2017/10/puuro-1.jpg")
 val fetapasta = new URL("https://www.maaseuduntulevaisuus.fi/image/policy:1.1321788:1613752789/image.jpg?f=default&q=0.9&$p$f$q=fda4bc7&w=806&$w=17a9782")

   val ekaNappi = new Button("Pizza"){
   // this.name ="1"
  }
  val tokaNappi = new Button("Omelette!")
  val kolmasnappi = new Button("Puuro")
   //{this.name = "2"}
  val pastanappi = new Button("Fetapasta")

  val receipt = new Receipt
  val ruoka = receipt.pizza
  val oml = receipt.Omlette
  val puuro = receipt.puuro
  val pasta= receipt.pasta

  val kuvat = Buffer(Pizza, omlette,Puuro,fetapasta)
  val napit = Buffer(ekaNappi,tokaNappi, kolmasnappi,pastanappi)
  val tekstit = Buffer(ruoka,oml,puuro,pasta)


  var hk = new BoxPanel(Orientation.Vertical)
  var kkk = new BoxPanel(Orientation.Horizontal)

  for ( k <- 0 to 3){
    if(k % 2==0){
    hk = new BoxPanel(Orientation.Vertical)
    kkk.contents  += hk
    hk.border = new EmptyBorder(8,8,8,8)
    }
    val numLabel2 = new Label {
    val b = new ImageIcon(kuvat(k))
    val imagess = b.getImage.getScaledInstance(300, 300, SCALE_SMOOTH)
    this.icon = new ImageIcon(imagess)
  }
    val label = new Label{
      text= tekstit(k)
       visible = false

    }
    val pizzanappi = napit(k)

    hk.contents += numLabel2
    hk.contents += label
    hk.contents += pizzanappi
    listenTo(napit(k))
    reactions += {
      case painallus: ButtonClicked =>{
        if(painallus.source == pizzanappi) {
        label.visible = true
          receipt.pizzacalcuate(1,1,1)
       // receipt.calcuate(k)
        }

      }



  }

  }


  val nappulaikkuna = new MainFrame
  nappulaikkuna.contents = kkk
  nappulaikkuna.title = "Smart Receipt"

  // Sovelluksen pääikkunan palauttava metodi:
  def top = this.nappulaikkuna
}





  /*

   val mLabel = new Label {
    val v = new ImageIcon(Puuro)
    val ik = v.getImage.getScaledInstance(50, 50, SCALE_SMOOTH)
    this.icon = new ImageIcon(ik)
  }
  val hh = new BoxPanel(Orientation.Vertical)


for(i <- 0 to 5) {

  val numLabel2 = new Label {
    val b = new ImageIcon(omlette)
    val imagess = b.getImage.getScaledInstance(300, 300, SCALE_SMOOTH)
    this.icon = new ImageIcon(imagess)
  }
  hh.contents+= numLabel2
   hh.contents += ekaNappi
  hh.contents += label


  val label1 = new Label {
  this.name = "1"
    text = oml
    visible = false
  }
  hh.contents += label1
  val puurolabel = new Label {
  this.name = "2"
    text = puuro
    visible = false
  }


}

  val receipt = new Receipt
  val ruoka = receipt.pizza
  val oml = receipt.Omlette
  val puuro = receipt.puuro
  val label = new Label {
    text = ruoka
    visible = false
  }



  val ekaNappi = new Button("Pizza"){
    this.name ="1"
  }
  val tokaNappi = new Button("Omelette!")
  val kolmasnappi = new Button("Puuro")
  {this.name = "2"}
  val kehote = new Label("Mitä haluat syödä?")


  val uusi = new GridPanel(3,3)

  val d = new BoxPanel(Orientation.Vertical)
  d.contents += numLabel
  // d.contents += uusi
  d.contents += ekaNappi
  d.contents += label

  val dpuuro = new BoxPanel(Orientation.Vertical)
  dpuuro.contents += mLabel
  dpuuro.contents += uusi
  dpuuro.contents += kolmasnappi
  dpuuro.contents += puurolabel
  dpuuro.contents += mLabel


  val u = new BoxPanel(Orientation.Vertical)
  u.contents += numLabel2
  u.contents += tokaNappi
  u.contents += label1
  //k.contents += u
  listenTo(tokaNappi)
   listenTo(ekaNappi,tokaNappi,kolmasnappi)

    reactions += {
      case painallus: ButtonClicked =>{
        if(painallus.source.name=="1")
        label.visible = true
        else if(painallus.source.name=="2")
          puurolabel.visible = true
        else
         label1.visible = true
      }
        val k = new BoxPanel(Orientation.Vertical)
  k.contents += numLabel2
  k.contents += tokaNappi
  k.contents += label1
  //k.contents += u
  listenTo(tokaNappi)
   listenTo(ekaNappi,tokaNappi,kolmasnappi)

    reactions += {
      case painallus: ButtonClicked =>{
        if(painallus.source.name=="1")
        label.visible = true
        else if(painallus.source.name=="2")
          puurolabel.visible = true
        else
         label1.visible = true
      }
     val newbox = new BoxPanel(Orientation.Horizontal)




       }

  // Komponenttien asemointi ikkunaan:
  val kaikkiJutut = new BoxPanel(Orientation.Vertical)
  kaikkiJutut.contents += d
  //(oli Grindplnel)
  kaikkiJutut.contents += u
  kaikkiJutut.contents += uusi
  kaikkiJutut.contents += dpuuro

  val nappulaikkuna = new MainFrame
  nappulaikkuna.contents = kaikkiJutut
  nappulaikkuna.title = "Smart Receipt"

  // Sovelluksen pääikkunan palauttava metodi:
  def top = this.nappulaikkuna

   */



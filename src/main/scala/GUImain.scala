import GUImain.{listenTo, reactions}

import scala.collection.mutable.Buffer
import java.awt.Image.SCALE_SMOOTH
import java.net.URL
import javax.swing.ImageIcon
import scala.swing._
import scala.swing.event.ButtonClicked


object GUImain extends SimpleSwingApplication {


  val description    = Map( "pizza"        -> new URL("https://public.keskofiles.com/f/recipe/napolilainenpizza_21?w=2400&fit=crop)"),
                            "omlette"      -> new URL("https://www.jessicagavin.com/wp-content/uploads/2020/09/how-to-make-an-omelette-american-12-1200.jpg"),
                            "porridge"     -> new URL("https://www.foreverclub.fi/wp-content/uploads/2017/10/puuro-1.jpg"),
                            "fetapasta"    -> new URL("https://kasvisreseptit.fi/wp-content/uploads/2019/03/uunifetapasta-kasvisreseptit-1.jpg"),
                            "tikkamasala"  -> new URL("https://www.halfbakedharvest.com/wp-content/uploads/2019/10/Coconut-Chicken-Tikka-Masala-1.jpg"))






  val foodPanel = for (
    (nimi, kuva) <- description

  ) yield new BoxPanel(Orientation.Vertical) {

    val buildPhoto      = new ImageIcon(kuva)
    val image           = buildPhoto.getImage.getScaledInstance(250, 250, SCALE_SMOOTH)
    val normalButton    = new Button("Use" + " " + nimi + " "  + "receipe")

        buildPhoto.setImage(image)

     contents += new Label() {
      this.icon = buildPhoto


    }

    var buildPane = new TextPane
        buildPane.peer.setContentType("text/html")
        buildPane.editable = false

    listenTo(normalButton)
    reactions += {
      case painallus: ButtonClicked => {
       if(painallus.source==normalButton ) {

          if(buildPane.visible == false){
             buildPane.text = Recipe.makefood(nimi)
          }


            buildPane.visible             = !buildPane.visible
            RawMaterialLabel.visible      = false
            buidlVeganPane.visible        = false
            VeganRawMaterialLabel.visible = false
            addMaterial.visible           = false
            buidlAllergiaPane.visible     = false
            addVeganMaterial.visible      = false
            addWA.visible                 = false
            WARawMaterialLabel.visible    = false


        Recipe.makefood(nimi)
       }


      }
      this.revalidate()
    this.repaint()

    }

    var buidlAllergiaPane = new TextPane
    buidlAllergiaPane.peer.setContentType("text/html")
    buidlAllergiaPane.editable = false
    val allergicButton = new Button ("Use" + " " +nimi + " " + "no allergies" +  " "  + "recipe")
    listenTo(allergicButton)
    reactions += {
      case painallus: ButtonClicked => {
       if(painallus.source==allergicButton ) {
         if(painallus.source==allergicButton ) {
          if(buidlVeganPane.visible == false){
        buidlAllergiaPane.text = Recipe.makefood("no allergies"+ " "+nimi)
          }
        Recipe.descriptions("no allergies"+ " "+nimi)
        buidlAllergiaPane.visible      = !buidlAllergiaPane.visible
         RawMaterialLabel.visible      = false
         buildPane.visible             = false
         VeganRawMaterialLabel.visible = false
         addMaterial.visible           = false
         buidlVeganPane.visible        = false
         addVeganMaterial.visible      = false
         addWA.visible                 = false
         WARawMaterialLabel.visible    = false

        Recipe.makefood("no allergies"+ " "+nimi)
       }

      }

    this.revalidate()
    this.repaint()


    }
    }

    var buidlVeganPane= new TextPane
        buidlVeganPane.peer.setContentType("text/html")
        buidlVeganPane.editable = false
    val veganButton = new Button ("Use" + " " +nimi + " " + "vegan" +  " "  + "recipe")
    listenTo(veganButton)
    reactions += {
      case painallus: ButtonClicked => {
       if(painallus.source==veganButton ) {
          if(buidlVeganPane.visible == false){
        buidlVeganPane.text = Recipe.makefood("vegan"+nimi)
          }


         Recipe.descriptions("vegan"+nimi)
         buidlVeganPane.visible        = !buidlVeganPane.visible
         RawMaterialLabel.visible      = false
         buildPane.visible             = false
         VeganRawMaterialLabel.visible = false
         addMaterial.visible           = false
         buidlAllergiaPane.visible     = false
         addVeganMaterial.visible      = false
         addWA.visible                 = false
         WARawMaterialLabel.visible    = false

        Recipe.makefood("vegan"+nimi)
       }


      }
      this.revalidate()
    this.repaint()


    }




    var RawMaterialLabel = new Label()
    val ButtonAmount = new Button("Raw material amount")
       listenTo(ButtonAmount)
         reactions +=
      {

      case painallus: ButtonClicked => {
        if(painallus.source==ButtonAmount ){
          if(RawMaterialLabel.visible == false){
           RawMaterialLabel.text         = Recipe.amounTotext(nimi)
          }
           RawMaterialLabel.visible      = !RawMaterialLabel.visible
           buildPane.visible             = false
           buidlVeganPane.visible        = false
           VeganRawMaterialLabel.visible = false
           addMaterial.visible           = false
           buidlAllergiaPane.visible     = false
           addVeganMaterial.visible      = false
           addWA.visible                 = false
           WARawMaterialLabel.visible    = false
        }
      }
     this.revalidate()
    this.repaint()

    }


    var VeganRawMaterialLabel = new Label()
    val VeganButtonAmount = new Button("Vegan raw material amount")
  listenTo(VeganButtonAmount)
    reactions +=
      {

      case painallus: ButtonClicked => {
        if(painallus.source==VeganButtonAmount ){
          if(VeganRawMaterialLabel.visible == false){
             VeganRawMaterialLabel.text     = Recipe.amounTotext("vegan"+nimi)
          }
             VeganRawMaterialLabel.visible  = !VeganRawMaterialLabel.visible
             buildPane.visible              = false
             buidlVeganPane.visible         = false
             RawMaterialLabel.visible       = false
             addMaterial.visible            = false
             buidlAllergiaPane.visible      = false
             addVeganMaterial.visible       = false
             addWA.visible                  = false
             WARawMaterialLabel.visible     = false

        }
      }
     this.revalidate()
    this.repaint()

    }



    var WARawMaterialLabel   = new Label()                         // Wihtout Allergies = shortline WA
    val WAButtonAmount       = new Button("No allergies raw material amount ")
  listenTo(WAButtonAmount)
    reactions +=
      {

      case painallus: ButtonClicked => {
        if(painallus.source==WAButtonAmount ){
          if(WARawMaterialLabel.visible == false){
        WARawMaterialLabel.text          = Recipe.amounTotext("no allergies"+ " "+nimi)
          }
          WARawMaterialLabel.visible     = !WARawMaterialLabel.visible
          buildPane.visible              = false
          buidlVeganPane.visible         = false
          RawMaterialLabel.visible       = false
          addMaterial.visible            = false
          buidlAllergiaPane.visible      = false
          addVeganMaterial.visible       = false
          addWA.visible                  = false
          VeganRawMaterialLabel.visible  = false

        }
      }
     this.revalidate()
    this.repaint()

    }




    var addMaterial = new Label()
    val addButton   = new Button("Add raw material")
        listenTo(addButton)
    reactions+=
      {

      case painallus: ButtonClicked => {
        if(painallus.source==addButton ){
          if(addMaterial.visible == false){
        addMaterial.text = Recipe.addRawMaterials(
          nimi)
          }
          Recipe.addRawMaterials(nimi)
          addMaterial.visible           = !addMaterial.visible
          buildPane.visible             = false
          buidlVeganPane.visible        = false
          VeganRawMaterialLabel.visible = false
          RawMaterialLabel.visible      = false
          buidlAllergiaPane.visible     = false
          addVeganMaterial.visible      = false
          addWA.visible                 = false
          WARawMaterialLabel.visible    = false
        }
      }
     this.revalidate()
    this.repaint()

    }



 var addVeganMaterial = new Label()
    val addVeganButton = new Button("Add vegan raw material ")
  listenTo(addVeganButton)
    reactions +=
      {

      case painallus: ButtonClicked => {
        if(painallus.source==addVeganButton ){
          if(addVeganMaterial.visible == false){
        addVeganMaterial.text           = Recipe.addRawMaterials(
          "vegan"+nimi)
          }
          Recipe.addRawMaterials("vegan"+nimi)
          addVeganMaterial.visible      = !addVeganMaterial.visible
          buildPane.visible             = false
          buidlVeganPane.visible        = false
          VeganRawMaterialLabel.visible = false
          RawMaterialLabel.visible      = false
          buidlAllergiaPane.visible     = false
          addMaterial.visible           = false
          addWA.visible                 = false
          WARawMaterialLabel.visible    = false

        }
      }
     this.revalidate()
    this.repaint()

    }





    var addWA       = new Label()                                                 // Wihtout Allergies = shortline WA
    val addWAButton = new Button("Add no allergies raw material")
        listenTo(addWAButton)
    reactions +=
      {

      case painallus: ButtonClicked => {
        if(painallus.source==addWAButton ){
          if(addWA.visible == false){
        addWA.text       = Recipe.addRawMaterials(
          "no allergies"+ " "+nimi)
          }
          Recipe.addRawMaterials("no allergies"+ " "+nimi)
          addWA.visible                  = !addWA.visible
          buildPane.visible              = false
          buidlVeganPane.visible         = false
          VeganRawMaterialLabel.visible  = false
          RawMaterialLabel.visible       = false
          buidlAllergiaPane.visible      = false
          addMaterial.visible            = false
          addVeganMaterial.visible       = false
          WARawMaterialLabel.visible     = false


        }
      }
     this.revalidate()
    this.repaint()

    }




    contents += normalButton
    contents += veganButton
    contents += allergicButton
    contents += ButtonAmount
    contents += VeganButtonAmount
    contents += WAButtonAmount
    contents += addButton
    contents += addVeganButton
    contents += addWAButton


    contents += RawMaterialLabel
    contents += VeganRawMaterialLabel
    contents += WARawMaterialLabel
    contents += addMaterial
    contents += addVeganMaterial
    contents += addWA
    contents += buidlAllergiaPane



    buildPane.minimumSize             = new Dimension(400, 400)
    buildPane.preferredSize           = new Dimension(400, 400)
    val scroll                        = new ScrollPane(buildPane)
    scroll.horizontalScrollBarPolicy  = ScrollPane.BarPolicy.Never
    contents += scroll


    buidlVeganPane.minimumSize        = new Dimension(400, 400)
    buidlVeganPane.preferredSize      = new Dimension(400, 400)
    val scroll3                       = new ScrollPane(buidlVeganPane)
    scroll3.horizontalScrollBarPolicy = ScrollPane.BarPolicy.Never
                            contents += scroll3

     buidlAllergiaPane.minimumSize    = new Dimension(400, 400)
    buidlAllergiaPane.preferredSize   = new Dimension(400, 400)
    val scroll9                       = new ScrollPane(buidlAllergiaPane)
    scroll9.horizontalScrollBarPolicy = ScrollPane.BarPolicy.Never
    contents                         += scroll9




   buildPane.visible                  = false
   RawMaterialLabel.visible           = false
   buidlVeganPane.visible             = false
    VeganRawMaterialLabel.visible     = false
    addMaterial.visible               = false
    buidlAllergiaPane.visible         = false
     addVeganMaterial.visible         = false
     addWA.visible                    = false
    WARawMaterialLabel.visible        = false

    this.revalidate()
    this.repaint()
  }



  val rightSide                       = new GridPanel(1, 1)
      rightSide.contents            ++= foodPanel

 val main                             = new MainFrame
     main.contents                    = rightSide
     main.title                       = "Smart Receipt"
  //nappulaikkuna.background = java.awt.Color.yellow



  def top = this.main
}





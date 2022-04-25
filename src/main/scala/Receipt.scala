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
     "<html>Put the oven to warm to 250´c. Place the pizza base on a baking sheet over the baking paper."+
 "<html>Then spread the desired amount of filling on the bottom and grated cheese on top, optionally pizza seasoning and in the oven."+
 "<html>Bake in the oven for about 6-8 minutes or until the cheese has melted nicely." +
  "<html>Take the pizza out of the oven and butter Lift the pizza base over the baking paper on a baking sheet." +
"<html>Drain the tuna. Peel and chop the red onion. Spread the pizza sauce on top." +
"<html>Add the fillings and grated cheese. Bake the pizza in a 250 degree oven for 10-15 minutes. Sprinkle oregano on top if desired.<br/>"

    val Omlette ="<html>Break the structure of the eggs in a bowl and add water or milk, salt and pepper."+
"<html>Heat the fat in a frying pan and pour the egg mixture into the hot pan."+
"<html>Lower the heat. Pull the egg mass with a spatula along the bottom from the edges to the center"+
 "<html>until the omelet is almost clotted. The surface must remain moist.<br/>"

  val puuro = "<html>Boil water and salt in a saucepan. Stir in the oatmeal. Boil for a few min."+
"<html>Add milk. Cook for another 5 minutes, stirring occasionally."+
"<html>Lift the kettle aside and allow to set for 5 minutes."+
"<html>Serve with buttery eye, a pinch of sugar and milk<br/>"


  val pasta = "<html>Sprinkle a drop of olive oil on the bottom of the iron pan. Put the whole feta in a pan." +
  "<html>Small chili and put on top of feta. Sprinkle briskly with olive oil."+
  "<html>Put the cherry tomatoes in a pan and spin in olive oil. Grind over black pepper and finish with a pinch of salt."+
"<html>Bake in the middle of the oven at 200 degrees for 15 minutes."+
"<html>Raise the heat to 225 degrees and turn the oven to grill resistance. Raise the pan to the top of the oven and bake for another 10 minutes."+
"<html>Note! Watch for toasting. The cooking time depends on the oven."+
"<html>Cook the pasta according to the instructions."+
"<html>If you use branched cherry tomatoes, remove the branches and stems." +
   "<html>mix the whole baking dish into the pasta. Serve with basil.<br/>"


 val tikkamasala = "<html>Sauté oil-chopped onion, garlic cloves, grated ginger, spices and tomato sauce." +
 "<html>Add the tomato paste and simmer for 15 minutes."+
"<html>Chop the chicken fillets and brown the surface in a hot pan."+
"<html>Take the sauce off the stove and puree with a stick blender. The mouthfeel and coincidences may be left in the sauce."+
"<html>Add the chicken pieces and yogurt. Simmer for about another 10 minutes or until the chickens are cooked through.<br/>"

 val veganpizza = "<html> Put the oven to warm to 250´c. Place the pizza base on a baking sheet over the baking paper."+
 "<html>Then spread the desired amount of filling on the bottom and grated vegan cheese on top, optionally pizza seasoning and in the oven."+
 "<html>Bake in the oven for about 6-8 minutes or until the cheese has melted nicely."+
  "<html>Take the pizza out of the oven and butter Lift the pizza base over the baking paper on a baking sheet."+
"<html>Drain the peppers and zucchini. Peel and chop the red onion. Spread the pizza sauce on top."+
"<html>Add the fillings and grated vegan cheese. Bake the pizza in a 250 degree oven for 10-15 minutes. Sprinkle oregano on top if desired.<br/>"



 val vegantikkamasla =  "<html>Sauté oil-chopped onion, garlic cloves, grated ginger, spices and tomato sauce." +
 "<html>Add the tomato paste and simmer for 15 minutes."+
"<html>Chop the tofu and brown the surface in a hot pan."+
"<html>Take the sauce off the stove and puree with a stick blender. The mouthfeel and coincidences may be left in the sauce."+
"<html>Add the  tofus. Simmer for about another 10 minutes or until the chickens are cooked through.<br/>"


   val ilmanAllergiatikkamasala =
      "<html>(WITHOUT SPICE RECEIPE )Sauté oil-chopped onion, garlic cloves, grated ginger and tomato sauce." +
 "<html>Add the tomato paste and simmer for 15 minutes."+
"<html>Chop the chicken fillets and brown the surface in a hot pan."+
"<html>Take the sauce off the stove and puree with a stick blender. The mouthfeel and coincidences may be left in the sauce."+
"<html>Add the chicken pieces and  LACTOS FREE yogurt. Simmer for about another 10 minutes or until the chickens are cooked through.<br/>"

  val ilmanallergiaPizza =  "<html>(WITHOUT TUNA)Put the oven to warm to 250´c. Place the pizza base on a baking sheet over the baking paper."+
 "<html>Then spread the desired amount of filling on the bottom and LACTOS FREE grated cheese on top, optionally pizza seasoning and in the oven."+
 "<html>Bake in the oven for about 6-8 minutes or until the cheese has melted nicely."+
  "<html>Take the pizza out of the oven and butter Lift the pizza base over the baking paper on a baking sheet."+
"<html>Drain the chicken fillets. Peel and chop the red onion. Spread the pizza sauce on top."+
"<html>Add the fillings and  LACTOS FREE grated cheese. Bake the pizza in a 250 degree oven for 10-15 minutes<br/>"

    val ilmanallergiapuuro = "<html>Boil water and salt in a saucepan. Stir in the oatmeal. Boil for a few min."+
"<html>Add LACTOS FREE milk. Cook for another 5 minutes, stirring occasionally."+
"<html>Lift the kettle aside and allow to set for 5 minutes."+
"Serve with buttery eye and milk<br/>"

  val ilmanallergiaomelette = "<html>(WITHOUT SPICE RECEIPE) Break the structure of the eggs in a bowl and add LACTOS FREE  milk."+
"<html>Heat the fat in a frying pan and pour the egg mixture into the hot pan."+
"<html>Lower the heat. Pull the egg mass with a spatula along the bottom from the edges to the center"+
 "<html>until the omelet is almost clotted. The surface must remain moist.<br/>"


  val ilmanAllergiaPasta=  "<html>(WITHOUT SPICE RECEIPE) Sprinkle a drop of olive oil on the bottom of the iron pan. Put the whole LACTOS FREE  feta in a pan." +
  "<html> Sprinkle briskly with olive oil."+
  "<html>Put the cherry tomatoes in a pan and spin in olive oil"+
"<html>Bake in the middle of the oven at 200 degrees for 15 minutes."+
"<html>Raise the heat to 225 degrees and turn the oven to grill resistance. Raise the pan to the top of the oven and bake for another 10 minutes."+
"<html>Note! Watch for toasting. The cooking time depends on the oven."+
"<html>Cook the pasta according to the instructions."+
"<html>If you use branched cherry tomatoes, remove the branches and stems." +
  "<html>mix the whole baking dish into the pasta. Serve with basil.<br/>"



  val veganpasta=
  "<html>Sprinkle a drop of olive oil on the bottom of the iron pan. Put the whole VEGAN feta in a pan." +
  "<html>Small chili and put on top of feta. Sprinkle briskly with olive oil."+
  "<html>Put the cherry tomatoes in a pan and spin in olive oil. Grind over black pepper and finish with a pinch of salt."+
"<html>Bake in the middle of the oven at 200 degrees for 15 minutes."+
"<html>Raise the heat to 225 degrees and turn the oven to grill resistance. Raise the pan to the top of the oven and bake for another 10 minutes."+
"<html>Note! Watch for toasting. The cooking time depends on the oven."+
"<html>Cook the pasta according to the instructions."+
"<html>If you use branched cherry tomatoes, remove the branches and stems." +
 "<html>mix the whole baking dish into the pasta. Serve with basil.<br/>"



  val veganomlette = "<html>(Using the same recipe as the normal recipe) " +
   "<html>Break the structure of the eggs in a bowl and add water or milk, salt and pepper."+
"<html>Heat the fat in a frying pan and pour the egg mixture into the hot pan."+
"<html>Lower the heat. Pull the egg mass with a spatula along the bottom from the edges to the center"+
 "<html>until the omelet is almost clotted. The surface must remain moist.<br/>"






  val veganpuuro =  "<html>Boil water and salt in a saucepan. Stir in the oatmeal. Boil for a few min."+
"<html>. Cook for another 5 minutes, stirring occasionally."+
"<html>Lift the kettle aside and allow to set for 5 minutes."+
" <br/>"


   val kuvaukset   =     Map("pizza" -> pizza , "omlette" -> Omlette,  "porridge" -> puuro, "fetapasta" -> pasta,
     "tikkamasala"-> tikkamasala, "veganpizza"-> veganpizza, "vegantikkamasala" -> vegantikkamasla,
   "veganfetapasta" -> veganpasta, "veganomlette"-> veganomlette,"veganporridge" -> veganpuuro, "without allergies omlette"-> ilmanallergiaomelette,
     "without allergies pizza" -> ilmanallergiaPizza,  "without allergies fetapasta"-> ilmanAllergiaPasta, "without allergies porridge" -> ilmanallergiapuuro,
     "without allergies tikkamasala" -> ilmanAllergiatikkamasala)

   val ruokakaappi    =   collection.mutable.Map ("tuna" -> 360, "tomato" -> 2, "milk" -> 1000,"egg" -> 500 ,
     "pizza cheese" -> 500, "chicken fillets"-> 2000,"tomato souce" -> 1200, "onion" -> 200, "pizza Base" -> 300, "oil"-> 1000
   , "salt"-> 100, "black pepper" -> 30, "ginger"-> 90, "water" -> 10000, "oat" -> 900, "pasta" -> 1000,
     "cherry tomato" -> 800, "basilica"-> 50, "feta"-> 200, "mozzarella" ->  200, "tofu"-> 400, "veganfeta" -> 400,  "zucchini" ->  300, "parika" -> 300,
     "vegan pizza cheese" -> 300, "lactose free feta"-> 200, "lactose free pizza cheese"->1000, "lactose free pizza yogurt"-> 300, "spices" -> 90, "yogurt"->300,
     "lactose free milk"-> 1000 )
   val pizzaresepti =    Map ("tomato souce" -> 400, "pizza cheese" -> 100 , "pizza Base" -> 150, "tuna" -> 360)
  val veganipizza     =  Map ("tomato souce" -> 400,  "vegan pizza cheese" -> 100 , "pizza Base" -> 150, "zucchini" ->  100, "parika" -> 100 )
  val omeletteresepti =  Map ("egg" -> 240 ,"salt"-> 10, "black pepper" -> 10, "oil"-> 200, "milk"-> 100)
  val tikkamaslaresepti = Map("chicken fillets"-> 400, "salt"-> 20,"onion" -> 50, "ginger"-> 30, "oil"-> 100, "yogurt"->100,"spices" -> 30, "tomato souce" -> 100)
  val puuroo = Map ("water" -> 500, "oat" -> 400 , "milk"-> 500, "salt"-> 10 )
  val pastaa = Map ("pasta" -> 200 , "feta"-> 200, "oil"-> 100 , "cherry tomato" -> 400, "basilica"-> 20, "salt"-> 10,  "black pepper" -> 10)
  val veganpuurorsepti = Map ("water" -> 500, "oat" -> 400 , "salt"-> 10 )
  val vegantikkaresepti = Map("tofu"-> 400, "salt"-> 20,"onion" -> 50, "ginger"-> 30, "oil"-> 100 )
  val veganomletteresepti = Map ("egg" -> 240 ,"salt"-> 10, "black pepper"-> 10, "oil"-> 200 )
  val veganpastaresepti = Map ("pasta" -> 200 , "veganfeta"-> 200, "oil"-> 100 , "cherry tomato" -> 400, "basilica"-> 20, "salt"-> 10,  "black pepper" -> 10)
  val ilmanAllergiaTikkamaslaResepti = Map("chicken fillets"-> 400, "onion" -> 50, "ginger"-> 30, "oil"-> 100, "lactose free pizza yogurt"-> 100)
  val ilmanAllergiaOmeletteResepti =  Map ("egg" -> 240 , "oil"-> 200, "lactose free milk"-> 200 )
  val ilmanAllergiapuurooResepti = Map ( "oat" -> 400 , "lactose free milk"-> 500 )
  val ilmanallergiapastaResepti = Map ("pasta" -> 200 , "lactose free feta"-> 200, "oil"-> 100 , "cherry tomato" -> 400, "basilica"-> 20)
  val ilmanAllergiaPizzaResepti =  Map ("tomato souce" -> 400, "lactose free pizza cheese"->100 , "pizza Base" -> 150, "chicken fillets" -> 360, "tomato souce" -> 100)
  val reseptit = Map("pizza"->pizzaresepti,"omlette" -> omeletteresepti, "porridge" -> puuroo,"fetapasta"-> pastaa
  , "tikkamasala"-> tikkamaslaresepti, "veganpizza"-> veganipizza,"veganfetapasta" -> veganpastaresepti,
    "vegantikkamasala"->vegantikkaresepti,"veganomlette"-> veganomletteresepti, "veganporridge"-> veganpuurorsepti , "without allergies pizza"-> ilmanAllergiaPizzaResepti,
 "without allergies omlette"-> ilmanAllergiaOmeletteResepti, "without allergies porridge"-> ilmanAllergiapuurooResepti,"without allergies fetapasta" ->ilmanallergiapastaResepti,
    "without allergies tikkamasala"-> ilmanAllergiaTikkamaslaResepti )




  def makefood (ruoka: String)={
   var text = "<html>"
    for {
      (reseptinAine, reseptinMaara) <- reseptit(ruoka)
    } {
      if (ruokakaappi(reseptinAine) >= reseptinMaara) {
        ruokakaappi(reseptinAine) = ruokakaappi(reseptinAine)- reseptinMaara

      text = text +" " + kuvaukset(ruoka) + "<br>"
    }
      else{
       //val puuttuu =   reseptinMaara - ruokakaappi(reseptinAine)
      text = text + "et voi käyttää tätä reseptiä, koska tietyt raaka-aineet ovat loppunut käy tarkistamssa raaka-aine tarkistuksen kohdassa <br>"
}
    }
    text += "</html>"
    text
  }




 def maketext (ruoka: String)={
   var text = "<html>"
    for {
      (reseptinAine, reseptinMaara) <- reseptit(ruoka)
    } {
      if (ruokakaappi(reseptinAine) >= reseptinMaara) {
      text = text + reseptinAine + " " +"the amount is a suitable amount to use in the recipe<br/>"
    }
      else{
       val puuttuu =   reseptinMaara - ruokakaappi(reseptinAine)
      text = text + "finished" + " " + reseptinAine + "  " + "and need at least" + " " + puuttuu + "g"  + " "+ reseptinAine + "<br>"
}
    }
    text += "</html>"
    text
  }




  def addfood (ruoka: String)={
   var text = "<html>"
    for {
      (reseptinAine, reseptinMaara) <- reseptit(ruoka)
    } {
      if (ruokakaappi(reseptinAine) <= reseptinMaara) {
        ruokakaappi(reseptinAine) = ruokakaappi(reseptinAine)+ reseptinMaara
        val lisätty = ruokakaappi(reseptinAine)+ reseptinMaara

      text =text + " about"  + " " +lisätty+ "g"+ " " +reseptinAine + " "+  "has been added to the cupboard<br/>"
    }


      else {
        text = text + reseptinAine +  " " + "the amount is a suitable amount and does not need to be added<br/>"

      }

    }
    text += "</html>"
    text
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
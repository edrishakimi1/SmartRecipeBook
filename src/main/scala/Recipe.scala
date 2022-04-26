//import main.Receipt
import scala.collection.mutable.Buffer
object Recipe {

  val pizzaRecipe =
      "<html>Put the oven to warm to 250´c. Place the pizza base on a baking sheet over the baking paper. "+
      "<html>Then spread the desired amount of filling on the bottom and grated cheese on top, optionally pizza seasoning and in the oven. "+
      "<html>Bake in the oven for about 6-8 minutes or until the cheese has melted nicely. " +
      "<html>Take the pizza out of the oven and butter Lift the pizza base over the baking paper on a baking sheet. " +
      "<html>Drain the tuna. Peel and chop the red onion. Spread the pizza sauce on top. " +
      "<html>Add the fillings and grated cheese. Bake the pizza in a 250 degree oven for 10-15 minutes. Sprinkle oregano on top if desired.<br/>"

  val omletteRecipe =
      "<html>Break the structure of the eggs in a bowl and add water or milk, salt and pepper. "+
      "<html>Heat the fat in a frying pan and pour the egg mixture into the hot pan. "+
      "<html>Lower the heat. Pull the egg mass with a spatula along the bottom from the edges to the center"+
      "<html>until the omelet is almost clotted. The surface must remain moist.<br/>"

  val porridgeRecipe =
      "<html>Boil water and salt in a saucepan. Stir in the oatmeal. Boil for a few min. "+
      "<html>Add milk. Cook for another 5 minutes, stirring occasionally. "+
      "<html>Lift the kettle aside and allow to set for 5 minutes. "+
      "<html>Serve  a pinch of sugar and milk<br/>"


 val pastaRecipe =
      "<html>Sprinkle a drop of olive oil on the bottom of the iron pan. Put the whole feta in a pan. " +
      "<html>Small chili and put on top of feta. Sprinkle briskly with olive oil. "+
      "<html>Put the cherry tomatoes in a pan and spin in olive oil. Grind over black pepper and finish with a pinch of salt. "+
      "<html>Bake in the middle of the oven at 200 degrees for 15 minutes. "+
      "<html>Raise the heat to 225 degrees and turn the oven to grill resistance. Raise the pan to the top of the oven and bake for another 10 minutes. "+
      "<html>Note! Watch for toasting. The cooking time depends on the oven. "+
      "<html>Cook the pasta according to the instructions. "+
      "<html>If you use branched cherry tomatoes, remove the branches and stems. " +
      "<html>mix the whole baking dish into the pasta. Serve with basil.<br/>"


 val tikkamasalaRecipe =
      "<html>Sauté oil-chopped onion, garlic cloves, grated ginger, spices and tomato sauce. " +
      "<html>Add the tomato paste and simmer for 15 minutes. "+
      "<html>Chop the chicken fillets and brown the surface in a hot pan. "+
      "<html>Take the sauce off the stove and puree with a stick blender. The mouthfeel and coincidences may be left in the sauce. "+
      "<html>Add the chicken pieces and yogurt. Simmer for about another 10 minutes or until the chickens are cooked through.<br/>"

 val VeganPizzaRecipe =
      "<html> Put the oven to warm to 250´c. Place the pizza base on a baking sheet over the baking paper. "+
      "<html>Then spread the desired amount of filling on the bottom and grated vegan cheese on top, optionally pizza seasoning and in the oven. "+
      "<html>Bake in the oven for about 6-8 minutes or until the cheese has melted nicely. "+
      "<html>Take the pizza out of the oven and butter Lift the pizza base over the baking paper on a baking sheet. "+
      "<html>Drain the peppers and zucchini. Peel and chop the red onion. Spread the pizza sauce on top. "+
      "<html>Add the fillings and grated vegan cheese. Bake the pizza in a 250 degree oven for 10-15 minutes. Sprinkle oregano on top if desired.<br/>"



 val VeganTikkamaslaRecipe =
      "<html>Sauté oil-chopped onion, garlic cloves, grated ginger, spices and tomato sauce. " +
      "<html>Add the tomato paste and simmer for 15 minutes. "+
      "<html>Chop the tofu and brown the surface in a hot pan. "+
      "<html>Take the sauce off the stove and puree with a stick blender. The mouthfeel and coincidences may be left in the sauce. "+
      "<html>Add the  tofus. Simmer for about another 10 minutes or until the chickens are cooked through.<br/>"


 val withoutAllergiesTikkamasalaRecipe =
     "<html>(WITHOUT SPICE RECEIPE )Sauté oil-chopped onion, garlic cloves, grated ginger and tomato sauce. " +
     "<html>Add the tomato paste and simmer for 15 minutes. "+
     "<html>Chop the chicken fillets and brown the surface in a hot pan. "+
     "<html>Take the sauce off the stove and puree with a stick blender. The mouthfeel and coincidences may be left in the sauce. "+
     "<html>Add the chicken pieces and  LACTOS FREE yogurt. Simmer for about another 10 minutes or until the chickens are cooked through.<br/>"

 val withoutAllergiesPizzaRecipe =
     "<html>(WITHOUT TUNA) Put the oven to warm to 250´c. Place the pizza base on a baking sheet over the baking paper. "+
     "<html>Then spread the desired amount of filling on the bottom and LACTOS FREE grated cheese on top, optionally pizza seasoning and in the oven. "+
     "<html>Bake in the oven for about 6-8 minutes or until the cheese has melted nicely. "+
     "<html>Take the pizza out of the oven and butter Lift the pizza base over the baking paper on a baking sheet. "+
     "<html>Drain the chicken fillets. Peel and chop the red onion. Spread the pizza sauce on top. "+
     "<html>Add the fillings and  LACTOS FREE grated cheese. Bake the pizza in a 250 degree oven for 10-15 minutes<br/>"

 val withoutAllergiesPorridgeRecipe =
     "<html>Boil water and salt in a saucepan. Stir in the oatmeal. Boil for a few min. "+
     "<html>Add LACTOS FREE milk. Cook for another 5 minutes, stirring occasionally. "+
     "<html>Lift the kettle aside and allow to set for 5 minutes. "+
     "Serve with sugar<br/>"

 val withoutAllergiesOmletteRecipe =
    "<html>(WITHOUT SPICE RECEIPE) Break the structure of the eggs in a bowl and add LACTOS FREE  milk. "+
    "<html>Heat the fat in a frying pan and pour the egg mixture into the hot pan. "+
    "<html>Lower the heat. Pull the egg mass with a spatula along the bottom from the edges to the center"+
    "<html>until the omelet is almost clotted. The surface must remain moist.<br/>"


 val withoutAllergiesPastaRecipe=
    "<html>(WITHOUT SPICE RECEIPE) Sprinkle a drop of olive oil on the bottom of the iron pan. Put the whole LACTOS FREE  feta in a pan. " +
    "<html> Sprinkle briskly with olive oil. "+
    "<html>Put the cherry tomatoes in a pan and spin in olive oil"+
    "<html>Bake in the middle of the oven at 200 degrees for 15 minutes. "+
    "<html>Raise the heat to 225 degrees and turn the oven to grill resistance. Raise the pan to the top of the oven and bake for another 10 minutes. "+
    "<html>Note! Watch for toasting. The cooking time depends on the oven. "+
    "<html>Cook the pasta according to the instructions. "+
    "<html>If you use branched cherry tomatoes, remove the branches and stems. " +
    "<html>mix the whole baking dish into the pasta. Serve with basil.<br/>"



  val veganPastaRecipe=
   "<html>Sprinkle a drop of olive oil on the bottom of the iron pan. Put the whole VEGAN feta in a pan. " +
   "<html>Small chili and put on top of feta. Sprinkle briskly with olive oil. "+
   "<html>Put the cherry tomatoes in a pan and spin in olive oil. Grind over black pepper and finish with a pinch of salt. "+
   "<html>Bake in the middle of the oven at 200 degrees for 15 minutes. "+
   "<html>Raise the heat to 225 degrees and turn the oven to grill resistance. Raise the pan to the top of the oven and bake for another 10 minutes. "+
   "<html>Note! Watch for toasting. The cooking time depends on the oven. "+
   "<html>Cook the pasta according to the instructions. "+
   "<html>If you use branched cherry tomatoes, remove the branches and stems. " +
   "<html>mix the whole baking dish into the pasta. Serve with basil.<br/>"



   val VeganOmletteRecipe =
   "<html>(Using the same recipe as the normal recipe) " +
   "<html>Break the structure of the eggs in a bowl and add water or milk, salt and pepper. "+
   "<html>Heat the fat in a frying pan and pour the egg mixture into the hot pan. "+
   "<html>Lower the heat. Pull the egg mass with a spatula along the bottom from the edges to the center"+
   "<html>until the omelet is almost clotted. The surface must remain moist.<br/>"


   val VeganPorridgeRecipe =
    "<html>Boil water and salt in a saucepan. Stir in the oatmeal. Boil for a few min. "+
    "<html>Cook for another 5 minutes, stirring occasionally. "+
    "<html>Lift the kettle aside and allow to set for 5 minutes.<br/>"




  val descriptions                         = Map("pizza" -> pizzaRecipe , "omlette" -> omletteRecipe,  "porridge" -> porridgeRecipe, "fetapasta" -> pastaRecipe,
                                                 "tikkamasala"-> tikkamasalaRecipe, "veganpizza"-> VeganPizzaRecipe, "vegantikkamasala" -> VeganTikkamaslaRecipe,
                                                 "veganfetapasta" -> veganPastaRecipe, "veganomlette"-> VeganOmletteRecipe,"veganporridge" -> VeganPorridgeRecipe,
                                                 "no allergies omlette"-> withoutAllergiesOmletteRecipe, "no allergies pizza" -> withoutAllergiesPizzaRecipe,
                                                 "no allergies fetapasta"-> withoutAllergiesPastaRecipe, "no allergies porridge" -> withoutAllergiesPorridgeRecipe,
                                                 "no allergies tikkamasala" -> withoutAllergiesTikkamasalaRecipe)

   val pantry             = collection.mutable.Map("tuna" -> 360, "tomato" -> 2, "milk" -> 1000,"egg" -> 500 ,
                                                   "pizza cheese" -> 500, "chicken fillets"-> 2000,"tomato souce" -> 1200,
                                                   "onion" -> 200, "pizza Base" -> 300, "oil"-> 1000, "salt"-> 100,
                                                   "black pepper" -> 30, "ginger"-> 90, "water" -> 10000, "oatmeal" -> 900, "pasta" -> 1000,
                                                   "cherry tomato" -> 800, "basilica"-> 50, "feta"-> 200, "mozzarella" ->  200, "tofu"-> 400,
                                                   "veganfeta" -> 400,  "zucchini" ->  300, "parika" -> 300,
                                                   "vegan pizza cheese" -> 300, "lactose free feta"-> 200, "lactose free pizza cheese"->1000,
                                                   "lactose free pizza yogurt"-> 300, "spices" -> 90, "yogurt"->300,"lactose free milk"-> 1000)
  
   val pizzaRawMaterial                      = Map ("tomato souce" -> 400, "pizza cheese" -> 100 , "pizza Base" -> 150, "tuna" -> 360)
   val veganPizzaRawMaterial                 = Map ("tomato souce" -> 400,  "vegan pizza cheese" -> 100 , "pizza Base" -> 150, "zucchini" ->  100, "parika" -> 100 )
   val omeletteRawMaterial                   = Map ("egg" -> 240 ,"salt"-> 10, "black pepper" -> 10, "oil"-> 200, "milk"-> 100)
   val tikkamaslaRawMaterial                 = Map ("chicken fillets"-> 400, "salt"-> 20,"onion" -> 50, "ginger"-> 30, "oil"-> 100, "yogurt"->100,"spices" -> 30, "tomato souce" -> 100)
   val porridgeRawMaterial                   = Map ("water" -> 500, "oatmeal" -> 400 , "milk"-> 500, "salt"-> 10 )
   val pastaRawMaterial                      = Map ("pasta" -> 200 , "feta"-> 200, "oil"-> 100 , "cherry tomato" -> 400, "basilica"-> 20, "salt"-> 10,  "black pepper" -> 10)
   val veganPorrdigeRawMaterial              = Map ("water" -> 500, "oatmeal" -> 400 , "salt"-> 10 )
   val veganTikkamaslaRawMaterial            = Map ("tofu"-> 400, "salt"-> 20,"onion" -> 50, "ginger"-> 30, "oil"-> 100 )
   val veganOmletteRawMaterial               = Map ("egg" -> 240 ,"salt"-> 10, "black pepper"-> 10, "oil"-> 200 )
   val veganPastaRawMaterial                 = Map ("pasta" -> 200 , "veganfeta"-> 200, "oil"-> 100 , "cherry tomato" -> 400, "basilica"-> 20, "salt"-> 10,  "black pepper" -> 10)
   val withoutAllergiesTikkamaslaRawMaterial = Map ("chicken fillets"-> 400, "onion" -> 50, "ginger"-> 30, "oil"-> 100, "lactose free pizza yogurt"-> 100)
   val withoutAllergiesOmletteRawMaterial    = Map ("egg" -> 240 , "oil"-> 200, "lactose free milk"-> 200 )
   val withoutAllergiesPorridgeRawMaterial   = Map ( "oatmeal" -> 400 , "lactose free milk"-> 500 )
   val withoutAllergiesPastaRawMaterial      = Map ("pasta" -> 200 , "lactose free feta"-> 200, "oil"-> 100 , "cherry tomato" -> 400, "basilica"-> 20)
   val withoutAllergiesPizzaRawMaterial      = Map ("tomato souce" -> 400, "lactose free pizza cheese"->100 , "pizza Base" -> 150, "chicken fillets" -> 360, "tomato souce" -> 100)


   val recipesRawMaterials                   = Map("no allergies fetapasta" ->withoutAllergiesPastaRawMaterial,"tikkamasala"-> tikkamaslaRawMaterial,
                                                   "veganpizza"-> veganPizzaRawMaterial,"veganfetapasta" -> veganPastaRawMaterial,
                                                   "vegantikkamasala"->veganTikkamaslaRawMaterial,"no allergies porridge"-> withoutAllergiesPorridgeRawMaterial,
                                                   "veganporridge"-> veganPorrdigeRawMaterial,"no allergies pizza"-> withoutAllergiesPizzaRawMaterial,
                                                   "fetapasta"-> pastaRawMaterial,"no allergies omlette"-> withoutAllergiesOmletteRawMaterial,
                                                   "veganomlette"-> veganOmletteRawMaterial,"porridge" -> porridgeRawMaterial,"pizza"->pizzaRawMaterial,
                                                   "no allergies tikkamasala"-> withoutAllergiesTikkamaslaRawMaterial, "omlette" -> omeletteRawMaterial)




  def makefood (food: String)={
   var text    = "<html>"
   var missing = Buffer[Int]()
     for {
      (recipeRaw, recipeAmount) <- recipesRawMaterials(food)
    } {
     if (pantry(recipeRaw) >= recipeAmount) {                                      //I'm checking here is pantry Raw material enough to use in recipe
          pantry(recipeRaw) = pantry(recipeRaw)- recipeAmount                      //If it's enough the should update the raw material after using


    }
     else{
        val miss =   recipeAmount - pantry(recipeRaw)                              //"miss" telling me that how many amount of raw materials is missing
                                                                                   // or which raw mater and how much

            missing += (miss)                                                      // then adding to buffer.
      }
    }



     if(missing.toList.isEmpty){                                                  // In here I'm checking that if buffer is empty.That means pantry amount is enough tu use in recipe
           text = " " + descriptions(food)+ "<br>"                                    //Then I return the recipe text

      }
     else{
          text = text + "You cannot use this recipe because you have run out  the raw material, please check raw materia amount section what's is missing<br>"
    }

          text += "</html>"
          text
  }




 def amounTotext(food: String)={
   var text = "<html>"
    for {
      (recipeRaw, recipeAmount) <- recipesRawMaterials(food)
    } {
      if (pantry(recipeRaw) >= recipeAmount) {                                                        // This method working as well like Above but the only difference is that
                                                                                                      // I'm not updating the raw material amount. I'm just returning the text
                                                                                                      // the text telling amount of raw materil having in pantry
      text = text + recipeRaw + " " +"the amount is a suitable amount to use in the recipe<br/>"
    }
      else{
       val miss =   recipeAmount - pantry(recipeRaw)
      text = text + "out of" + " " + recipeRaw + "  " + "and need at least" + " " + miss + "g"  + " "+ recipeRaw + "<br>"
      }
    }
    text += "</html>"
    text
  }




  def addRawMaterials(food: String)={
   var text = "<html>"
    for {
      (recipeRaw, recipeAmount) <- recipesRawMaterials(food)
    } {
      if (pantry(recipeRaw) <= recipeAmount) {
        pantry(recipeRaw) = pantry(recipeRaw)+ recipeAmount
        val added = pantry(recipeRaw)+ recipeAmount                                   // telling that how many amount of raw material had been added

      text =text + " about"  + " " +added+ "g"+ " " +recipeRaw + " "+  "has been added to the cupboard<br/>"
    }


      else {
        text = text + recipeRaw +  " " + "the amount is a suitable amount and does not need to be added<br/>"

      }

    }
    text += "</html>"
    text
  }

}
fun main() {
  fact("Lavington")
  values()
   nouns()

}
// using for loop to print the lenght of an arra
fun fact(town:String){

  println(town)
  for (x in town)
    println(x)
  println(town.length)

  var  point = "its possible"
  println(point.uppercase())

}
// printing the element at the neutral number

fun name(name1:String){
 print(statement("7"))
}
fun statement(Neutral:String){
val x = "7"
  if (x ==(Neutral))
    println("Neutral")
  else println("acidic")

}
//finding the maximum number of the arrays
fun values(){
 var value = arrayOf(34,18,52,39,13)
  println(value.max())

}
//sorting arra from firs leer to last volcanic sounds

fun nouns(){
  var noun = arrayOf("anitab","adalab","hopperlab","rwanda","kenya","tanzania")

    println( noun.sortedArray().contentToString())
}


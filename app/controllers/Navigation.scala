package controllers

case class Command(
                    val description: String,
                    val action: String,
                  )

case class Navigation(val itens: List[Command])

//val civilNavigation = new Navigation(List())
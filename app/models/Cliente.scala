package models

case class Cliente(val id: Int,
                   val nome: String,
                   val endereco: String,
                   val email: String,
                   val telefone: String,
                   val celular: String,
                   val cidade: String)

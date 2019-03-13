package models

case class Obra(val id: Int, var nomeObra: String, var descricao: String, var clientes: List[Cliente]) {

}

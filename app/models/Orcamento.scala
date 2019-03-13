package models

case class Orcamento(val id: Int, val nome: String) {

}

case class ItemOrcamento(val id: Int, var descricao: String, var grupoItem: Orcamento, var unidade: Unidade) {

}

case class Unidade(val id: Int, val simbolo: String, val nome: String)
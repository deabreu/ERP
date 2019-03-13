package models

case class LancamentoFinanceiro(val id: Int, var descricao: String, var grupoItem: Orcamento, var unidade: Unidade) {

}

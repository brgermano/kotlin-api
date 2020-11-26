package com.kestraa.simpleapi

data class ImcRecord(val min: Float, val max: Float, val text: String)

object ImcTable {

  fun data(): List<ImcRecord> =
    listOf(
      ImcRecord(10.0f, 18.4f, "Baixo Peso"),
      ImcRecord(18.5f, 24.9f, "Peso normal"),
      ImcRecord(25.0f, 29.9f, "Excesso de Peso"),
      ImcRecord(30.0f, 34.9f, "Obesidade Classe 1")
    )
}
package one.innovation.digital.imc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import one.innovation.digital.pessoa.Pessoa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Testes Unitários para Calcular IMC.
 *
 * @author Antônio Lima Jr
 * @created 2021-05-07
 * @project calculadora-imc
 */

@DisplayName("Teste imc utilizando a classe Pessoa")
class CalcularImcTest {

  private static final String NOME = "Antônio";
  private static final double PESO = 83;
  private static final double ALTURA = 1.83;
  private transient double imcEsperado;

  @Test
  @DisplayName("Teste do IMC")
  void calcularImc() {
    final Pessoa pessoa = new Pessoa(NOME, PESO, ALTURA);

    this.imcEsperado = PESO / Math.pow(ALTURA, 2);

    assertEquals(imcEsperado, CalcularImc.calcula(pessoa), "Erro no teste calcular IMC");
  }

}
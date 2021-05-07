package one.innovation.digital.imc;

import one.innovation.digital.pessoa.Pessoa;

/**
 * Classe destina a calcular o IMC de uma pessoa.
 *
 * @author Antônio Lima Jr
 * @created 2021-05-06
 * @project calculadora-imc
 */

public class CalcularImc {

  /**
   * Calcular o IMC de uma pessoa.
   *
   * @param pessoa Recebe um objeto do tipo pessoa
   * @return retornar o IMC calculado de uma pessoa
   */
  public static double calcula(final Pessoa pessoa) {
    return pessoa.getPeso() / Math.pow(pessoa.getAltura(), 2);
  }
}

/*
 * MENOR QUE 18,5                MAGREZA                 0
 * ENTRE QUE 18,5 E 24,9         NORMAL                  0
 * ENTRE QUE 25 E 29,9           SOBRE PESO              I
 * ENTRE QUE 30 E 39,9           OBESIDADE               II
 * MAIOR QUE 40,0                OBESIDADE GRAVE         III
 * */

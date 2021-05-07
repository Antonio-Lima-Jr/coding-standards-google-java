package one.innovation.digital.pessoa;

/**
 * Classe para guardar as informações de uma pessoa.
 *
 * @author Antônio Lima Jr
 * @created 2021-05-06
 * @project calculadora-imc
 */

public class Pessoa {

  private final String nome;
  private final double peso;
  private final double altura;

  /**
   * Construtor da Classe pessoa recebe (String nome, double peso, double altura).
   *
   * @param nome   nome da pessoa
   * @param peso   peso da pessoa
   * @param altura altura da pessoa
   */
  public Pessoa(String nome, double peso, double altura) {
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }

}

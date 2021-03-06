package aulapolimorfismo1;

public class Peixe extends Animal{
  private String corEscama;
  
  public void soltarBolha(){
    System.out.println("Soltando Bolhas");
  }
  @Override
  public void locomover() {
    System.out.println("Nadando");
  }
  @Override
  public void alimentar() {
    System.out.println("Alimentando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Sem Som");
  }
  public String getCorEscama() {
    return corEscama;
  }

  public void setCorEscama(String corEscama) {
    this.corEscama = corEscama;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getMembros() {
    return membros;
  }

  public void setMembros(int membros) {
    this.membros = membros;
  }
  
}

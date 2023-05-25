public class Pessoa extends Animal {
    // Atributos da classe
    public String sobrenome;
    // métodos da classe
    public void falar(){
        System.out.println("falei");
    }
    public String falar(String texto){
        return texto;
    }
    public Pessoa criarPessoa(){
        return new Pessoa();
    }
    public void comer(){
        System.out.println("Pessoa comeu");
    }

}

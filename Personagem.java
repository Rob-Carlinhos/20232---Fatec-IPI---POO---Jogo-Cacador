public class Personagem{
    
    //atributos ou propriedades
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    //comportamentos (métodos)
    void cacar() {
        if(energia >= 2) {
            System.out.println(nome + " caçando...");
            energia -= 2; //energia = energia - 2;
        }
        else {
            System.out.println(nome + " sem energia para caçar...");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer() {
        if(fome >= 1) {
            System.out.println(nome + " comendo...");
            // operador ternário (tem três partes)
            energia = energia + 1 > 10 ? 10 : energia + 1;
            fome--;
        }
        else {
            System.out.println(nome + " está de barriga cheia...");
        }
    }

    void dormir() {
        if (sono > 0) {
        System.out.println(nome + " dormindo...");
        sono -= 1;
        energia = Math.min(10, energia + 1);
        }
        else {
            System.out.println(nome + " sem sono");
        }
    }
    public static void main(String[] args) {

    }
}
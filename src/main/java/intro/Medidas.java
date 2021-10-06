// 1 - Pacote
package intro;

// 2 - Referência as Bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        calcularAreaModoCurto();
        calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de áreas Modo Curto:");

        // Calculo de Area - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso() {
        System.out.println("Cálculo de áreas Modo Extenso:");
        // Calculo de Area -  Exemplo: O tamanho do tapete o do piso

        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + resultado + "m²");
    }
}


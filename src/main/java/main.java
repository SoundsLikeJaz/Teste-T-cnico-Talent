import java.util.Scanner;

public class main {
    private static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1;
        int c = a + b;

        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }

    private static int howManyAs(String amostra) {
        int n = 0;
        String amostraMin = amostra.toLowerCase();

        for (int i = 0; i < amostraMin.length(); i++) {
            if(amostraMin.charAt(i) == 'a') n++;
        }

        return n;
    }

    private static int verificaSoma() {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k++;
            soma += k;
        }

        return soma;
    }

    private static void checarLogica() {
        System.out.println("a) 1, 3, 5, 7, >>>9<<<");
        System.out.println("b) 2, 4, 8, 16, 32, 64, >>>128<<<");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, >>>49<<<");
        System.out.println("d) 4, 16, 36, 64, >>>100<<<");
        System.out.println("e) 1, 1, 2, 3, 5, 8, >>>13<<<");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, >>>200<<<");
    }

    public static void checarLampada() {
        System.out.println("Uma forma simples, mas um pouco trapaceira, de se descobrir qual interruptor controla a " +
                "lâmpada de cada sala sem nenhuma visita seria simplesmente não entrando nelas, observar a passagem " +
                "de luz pela parte de" +
                " baixo da porta não categorizaria como uma visita :) \nEntretanto, se você pode visitar até duas " +
                "salas é possível verificar a temperatura da lâmpada para descobrir qual era a correta. Exemplo: Se " +
                "você mantiver o interruptor 1 aceso por alguns minutos, o suficiente para a lâmpada aquecer, então " +
                "apaga-lo e ativar o interruptor 2, terão 3 combinações possíveis: Lâmpaga apagada e quente " +
                "(interruptor 1), lâmpada acesa (interruptor 2) ou lâmpada apagada e fria (interruptor 3). Assim você" +
                " pode visitar duas salas e definir a terceira por eleminação.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        int opcaoFibonacci;
        String opcaoString;

        do {
            System.out.println("Menu: ");
            System.out.println("1 - Fibonacci");
            System.out.println("2 - Quantas letras 'A'");
            System.out.println("3 - Loop");
            System.out.println("4 - Sequências");
            System.out.println("5 - Qual lâmpada");
            System.out.println("6 - Sair");
            System.out.println("Escolha a opção desejada: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe um valor para a fibonacci: ");
                    opcaoFibonacci = sc.nextInt();
                    System.out.printf("O número %d %s parte da sequência de Fibonacci. \n", opcaoFibonacci,
                            isFibonacci(opcaoFibonacci) ? "é" : "não é");

                    break;

                case 2:
                    System.out.println("Insira o texo: ");
                    opcaoString = sc.next();
                    System.out.printf("No texto inserido a letra A aparece %d vezes. \n", howManyAs(opcaoString));

                    break;

                case 3:
                    System.out.printf("No loop solicitado, o valor final de SOMA é %d. \n", verificaSoma());

                    break;

                case 4:
                    checarLogica();

                    break;

                case 5:
                    checarLampada();

                    break;

                case 6:
                    System.out.println("Muito obrigado pelo seu tempo, espero que meu código esteja de seu agrado <3");

                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 6);

        sc.close();
    }
}
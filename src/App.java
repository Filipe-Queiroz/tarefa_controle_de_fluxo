public class App {
    public static void main(String[] args) {

        double nota1 = 8;

        double nota2 = 9;

        double nota3 = 5;

        double nota4 = 10;

        double somaDasNotas = nota1 + nota2 + nota3 + nota4;

        double calculoMediaNotas = somaDasNotas / 4;

        if (calculoMediaNotas >= 7) {
            System.out.println("Sua media de notas foi: " + calculoMediaNotas);
            System.out.println("APROVADO!");
        } else if (calculoMediaNotas >= 5) {
            System.out.println("Sua media de notas foi: " + calculoMediaNotas);
            System.out.println("EM RECUPERAÇÃO!");
        } else {
            System.out.println("Sua media de notas foi: " + calculoMediaNotas);
            System.out.println("REPROVADO. MELHORE!");
        }
    }
}

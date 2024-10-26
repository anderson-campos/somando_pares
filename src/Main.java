//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int soma = 0;
        int i = 0;

        for(i = 1; i <= 20; i++){

            if (i % 2 == 0){
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("Valor final é de: " + soma);
        System.out.println("Fim da execução");
    }
}
import java.util.Scanner;

public class app {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        var name = scanner.nextLine();
        System.out.print("Informe sua Idade: ");
        var age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Voce eh emancipado? ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if(age >= 18){
            System.out.printf("%s, voce eh maior de idade! \n",name);
        } else if (age>= 16 && isEmancipated){
            System.out.printf("%s, voce eh emancipado \n",name);
        } else{
            System.out.printf("%s, voce eh menor de idade! \n",name);
        }
        scanner.close();
    }
}

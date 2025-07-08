import dao.UserDAO;
import model.MenuOptions;

import java.util.Scanner;

public class Main {

    private static final UserDAO dao = new UserDAO();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Bem vindo ao Cadastro de Usuarios
                Selecione a Operaçao Desejada""");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Buscar ID");
        System.out.println("5 - Listar");
        System.out.println("6 - Sair");

        int userInput = sc.nextInt();

        while (true) {
            var selectedOption = MenuOptions.values()[userInput - 1];

        }
    }
}

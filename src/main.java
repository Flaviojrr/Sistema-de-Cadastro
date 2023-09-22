import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro teste = new Cadastro();
        int op=0;
        do {
            System.out.println("////// ABC //////"
                    +"\n(1)Realizar login"
                    +"\n(2)Realizar Cadastro"
                    +"\n(3)Sair");
            op=sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("/// Login ///"+"\nUsuario:");
                    String userLogin = sc.next();
                    System.out.println("Senha:");
                    String senhaLogin = sc.next();
                    if(teste.login(userLogin,senhaLogin)==true){
                        System.out.println("Login realizado com sucesso!!!");
                    }else{
                        System.out.println("Usuario ou Senha incorretos!!!");
                    }
                    break;
                case 2:
                    System.out.println("/// Cadastro ///"+"\nNome:");
                    String nomeCadastro = sc.next();
                    System.out.println("Email:");
                    String emailCadastro = sc.next();
                    System.out.println("Senha:");
                    String senhaCadastro = sc.next();
                    System.out.println(teste.adicionarUser(nomeCadastro,senhaCadastro,emailCadastro));
                    break;
            }
        }while (op!=3);
    }
}

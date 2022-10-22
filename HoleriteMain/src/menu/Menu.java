package menu;

import java.util.Scanner;
import holerite.Holerite;

public class Menu 
{
    
    public static void menu(Holerite holerite)
    {
        System.out.println("---------------------------------------------");
        System.out.println("|         CALCULADORA DE HOLERITE           |");
        System.out.println("---------------------------------------------\n");
        
        System.out.println(" ___________________________________________");
        System.out.println("|                                           |");
        System.out.println("| Escolha uma das opções para continuar:    |");
        System.out.println("|                                           |");
        System.out.println("| 1 - Cadastrar Holerite                    |");
        System.out.println("| 2 - Selecionar funcionário                |");
        System.out.println("| 3 - Listar todos holerites                |");
        System.out.println("| 4 - Sair                                  |");
        System.out.println("|___________________________________________|");
        
        int opcao = opcao();
        avaliaOpcao(opcao, holerite);  
    }
    
    public static int opcao()
    {
        System.out.print("| Opção: ");
        Scanner sc = new Scanner (System.in);
        int opcao = sc.nextInt();
        
        return opcao;
    }
    
    public static void avaliaOpcao(int opcao, Holerite holerite)
    {
        
        switch(opcao)
        {
            case 1:
                holerite.cadastraHolerite();
                menu(holerite);
                break;
                
            case 2:
                holerite.pegaFuncionarios();
                menu(holerite);
                break;
                
            case 3:
                Holerite.listaTodos();
                break;
            
            case 4:
                System.out.println("Até logo!");
                System.exit(0);
                break;
                
            default:
                System.out.println("Operação inválida");
                Menu.avaliaOpcao(opcao, holerite);
                
        }
    }
}

package menu;

import java.util.Scanner;
import holerites.Holerites;

public class Menu 
{
    
    public static void menu()
    {
        System.out.println("#############################################");
        System.out.println("#######    CALCULADORA DE HOLERITE    #######");
        System.out.println("#############################################\n");
        
        System.out.println(" ___________________________________________");
        System.out.println("|                                           |");
        System.out.println("| Escolha uma das opções para continuar:    |");
        System.out.println("|                                           |");
        System.out.println("| 1 - Calcular Holerite                     |");
        System.out.println("| 2 - Selecionar funcionário                |");
        System.out.println("| 3 - Listar todos holerites                |");
        System.out.println("| 4 - Sair                                  |");
        System.out.println("|___________________________________________|");
        
        int opcao = opcao();
        avaliaOpcao(opcao);  
    }
    
    public static int opcao()
    {
        System.out.print("| Opção: ");
        Scanner sc = new Scanner (System.in);
        int opcao = sc.nextInt();
        
        return opcao;
    }
    
    public static void avaliaOpcao(int opcao)
    {
        switch(opcao)
        {
            case 1:
                Holerites.holerite();
                break;
                
            case 2:
                Holerites.pegaFuncionarios();
                break;
                
            case 3:
                Holerites.listaTodos();
                break;
            
            case 4:
//                quit();
                break;
                
            default:
                System.out.println("Operação inválida");
                Menu.avaliaOpcao(opcao);
                
        }
    }
}

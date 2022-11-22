package menu;

import java.util.Scanner;
import holerite.Holerite;
import static holeritemain.HoleriteMain.main;

public class Menu 
{
    
    public static void menuMain(Holerite holerite)
    {
        try
        {
            menu(holerite);       
        }
        catch(Exception e)
        {
            System.out.println("\n!! Opção inválida, selecione uma das opções listadas !!\n");
            menuMain(holerite);
        }
    }
    
    
    public static void menu(Holerite holerite)
    {
        System.out.println("---------------------------------------------");
        System.out.println("|         CALCULADORA DE HOLERITE           |");
        System.out.println("---------------------------------------------\n");
        
        System.out.println("---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("| Escolha uma das opções para continuar:    |");
        System.out.println("|                                           |");
        System.out.println("| 1 - Cadastrar Holerite                    |");
        System.out.println("| 2 - Listar todos holerites                |");
        System.out.println("| 3 - Selecionar funcionario                |");
        System.out.println("| 4 - Sair                                  |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        
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
                menuMain(holerite);
                break;
                
            case 2:
                holerite.pegaFuncionarios();
                menuMain(holerite);
                break;
                
            case 3:
                holerite.listaTodos();
                menuMain(holerite);
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

    

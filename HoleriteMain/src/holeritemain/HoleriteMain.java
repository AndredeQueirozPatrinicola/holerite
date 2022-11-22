
package holeritemain;

import menu.Menu;
import holerite.Holerite;
import java.util.Scanner;

public class HoleriteMain 
{

    public static void main(String[] args) 
    {   
        try
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("-----------------------------------------------------");
            System.out.print("| Insira o numero de funcionários a ser cadastrado: ");
            int op = sc.nextInt();
                    
            Holerite holerite = new Holerite(new String[op], new String[op]);
            System.out.printf("\nO limite de funcionários escolhido foi: %d \n\n", op);
            
            try
            {
                Menu.menuMain(holerite);       
            }
            catch(Exception e)
            {
                System.out.println("\n!! Algo de errado com a inicialização do programa !!\n");
                main(null);
            }
        }
        catch(Exception e)
        {
            main(null);
        }
    }
}

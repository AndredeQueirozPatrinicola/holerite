
package holeritemain;

import menu.Menu;

public class HoleriteMain 
{

    public static void main(String[] args) 
    {   
        try
        {
            Menu.menu();       
        }
        catch(Exception e)
        {
            System.out.println("\n!! Opção inválida, selecione uma das opções listadas !!\n");
            Menu.menu();
        }
    }
    
}

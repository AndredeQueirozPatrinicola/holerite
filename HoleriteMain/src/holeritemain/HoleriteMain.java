
package holeritemain;

import menu.Menu;
import holerite.Holerite;

public class HoleriteMain 
{

    public static void main(String[] args) 
    {   
        Holerite holerite = new Holerite(new String[10]);
        try
        {
            Menu.menu(holerite);       
        }
        catch(Exception e)
        {
            System.out.println("\n!! Opção inválida, selecione uma das opções listadas !!\n");
            main(null);
        }
    }
}

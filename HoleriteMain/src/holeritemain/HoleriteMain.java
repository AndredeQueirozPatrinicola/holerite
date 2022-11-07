
package holeritemain;

import menu.Menu;
import holerite.Holerite;

public class HoleriteMain 
{

    public static void main(String[] args) 
    {   
        Holerite holerite = new Holerite(new String[10], new String[10]);
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
}

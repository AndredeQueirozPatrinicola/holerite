package holerite;

import funcionario.Funcionario;
import menu.Menu;
import java.util.Scanner;

public class Holerite 
{

    public static Funcionario cadastraHolerite()
    {
        System.out.println("\n---------------------------------------------");
        System.out.println("|     Digite as informações do holerite     |");
        System.out.println("|  ou digite 0 em todos os campos para sair |");
        System.out.println("---------------------------------------------\n");
        
        Funcionario funcionario;
        Funcionario buffer = new Funcionario("padrao", 0.00, 0.00, 0.00);
        
        try
        {
            Scanner nm = new Scanner(System.in);
            System.out.print("Insira o nome do funcionario:  ");
            String nomeFuncionario = nm.nextLine();

            Scanner sl = new Scanner(System.in);
            System.out.print("Insira o salário do funcionário:  ");
            double salario = sl.nextDouble();

            Scanner hr = new Scanner(System.in);
            System.out.print("Insira o numero de horas extras: ");
            double horaExtra = hr.nextDouble();

            Scanner ad = new Scanner(System.in);
            System.out.print("Insira o valor do adicional: ");
            double adicional = ad.nextDouble();
            
            if(nomeFuncionario.equals("0") && salario == 0 && horaExtra == 0 && adicional == 0)
            {
                Menu.menu();
                
            }
            
            funcionario = new Funcionario(nomeFuncionario, salario, horaExtra, adicional);
            funcionario.caculaDescontosAliquota();
            System.out.println("Holerite cadastrado");
                        
            return funcionario;
        }
        catch(Exception e)
        {
            System.out.println(" \n!! Informação inválida, favor inserir corretamente !!");
            cadastraHolerite();
        }
  
        return buffer;
    }
    
//    public static double calculaDescontosAliquotas(Funcionario funcionario)
//    {
//    
//        double salarioTotal = funcionario.
//     }
//       
//        return 0.00;
//    }
    
    
    public static void pegaFuncionarios()
    {
        
    
    }    
    
    public static void listaTodos()
    {
        
    
    }
}

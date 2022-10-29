package holerite;

import funcionario.Funcionario;
import menu.Menu;
import java.util.Scanner;

public class Holerite 
{
    
    public String[] holerites;
    
    public Holerite(String[] holerites)
    {
        this.holerites = holerites;
    }

    public  String[] cadastraHolerite()
    {
        System.out.println("\n---------------------------------------------");
        System.out.println("|     Digite as informações do holerite     |");
        System.out.println("---------------------------------------------\n");
        
        Funcionario funcionario;
        String[] buffer = new String[0];
        
        try
        {
            Scanner nm = new Scanner(System.in);
            System.out.print("Insira o nome do funcionario: ");
            String nomeFuncionario = nm.nextLine();

            Scanner sl = new Scanner(System.in);
            System.out.print("Insira o salário do funcionário: R$");
            double salario = sl.nextDouble();
            
            Scanner vh = new Scanner(System.in);
            System.out.print("Insira o valor da hora: R$");
            double valorHora = vh.nextDouble();

            Scanner hr = new Scanner(System.in);
            System.out.print("Insira o numero de horas extras: ");
            double horaExtra = hr.nextDouble();

            Scanner ad = new Scanner(System.in);
            System.out.print("Insira o valor do adicional: R$");
            double adicional = ad.nextDouble();
            
            Scanner vr = new Scanner(System.in);
            System.out.print("Recebe vale alimentação?[s/n]: ");
            String valeAlimentacao = vr.nextLine();
            
            funcionario = new Funcionario(nomeFuncionario, salario, valorHora, horaExtra, adicional);
            funcionario.caculaDescontosINSS();
            
            if(!valeAlimentacao.equals("s") && !valeAlimentacao.equals("n"))
            {
                System.out.println("Inserir vale alimentação corretamente");
                cadastraHolerite();
            }
            
            int contador = 0;
            for(int i = 0; i < this.holerites.length; i++ )
            {
                if(this.holerites[i] == null)
                {
                    contador += 1;
                }                               
            }
            
            int indice = this.holerites.length - contador;
            if(indice < 10)
            {  
                System.out.println("Holerite cadastrado");
                this.holerites[indice] = funcionario.retornaDados();
            }
            else
            {
                System.out.println("Limite de funcionários atingido, apague algum para continuar");
            }
            
            
            return this.holerites;
        }
        catch(Exception e)
        {
            System.out.println(" \n!! Informação inválida, favor inserir corretamente !!");
            cadastraHolerite();
        }
  
        return buffer;
    }
    

    
    public void pegaFuncionarios()
    {
        int contador = 0;
        
        for(String i : this.holerites)
        {
            if(i != null)
            {
                System.out.println(i);
            }
            else
            {
                contador += 1;
            }
        }
        if(contador == 10)
        {
            System.out.println("\n!! Nenhum holerite cadastrado. !!\n");
        }
    
    }    
    
    public static void listaTodos()
    {
        
        
        
    
    }
}

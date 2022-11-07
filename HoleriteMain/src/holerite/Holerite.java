package holerite;

import funcionario.Funcionario;
import menu.Menu;
import java.util.Scanner;
import static menu.Menu.opcao;

public class Holerite 
{
    
    public String[] holerites;
    public String[] nomes;
    
    public Holerite(String[] holerites, String[] nomes)
    {
        this.holerites = holerites;
        this.nomes = nomes;
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
            
            Scanner hr = new Scanner(System.in);
            System.out.print("Insira o numero de horas extras: ");
            double horaExtra = hr.nextDouble();

            Scanner ad = new Scanner(System.in);
            System.out.print("Insira o valor do adicional: R$");
            double adicional = ad.nextDouble();
            
            Scanner vr = new Scanner(System.in);
            System.out.print("Valor do vale alimentacao: R$");
            double valeAlimentacao = vr.nextDouble();
            
            Scanner vt = new Scanner(System.in);
            System.out.print("Gasto com transporte: R$");
            double valeTransporte = vt.nextDouble();
            
            Scanner des = new Scanner(System.in);
            System.out.print("Outros descontos: R$");
            double descontos = des.nextDouble();
            
            funcionario = new Funcionario(nomeFuncionario, salario, horaExtra, adicional, valeAlimentacao, valeTransporte, descontos);
            funcionario.caculaDescontosINSS();
            
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
                this.nomes[indice] = funcionario.retornaNome();
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
    
    public void listaTodos()
    {
        
        for(int i = 0; i < this.nomes.length; i++)
        {
            if (this.nomes[i] != null)
            {
                System.out.printf("%d - %s \n", i, this.nomes[i]);
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("| Selecione um funcionário pelo indice:     |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        
        int opcao = opcao();
    }
    
    public void apagaHolerite(int opcao)
    {
        this.holerites[opcao] = null;
        this.nomes[opcao] = null;
    }
}

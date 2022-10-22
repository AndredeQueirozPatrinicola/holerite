
package funcionario;


public class Funcionario {
    
    public String nome;
    public double salario;
    public double horaExtra;
    public double adicional;
    public double valorTotal;

    public Funcionario(String nome, double salario, double horaExtra, double adicional )
    {
        this.nome = nome;
        this.salario = salario;
        this.horaExtra = horaExtra;
        this.adicional = adicional;
        this.valorTotal = salario + horaExtra + adicional;
    }
    public  String pegaInfos()
    {
        String infos = String.format("- Nome: %s  \n- Salario: %.2f \n- Hora extra:  %.2f \n- Adicional %.2f ", 
                                        this.nome, this.salario, this.horaExtra, this.adicional);
        
        System.out.println(infos);
        return infos;
    }
    
    public double caculaDescontosAliquota()
    {
        
        double inss = 0;
        double valorDescontado = 0;
        
        if (valorTotal < 1212.00)
        {
            inss = valorTotal * 0.075;
        }
        if(valorTotal > 1212.00 && valorTotal < 2427.35 )
        {
            inss = valorTotal * 0.09;
        }
        if(valorTotal > 2427.35 && valorTotal < 3641.03)
        {
            inss = valorTotal * 0.12;
        }
        if(valorTotal > 3641.03)
        {
            inss = valorTotal * 0.14;
        }
        
        if(valorDescontado < 1924.32)
        {
            System.out.println("ooi");
        }
        return valorTotal;
        
    }
    
    public String retornaDados(){
        String dados = String.format("Nome: %s \nSalario: %f\nValor total: %f", this.nome, this.salario, this.valorTotal);
        
        return dados;
        
    }
    
}

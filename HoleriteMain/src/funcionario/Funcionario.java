
package funcionario;


public class Funcionario {
    
    public String nome;
    public double salario;
    public double valorHora;
    public double horaExtra;
    public double adicional;
    public double valorTotal;
    public double inss;
    public double irrf;
    public double valeAlimentacao;

    public Funcionario(String nome, double salario, double valorHora, double horaExtra, double adicional )
    {
        this.nome = nome;
        this.salario = salario;
        this.valorHora = valorHora;
        this.horaExtra = horaExtra;
        this.adicional = adicional;
        this.valorTotal = salario + (horaExtra * valorHora) + adicional;
        this.inss = 0;
        this.irrf = 0;
        this.valeAlimentacao = 0;
    }
    
    public void caculaDescontosINSS()
    {
        
        if (this.valorTotal < 1212.00)
        {
            this.inss = this.valorTotal * 0.075;
        }
        if(this.valorTotal > 1212.00 && this.valorTotal < 2427.35 )
        {
            this.inss = this.valorTotal * 0.09;
        }
        if(this.valorTotal > 2427.35 && this.valorTotal < 3641.03)
        {
            this.inss = this.valorTotal * 0.12;
        }
        if(this.valorTotal > 3641.03)
        {
            this.inss = this.valorTotal * 0.14;
        }
        
        
        this.valorTotal = this.valorTotal - this.inss;
        
        calculaDescontoIRRF();

    }
    
    
    public void calculaDescontoIRRF()
    {
        
        if(this.valorTotal < 1924.32)
        {
            this.irrf = 0;
        }
        if(this.valorTotal > 1924.32 && this.valorTotal < 2826.98)
        {
            this.irrf = this.valorTotal * 0.075;
        }
        if(this.valorTotal > 2826.98 && this.valorTotal < 3751.05)
        {
            this.irrf = this.valorTotal * 0.15;
        }
        if(this.valorTotal > 3751.05 && this.valorTotal < 4664.68)
        {
            this.irrf = this.valorTotal * 0.225;
        }
        if(this.valorTotal > 4664.68)
        {
            this.irrf = this.valorTotal * 0.275;
        }
        
        this.valorTotal = this.valorTotal - this.irrf;
    }
    
    public void calculaVale(String vale)
    {
        if(vale.equals("s"))
        {
            this.valeAlimentacao = 0;
        }
    }
    
            
    public String retornaDados(){
        String dados = String.format(""
                + "\n---------------------------------------------------"
                + "\n | Nome: %s \t \t \t \t \t |"
                + "\n----------------------GANHOS-----------------------"
                + "\n | Salario: %.2f \t \t \t \t |"
                + "\n | Hora(s) extra(s): %.2f \t \t \t |"
                + "\n | Adicional: %.2f \t \t \t \t |"
                + "\n | Valor total: %.2f \t \t \t |"
                + "\n--------------------DESCONTOS----------------------"
                + "\n | INSS: %.2f \t \t \t \t |"
                + "\n | IRRF: %.2f \t \t \t \t |"
                + "\n---------------------------------------------------", 
                                     
                this.nome, this.salario, this.horaExtra * this.valorHora, this.adicional, this.valorTotal, this.inss, this.irrf);
        
        return dados;
        
    }
    
}

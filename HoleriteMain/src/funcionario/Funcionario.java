/*
    Observações:

        1) Vale transporte
            Baseado em: http://www.planalto.gov.br/ccivil_03/leis/l7418.htm

            "Parágrafo único - O empregador participará dos gastos de deslocamento do 
            trabalhador com a ajuda de custo equivalente à parcela que exceder a 6% (seis por cento) 
            de seu salário básico."

            Ou seja:
                Se o gasto com passagem por mes for maior que 6% do salario bruto
                {
                    O desconto sera sera apenas de 6% do salario bruto
                } 
                Se o gasto com passagem for menor que 6% do salario bruto
                {
                    O desconto sera apenas do valor da passagem.
                }

            
        2) Hora Extra
            Para o calculo do valor da hora sera considerada a conta:

                valorHora = salario / 220h

                supondo 40h semanais

                de acordo com o site: https://www.coalize.com.br/quantas-horas-trabalhadas-por-mes

*/


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
    public double valeTransporte;
    public double descontos;

    public Funcionario(String nome, double salario, double horaExtra, double adicional, double valeAlimentacao, double valeTransporte, double descontos )
    {
        this.nome = nome;
        this.salario = salario;
        this.valorHora = salario / 220;
        this.horaExtra = horaExtra;
        this.adicional = adicional;
        this.valorTotal = salario + (horaExtra * valorHora) + adicional;
        this.inss = 0;
        this.irrf = 0;
        this.valeAlimentacao = valeAlimentacao;
        this.valeTransporte = valeTransporte;
        this.descontos = descontos;
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
        
        System.out.println(this.inss);
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
        
        calculaValeTransporte();
    }
    
    public void calculaValeTransporte()
    {
        if(this.valeTransporte > this.salario * 0.06)
        {
            this.valeTransporte = this.salario * 0.06;
        }
        
        calculaOutrosDescontos();
    }
    
    public void calculaOutrosDescontos()
    {
        if(this.descontos > 0)
        {
            this.valorTotal = this.valorTotal - this.descontos;
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
                + "\n--------------------DESCONTOS----------------------"
                + "\n | INSS: %.2f \t \t \t \t |"
                + "\n | IRRF: %.2f \t \t \t \t      |"
                + "\n | VALE TRANSPORTE: %.2f \t \t \t |"
                + "\n | OUTROS DESCONTOS: %.2f \t \t \t |"
                + "\n---------------------------------------------------" 
                + "\n | Valor total: %.2f \t \t \t |",
                                     
                this.nome, this.salario, this.horaExtra * this.valorHora, this.adicional, this.inss, this.irrf, this.valeTransporte, this.descontos, this.valorTotal);
        
        return dados;
        
    }
    
    public String retornaNome()
    {
        return this.nome;
    }
    
}

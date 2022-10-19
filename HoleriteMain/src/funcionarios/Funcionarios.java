
package funcionarios;


public class Funcionarios {
    
    String nome;
    float salario;
    float beneficios;
    float descontos;

    Funcionarios(String nome, float salario, float beneficios, float descontos )
    {
        this.nome = nome;
        this.salario = salario;
        this.beneficios = beneficios;
        this.descontos = descontos;
    }
    
    
    public static String pegaInfos()
    {
//        String infos = String.format("| %s  | %.f | %.f | %.f", this.nome, );
        
        return "oi";
    }
    
    
}

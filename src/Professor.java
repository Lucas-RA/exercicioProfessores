public class Professor {
//    definir atributos como privado - dados ficam encapsulados dentro do objeto (protegidos)
//    não permitir que certas variáveis sejam acessadas - da mais segurança pro tipo de variável
    private String nome;
    private String titulo;
    private int totalDeAulas;
    private double valorDaAula;

//    se é obrigatório ter os valores dentro do objeto - usamos o construtor - público pq se for privado, não conseguimos chamar ele
    public Professor(String nome, String titulo, int totalDeAulas, double valorDaAula){
//        this está sempre com o atributo
        this.nome = nome;
        this.titulo = titulo;
        this.totalDeAulas = totalDeAulas;
        this.valorDaAula = valorDaAula;
    }

//    cálculo do Salário do Professor
    public double calcularSalario(){
        double salarioBase, horaAtividade, descansoRemunerado;

//        calculo do salário Base
        salarioBase = (totalDeAulas * 4.5) * valorDaAula;
        if (titulo.equalsIgnoreCase("mestre")){
            salarioBase += salarioBase * (8.5/100);
        }
        else if(titulo.equalsIgnoreCase("doutor")){
            salarioBase += salarioBase * (12/100);
        }

//    cálculo da hora atividade
        horaAtividade = salarioBase * 5/100;

//    descanso remunerado
        descansoRemunerado = (salarioBase * horaAtividade) / 6;

        return salarioBase + horaAtividade + descansoRemunerado;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Lucas", "mestre", 40, 180);
        System.out.println(professor.calcularSalario());
        professor.setNome("Patricia");
        System.out.println(professor.getNome());
    }
}

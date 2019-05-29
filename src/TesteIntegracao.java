
public class TesteIntegracao {

    public static void main(String[] args) {
        Data d1 = new Data(10, 8, 1994);
        Pessoa p = new Pessoa("David", d1);
        //testar a inserção de uma pessoa (nome e data de nascimento)
        //p.mostrar();
        Data d2 = new Data(29, 5, 2019);
        Aluno a = new Aluno(p, "Engenharia de software", d2);
        //teste do aluno inserido com todas suas funçoes desejadas
        System.out.println("Aluno: " + a.getAluno().getNome());
        //erro de inserção
        //System.out.println("Data de nascimento: " + a.getAluno().getDataDeNascimento());
        System.out.print("Data de Nascimento: ");
        a.getAluno().getDataDeNascimento().mostrar();
        System.out.println("Apresentar na Materia: " + a.getMateria());
        System.out.print("Data de Apresentacao: ");
        a.getDiaAp().mostrar();

    }

}

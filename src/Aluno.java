
public class Aluno {
    //o aluno tem um nome, uma materia apresentar e uma data de apresentacao

    private Pessoa aluno;
    private String materia;
    private Data diaAp;
    
     public Aluno(Pessoa a, String m, Data d){
         this.setAluno(a);
         this.setMateria(m);
         this.setDiaAp(d);
     
     }
    public void setAluno(Pessoa p) {
        this.aluno = p;
    }

    public void setDiaAp(Data d) {
        this.diaAp = d;
    }

    public void setMateria(String m) {
        this.materia = m;
    }

    public Pessoa getAluno() {
        return this.aluno;
    }

    public String getMateria() {
        return this.materia;
    }

    public Data getDiaAp() {
        return this.diaAp;
    }
}

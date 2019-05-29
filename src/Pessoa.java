
public class Pessoa {

    private String nome;
    private Data dataDeNascimento;
    
    public Pessoa (String n, Data d){
       this.setNome(n);
       this.setDataDeNascimento(d);
    
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public void setDataDeNascimento(Data d) {
        this.dataDeNascimento = d;
    }

    public String getNome() {
        return this.nome;
    }

    public Data getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void mostrar() {
        System.out.println("nome: " + getNome());
        System.out.print("data de nascimento: ");
        getDataDeNascimento().mostrar();

    }
}

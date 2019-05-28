
public class Pessoa {

    private String nome;
    private String endereco;
    private int telefone;

    public Pessoa(String n, String e, int t) {
       
        setNome(n);
        setEndereco(e);
        setTelefone(t);

    }

    public String getNome() {
        return this.nome;

    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String e){
        this.endereco = e;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(int t){
        this.telefone = t;
    }
    
    
}

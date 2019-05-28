
public class Empregado extends Pessoa {
    private int codSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(int s, double sb,double i,String n, String e, int t){
        super(n,e,t);
        setCodSetor(s);
        setSalarioBase(sb);
        setImposto(i);
        
    }
    
    public int getCodSetor(){
        return this.codSetor;
    }
    public void setCodSetor(int c){
        this.codSetor = c;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public void setSalarioBase(double s){
        this.salarioBase = s;
    }
    public double getImposto(){
        return this.imposto;
    }
    public void setImposto(double i){
        this.imposto = i;
    }
    
    public double calcularSalario(){
        this.salarioBase = salarioBase-imposto;
        return this.salarioBase;
    }
}

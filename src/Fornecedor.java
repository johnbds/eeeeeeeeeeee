
public class Fornecedor extends Pessoa {
  
    private double valorCredito;
    private double valorDivida;
    
      public Fornecedor(double vC, double vD, String n, String e, int t){
        super(n,e,t);
        setValorCredito(vC);
        setValorDivida(vD);
        
    }
      public double getValorCredito(){
          return this.valorCredito;
      }
      public void setValorCredito(double c){
          this.valorCredito = c;
      }
      public double getValorDivida(){
          return this.valorDivida;
      }
      public void setValorDivida(double d){
          this.valorDivida = d;
      }
      
      public double obterSaldo(){
          valorCredito = valorCredito-valorDivida;
          return this.valorCredito;
      }
      
    
}

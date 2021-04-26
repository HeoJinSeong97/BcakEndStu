package Model;

public class Calc {

   private int n1;
   private int n2;
   private String op;
   private int res;
   
   public Calc(int n1,int n2,String op){
      this.n1=n1;
      this.n2=n2;
      this.op=op;
      use();
   }
   private void use() {
      if(this.op.equals("+")) {
         plus();
      }
      else {
         minus();
      }
   }
   
   public void plus() {
      this.res=this.n1+this.n2;
   }
   public void minus() {
      this.res=this.n1-this.n2;
   }
   
   
   public String getRes() {
      return this.n1+this.op+this.n2+"="+this.res;
   }
   
}
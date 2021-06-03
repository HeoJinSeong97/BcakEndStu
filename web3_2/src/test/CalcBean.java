package test;

public class CalcBean {
   private int num1,num2,result=0;
   private String op="";
   public void setNum1(String num1) {
      this.num1 = Integer.parseInt(num1);
   }
   public void setNum2(String num2) {
      this.num2 = Integer.parseInt(num2);
   }
   public int getResult() {
      return result;
   }
   public void setOp(String op) {
      this.op = op;
   }
   public void calc() {
      if (op.equals("+")) {
         result = num1 + num2;
      } else if (op.equals("-")) {
         result = num1 - num2;
      } else if (op.equals("x")) {
         result = num1 * num2;
      } else if (op.equals("/")){
         result = num1 / num2;
      }
   }
}
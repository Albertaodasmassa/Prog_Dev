import java.util.Scanner;

class Program3 {
   public static void main() {
   Scanner entrada = new Scanner(System.in);
   
   int n1 =0,n2=0,n3=0,res=0;

   System.out.print("Digite a Nota 1: ");
   n1=entrada.nextInt();
   System.out.print("Digite a Nota 2: ");
   n2=entrada.nextInt();
   System.out.print("Digite a Nota 3: ");
   n3=entrada.nextInt();
   res=(n1+n2+n3)/3;
   System.out.printf("A Soma do valor e: %d\n",res);
   if(res>6){
    System.out.print("Aluno Aprovado! ");   
   }else if(res<5){
    System.out.print("Aluno em recuperação! ");
   }else{
     System.out.print("Aluno Reprovado!");
   }
    }
}
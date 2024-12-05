import java.util.Scanner;

public class Notas {

    private double nota1,nota2,nota3 ;



    public void CalcularNotas  () {

       

        int continuar = 0 ;
        Scanner leia = new Scanner(System.in);

        
        while (continuar < 2) {
            System.out.println("1-SISTEMA DE CALCULAR NOTAS // 2-SAIR");
            continuar = leia.nextInt();

            
            switch (continuar) {
                case 1:
                    
                    System.out.println("Primeira nota do primeiro trimestre;");
                    nota1 = leia.nextDouble();

                    System.out.println("Segunda nota do terceiro trimestre");
                    nota2 = leia.nextDouble();

                    System.out.println("Terceira nota do terceiro trimestre!");
                    nota3 = leia.nextDouble();

                    double Soma = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4) ) / 10;

                    System.out.println("SUA NOTA FINAL FOI DE : " + Soma);



                    break;
            
                default:
                    break;
            }
            
        }

    }


}

import java.util.Scanner;
public class TerceiraClasse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l;
        int c;
        float mes = 0, s1 = 0, s2 = 0, s3 = 0 , s4 = 0;
        float media, semana1, semana2, semana3, semana4;

        int[][] bolsa = new int[4][7];

        int qt = 1;


        for (l = 0; l < 4; l++){
            for (c = 0; c < 7; c++){
                System.out.print("Valor da bolsa no "+qt+"ª dia: ");
                bolsa[l][c] = sc.nextInt();
                mes = mes + bolsa[l][c];
                qt++;
            }
        }

        media = mes/28;
        System.out.println("Média Mensal: "+media);

        for (c = 0; c < 7; c++){
            s1 = s1 + bolsa[0][c];
        }

        semana1 = s1 / 7;
        System.out.println("Média Semana 01: "+semana1);

        for (c = 0; c < 7; c++){
            s2 = s2 + bolsa[1][c];
        }

        semana2 = s2 / 7;
        System.out.println("Média Semana 02: "+semana2);

        for (c = 0; c < 7; c++){
            s3 = s3 + bolsa[2][c];
        }

        semana3 = s3 / 7;
        System.out.println("Média Semana 03: "+semana3);

        for (c = 0; c < 7; c++){
            s4 = s4 + bolsa[3][c];
        }

        semana4 = s4 / 7;
        System.out.println("Média Semana 04: "+semana4);

        if (semana1 > semana2 && semana1 > semana3 && semana1 > semana4){
            System.out.println("A maior média é: "+semana1);
        }else if (semana2 > semana1 && semana2 > semana3 && semana2 > semana4){
            System.out.println("A maior média é: "+semana2);
        }else if (semana3 > semana1 && semana3 > semana2 && semana3 > semana4){
            System.out.println("A maior média é: "+semana3);
        }else {
            System.out.println("A maior média é: "+semana4);
        }


        if (semana1 < semana2 && semana1 < semana3 && semana1 < semana4){
            System.out.println("A menor média é: "+semana1);
        }else if (semana2 < semana1 && semana2 < semana3 && semana2 < semana4){
            System.out.println("A menor média é: "+semana2);
        }else if (semana3 < semana1 && semana3 < semana2 && semana3 < semana4){
            System.out.println("A menor média é: "+semana3);
        }else {
            System.out.println("A menor média é: "+semana4);
        }







    }
}

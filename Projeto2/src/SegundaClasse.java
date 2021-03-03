import java.util.Scanner;
public class SegundaClasse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int af = 0;

        //Primeiro Aluno
        System.out.println("Primeiro Aluno: "+"\n");

        System.out.println("Notas Primeiro Bimestre Escolar: ");
        System.out.print("Nota Prova: ");
        float prova = sc.nextFloat();
        System.out.print("Nota Projeto: ");
        float projeto = sc.nextFloat();
        System.out.print("Nota Exercício: ");
        float exercicio = sc.nextFloat();
        float bimestre = (((prova*5)+(projeto*3)+(exercicio*2))/10);
        System.out.println("A média do primeiro bimestre desse aluno é: "+bimestre+"\n");

        System.out.println("Notas Segundo Bimestre Escolar: ");
        System.out.print("Nota Prova: ");
        float prova2 = sc.nextFloat();
        System.out.print("Nota Projeto: ");
        float projeto2 = sc.nextFloat();
        System.out.print("Nota Exercício: ");
        float exercicio2 = sc.nextFloat();
        float bimestre2 = (((prova2*5)+(projeto2*3)+(exercicio2*2))/10);
        System.out.println("A média do segundo bimestre desse aluno é: "+bimestre2+"\n");

        float semestre = ((bimestre+bimestre2)/2);
        System.out.println("A média semestral desse aluno é: "+semestre+"\n");

        if (semestre < 5) {
            reprovados = reprovados + 1;
        }else if (semestre < 7.9) {
            af = af + 1;
        }else {
            aprovados = aprovados + 1;
        }


        //Segundo Aluno
        System.out.println("Segundo Aluno: "+"\n");

        System.out.println("Notas Primeiro Bimestre Escolar: ");
        System.out.print("Nota Prova: ");
        float prova3 = sc.nextFloat();
        System.out.print("Nota Projeto: ");
        float projeto3 = sc.nextFloat();
        System.out.print("Nota Exercício: ");
        float exercicio3 = sc.nextFloat();
        float bimestre3 = (((prova3*5)+(projeto3*3)+(exercicio3*2))/10);
        System.out.println("A média do primeiro bimestre desse aluno é: "+bimestre3+"\n");

        System.out.println("Notas Segundo Bimestre Escolar: ");
        System.out.print("Nota Prova: ");
        float prova4 = sc.nextFloat();
        System.out.print("Nota Projeto: ");
        float projeto4 = sc.nextFloat();
        System.out.print("Nota Exercício: ");
        float exercicio4 = sc.nextFloat();
        float bimestre4 = (((prova4*5)+(projeto4*3)+(exercicio4*2))/10);
        System.out.println("A média do segundo bimestre desse aluno é: "+bimestre4+"\n");

        float semestre2 = ((bimestre3+bimestre4)/2);
        System.out.println("A média semestral desse aluno é: "+semestre2+"\n");

        if (semestre2 < 5) {
            reprovados = reprovados + 1;
        }else if (semestre2 < 7.9) {
            af = af + 1;
        }else {
            aprovados = aprovados + 1;
        }


        //Terceiro Aluno
        System.out.println("Terceiro Aluno: "+"\n");

        System.out.println("Notas Primeiro Bimestre Escolar: ");
        System.out.print("Nota Prova: ");
        float prova5 = sc.nextFloat();
        System.out.print("Nota Projeto: ");
        float projeto5 = sc.nextFloat();
        System.out.print("Nota Exercício: ");
        float exercicio5 = sc.nextFloat();
        float bimestre5 = (((prova5*5)+(projeto5*3)+(exercicio5*2))/10);
        System.out.println("A média do primeiro bimestre desse aluno é: "+bimestre5+"\n");

        System.out.println("Notas Segundo Bimestre Escolar: ");
        System.out.print("Nota Prova: ");
        float prova6 = sc.nextFloat();
        System.out.print("Nota Projeto: ");
        float projeto6 = sc.nextFloat();
        System.out.print("Nota Exercício: ");
        float exercicio6 = sc.nextFloat();
        float bimestre6 = (((prova6*5)+(projeto6*3)+(exercicio6*2))/10);
        System.out.println("A média do segundo bimestre desse aluno é: "+bimestre6+"\n");

        float semestre3 = ((bimestre5+bimestre6)/2);
        System.out.println("A média semestral desse aluno é: "+semestre3+"\n");

        if (semestre3 < 5) {
            reprovados = reprovados + 1;
        }else if (semestre3 < 7.9) {
            af = af + 1;
        }else {
            aprovados = aprovados + 1;
        }


        sc.close();

        //Média dos Alunos
        float média = ((semestre+semestre2+semestre3)/3);
        System.out.println("A média dos alunos é: "+média);


        //Maior Média
        if (semestre > semestre2 && semestre > semestre3) {
            System.out.println(semestre+" é a maior média");
        }else if (semestre2 > semestre && semestre2 > semestre3) {
            System.out.println(semestre2+" é a maior média");
        }else {
            System.out.println(semestre3+" é a maior média");
        }


        //Menor Média
        if (semestre < semestre2 && semestre < semestre3) {
            System.out.println(semestre+" é a menor média");
        }else if (semestre2 < semestre && semestre2 < semestre3) {
            System.out.println(semestre2+" é a menor média");
        }else {
            System.out.println(semestre3+" é a menor média");
        }

        System.out.println("Alunos aprovados: "+aprovados);
        System.out.println("Alunos reprovados: "+reprovados);
        System.out.println("Alunos que precisam fazer a avaliação final: "+af);
    }
}
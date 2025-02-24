import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorNotas {
    private Scanner scan = new Scanner(System.in);
    private Map<String, Aluno> alunos = new HashMap<>();

    public void addAluno (){
        System.out.println("Insira o nome do Aluno: ");
        scan.nextLine();
        String nome = scan.nextLine();

        String materia = "";
        ArrayList<Double>notas = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            if (i == 0){
                materia = "Matemática";
            }else if(i==1){
                materia = "Português";
            }else if(i==2){
                materia = "Ciências";
            }else if(i==3){
                materia = "História";
            }else if(i==4){
                materia = "Geografia";
            }
            System.out.println("Insira a Nota de " + materia + ": ");
            double nota = scan.nextDouble();
            notas.add(nota);

        }
        Aluno aluno = new Aluno(nome, notas);
        alunos.put(nome, aluno);
        System.out.println("-----");
        System.out.println("Aluno Adicionado com sucesso! \n");
        System.out.println("-----");
    }

    public void mostrarAlunos(){
        double x = 0;
        for (String y : alunos.keySet()){
            String nomeAluno = y;
            Aluno aluno = alunos.get(nomeAluno);
            for (double i : aluno.getNotas()) {
                x = x+i;
                
            }
        System.out.println(alunos.get(nomeAluno) + " Media: " + x/5);
        }
            }

    public void run(){
        while (true) {
            System.out.println("O que deseja fazer? ");
            System.out.println("[1] Exibir notas dos alunos: \n[2] Adicionar nota de aluno \n[0] SAIR");
            System.out.println("---");

            int option = scan.nextInt();
            switch (option) {
                case 1:
                    mostrarAlunos();
                    break;
                case 2:
                    addAluno();
                    break;      
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha uma das opções válidas!! \n \n");
            }
        }
    }
}

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

//Constructors
    public Aluno (){
    }

    public Aluno (String nome, ArrayList<Double> notas){
        this.nome = nome;
        this.notas = notas;
    }

//Get & Set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Double> getNotas(){
        return notas;
    }
    public void setNotas(ArrayList<Double>notas){
        this.notas = notas;
    }



    @Override
    public String toString(){
        return "Aluno: " + nome + ", Notas: " + notas;
    }

//Metodos

}

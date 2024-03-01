import br.com.caelum.ed.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno alunoUm;
        Aluno alunoDois;
        alunoUm = new Aluno();
        alunoDois = new Aluno();

        alunoUm.setNome("Gabriel");
        alunoDois.setNome("Natan");
        System.out.println(alunoUm.equals(alunoDois));
    }
}
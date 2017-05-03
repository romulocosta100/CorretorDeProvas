/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corretordeprovas.model;

import java.util.List;

/**
 *
 * @author romulo
 */
public class Turma {
    private String nome;
    private List<Aluno> alunos;

    @Override
    public String toString() {
        String out = "Turma\n" + "nome=" + nome+"\n";
        
        for (Aluno aluno : alunos) {
            out = out + aluno.getMatricula() + "\n" + aluno.getNome() + "\n";
        }
        return out;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
}

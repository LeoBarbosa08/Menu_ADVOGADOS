;

import java.util.ArrayList;
import java.util.List;

public class Cadastro_ADVOGADO {

    String nome;
    String OAB;
    String senha;
    String cpf;
    int idade;
    String area;

    int precoE;
    int precoP;
    int precoEs;


    public Cadastro_ADVOGADO() {
        // TODO Auto-generated constructor stub
    }
    public Cadastro_ADVOGADO(String nome, int idade, String cpf, String oab, String area) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.OAB = oab;
        this.area = area;
    }


















    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getOAB() {
        return OAB;
    }

    public void setOAB(String oAB) {
        OAB = oAB;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }
    public int getPrecoE() {
        return precoE;
    }
    public void setPrecoE(int precoE) {
        this.precoE = precoE;
    }
    public int getPrecoP() {
        return precoP;
    }
    public void setPrecoP(int precoP) {
        this.precoP = precoP;
    }
    public int getPrecoEs() {
        return precoEs;
    }
    public void setPrecoEs(int precoEs) {
        this.precoEs = precoEs;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }





}

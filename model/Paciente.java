package model;
public class Paciente {
    private String nome;
    private String endereco;
    private String CPF;
    private int RG;
    private String sexo;
    private int cod_con;
    private int cod_plano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCod_con() {
        return cod_con;
    }

    public void setCod_con(int cod_con) {
        this.cod_con = cod_con;
    }

    public int getCod_plano() {
        return cod_plano;
    }

    public void setCod_plano(int cod_plano) {
        this.cod_plano = cod_plano;
    }
    
}

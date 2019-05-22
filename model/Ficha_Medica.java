package model;

import java.util.Date;

public class Ficha_Medica {
    private int cod;
    private String nome_paciente;
    private String CPF;
    private String nome_medico;
    private String CRM;
    private Date data_consulta;
    private String queixa;
    private String antecedentes;
    private String historico;
    private String hipotese_diag;
    private String medicacao;
    private String exames_ap_sist;
    private String exames_comp;

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Date getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getHipotese_diag() {
        return hipotese_diag;
    }

    public void setHipotese_diag(String hipotese_diag) {
        this.hipotese_diag = hipotese_diag;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getExames_ap_sist() {
        return exames_ap_sist;
    }

    public void setExames_ap_sist(String exames_ap_sist) {
        this.exames_ap_sist = exames_ap_sist;
    }

    public String getExames_comp() {
        return exames_comp;
    }

    public void setExames_comp(String exames_comp) {
        this.exames_comp = exames_comp;
    }
    
    
}

package model;
public class Plano {
    private int cod;
    private String tipo;
    private String desc;
    private int cod_con;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCod_con() {
        return cod_con;
    }

    public void setCod_con(int cod_con) {
        this.cod_con = cod_con;
    }
    
}

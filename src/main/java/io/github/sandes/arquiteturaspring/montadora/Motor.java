package io.github.sandes.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindors;
    private Double litragem;
    private TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindors() {
        return cilindors;
    }

    public void setCilindors(Integer cilindors) {
        this.cilindors = cilindors;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilindors=" + cilindors +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}

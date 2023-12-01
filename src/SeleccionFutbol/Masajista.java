package SeleccionFutbol;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int anosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int anosExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void darMaxases(){

    }

    @Override
    public String toString() {
        return super.toString()+ "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
}

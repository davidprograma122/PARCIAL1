package modelo;
/**
 *
 * @author david
 */
public class Computadora {
    private String dfpcMarca;
    private int dfpcMemoria;
    private String dfpcProcesador;
    private String dfpcSistemaOperativo;
    private double dfpcPrecio;

    public Computadora() {
    }

    public Computadora(String dfpcMarca, int dfpcMemoria, String dfpcProcesador, String dfpcSistemaOperativo, double dfpcPrecio) {
        this.dfpcMarca = dfpcMarca;
        this.dfpcMemoria = dfpcMemoria;
        this.dfpcProcesador = dfpcProcesador;
        this.dfpcSistemaOperativo = dfpcSistemaOperativo;
        this.dfpcPrecio = dfpcPrecio;
    }

    public String getDfpcMarca() {
        return dfpcMarca;
    }

    public void setDfpcMarca(String dfpcMarca) {
        this.dfpcMarca = dfpcMarca;
    }

    public int getDfpcMemoria() {
        return dfpcMemoria;
    }

    public void setDfpcMemoria(int dfpcMemoria) {
        this.dfpcMemoria = dfpcMemoria;
    }

    public String getDfpcProcesador() {
        return dfpcProcesador;
    }

    public void setDfpcProcesador(String dfpcProcesador) {
        this.dfpcProcesador = dfpcProcesador;
    }

    public String getDfpcSistemaOperativo() {
        return dfpcSistemaOperativo;
    }

    public void setDfpcSistemaOperativo(String dfpcSistemaOperativo) {
        this.dfpcSistemaOperativo = dfpcSistemaOperativo;
    }

    public double getDfpcPrecio() {
        return dfpcPrecio;
    }

    public void setDfpcPrecio(double dfpcPrecio) {
        this.dfpcPrecio = dfpcPrecio;
    }
    
    
}

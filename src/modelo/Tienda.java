package modelo;
/**
 *
 * @author david
 */
public class Tienda {
    private String dfpcNombreTienda;
    private String dfpcNombrePropietario;
    private int dfpcIdentificadorTributario;

    public Tienda() {
    }

    public Tienda(String dfpcNombreTienda, String dfpcNombrePropietario, int dfpcIdentificadorTributario) {
        this.dfpcNombreTienda = dfpcNombreTienda;
        this.dfpcNombrePropietario = dfpcNombrePropietario;
        this.dfpcIdentificadorTributario = dfpcIdentificadorTributario;
    }

    public String getDfpcNombreTienda() {
        return dfpcNombreTienda;
    }

    public void setDfpcNombreTienda(String dfpcNombreTienda) {
        this.dfpcNombreTienda = dfpcNombreTienda;
    }

    public String getDfpcNombrePropietario() {
        return dfpcNombrePropietario;
    }

    public void setDfpcNombrePropietario(String dfpcNombrePropietario) {
        this.dfpcNombrePropietario = dfpcNombrePropietario;
    }

    public int getDfpcIdentificadorTributario() {
        return dfpcIdentificadorTributario;
    }

    public void setDfpcIdentificadorTributario(int dfpcIdentificadorTributario) {
        this.dfpcIdentificadorTributario = dfpcIdentificadorTributario;
    }
    
    
}

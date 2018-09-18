package bo.com.horoscopochino.model;

/**
 *
 * @author Daniel Sanchez
 */
public class HoroscopoChino {

    private int anio;
    private String signo;

    public HoroscopoChino(int anioNacimiento) {
        this.anio = anioNacimiento;
    }

    /**
     * Metodo que permite identificar el signo del horoscopo chino que le
     * corresponde al anio de nacimiento
     *
     * @return String signo
     */
    public String obtenerSigno() {
        int residuo = anio % 12;

        switch (residuo) {
            case 0:
                signo = "Mono";
                break;
            case 1:
                signo = "Gallo";
                break;
            case 2:
                signo = "Perro";
                break;
            case 3:
                signo = "Cerdo";
                break;
            case 4:
                signo = "Rata";
                break;
            case 5:
                signo = "Buey";
                break;
            case 6:
                signo = "Tigre";
                break;
            case 7:
                signo = "Conejo";
                break;
            case 8:
                signo = "Dragon";
                break;
            case 9:
                signo = "Serpiente";
                break;
            case 10:
                signo = "Caballo";
                break;
            case 11:
                signo = "Cabra";
                break;
            default:
                signo = "No se pudo determinar el signo en base al anio introducido";
                break;
        }
        return signo;
    }
}

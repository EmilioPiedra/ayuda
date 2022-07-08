package ec.edu.utpl.poo.parcial1.util;

public class UTPLValidator {

    public static void validateNota(double nota) {
        if(nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota fuera de rango");
        }
    }

    public static boolean esValidaNota(double nota) {
        if( nota >= 0 && nota <= 10) {
            return true;
        }
        return false;
    }
}

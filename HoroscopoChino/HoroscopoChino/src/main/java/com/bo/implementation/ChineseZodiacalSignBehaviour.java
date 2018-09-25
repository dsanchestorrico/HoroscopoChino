package com.bo.implementation;

import com.bo.behaviours.ZodiacalSignBehaviour;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author daniel.sanchez
 */
public class ChineseZodiacalSignBehaviour implements ZodiacalSignBehaviour{
    private Date birthdate;
    
    public ChineseZodiacalSignBehaviour (Date birthdate){
        this.birthdate = birthdate;
    }
    @Override
    public void getSigno() {
        int anioNacimiento = this.obtenerAnioNacimiento(birthdate);
        int residuo = anioNacimiento % 12;  
        String sign = "";

        switch (residuo) {
            case 0:
                sign = "Mono";
                break;
            case 1:
                sign = "Gallo";
                break;
            case 2:
                sign = "Perro";
                break;
            case 3:
                sign = "Cerdo";
                break;
            case 4:
                sign = "Rata";
                break;
            case 5:
                sign = "Buey";
                break;
            case 6:
                sign = "Tigre";
                break;
            case 7:
                sign = "Conejo";
                break;
            case 8:
                sign = "Dragon";
                break;
            case 9:
                sign = "Serpiente";
                break;
            case 10:
                sign = "Caballo";
                break;
            case 11:
                sign = "Cabra";
                break;
            default:
                sign = "No se pudo determinar el signo en base al anio introducido";
                break;
        }
        
        System.out.println("El signo que te corresponde es : "+sign);

    }
    private int obtenerAnioNacimiento(Date birthdate){
        
        int anioNacimiento = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthdate);
        anioNacimiento = calendar.get(Calendar.YEAR);              
        
        return anioNacimiento;
    }
    
}

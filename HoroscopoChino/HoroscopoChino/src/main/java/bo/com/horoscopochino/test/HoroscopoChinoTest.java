/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.horoscopochino.test;

import java.util.Scanner;
import bo.com.horoscopochino.model.HoroscopoChino;

/**
 *
 * @author Daniel Sanchez
 */
public class HoroscopoChinoTest {

    public static void main(String[] args) {
        System.out.println("¿Quiere conocer su signo en el Horoscopo Chino?");
        System.out.println("Por favor introduzca su anio de nacimiento");
        Scanner entrada = new Scanner(System.in);
        try {
            int anioNacimiento = entrada.nextInt();
            entrada.close();
            HoroscopoChino horoscopoChino = new HoroscopoChino(anioNacimiento);
            String signo = horoscopoChino.obtenerSigno();
            System.out.println("Tu anio de nacimiento es " + anioNacimiento + ", tu signo es " + signo);
        } catch (Exception e) {
            System.out.println("Por favor introduzca un anio valido...");
        }
    }
}

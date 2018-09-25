package com.bo.client;

import com.bo.implementation.ChineseZodiacalSignBehaviour;
import com.bo.implementation.SignZodiacal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daniel.sanchez
 */
public class SignZodiacalClient {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = "03-01-1987";
        Date birthdate = formatter.parse(dateInString);
        
        SignZodiacal signoZodical = new SignZodiacal(new ChineseZodiacalSignBehaviour(birthdate));
        signoZodical.determinarSigno();
        
    }
}

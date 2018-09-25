package com.bo.implementation;

import com.bo.behaviours.ZodiacalSignBehaviour;


/**
 *
 * @author daniel.sanchez
 */
public class SignZodiacal {
    private ZodiacalSignBehaviour zodiacalSignBehaviour;
    
    public SignZodiacal(ZodiacalSignBehaviour zodiacalSignBehaviour){
        this.zodiacalSignBehaviour = zodiacalSignBehaviour;
    }
    public void determinarSigno(){
        this.zodiacalSignBehaviour.getSigno();
    }
}

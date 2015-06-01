/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.model;

import br.com.schumaker.core.Translation;

/**
 *
 * @author hudsonschumaker
 */
public abstract class Character {
    protected String name;
    protected int asciiCode;
    
    public Character(String name, int asciiCode){
        this.name = name;
        this.asciiCode = asciiCode;
    }
    public String getName(){
        return name;
    }
    
    public int getAsciiCode(){
        return asciiCode;
    }
    
    public String getBinaryCode(){
        return Translation.asciiToBinaryString(asciiCode);
    }
}

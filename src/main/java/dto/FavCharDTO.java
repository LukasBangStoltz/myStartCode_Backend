/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.FavChar;

/**
 *
 * @author lukas
 */
public class FavCharDTO {

    private String charName;
    private String charAge;

    public FavCharDTO(FavChar favChar) {
        this.charName = favChar.getCharName();
        this.charAge = favChar.getCharAge();
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharAge() {
        return charAge;
    }

    public void setCharAge(String charAge) {
        this.charAge = charAge;
    }
    
    
    
    
    
}

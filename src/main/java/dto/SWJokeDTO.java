/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author lukas
 */
public class SWJokeDTO {
    private String starWarsQuote;

    public SWJokeDTO(String starWarsQuote) {
        this.starWarsQuote = starWarsQuote;
    }

    public String getStarWarsQuote() {
        return starWarsQuote;
    }

    public void setStarWarsQuote(String starWarsQuote) {
        this.starWarsQuote = starWarsQuote;
    }
    
    
}

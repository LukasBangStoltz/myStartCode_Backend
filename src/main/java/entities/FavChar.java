/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lukas
 */
@Entity
@Table(name = "favchar")
public class FavChar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String charName;
    private String charAge;
    @OneToMany(mappedBy = "favChar", cascade = CascadeType.PERSIST)
    private List<User> users;

    public FavChar() {

    }

    public FavChar(String charName, String charAge) {
        this.charName = charName;
        this.charAge = charAge;
        this.users = new ArrayList();
        
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    
}

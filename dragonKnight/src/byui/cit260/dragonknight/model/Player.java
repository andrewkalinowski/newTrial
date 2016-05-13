/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DragonmanJoel
 */
public class Player implements Serializable {

    
    // class instance variables
    private String name;
    private String classSelection;
    private String race;
    private String attributes;
    private String itemList;
    private double tile;
    
    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSelection() {
        return classSelection;
    }

    public void setClassSelection(String classSelection) {
        this.classSelection = classSelection;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public double getTile() {
        return tile;
    }

    public void setTile(double tile) {
        this.tile = tile;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.classSelection);
        hash = 97 * hash + Objects.hashCode(this.race);
        hash = 97 * hash + Objects.hashCode(this.attributes);
        hash = 97 * hash + Objects.hashCode(this.itemList);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.tile) ^ (Double.doubleToLongBits(this.tile) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.tile) != Double.doubleToLongBits(other.tile)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.classSelection, other.classSelection)) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        if (!Objects.equals(this.attributes, other.attributes)) {
            return false;
        }
        if (!Objects.equals(this.itemList, other.itemList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", classSelection=" + classSelection + ", race=" + race + ", attributes=" + attributes + ", itemList=" + itemList + ", tile=" + tile + '}';
    }

    public void classSelection(String avenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void race() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void race(String superhero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void attributes(String super_Soldier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void itemList(String shield) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void tile(String _22) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

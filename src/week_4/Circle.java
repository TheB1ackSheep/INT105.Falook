/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_4;

/**
 *
 * @author INT105
 */
public class Circle extends Geometric{
    private String color = "Cir";
    private int rad;
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public Circle(int rad) {
        this.rad = rad;
    }   
    
    @Override
    public double getArea() {
        return Math.PI*rad*rad;
    }

    @Override
    public double getPaerimeter() {
        return 2*Math.PI*rad;
    }

    @Override
    public String toString() {
        return "Circle{" + "rad=" + rad +", color="+this.color +'}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle)
            if(((Circle)obj).rad == rad)
                return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.rad;
        return hash;
    }
    
    
    
}

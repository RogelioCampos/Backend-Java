package Semana1;

public class Bicicleta {
    public int pins, rodada;
    public double vel;
    public String color;

    public double getVel() { return vel; }
    public int getPins() { return pins; }
    public int getRodada() { return rodada; }
    public String getColor() { return color; }

    public boolean setVel(double vel){
        if(vel > 0){
            this.vel = vel;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        } else {
            return false;
        }
    }

    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        } else {
            return false;
        }
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        } else {
            return false;
        }
    }

    public String printState() {
        return  "Piñones: " + pins +
                "\nRodada: " + rodada +
                "\nVelociadad: " + vel +
                "\nColor: " + color;
    }
}

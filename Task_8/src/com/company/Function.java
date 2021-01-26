package com.company;

public class Function {
    double F;
    double x;

    public Function(double x) {
        this.x = x;
    }

    public double getF() {
        return F;
    }

    public void setF(double f) {
        F = f;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double calculateFunction(){
        if(x >= 3){
            F = Math.pow(-x, 2) + 3*x + 9;
        } else{
            F = 1 / (Math.pow(x, 3) - 9);
        }
        return F;
    }
}

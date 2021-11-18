public class EarthAir implements Air {
    //EarthAir implements Air class
    private double n2;
    private double o2;
    private double co2;
    private double otherGases;
    public  EarthAir(double N2,double O2,double CO2,double others){
        n2 = N2;
        o2 = O2;
        co2 = CO2;
        otherGases = others;
    }
    //getters
    public double getN2() {
        return n2;
    }
    public double getO2() {
        return o2;
    }
    public double getCo2() {
        return co2;
    }
    public double getOtherGases() {
        return otherGases;
    }
    //setters
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public void setO2(double o2) {
        this.o2 = o2;
    }
    public void setCo2(double co2) {
        this.co2 = co2;
    }
    public void setOtherGases(double otherGases) {
        this.otherGases = otherGases;
    }
//implements AirDetails method from Air interface
    public void AirDetails(){
        System.out.println("In the air there is "+n2+" % nitrogen");
        System.out.println("In the air there is "+o2+" % oxygen");
        System.out.println("In the air there is "+co2+" % oxygen");
        System.out.println("In the air there is "+otherGases+" % other gases");
    }
}

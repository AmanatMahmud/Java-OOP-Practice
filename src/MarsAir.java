public class MarsAir extends EarthAir{
    //MarsAir inherits from EarthAir class
    private double ar;

    public MarsAir(double N2, double O2, double CO2, double others, double Ar) {
        super(N2, O2, CO2, others);
        this.ar = Ar;
    }
    //overrides AirDetails method from EarthAir class
    @Override
    public void AirDetails() {
        System.out.println("Air of Mars");
        super.AirDetails();
        System.out.println("In the air there is "+ar+" % argon");
    }
}

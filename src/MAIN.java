public class MAIN {
    public static void main(String[] args) {
//        EarthAir AirOfCtg = new EarthAir(78,20.9,0.03,0.17);
//        AirOfCtg.n2 = 78;
//        AirOfCtg.o2 = 20.9;
//        AirOfCtg.co2 = 0.03;
//        AirOfCtg .otherGases = 0.17;
        System.out.println("Air of Earth");
        //AirOfCtg.AirDetails();
        //MarsAir Mars = new MarsAir(2.8,0.174,95,0.026,2);
        Air Earth = new EarthAir(78,20.9,0.03,0.17);
        Earth.AirDetails();
        Air Mars = new MarsAir(2.8,0.174,95,0.026,2);
        Mars.AirDetails();

    }
}

public class Program {
    public static void main(String[] args) {
        PassengerTransport passenger = new PassengerTransport(114, 175, 2250, "Renault Espace 3", 4, 9.7, "MPV", 7);
        FreightTransport freight = new FreightTransport(302, 100, 16000, "МАЗ 54323", 6, 52.25, 21);
        CivilTransport civil = new CivilTransport(182018, 945, 166881, "Boeing 777-300ER", 64.8, 3300, 402, true);
        MilitaryTransport military = new MilitaryTransport(14801, 975, 9500, "Су-25 штурмовик", 14.36, 550, true, 6);
        System.out.println(passenger.toString());
        passenger.calculateOfDistanceTraveledWithMaxSpeed(5.5);
        System.out.println();
        System.out.println(freight.toString());
        freight.checkTruckCapacity(22);
        System.out.println();
        System.out.println(civil.toString());
        civil.checkAircraftPassengerCapacity(400);
        System.out.println();
        System.out.println(military.toString());
        military.launch_rocket(military.getNumberOfRockets());
        military.launch_catapult();


    }
}

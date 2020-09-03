package module02.TASK_07;

public class ProgramTask73 {
    public static void main(String[] args) {
        MiniGarage miniGarage = new MiniGarage();
        Garage garage = new Garage();
        BigGarage bigGarage = new BigGarage();
        System.out.println("--------- Mini garage ----------");
        System.out.println(miniGarage.leave() ? "The car leaves the mini garage" : "There are no cars in mini garage");
        System.out.println(miniGarage.enter(new MazdaX7(7,400, 300)) ?
                "MazdaX7 enter the mini garage" : "There no free space in mini garage");
        System.out.println(miniGarage.enter(new MercedesLs(8, 500,320)) ?
                "MercedesLs enter the mini garage" : "There no free space in mini garage") ;
        System.out.println(miniGarage.leave() ?
                "The car leaves the mini garage." : "There are no cars in mini garage");
        System.out.println(miniGarage.enter(new ManTgx(18,400, 3000)) ?
                "Truck entered mini garage" : "Truck can't enter mini garage");
        System.out.println("--------- Garage ----------");
        System.out.println(garage.enter(new MercedesLs(8, 500, 320)) ?
                "MercedesLs enter garage" : "There no free space in garage");
        System.out.println(garage.leave() ? "The car leaves garage." : "There are no cars in garage");
        System.out.println(garage.enter(new ManTgx(18, 400, 3000)) ?
                "ManTgx truck enter garage" : "There no free space in garage");
        System.out.println(garage.leave() ? "The car leaves garage." : "There are no cars in garage");
        System.out.println(garage.enter(new EncBus(88, 500, 40)) ?
                "Bus entered garage" : "Truck can't enter garage");
        System.out.println("--------- Big garage ----------");
        System.out.println(bigGarage.enter(new MazdaX7(7,400, 300)) ?
                "MazdaX7 enter the big garage" : "There no free space in big garage");
        System.out.println(bigGarage.enter(new EncBus(88, 500, 40)) ?
                "EncBus bus enter the big garage" : "There no free space in the big garage");
        System.out.println(bigGarage.enter(new MercedesLs(8, 500,320)) ?
                "MercedesLs enter the big garage" : "There no free space in big garage") ;
    }
}

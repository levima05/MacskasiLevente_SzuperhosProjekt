package hu.petrik.szuperhosprojekt;

public class Main {
    public static void main(String[] args) {
        Vasember vasember = new Vasember();
        Batman batman = new Batman();

        System.out.println(vasember);
        System.out.println(batman);

        System.out.println("Vasember legyőzi Batmant? " + vasember.legyoziE(batman));
        System.out.println("Batman legyőzi Vasembert? " + batman.legyoziE(vasember));
    }
}

package pl.mzelechowski;

public class Main {

    public static void main(String[] args) {
	Pizza pineapplePizza=new Pizza.Builder()
            .beans("fasoleczka")
            .cheese("radamer")
            .flour("zytani")
            .onion("Cebela")
            .build();

        System.out.println(pineapplePizza);
    }
}

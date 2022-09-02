public class DeluxeBurger extends Hamburger{

    private String name = "Deluxe";
    private String meat = "Sausage & Bacon";
    private double price = 14.54;
    private String breadRollType = "White roll";





    @Override
    public void addHamburgerAddition1(String type, double pricee) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String type, double pricee) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String type, double pricee) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String type, double pricee) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType+ " with " + meat + ", price is " + price);
        System.out.println("Added Chips for an extra 2.75");
        System.out.println("Added Drink for an extra 1.81");
        return 19.10;
    }
}





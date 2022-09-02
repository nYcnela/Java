public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger() {
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + ", price is " + price);
    }



    public void addHamburgerAddition1 (String type, double pricee){
        if(!type.isEmpty()){
            price += pricee;
            System.out.println("Added " + type + " for " + pricee);
        }
    }
    public void addHamburgerAddition2 (String type, double pricee){
        if(!type.isEmpty()){
            price += pricee;
            System.out.println("Added " + type + " for " + pricee);
        }
    }
    public void addHamburgerAddition3 (String type, double pricee) {
        if(!type.isEmpty()){
            price += pricee;
            System.out.println("Added " + type + " for " + pricee);
        }
    }
    public void addHamburgerAddition4 (String type, double pricee) {
        if(!type.isEmpty()){
            price += pricee;
            System.out.println("Added " + type + " for " + pricee);
        }
    }

    public double itemizeHamburger(){
        return price;
    }
}


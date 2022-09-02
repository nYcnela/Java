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
            this.addition1Name = type;
            this.addition1Price = pricee;
            System.out.println("Added " + this.addition1Name + " for " + this.addition1Price);
        }
    }
    public void addHamburgerAddition2 (String type, double pricee){
        if(!type.isEmpty()){
            this.addition2Name = type;
            this.addition2Price = pricee;
            System.out.println("Added " + this.addition2Name + " for " + this.addition2Price);
        }
    }
    public void addHamburgerAddition3 (String type, double pricee) {
        if(!type.isEmpty()){
            this.addition3Name = type;
            this.addition3Price = pricee;
            System.out.println("Added " + this.addition3Name + " for " + this.addition3Price);
        }
    }
    public void addHamburgerAddition4 (String type, double pricee) {
        if(!type.isEmpty()){
            this.addition4Name = type;
            this.addition4Price = pricee;
            System.out.println("Added " + this.addition4Name + " for " + this.addition4Price);
        }
    }

    public double itemizeHamburger(){
        return addition1Price + addition2Price + addition3Price + addition4Price + price;
    }
}



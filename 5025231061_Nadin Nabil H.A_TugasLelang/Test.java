public class Test {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction();

        // Enter lots into the auction
        auction.enterLot("Mona Lisa");
        auction.enterLot("The Last Supper");
        auction.enterLot("The Starry Night");

        // Show all the lots
        System.out.println("Available");
        auction.showLots();

        // Create bidders (persons)
        Person person1 = new Person("Budiono Siregar");
        Person person2 = new Person("Mr. Vincent");
        Person person3 = new Person("Mr. Gus Gupron");

        // Make some bids
        System.out.println("\nProcess:");

        // Budiono bids on the first lot (Mona Lisa)
        auction.makeABid(1, person1, 100);
        
        // Mr. vincent tries to bid lower than Alice on the first lot
        auction.makeABid(1, person2, 80);

        // Mr. Gus tries to bid upper than Budiono on the first lot
        auction.makeABid(1, person3, 110);

        // Bob bids higher on the first lot
        auction.makeABid(1, person2, 120);

        // Budiono bids on the second lot (The Starry Night)
        auction.makeABid(2, person1, 5000);

        // Mr. Gus tries to bind upper than Budiono on second lot(The Starry Night)
        auction.makeABid(2, person3, 5001);

        // Show the updated list of lots and their highest bids
        System.out.println("\nUpdated After Binding");
        auction.showLots();
    }
}

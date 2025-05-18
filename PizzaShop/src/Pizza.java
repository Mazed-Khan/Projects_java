public class Pizza {
    private int price;
    private boolean veg;

    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 120;
    private final int takeAwayCharge = 40;
    private final int normalPizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        normalPizzaPrice = this.price;
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            this.price += extraCheesePrice;
            isExtraCheeseAdded = true;
            System.out.println("Extra Cheese added.");
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingsAdded) {
            this.price += extraToppingsPrice;
            isExtraToppingsAdded = true;
            System.out.println("Extra Toppings added.");
        }
    }

    public void takeAway() {
        if (!isOptedForTakeAway) {
            this.price += takeAwayCharge;
            isOptedForTakeAway = true;
            System.out.println("Take away option selected.");
        }
    }

    public void totalBill() {
        String bill = "";
        bill += " Pizza Price: " + normalPizzaPrice + "\n";

        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }

        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }

        if (isOptedForTakeAway) {
            bill += "Take Away Charge: " + takeAwayCharge + "\n";
        }

        bill += "Total Bill: " + this.price + "\n";

        System.out.println("-------------------------");
        System.out.println("------- Total Bill -----");
        System.out.println("-------------------------");

        System.out.print(bill);
    }
}

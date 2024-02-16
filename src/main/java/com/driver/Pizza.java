package com.driver;

public class Pizza {

    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;
    private boolean isVeg;
    private StringBuilder bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheesePrice = 80;
        this.extraToppingsPrice = isVeg ? 70 : 120;
        this.paperBagPrice = 20;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
        this.bill = new StringBuilder();
        this.bill.append("Base Price Of The Pizza: ").append(this.basePrice).append("\n");
    }

    public void addExtraCheese(){
        if (!extraCheeseAdded) {
            this.extraCheeseAdded = true;
            this.bill.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
        }
    }

    public void addExtraToppings(){
        if (!extraToppingsAdded) {
            this.extraToppingsAdded = true;
            this.bill.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");
        }
    }

    public void addTakeaway(){
        if (!paperBagAdded) {
            this.paperBagAdded = true;
            this.bill.append("Paperbag Added: ").append(paperBagPrice).append("\n");
        }
    }

    public int getPrice(){
        int total = basePrice;
        if (extraCheeseAdded) total += extraCheesePrice;
        if (extraToppingsAdded) total += extraToppingsPrice;
        if (paperBagAdded) total += paperBagPrice;
        return total;
    }

   public String getBill(){
    // Clear the bill string
    this.bill.setLength(0);
    // Append the base price
    this.bill.append("Base Price Of The Pizza: ").append(this.basePrice).append("\n");
    
    // Append extra cheese if added
    if (this.extraCheeseAdded)
        this.bill.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");

    // Append extra toppings if added
    if (this.extraToppingsAdded)
        this.bill.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");

    // Append paper bag if added
    if (this.paperBagAdded)
        this.bill.append("Paperbag Added: ").append(paperBagPrice).append("\n");

    // Append the total price
    this.bill.append("Total Price: ").append(getPrice()).append("\n");

    return this.bill.toString();
}
}

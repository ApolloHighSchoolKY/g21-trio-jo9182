//Write your answer here
public class Trio implements MenuItem{
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(){

    }

    public Trio(Sandwich sand, Salad sald, Drink dink){
        sandwich = sand;
        salad = sald;
        drink = dink;
    }

    public String getName(){
        return sandwich.getName() + " / " + salad.getName() + " / " + drink.getName() + " Trio";
    }

    public double getPrice(){
        if(salad.getPrice() < sandwich.getPrice && salad.getPrice() < drink.getPrice)
            return sandwich.getPrice() + drink.getPrice();

        if(drink.getPrice() < sandwich.getPrice && drink.getPrice() < salad.getPrice)
            return sandwich.getPrice() + salad.getPrice();
        
        return drink.getPrice() + salad.getPrice();

    }
}
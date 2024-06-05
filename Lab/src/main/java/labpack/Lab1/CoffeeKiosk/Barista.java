package labpack.Lab1.CoffeeKiosk;

public class Barista {
    private int coffeeStock = 5000; // 5000g 커피보유

    public Coffee[] makeCoffee(Order order) {

        Coffee[] coffees = new Coffee[order.getCount()];

        for(int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());
        }

        return coffees;
    }
}


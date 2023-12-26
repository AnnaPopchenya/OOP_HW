package HW_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        
        Actor actor1 = new Actor("Петя");
        Actor actor2 = new Actor("Алиса");
        
        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);
        
        market.takeInQueue(actor1);
        market.takeInQueue(actor2);
        
        market.releaseFromMarket(List.of(actor1, actor2));
        
        market.update();
        
        market.takeOrders();
        market.giveOrders();
        
        market.releaseFromQueue();
    }
}
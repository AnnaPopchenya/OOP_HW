package HW_2;

import java.util.ArrayList;
import java.util.List;

class Market implements MarketBehaviour, QueueBehaviour  {
    
    private List<Actor> queue;
    
    public Market() {
        this.queue = new ArrayList<>();
    }
    
    @Override
    public void acceptToMarket(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " пришел на рынок");
    }
    
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println(actor.getName() + " ушел с рынка");
        }
    }
    
    @Override
    public void update() {
        System.out.println("Магазин обновляется...");
       
    }
    
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " присоединился к очереди");
    }
    
    @Override
    public void takeOrders() {
        System.out.println("Принятие заказов из очереди...");
        
    }
    
    @Override
    public void giveOrders() {
        System.out.println("Выдача заказа клиентам...");
    }
        
    
    @Override
    public void releaseFromQueue() {
        Actor actor = queue.remove(1);
        System.out.println(actor.getName() + " был освобожден из очереди");
    }
}
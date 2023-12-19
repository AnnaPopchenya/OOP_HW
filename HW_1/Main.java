public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса HotBeverageMachine
        HotBeverageMachine vendingMachine = new HotBeverageMachine();

        // Получаем продукты из автомата
        HotBeverage beverage1 = vendingMachine.getProduct("Чай", 200);
        HotDrink drink1 = vendingMachine.getProduct("Кофе", 300, 70);

        // Выводим информацию о полученных напитках
        System.out.println("Напиток 1: " + beverage1.getName() + ", объем: " + beverage1.getVolume());
        System.out.println("Напиток 2: " + drink1.getName() + ", объем: " + drink1.getVolume() + ", температура: " + drink1.getTemperature());
    }
}
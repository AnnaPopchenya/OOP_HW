interface VendingMachine {
    HotBeverage getProduct(String name, int volume);
    HotDrink getProduct(String name, int volume, int temperature);
}
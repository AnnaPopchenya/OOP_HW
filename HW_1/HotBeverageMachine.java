class HotBeverageMachine implements VendingMachine {
    public HotBeverage getProduct(String name, int volume) {
        return new HotBeverage(name, volume);
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrink(name, volume, temperature);
    }
}
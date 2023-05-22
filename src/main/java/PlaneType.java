public enum PlaneType {
    BOEING_747(416, 396890),
    AIRBUS_A380(853, 560000),
    BOEING_777(396, 299370),
    AIRBUS_A350(440, 280000),
    BOEING_787(296, 227930),
    AIRBUS_A320(180, 77000),
    BOEING_737(188, 82150);

    private final int passengerCapacity;
    private final int totalWeightInKg;

    PlaneType(int passengerCapacity, int totalWeightInKg) {
        this.passengerCapacity = passengerCapacity;
        this.totalWeightInKg = totalWeightInKg;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getTotalWeightInKg() {
        return totalWeightInKg;
    }
}

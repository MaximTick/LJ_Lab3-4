package com.aircraft.logic;
/**Грузовые самолеты*/

 public class CargoAircraft extends Aircraft {
    public final Integer cargoCapacity; //грузоподъемность

    public CargoAircraft(String aircraftManufcturer, String aircraftModel, int flightRange,
                         int fuelConsumption, Integer cargoCapacity) {
        super(aircraftManufcturer, aircraftModel, flightRange, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}

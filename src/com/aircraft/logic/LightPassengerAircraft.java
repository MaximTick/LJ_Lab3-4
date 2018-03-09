package com.aircraft.logic;
/**
 Легкие пассажирские самолеты*/

public class LightPassengerAircraft extends Aircraft {
    private final Integer seatingCapacity; //кол-во сидячиъ мест

    public LightPassengerAircraft(String aircraftManufcturer, String aircraftModel, int flightRange,
                                  int fuelConsumption, Integer seatingCapacity) {
        super(aircraftManufcturer, aircraftModel, flightRange, fuelConsumption);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public int getSeatingCapacity() { //получить кол-во сидячиъ мест
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return 0;
    } //    получить грузоподъемность
}

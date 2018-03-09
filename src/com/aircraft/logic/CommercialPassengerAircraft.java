package com.aircraft.logic;
/**
 Коммерческие пассажирские самолеты*/

public class CommercialPassengerAircraft extends Aircraft{
    private final Integer seatingCapacity; //кол-во сидячих мест
    private final Integer cargoCapacity;   //грузоподъемность

    public CommercialPassengerAircraft(String aircraftManufacturer, String aircraftModel, int flightRange,
                                       int fuelConsumption, int seatingCapacity, int cargoCapacity) {
        super(aircraftManufacturer, aircraftModel, flightRange, fuelConsumption);
        this.seatingCapacity = seatingCapacity;
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

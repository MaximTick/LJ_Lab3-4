package com.main;
import com.aircraft.instances.*;
import com.aircraft.logic.Aircraft;
import com.airline.Airline;

public class Main {
    public static void main(String[] args) {
        try {
            Aircraft aircraftAirbusA320a = new AircraftAirbusA320();
            Aircraft aircraftAirbusA320b = new AircraftAirbusA320();
            Aircraft aircraftDouglas = new AircraftDouglasMD11F();
            Aircraft aircraftCessna = new AircraftCessna172();
            Aircraft aircraftBoeing = new AircraftBoeing737();

            Airline dispathcer = new Dispathcer("International Airlines");
            dispathcer.addAircraft(aircraftAirbusA320a);
            dispathcer.addAircraft(aircraftAirbusA320b);
            dispathcer.addAircraft(aircraftDouglas);
            dispathcer.addAircraft(aircraftCessna);
            dispathcer.addAircraft(aircraftBoeing);

            dispathcer.showAirlineAircrafts();

            System.out.println("Самолеты отсортированы по дальности полета:");
            dispathcer.sortPlanesByFlightRange();
            dispathcer.showAirlineAircrafts();

            System.out.println("Диапазон топлива ");
            dispathcer.filterAircraftsByFuelConsumption(2000, 3000, true);
            System.out.println();

            dispathcer.calculateTotalCargoPassengerCapacity(); //общая грузоподъемность
        }
        catch (Exception ex){
            System.out.println( ex.getMessage());
        }

    }
}

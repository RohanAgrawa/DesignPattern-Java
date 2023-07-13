public class PathFinder {


    private final GoogleMapPath bike = new BikeRoute();
    private final GoogleMapPath car = new CarRoute();

    private final GoogleMapPath heavyMotor = new HeavyVechileRoute();

    private final GoogleMapPath train = new RailwayRoute();
    public GoogleMapPath getPath(String mode)
    {
        if(ModeOfTransportation.BIKE.toString().equals (mode))
        {
           return bike;
        }

        else if(ModeOfTransportation.CAR.toString().equals (mode))
        {
            return car;
        }

        else if(ModeOfTransportation.BUS.toString().equals (mode) || ModeOfTransportation.TRUCK.toString().equals(mode))
        {
           return heavyMotor;
        }

        else if(ModeOfTransportation.TRAIN.toString().equals (mode) || ModeOfTransportation.RAIL.toString().equals (mode))
        {
            return train;
        }

        else {
            return null;
        }
    }
}

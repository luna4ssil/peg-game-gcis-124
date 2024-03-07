package peggame;

public class Peg {
    private Location currentLocation;
    
    public Peg(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }
}
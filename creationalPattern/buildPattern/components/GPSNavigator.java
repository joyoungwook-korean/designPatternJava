package creationalPattern.buildPattern.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "seoul gurogu";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}

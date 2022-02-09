public class TemperatureConversion {
    // properties
    private double _celsius = 0.0;

    // constructor(s)
    TemperatureConversion() {}

    TemperatureConversion(double celsius) {
        this._celsius = celsius;
    }

    // func to calc
    public double CelsiusToFahrenheit() {
        return (9.0 / 5) * this._celsius + 32;
    }    

    // getters and setters
    public double GetCelsius() {
        return this._celsius;
    }

    public void SetCelsius(double input) {
        this._celsius = input;
    }
}

package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit(double temp){
        return temp*9/5+32;
    }

    // Instance method to get a formatted summary string
    public String getSummary(){
        double temperatureFahrenheit = this.temperatureFahrenheit(temperatureCelsius);
        return String.format("Current weather: %.1f°C (%.1f°F) and %s.",temperatureCelsius,temperatureFahrenheit,conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       return  new WeatherData((tempFahrenheit-32)*5/9,conditions);
    }

    public static void main(String[] args) {
        WeatherData record = new WeatherData(25,"Sunny");
        System.out.println("Today's weather: "+record.getSummary());
        WeatherData record2 = WeatherData.fromFahrenheit(50,"Cloudy");
        System.out.println("Yesterday's weather: "+record2.getSummary());
    }

}

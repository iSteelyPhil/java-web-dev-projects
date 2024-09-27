package Temp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    // Test Celsius to Fahrenheit conversion
    @Test
    public void testCelsiusToFahrenheit() {
        // Celsius to Fahrenheit (0°C to 32°F)
        Celsius celsius = new Celsius(0);  // Set Celsius to 0
        double fahrenheit = celsius.convertTemp();
        assertEquals(32.0, fahrenheit, 0.001, "0°C should be 32°F");

        // Celsius to Fahrenheit (100°C to 212°F)
        celsius = new Celsius(100);  // Set Celsius to 100
        fahrenheit = celsius.convertTemp();
        assertEquals(212.0, fahrenheit, 0.001, "100°C should be 212°F");
    }

    // Test Fahrenheit to Celsius conversion
    @Test
    public void testFahrenheitToCelsius() {

        Fahrenheit fahrenheit = new Fahrenheit(32);
        double celsius = fahrenheit.convertTemp();
        assertEquals(0.0, celsius, 0.001, "32°F should be 0°C");


        fahrenheit = new Fahrenheit(212);
        celsius = fahrenheit.convertTemp();
        assertEquals(100.0, celsius, 0.001, "212°F should be 100°C");
    }

    // Test edge cases (absolute zero)
    @Test
    public void testAbsoluteZero() {

        Celsius celsius = new Celsius(-273.15);
        double fahrenheit = celsius.convertTemp();
        assertEquals(-459.67, fahrenheit, 0.001, "Absolute zero in Celsius should be -459.67°F");


        Fahrenheit fahrenheitObj = new Fahrenheit(-459.67);
        double celsiusTemp = fahrenheitObj.convertTemp();
        assertEquals(-273.15, celsiusTemp, 0.001, "Absolute zero in Fahrenheit should be -273.15°C");
    }
}


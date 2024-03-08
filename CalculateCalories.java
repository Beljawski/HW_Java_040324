package hw_04032024;
//Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром
// 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
public class CalculateCalories {

        public static void main(String[] args) {
            // Диаметр пиццы small
            double diameterPizzaSmall = 24.0;

            // Диаметр пиццы big
            double diameterPizzaBig = 28.0;

            // Радиус пиццы small
            double radiusPizzaSmall = diameterPizzaSmall / 2.0;

            // Радиус пиццы big
            double radiusPizzaBig = diameterPizzaBig / 2.0;

            // Fläche der Pizza small berechnen
            double areaPizzaSmall = Math.PI * Math.pow(radiusPizzaSmall, 2);

            // Kalorien für Pizza small berechnen
            double caloriesPizzaSmall = areaPizzaSmall * 40;

            // Fläche der Pizza big berechnen
            double areaPizzaBig = Math.PI * Math.pow(radiusPizzaBig, 2);

            // Kalorien für Pizza big berechnen
            double caloriesPizzaBig = areaPizzaBig * 40;

            // Unterschied in den Kalorien berechnen
            double caloriesDifference = caloriesPizzaBig - caloriesPizzaSmall;

            // Ausgabe der Ergebnisse
            System.out.println("Пицца диаметром 24 содержит " + (int) caloriesPizzaSmall + " калорий");
            System.out.println("Пицца диаметром 28 содержит " + (int) caloriesPizzaBig + " калорий");
            System.out.println("Лишние калории: " + (int) caloriesDifference);
        }
    }


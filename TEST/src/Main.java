//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
    String[] consoles = {"PS5", "Xbox", "Switch"};

    int[][] sales = {
            {1000, 2000, 3000}, //Cape Town
            {2000, 3000, 4000}, //Port Elizabeth
            {1500, 1100, 1200}, //Pretoria

    };

    int[] cityTotals = new int[cities.length];

    System.out.println("_____________________________");
    System.out.println("Gaming console report");
    System.out.println("_______________________________");

    System.out.printf("%-15s %-10s %-10s %-10s%n", "", consoles[0], consoles[1], consoles[2]);

    for (int i = 0; i < cities.length; i++) {
        System.out.printf("%-15s", cities[i]);
        int rowTotal = 0;
        for (int j = 0; j < consoles.length; j++) {

            System.out.printf("%-10d", sales[i][j]);

            rowTotal += sales[i][j];
        }

        cityTotals[i] = rowTotal;

        System.out.println();
    }

    System.out.println("________________________________________");
    System.out.println("Console Sales Totals for Each City");
    System.out.println("________________________________________");

    for (int i = 0; i < cities.length; i++) {
        System.out.printf("%-15s %d%n", cities[i], cityTotals[i]);
    }

    int maxSales = cityTotals[0];
    int maxIndex = 0;

    for (int i = 1; i < cityTotals.length; i++)
        if (cityTotals[i] > maxSales) {
            maxSales =
                    cityTotals[i];
            maxIndex = i;

        }
}

System.out.printIn();
System.out.printIn("City With the most sales:" + cities[maxIndex]);
System.out.printIn("_____________________________________");

        }
                }




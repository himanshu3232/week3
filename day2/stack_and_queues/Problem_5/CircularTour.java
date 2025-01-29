package Problem_5;

public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int totalSurplus = 0; // Total petrol - total distance
        int surplus = 0; // Surplus petrol at any point
        int startIndex = 0; // Starting petrol pump index

        for (int i = 0; i < petrol.length; i++) {
            int netGain = petrol[i] - distance[i];
            surplus += netGain;
            totalSurplus += netGain;

            // If we run out of petrol at any pump, reset the start index
            if (surplus < 0) {
                surplus = 0;  // Reset surplus
                startIndex = i + 1; // Start from the next pump
            }
        }

        // If totalSurplus is negative, no solution exists
        return (totalSurplus >= 0) ? startIndex : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPoint(petrol, distance);
        System.out.println("Starting Petrol Pump Index: " + startIndex);
    }
}

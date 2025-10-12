public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            // अगर currentGas negative हो जाए, तो यह स्टेशन सही नहीं है
            if (currentGas < 0) {
                startStation = i + 1;  // अगले स्टेशन को नया start मानो
                currentGas = 0;        // गैस फिर से 0 से गिनना शुरू
            }
        }

        // अगर कुल गैस कुल लागत से कम है, तो possible नहीं
        if (totalGas < totalCost) {
            return -1;
        }

        return startStation;
    }

    public static void main(String[] args) {
        GasStation obj = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int result = obj.canCompleteCircuit(gas, cost);
        System.out.println("Starting station index: " + result);
    }
}

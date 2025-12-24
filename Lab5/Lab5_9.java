package Lab5;

import java.util.Scanner;

class ItemBase {
    protected String itemLabel;

    public ItemBase(String itemLabel) {
        this.itemLabel = itemLabel;
    }

    public double getValue() {
        return 0.0;
    }
}

class TangibleGoods extends ItemBase {
    protected double pricePerUnit;
    protected int stockCount;

    public TangibleGoods(String itemLabel, double pricePerUnit, int stockCount) {
        super(itemLabel);
        this.pricePerUnit = pricePerUnit;
        this.stockCount = stockCount;
    }

    @Override
    public double getValue() {
        return pricePerUnit * stockCount;
    }
}

class OnlineService extends ItemBase {
    protected double costPerMonth;
    protected int activeMonths;

    public OnlineService(String itemLabel, double costPerMonth, int activeMonths) {
        super(itemLabel);
        this.costPerMonth = costPerMonth;
        this.activeMonths = activeMonths;
    }

    @Override
    public double getValue() {
        return costPerMonth * activeMonths;
    }
}

public class Lab5_9 {
    public static void main(String[] args) {
        Scanner dataStream = new Scanner(System.in);

        String physicalName = dataStream.nextLine();
        double physicalPrice = Double.parseDouble(dataStream.nextLine());
        int physicalAmount = Integer.parseInt(dataStream.nextLine());

        String digitalName = dataStream.nextLine();
        double digitalCost = Double.parseDouble(dataStream.nextLine());
        int digitalDuration = Integer.parseInt(dataStream.nextLine());

        ItemBase firstItem =
                new TangibleGoods(physicalName, physicalPrice, physicalAmount);

        ItemBase secondItem =
                new OnlineService(digitalName, digitalCost, digitalDuration);

        ItemBase[] inventoryList = { firstItem, secondItem };

        double totalWorth = 0.0;

        for (ItemBase storedItem : inventoryList) {
            totalWorth += storedItem.getValue();
        }

        System.out.println(totalWorth);

        dataStream.close();
    }
}

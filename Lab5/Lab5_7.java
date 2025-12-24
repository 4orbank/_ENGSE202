	package Lab5;
	
	import java.util.Scanner;
	
	class StaffBaseUnit {
	    protected String staffName;
	    protected double baseIncome;
	
	    public StaffBaseUnit(String staffName, double baseIncome) {
	        this.staffName = staffName;
	        this.baseIncome = baseIncome;
	    }
	
	    public double calculatePay() {
	        return baseIncome;
	    }
	}
	
	class CommissionStaffUnit extends StaffBaseUnit {
	    protected double commissionFactor;
	
	    public CommissionStaffUnit(String staffName, double baseIncome, double commissionFactor) {
	        super(staffName, baseIncome);
	        this.commissionFactor = commissionFactor;
	    }
	
	    @Override
	    public double calculatePay() {
	        return baseIncome + (baseIncome * commissionFactor);
	    }
	}
	
	class BonusStaffUnit extends StaffBaseUnit {
	    protected double bonusAmount;
	
	    public BonusStaffUnit(String staffName, double baseIncome, double bonusAmount) {
	        super(staffName, baseIncome);
	        this.bonusAmount = bonusAmount;
	    }
	
	    @Override
	    public double calculatePay() {
	        return baseIncome + bonusAmount;
	    }
	}
	
	class SalaryOutputEngine {
	    public static void process(StaffBaseUnit staffObject) {
	        System.out.println(staffObject.staffName + " total pay: " + staffObject.calculatePay());
	    }
	}
	
	public class Lab5_7 {
	    public static void main(String[] args) {
	        Scanner inputStreamReader = new Scanner(System.in);
	
	        String commissionName = inputStreamReader.nextLine();
	        double commissionSalary = inputStreamReader.nextDouble();
	        double commissionRate = inputStreamReader.nextDouble();
	        inputStreamReader.nextLine();
	
	        String bonusName = inputStreamReader.nextLine();
	        double bonusSalary = inputStreamReader.nextDouble();
	        double bonusValue = inputStreamReader.nextDouble();
	
	        StaffBaseUnit commissionWorker =
	                new CommissionStaffUnit(commissionName, commissionSalary, commissionRate);
	
	        StaffBaseUnit bonusWorker =
	                new BonusStaffUnit(bonusName, bonusSalary, bonusValue);
	
	        SalaryOutputEngine.process(commissionWorker);
	        SalaryOutputEngine.process(bonusWorker);
	
	        inputStreamReader.close();
	    }
	}

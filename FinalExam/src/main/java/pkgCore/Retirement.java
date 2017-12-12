package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//Complete: Build the contructor, getters and setters for the attributes above.
	
	Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, 
			   double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySSI)
	{
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
		
		
	}
	
	public int getiYearsToWork() {
		return iYearsToWork;
	}

	private void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	private void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}

	private void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	private void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	private void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	private void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}

	public double AmountToSave()
	{
		//Complete: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		double perMonth = (this.TotalAmountSaved() / (this.getiYearsToWork() * 12) * (1 + (this.getdAnnualReturnWorking() / 100)));
		
		return perMonth;
	}
	
	public double TotalAmountSaved()
	{
		//	Complete: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		double incomeDiff = this.getdRequiredIncome() - this.getdMonthlySSI();
		double totSavings = ((incomeDiff * (1 + (this.getdAnnualReturnRetired() / 100))) * (this.getiYearsRetired() * 12));
		
		return totSavings;
	}
}

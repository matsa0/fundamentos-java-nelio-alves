package employees;

public class OutsourcedEmployee extends Employee{
    private double additionalCharge;

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return (getValuePerHour() * getHours()) + (1.1 * additionalCharge);
    }

    @Override
    public String toString() {
        return getName() + " - $" + payment();
    }

    public double getAddCharge() {
        return this.additionalCharge;
    }
    public void setAddCharge(double addCharge) {
        this.additionalCharge = addCharge;
    }
}

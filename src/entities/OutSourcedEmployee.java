package entities;

public class OutSourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutSourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}

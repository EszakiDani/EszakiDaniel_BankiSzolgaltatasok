package hu.petrik.BankiSzolgaltatasok;

public abstract class BankiSzolgaltatas {
    private final Tulajdonos tulajdonos;

    public BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }
}
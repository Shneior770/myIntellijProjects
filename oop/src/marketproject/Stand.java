package marketproject;

public abstract class Stand  implements StandBase {
    private Clerck[] clercks;
    private StandsName standsName;

    protected Stand(Clerck[] clercks, StandsName standsName) {
        this.clercks = clercks;
        this.standsName = standsName;
    }

    public boolean serveCostumer(Client client) {
        for (int i = 0; i < clercks.length; i++) {
            if (clercks[i].isClerckOccupied() == false) {
                clercks[i].serveCustomer();
                return true;
            }
        }

        return false;
    }

    @Override
    public String getStandName() {
        return standsName.getStandName();
    }
}

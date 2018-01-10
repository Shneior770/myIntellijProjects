package marketproject;

import marketproject.Client;
import marketproject.Stand;
import marketproject.StandBase;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private Stand[] marketStands;

    public Market(Stand[] marketStands) {
        this.marketStands = marketStands;
    }

    public List<StandBase> visit(Client client) {
        List<StandBase> list = new ArrayList<>();

        for (int i = 0; i < marketStands.length; i++) {
            if(marketStands[i].serveCostumer(client)) {
                list.add(marketStands[i]);
            }
        }

        return list;
    }
}




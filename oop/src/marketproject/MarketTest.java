package marketproject;


import marketproject.*;

import java.util.List;

public class MarketTest {

    public static void main(String[] arg) throws InterruptedException {

        Stand[] stands = new Stand[3];// 3 spaces for stands
        Clerck[] Oclercks = new Clerck[3];// 3 spaces for clercks
        for (int i = 0; i < Oclercks.length; i++) {
            Oclercks[i] = new Clerck();
        }
        Clerck[] Aclercks = new Clerck[2];// 2 spaces for clercks
        for (int i = 0; i < Aclercks.length; i++) {
            Aclercks[i] = new Clerck();
        }

        Clerck[] Bclercks = new Clerck[2];// 2 spaces for clercks

        for (int i = 0; i < Bclercks.length; i++) {
            Bclercks[i] = new Clerck();
        }

        stands[0] = new OrangeStand(Oclercks);
        stands[1] = new AppleStand(Aclercks);
        stands[2] = new BananaStand(Bclercks);

        Market market = new Market(stands);
        Client clientA = new Client();
        Client clientB = new Client();
        Client clientC = new Client();
        Client clientD = new Client();

        List<StandBase> lista = market.visit(clientA);
        printStandsList(lista);
        List<StandBase> listb = market.visit(clientB);
        printStandsList(listb);
        List<StandBase> listc = market.visit(clientC);
        printStandsList(listc);
        List<StandBase> listd = market.visit(clientD);
        printStandsList(listd);

        Thread.sleep(1000 * 61);

        market.visit(clientC);


    }

    private static void printStandsList(List<StandBase> list) {
        for (StandBase item: list)  {
            System.out.println("list item: " + item.getStandName());
        }

        System.out.println("------------------------");
    }
}


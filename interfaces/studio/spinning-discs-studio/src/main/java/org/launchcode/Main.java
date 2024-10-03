package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD coheedAlbumOne = new CD("The Second Stage Turbine Blade", true);
        CD warcraftThree = new CD("Warcraft 3: Reign of Chaos");
        DVD seinfeldSeason3 = new DVD("Seinfeld: Season 3");

        File timeConsumer = new File("Time Consumer", 50);
        File everythingEvil = new File("Everything Evil", 60);
        coheedAlbumOne.writeFile(timeConsumer);
        coheedAlbumOne.writeFile(everythingEvil);

        File scourgeCampaign = new File("The Scourge Campaign", 100);
        File orcCampaign = new File("The Orc Campaign", 100);
        warcraftThree.writeFile(scourgeCampaign);
        warcraftThree.writeFile(orcCampaign);

        File s3e1 = new File("Season 3 - Episode 1", 310);
        File s3e2 = new File("Season 3 - Episode 2", 320);
        seinfeldSeason3.writeFile(s3e1);
        seinfeldSeason3.writeFile(s3e2);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(coheedAlbumOne);
        System.out.println(warcraftThree);
        System.out.println(seinfeldSeason3);

        //
        coheedAlbumOne.runFile(everythingEvil);
        seinfeldSeason3.writeFile(s3e2);
        //
        warcraftThree.removeFile(orcCampaign);
        warcraftThree.runFile(orcCampaign);
        //
        coheedAlbumOne.reformatDisc();
        coheedAlbumOne.runFile(everythingEvil);
        //
        File tooBigFile = new File("TOOOBIIIIIG", 10000);
        coheedAlbumOne.writeFile(tooBigFile);
    }
}
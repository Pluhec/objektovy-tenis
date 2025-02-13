public class Logika {

    int domaciHry;
    int hosteHry;
    int domaciGemy;
    int hosteGemy;
    int domaciSety;
    int hosteSety;
    int domaciPocitadloVyhod;
    int hostePocitadloVyhod;

    String vyhoda = "AD";

    void getInput(Vystupy vystupy){
        int vstup = vystupy.input();
        process(vstup, vystupy);
    }

    void process(int vstup, Vystupy vystup){

        if (vstup == 1 && domaciHry != 30 && domaciHry <= 39) {
            domaciHry += 15;
        } else if (vstup == 1 && domaciHry == 30 || vstup == 1 && domaciHry == 40) {
            domaciHry += 10;
        }

        if (vstup == 2 && hosteHry != 30 && hosteHry <= 39) {
            hosteHry += 15;
        } else if (vstup == 2 && hosteHry == 30 || vstup == 2 && hosteHry == 40) {
            hosteHry += 10;
        }

        if (domaciHry == 50 && vstup == 1 && hosteHry == 40) {
            domaciHry = 100;
        }

        if (hosteHry == 50 && vstup == 2 && domaciHry == 40) {
            hosteHry = 100;
        }

        if (domaciHry == 100) {
            ++domaciPocitadloVyhod;
        }

        if (hosteHry == 100) {
            ++hostePocitadloVyhod;
        }

        if (domaciHry == 100 && hosteHry == 50) {
            hostePocitadloVyhod = 0;
            domaciPocitadloVyhod = 0;
            hosteHry = 40;
            domaciHry = 40;
        }

        if (domaciHry == 50 && hosteHry == 100) {
            hostePocitadloVyhod = 0;
            domaciPocitadloVyhod = 0;
            hosteHry = 40;
            domaciHry = 40;
        }

        if (vstup == 1 && domaciPocitadloVyhod == 2 || vstup == 1 && domaciHry == 50 && hosteHry != 40) {
            ++domaciGemy;
            domaciHry = 0;
            hosteHry = 0;
            domaciPocitadloVyhod = 0;
            hostePocitadloVyhod = 0;
        }

        if (vstup == 2 && hostePocitadloVyhod == 2 || vstup == 2 && hosteHry == 50 && domaciHry != 40) {
            ++hosteGemy;
            domaciHry = 0;
            hosteHry = 0;
            domaciPocitadloVyhod = 0;
            hostePocitadloVyhod = 0;
        }

        if (vstup == 1 && domaciHry == 100 && domaciPocitadloVyhod == 2) {
            ++domaciGemy;
            domaciHry = 0;
            hosteHry = 0;
        } else if (vstup == 2 && hosteHry == 100 && hostePocitadloVyhod == 2) {
            ++hosteGemy;
            domaciHry = 0;
            hosteHry = 0;
        }

        if (domaciGemy >= 6 || hosteGemy >= 6) {
            if (domaciGemy == 6 && hosteGemy <= 4) {
                ++domaciSety;
                domaciGemy = 0;
                hosteGemy = 0;
            }

            if (hosteGemy == 6 && domaciGemy <= 4) {
                ++hosteSety;
                domaciGemy = 0;
                hosteGemy = 0;
            }

            if (domaciGemy - hosteGemy > 1) {
                ++domaciSety;
                domaciGemy = 0;
                hosteGemy = 0;
            }

            if (hosteGemy - domaciGemy > 1) {
                ++hosteSety;
                domaciGemy = 0;
                hosteGemy = 0;
            }
        }
        vystup.outputMessage(domaciHry, hosteHry, domaciGemy, hosteGemy, domaciSety, hosteSety, vyhoda);
    }
}

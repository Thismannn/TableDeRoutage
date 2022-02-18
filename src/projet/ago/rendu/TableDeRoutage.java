package projet.ago.rendu;

    import java.util.*;

    public class TableDeRoutage {

        public static void main(String[] args) {

            Random alea = new Random();
            Graphe[] sommet = new Graphe[100];
            Graphe[] sommet1 = new Graphe[100];
            int a = 0;
            int b = 10;
            int c = 30;
            double prob;
            int Tier;
            int valT1 = 0, valT2 = 0, valT3 = 0;
            int j = 0;
            int i;
            boolean k = true;


            // creation des sommets
            System.out.println("\tListe des couples (sommet, info)");
            for (i = 0; i < 100; i++) {
                sommet[i] = new Graphe(i, alea.nextInt(101));


                System.out.print(sommet[i] + " ");

            }
            // creation aleatoire des aretes
            System.out.println("\n\tListe des aretes");


            for (a = 0; a < 10; a++) {
                if (Math.random() > 0.25) {
                    valT1 = 5 + alea.nextInt(5);

                }

                System.out.println("T1" + sommet[a] + "<--" + valT1 + "-->" + sommet[alea.nextInt(10)]);


            }


            for (b = 10; b < 31; b++) {
                prob = Math.random();
                valT2 = 10 + alea.nextInt(10);

                if (prob < 0.5) {

                    if (Math.random() < 0.5) {
                        System.out.println("T2" + sommet[b] + "<--" + valT2 + "-->" + sommet[alea.nextInt(a + 1)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)]);
                    } else {
                        System.out.println("T2" + sommet[b] + "<--" + valT2 + "-->" + sommet[alea.nextInt(a + 1)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)]);
                    }
                } else {
                    if (Math.random() < 0.5) {
                        System.out.println("T2" + sommet[b] + "<--" + valT2 + "-->" + sommet[alea.nextInt(a + 1)] + "" + sommet[alea.nextInt(a + 1)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)]);
                    } else {
                        System.out.println("T2" + sommet[b] + "<--" + valT2 + "-->" + sommet[alea.nextInt(a + 1)] + "" + sommet[alea.nextInt(a + 1)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)]);
                    }
                }


            }


            for (c = 31; c < 100; c++) {
                prob = Math.random();
                valT3 = 15 + alea.nextInt(35);

                System.out.println("T3" + sommet[c] + "<--" + valT3 + "-->" + sommet[11 + alea.nextInt(19)] + "" + sommet[11 + alea.nextInt(19)] + "" + sommet[31 + alea.nextInt(69)]);

            }


            // parcours profondeur des sommets
            System.out.println("\n\tParcours en profondeur");
            Graphe.parcoursProfondeur(Arrays.asList(sommet));


            //System.out.println("\n\tListe des aretes");
            for (i = 0; i < sommet.length; i++)
                for (j = i + 1; j < sommet.length; j++)

                    if (alea.nextBoolean()) {
                        Graphe.arete(sommet[i], sommet[j]);
                        //   System.out.println(sommet[i]+" ==> "+sommet[j]);

                    }
            // Parcours en profondeur entre deux sommets quelconques
            System.out.println("\n\tLe parcours en profondeur entre les sommets choisis : :");
            Graphe.existeChemin(Arrays.asList(sommet), sommet[0], sommet[25]);

            // Le plus court chemin
            System.out.println("\n\tLe plus court chemin entre les sommets 1 et 15 est : :");
            Graphe.plusCourtChemin(Arrays.asList(sommet), sommet[1], sommet[15]);

            // existeChemin
            System.out.println("\n\tLe chemin suivi par le message est le suivant :");
            Graphe.existeChemin(Arrays.asList(sommet), sommet[2 ], sommet[10]);
        }

}

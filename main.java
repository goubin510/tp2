/*
 * Thomas Mathilda - Goubin Antoine
 * 
 * 3/11/14 Groupe Cb
 */
package tp2_goubin_thomas_cb;

import java.util.Scanner;

/**
 *
 * @author agoubin
 */
public class TP2_GOUBIN_THOMAS_CB {

    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main(String[] args) {

        ChaineTV chaineStd = new ChaineTV("TV1");

        Scanner sc = new Scanner(System.in);
        int choix;
        String nomChaine;

        System.out.println("Entree dans le prog.");

        do {
            System.out.println("voulez vous :");
            System.out.println("1/ Creer Une chaines TV");
            System.out.println("2/ Editer Une chaines TV");
            choix = sc.nextInt();
        } while ((choix != 1) && (choix != 2));
        if (choix == 1) {
            System.out.println("quel est le nom de cette chaineTV :");
            nomChaine = sc.nextLine();

            ChaineTV uneChaine = new ChaineTV(nomChaine);
            Chaines(uneChaine);

        }
        if (choix == 2) {
            System.out.println("quel est le nom de cette chaineTV :");
            nomChaine = sc.nextLine();

        }

    }

    private static void Chaines(ChaineTV uneChaine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("voulez vous :");
        int choix;

        do {
            System.out.println("voulez vous :");
            System.out.println("1/ Creer Une Grille");
            System.out.println("2/ Editer Une Grille");
            choix = sc.nextInt();
        } while ((choix != 1) && (choix != 2));

        if (choix == 1) {
            System.out.println("quel est le jour de cette Grille :");
            choix = sc.nextInt();

            Grille uneGrille = new Grille(choix);
            Emission(uneGrille);

        }
        if (choix == 2) {
            System.out.println("quel est le jour de cette Grille :");
            choix = sc.nextInt();

        }

    }

    private static void Emission(Grille uneGrille) {
        Scanner sc = new Scanner(System.in);
        int choix;

        System.out.println("voulez vous :");

        do {
            System.out.println("1/ Ajouter une emission");
            System.out.println("2/ Deplacer une emission");
            System.out.println("3/ Supprimer une emission");
            choix = sc.nextInt();
        } while ((choix != 1) && (choix != 2) && (choix != 3));
        if (choix == 1) {
            ajoutemi(uneGrille);
        }
        if (choix == 2) {

        }
        if (choix == 3) {

        }
    }

    private static void ajoutemi(Grille uneGrille) {
        Scanner sc = new Scanner(System.in);
        int choix;

        System.out.println("voulez vous :");
        do {
            System.out.println("1/ Ajouter une série");
            System.out.println("2/ Ajouter un film");
            System.out.println("3/ Ajouter un reportage");
            System.out.println("4/ Ajouter un divertissement");
            choix = sc.nextInt();
        } while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4));

        if (choix == 1) {
            Serie emission = new Serie("", 0, "", true, true, "", 0, 0);
            emission.info();
            Creneau unCreneau = new Creneau(emission, 0);
            do {
                System.out.println("choisir une heure de début :");
                choix = sc.nextInt();

            } while ((emission.verifiercreneau(choix) && (uneGrille.verifierDispo(unCreneau))));
            uneGrille.ajouter(unCreneau);

        }

        if (choix == 2) {
            Film emission = new Film("", 0, "", true, true);
            emission.info();
            Creneau unCreneau = new Creneau(emission, 0);
            do {
                System.out.println("choisir une heure de début :");
                choix = sc.nextInt();

            } while ((emission.verifiercreneau(choix) && (uneGrille.verifierDispo(unCreneau))));
            uneGrille.ajouter(unCreneau);
        }

        if (choix == 3) {
            Reportage emission = new Reportage("", 0, 0, "");
            emission.info();
            Creneau unCreneau = new Creneau(emission, 0);
            do {
                System.out.println("choisir une heure de début :");
                choix = sc.nextInt();

            } while ((emission.verifiercreneau(choix) && (uneGrille.verifierDispo(unCreneau))));
            uneGrille.ajouter(unCreneau);
        }

        if (choix == 4) {
            Divertissement emission = new Divertissement("", 0, 0, "");
            emission.info();
            Creneau unCreneau = new Creneau(emission, 0);
            do {
                System.out.println("choisir une heure de début :");
                choix = sc.nextInt();

            } while ((emission.verifiercreneau(choix) && (uneGrille.verifierDispo(unCreneau))));
            uneGrille.ajouter(unCreneau);
        }

    }

}

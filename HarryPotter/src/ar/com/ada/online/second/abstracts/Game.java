package ar.com.ada.online.second.abstracts;

import java.util.*;

public class Game {
    private static int attackSpellQtty = 0;
    private Player playerOne;
    private Player playerTwo;
    private boolean isPlayerWizard;
    private boolean isDark;
    AttackSpell attackSpell = new AttackSpell();
    private ArrayList<Spell> spells = new ArrayList<>();

    Scanner keyboard = new Scanner(System.in);

    protected void selectPlayer() {
        System.out.println("¿Qué tipo de personaje serás?");
        System.out.println("\n\t1) Mago\n\t2) Elfo");
        Player player = null;
        int choose = keyboard.nextInt();
        switch (choose) {
            case 1:
                player = selectWizard();
                isPlayerWizard = true;
                break;
            case 2:
                player = selectElf();
                isPlayerWizard = false;
                break;
            default:
                player = null;
                System.out.println("Debes elegir una opción válida");
                break;
        }
    }

    private Player selectElf() {
        Elf elf = new Elf();
        String aux = null;
        List<String> elfNames = new ArrayList<String>();
        do {
            System.out.println("Seleccione un Elfo de la lista: ");
            System.out.println("\t1) Dobby");
            System.out.println("\t2) Kreacher");
            System.out.println("\t3) Hokey");
            System.out.println("\t4) Winky");

            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    elf.setName("Dobby");
                    elfNames.add("Dobby");
                    aux = "aux";
                    break;
                case 2:
                    elf.setName("Kreacher");
                    elfNames.add("Kreacher");
                    aux = "aux";
                    break;
                case 3:
                    elf.setName("Hokey");
                    elfNames.add("Hokey");
                    aux = "aux";
                    break;
                case 4:
                    elf.setName("Winky");
                    elfNames.add("Winky");
                    aux = "aux";
                    break;
                default:
                    aux = null;
                    System.out.println("Debes elegir un número del 1 al 4");
                    break;
            }

        } while (aux == null);
        return elf;
    }

    private Player selectWizard() {
        Wizard wizard = new Wizard();
        String aux = null;
        List<String> wizardNames = new ArrayList<String>();
        do {
        System.out.println("Seleccione un mago de la lista: ");
        System.out.println("\t1) Harry Potter");
        System.out.println("\t2) Lord Voldemort");
        System.out.println("\t3) Luna Lovegood");
        System.out.println("\t4) Albus Dumbledore");
        System.out.println("\t5) Bellatrix Lestrange");

        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                wizard.setName("Harry Potter");
                wizardNames.add("Harry Potter");
                aux = "aux";
                break;
            case 2:
                wizard.setName("Lord Voldemort");
                wizardNames.add("Lord Voldemort");
                aux = "aux";
                break;
            case 3:
                wizard.setName("Luna Lovegood");
                wizardNames.add("Luna Lovegood");
                aux = "aux";
                break;
            case 4:
                wizard.setName("Albus Dumbledore");
                wizardNames.add("Albus Dumbledore");
                aux = "aux";
                break;
            case 5:
                wizard.setName("Bellatrix Lestrange");
                wizardNames.add("Bellatrix Lestrange");
                aux = "aux";
                break;
            default:
                wizard = null;
                System.out.println("Debes elegir un número del 1 al 5");
                break;
        }

        } while (aux == null);
        return wizard;
    }

    public void isPlayerWizard() {
        if (isPlayerWizard = true) {
            getRandomWand();
            System.out.println(" ");
        }
    }

    private Wand getRandomWand() {
        Random wand = new Random();
        //lógica para seleccionar de una lista las varitas
        List<Wand> list = new ArrayList<>();
        list.add(new Wand("Cerezo", 2)); // Neville
        list.add(new Wand("Ciprés", 4)); // Remus
        list.add(new Wand("Roble", 0)); // Hagrid
        list.add(new Wand("Sauce", 3)); // Ron
        list.add(new Wand("Abeto", 4)); // Minerva
        list.add(new Wand("Sauco", 5)); // Albus

        int index = wand.nextInt(list.size());

        System.out.println("La varita que eligió a este mago es: " + list.get(index).getWandName());
        return list.get(index); //acá estoy retornando la varita
    }

    protected static void menu(Game game, Scanner keyboard) {
        int continueMenu = 0;
        int spellCount = 0;
        do {
            System.out.println("Elegí el tipo de hechizo: \n\t1) Ataque \n\t2) Defensa \n\t3) Energía Mágica");
            int option = keyboard.nextInt(); // capturo la elección del usuario

            switch (option) {
                case 1:
                    AttackSpell attackSpell = getAttackSpellItem(keyboard); // llamo al método y le paso el teclado para el ingreso
                    if (attackSpell != null)
                        game.addSpell(attackSpell);
                    spellCount++;
                    break;
                case 2:
                    DefenseSpell defenseSpell = getDefenseSpellItem(keyboard);
                    if (defenseSpell != null)
                        game.addSpell(defenseSpell);
                    spellCount++;
                    break;
                case 3:
                    EnergySpell energySpell = getEnergySpellItem(keyboard);
                    if (energySpell != null)
                        game.addSpell(energySpell);
                    spellCount++;
                    break;
                default:
                    System.out.println("Debes elegir un número entre el 1 y el 3");

            }
            System.out.println("Querés agregar otro hechizo?\n\t1) Sí\n\t2) No");
            continueMenu = keyboard.nextInt(); // capturo la elección del usuario

        } while (continueMenu == 1 && spellCount < 7);

    }

        public void addSpell(Spell spell) {
            if (spell instanceof AttackSpell) {
                attackSpellQtty++;
            }
            this.spells.add(spell);

        }

    protected static AttackSpell getAttackSpellItem(Scanner keyboard) {
        System.out.println("Elige uno de los siguientes hechizos de ataque:");
        System.out.println("1) Avada Kedavra: ataque 100 - consumo de energía mágica 90");
        System.out.println("2) Imperius: ataque 90 - consumo de energía mágica 80");
        System.out.println("3) Crucio: ataque 80 - consumo de energía mágica 70");
        System.out.println("4) Petrificus Totalus: ataque 17 - consumo de energía mágica 9");
        System.out.println("5) Experliarmus: ataque 25 - consumo de energía mágica 15");
        System.out.println("6) Reducto: ataque 10 - consumo de energía mágica 5");

        AttackSpell attackSpell = new AttackSpell();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                attackSpell.setName ("Avada Kedavra");
                attackSpell.setAttack(100);
                attackSpell.setRequiredMagicPoints(90);
                break;
            case 2:
                attackSpell.setName("Imperius");
                attackSpell.setAttack(90);
                attackSpell.setRequiredMagicPoints(80);
                break;
            case 3:
                attackSpell.setName("Crucio");
                attackSpell.setAttack(80);
                attackSpell.setRequiredMagicPoints(70);
                break;
            case 4:
                attackSpell.setName("Petrificus Totalus");
                attackSpell.setAttack(17);
                attackSpell.setRequiredMagicPoints(9);
                break;
            case 5:
                attackSpell.setName("Expeliarmus");
                attackSpell.setAttack(25);
                attackSpell.setRequiredMagicPoints(15);
                break;
            case 6:
                attackSpell.setName("Reducto");
                attackSpell.setAttack(10);
                attackSpell.setRequiredMagicPoints(5);
                break;
            default:
                System.out.println("El número selecciondo es incorrecto.");
                attackSpell = null;
        }
        return attackSpell;
    }

    static DefenseSpell getDefenseSpellItem(Scanner keyboard) {
        System.out.println("Elige uno de los siguientes hechizos de curación:");
        System.out.println("1) Ossio Dispersimus: sanación: 20 - energía mágica requerida: 15");
        System.out.println("2) Repartifors: sanación: 15 - energía mágica requerida: 18");
        System.out.println("3) Ferula: sanación: 10 - energía mágica requerida: 5");
        System.out.println("4) Rennervate: sanación: 5 - energía mágica requerida: 1");


        DefenseSpell defenseSpell = new DefenseSpell();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                defenseSpell.setName("Ossio Dispersimus");
                defenseSpell.setHeal(20);
                defenseSpell.setRequiredMagicPoints(15);
                break;
            case 2:
                defenseSpell.setName("Repartifors");
                defenseSpell.setHeal(15);
                defenseSpell.setRequiredMagicPoints(8);
                break;
            case 3:
                defenseSpell.setName("Ferula");
                defenseSpell.setHeal(10);
                defenseSpell.setRequiredMagicPoints(5);
                break;
            case 4:
                defenseSpell.setName("Rennervate");
                defenseSpell.setHeal(5);
                defenseSpell.setRequiredMagicPoints(1);
                break;
            default:
                System.out.println("El número elegido es incorrecto.");
                defenseSpell = null;

        }
        return defenseSpell;
    }

    static EnergySpell getEnergySpellItem(Scanner keyboard) {
        System.out.println("Elige uno de los siguientes hechizos: ");
        System.out.println("1) Salvio Hexia: energía mágica recuperada 15 - energía 1");
        System.out.println("2) Protego: energía mágica recuperada 15 - energía 1");
        System.out.println("3) Episkey: energía mágica recuperada 15 - energía 1");

        EnergySpell energySpell = new EnergySpell();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                energySpell.setName("Salvio Hexia");
                energySpell.setMagicEnergy(15);
                energySpell.setRequiredMagicPoints(1);
                break;
            case 2:
                energySpell.setName("Protego");
                energySpell.setMagicEnergy(15);
                energySpell.setRequiredMagicPoints(1);
                break;
            case 3:
                energySpell.setName("Episkey");
                energySpell.setMagicEnergy(15);
                energySpell.setRequiredMagicPoints(1);
                break;
            default:
                System.out.println("El número elegido es incorrecto.");
                energySpell = null;
        }
        return energySpell;
    }

    public void isDarkWizard() {
        if (attackSpellQtty > 3) {
            isDark = true;
        } else {
            isDark = false;
        }
    }


}



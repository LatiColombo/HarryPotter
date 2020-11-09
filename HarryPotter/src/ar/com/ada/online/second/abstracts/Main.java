package ar.com.ada.online.second.abstracts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner keyboard = new Scanner(System.in);

        game.selectPlayer();
        game.isPlayerWizard();
        game.menu(game, keyboard);




    }
}

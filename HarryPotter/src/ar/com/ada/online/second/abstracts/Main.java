package ar.com.ada.online.second.abstracts;

import java.util.Scanner;

import static ar.com.ada.online.second.abstracts.Game.playerOne;
import static ar.com.ada.online.second.abstracts.Game.playerTwo;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner keyboard = new Scanner(System.in);

        game.selectPlayer(playerOne, keyboard);

        game.menu(playerOne, keyboard);

        System.out.println("Ahora seleccionemos al segundo jugador");

        game.selectPlayer(playerTwo, keyboard);

        game.menu(playerTwo, keyboard);

        System.out.println(playerOne.toString());

        System.out.println(playerTwo.toString());
    }
}

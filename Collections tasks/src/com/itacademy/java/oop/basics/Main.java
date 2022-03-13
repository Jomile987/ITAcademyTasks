package com.itacademy.java.oop.basics;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*Create 4 game objects with these properties*/
        Game gameOne = new Game("mario", "fantasy", 5, 1000);
        Game gameTwo = new Game("lol", "team", 0, 45);
        Game gameThree = new Game("tetris", "logic", 2, 10000);
        Game gameFour = new Game("snake", "logic", 1, 12);

        /*Create ArrayList and add Games*/
        List<Game> games = new ArrayList<>();
        games.add(gameOne);
        games.add(gameTwo);
        games.add(gameThree);
        games.add(gameFour);

        /*Remove second game and move Printing to the method and print list again.*/
        games.remove(1);
        listToString(games);
        System.out.println("-------");

        /*Sort Games by Price ascending*/
        Collections.sort(games, new PriceComparator());
        listToString(games);
        System.out.println("-------");

        /*Sort Games by Price descending*/
        Collections.sort(games, new PriceComparator().reversed());
        listToString(games);
        System.out.println("-------");

        /*Using Streams ForEach method increment price.
        Create Method in Games class (incrementPrice)*/
        games.stream().forEach(game -> game.incrementPrice(1));
        listToString(games);
        System.out.println("-------");

        /*Using Stream Filter games by Price is more than 10 euro*/
        List<Game> priceMoreThan10 = games.stream().filter(game -> game.getPrice() > 10).collect(Collectors.toList());
        listToString(priceMoreThan10);
        System.out.println("-------");

        /*Using Stream Filter games by Have sold copied are more than 50*/
        List<Game> copiesMoreThan50 = games.stream().filter(game -> game.getCopiesSold() > 50).collect(Collectors.toList());
        listToString(copiesMoreThan50);
        System.out.println("-------");

        /*Using Streams Sorted sort Game by copies sold*/
        List<Game> sorted = games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        listToString(sorted);
        System.out.println("-------");

        /*Using Streams Min/Max find Game that has sold minimum copies and maximum*/
        Optional<Game> minGamesByCopiesSold = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println(minGamesByCopiesSold.get());
        System.out.println("-------");

        Optional<Game> maxGamesByCopiesSold = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println(maxGamesByCopiesSold.get());


    }

    public static void listToString(List<Game> games) {
        /*Use foreach to go through array of games and print it. For printing use toString*/
        for (Game gameNumber : games) {
            System.out.println(gameNumber.toString());
        }
    }

}

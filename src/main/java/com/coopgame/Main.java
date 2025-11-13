package com.coopgame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) {
        primaryStage = stage;
        primaryStage.setTitle("Co-op Puzzle Game");

        showMainMenu();   // start on the main menu

        primaryStage.show();
    }

    // ---- Navigation helpers ----

    public static void showMainMenu() {
        MainMenuView root = new MainMenuView();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
    }

    public static void showMemoryPuzzle() {
        MemoryPuzzleView root = new MemoryPuzzleView();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
    }

    public static void showBlackjack() {
        BlackJackView root = new BlackJackView();
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
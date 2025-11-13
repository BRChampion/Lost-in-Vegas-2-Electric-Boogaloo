package com.coopgame;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainMenuView extends VBox {

    public MainMenuView() {
        setSpacing(20);
        setAlignment(Pos.CENTER);

        Label title = new Label("Co-op Puzzle Game");
        Button memoryButton = new Button("Memory Puzzle");
        Button blackjackButton = new Button("Blackjack vs Dealer");
        Button quitButton = new Button("Quit");

        memoryButton.setOnAction(e -> Main.showMemoryPuzzle());
        blackjackButton.setOnAction(e -> Main.showBlackjack());
        quitButton.setOnAction(e -> System.exit(0));

        getChildren().addAll(title, memoryButton, blackjackButton, quitButton);
    }
}

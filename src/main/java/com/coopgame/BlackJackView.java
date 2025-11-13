package com.coopgame;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class BlackJackView extends BorderPane {

    public BlackJackView() {
        Label header = new Label("Co-op Blackjack vs Dealer (placeholder)");
        Button backButton = new Button("Back to Menu");

        backButton.setOnAction(e -> Main.showMainMenu());

        VBox topBox = new VBox(header, backButton);
        topBox.setSpacing(10);
        topBox.setAlignment(Pos.CENTER);

        setTop(topBox);

        // TODO: later add:
        // - three hands (Player 1, Player 2, Dealer)
        // - buttons: Hit / Stand for each player
        // - simple text summary of results
    }
}

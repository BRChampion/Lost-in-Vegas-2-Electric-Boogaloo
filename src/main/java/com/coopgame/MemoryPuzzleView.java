package com.coopgame;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MemoryPuzzleView extends BorderPane {

    public MemoryPuzzleView() {
        Label header = new Label("Co-op Memory Puzzle (placeholder)");
        Button backButton = new Button("Back to Menu");

        backButton.setOnAction(e -> Main.showMainMenu());

        VBox topBox = new VBox(header, backButton);
        topBox.setSpacing(10);
        topBox.setAlignment(Pos.CENTER);

        setTop(topBox);

        // TODO: add actual memory puzzle grid + co-op logic here
    }
}

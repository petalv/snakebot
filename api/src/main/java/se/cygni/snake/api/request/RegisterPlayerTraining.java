package se.cygni.snake.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import se.cygni.snake.api.GameMessage;
import se.cygni.snake.api.model.GameSettings;
import se.cygni.snake.api.type.GameMessageType;

@GameMessageType
public class RegisterPlayerTraining extends GameMessage {

    private final String playerName;
    private final String color;
    private final GameSettings gameSettings;

    @JsonCreator
    public RegisterPlayerTraining(
            @JsonProperty("playerName") String playerName,
            @JsonProperty("color") String color,
            @JsonProperty("gameSettings") GameSettings gameSettings) {

        this.playerName = playerName;
        this.color = color;
        this.gameSettings = gameSettings;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getColor() {
        return color;
    }

    public GameSettings getGameSettings() {
        return gameSettings;
    }
}
package com.contestantbots.util;
import com.scottlogic.hackathon.game.Direction;
import com.scottlogic.hackathon.game.Move;

import java.util.UUID;

public class MoveImpl implements Move {
    private UUID playerId;
    private Direction direction;
    public MoveImpl(UUID playerId, Direction direction) {
        this.playerId = playerId;
        this.direction = direction;
    }
    @Override
    public UUID getPlayer() {
        return playerId;
    }
    @Override
    public Direction getDirection() {
        return direction;
    }
}

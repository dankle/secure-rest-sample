package com.jayway.template.sample;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: magnuskivi
 * Date: 2013-02-08
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
@Repository("games")
public class GameRepository {

    Map<String, GameDTO> games = new HashMap<String, GameDTO>();

    public void addGame(GameDTO game) {
        games.put(game.gameID, game);
    }

    public GameDTO getGame(String id) {
        return games.get(id);
    }

    public Collection<GameDTO> getJoinableGames() {
        return games.values();
    }
}

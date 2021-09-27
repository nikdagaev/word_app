package app.word.word_app.service;

import app.word.word_app.model.Request;
import app.word.word_app.model.Stats;
import java.util.List;

public interface StatsService {
    void saveStats(Stats stats);

    void saveAllStats(List<Stats> statsList);

    List<Stats> parseRequest(Request request);
}

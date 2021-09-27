package app.word.word_app.service.impl;

import app.word.word_app.model.Request;
import app.word.word_app.model.Stats;
import app.word.word_app.service.StatsService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StatsServiceImpl implements StatsService {
    @Override
    public void saveStats(Stats stats) {

    }

    @Override
    public void saveAllStats(List<Stats> statsList) {

    }

    @Override
    public List<Stats> parseRequest(Request request) {
        return null;
    }
}

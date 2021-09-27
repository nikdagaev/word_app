package app.word.word_app.dao;

import app.word.word_app.model.Request;
import app.word.word_app.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends JpaRepository<Stats, Long> {
}

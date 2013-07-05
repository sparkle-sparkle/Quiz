package nl.sparkle.scjpquiz.logic;

import nl.sparkle.scjpquiz.logic.nl.sparkle.scjpquiz.logic.model.Question;

import java.util.Collection;

public interface IScjpQuizLogic {

    Collection<Question> retrieveQuestions();

    void saveChangedQuestions(Collection<Question> questions);
}

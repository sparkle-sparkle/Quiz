package nl.sparkle.scjpquiz.logic;

import nl.sparkle.scjpquiz.logic.nl.sparkle.scjpquiz.logic.model.Question;

import java.io.File;
import java.util.Collection;

public class ScjpQuizLogic implements IScjpQuizLogic {
    QuestionConverter converter;

    public ScjpQuizLogic(){
        converter = new QuestionConverter();
    }

    @Override
    public Collection<Question> retrieveQuestions() {
        File file;
        StringBuilder json = new StringBuilder();
        return converter.convertJsonToQuestions(json.toString());
    }

    @Override
    public void saveChangedQuestions(Collection<Question> questions) {
        String json = converter.convertQuestionsToJson(questions);
    }

}

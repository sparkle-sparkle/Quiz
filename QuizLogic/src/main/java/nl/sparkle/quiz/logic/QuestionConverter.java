package nl.sparkle.scjpquiz.logic;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import nl.sparkle.scjpquiz.logic.nl.sparkle.scjpquiz.logic.model.Question;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public class QuestionConverter {
    private static final String PATH_TO_FILE = "resources/questions.json";

    private Gson gson = new Gson();

    public Collection<Question> convertJsonToQuestions(String json) {
        Collection<Question> questions = null;
        try {
            JsonReader reader = new JsonReader(new FileReader(PATH_TO_FILE));
            Type collectionType = new TypeToken<Collection<Question>>(){}.getType();
            questions = gson.fromJson(reader, collectionType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return questions;
    }

    public String convertQuestionsToJson(Collection<Question> questions) {
        JsonWriter writer = null;
        String json = null;

        try {
            writer = new JsonWriter(new FileWriter(PATH_TO_FILE));
            json = gson.toJson(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        gson.toJson(questions);

        return json;
    }
}

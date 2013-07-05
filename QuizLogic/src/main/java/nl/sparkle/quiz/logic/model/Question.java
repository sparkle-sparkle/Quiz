package nl.sparkle.scjpquiz.logic.nl.sparkle.scjpquiz.logic.model;

import java.io.Serializable;

public class Question implements Serializable {
    public String category;
    public String question;
    public String answer;
    public boolean hide;
}

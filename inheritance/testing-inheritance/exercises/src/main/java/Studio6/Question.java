package Studio6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Question {
    private int index;
    private String query;
    private ArrayList<String> choices;

    public Question(int index, String query, ArrayList<String> choices) {
        this.index = index;
        this.query = query;
        this.choices = choices;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public abstract boolean isCorrect(String answer);

    public abstract void askQuestion();

}

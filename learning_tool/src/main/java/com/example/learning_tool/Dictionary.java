package com.example.learning_tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dictionary {

    private ArrayList<Translation> translations;
    private int random;

    public Dictionary() {
        translations = new ArrayList<>();
        Translation d1 = new Translation("Playing football is awesome", "Fussball zu spielen ist _____.", "fantastisch");
        Translation d2 = new Translation("He was talking about his school", "Er sprach von seiner _____.", "Schule");
        Translation d3 = new Translation("Working at Andeo is a great experience", "Bei Andeo zu arbeiten ist eine grossartige _____.", "Erfahrung");
        Translation d4 = new Translation("Can you translate this for me?","Kannst du das für mich _____?", "übersetzen");
        Translation d5 = new Translation("I'll call you when I leave.","Ich ruf dich an, wenn ich ____.", "gehe");
        Translation d6 = new Translation("The book is under the table.","Das Buch ist unter dem _____.", "Tisch");
        translations.add(d1);
       translations.add(d2);
        translations.add(d3);
        translations.add(d4);
        translations.add(d5);
        translations.add(d6);
    }

    public Translation selectRandomTranslation() {
        Random randomizer = new Random();
        this.random = randomizer.nextInt(translations.size());
        return translations.get(random);
    }

    public void addTranslation(String eng, String ger, String sol) {
        translations.add(new Translation(eng, ger, sol));
    }
}

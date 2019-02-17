package com.example.lenovo.divingintoenglish.model;

public class Alphabet {

    private int letterPhoto;
    private String letterName;
    private String letterTranscription;
    private int letterSound;
    private int wordPhoto;
    private String wordName;
    private String wordTranscription;
    private String wordTranslation;
    private int wordSound;

    public Alphabet(int letterPhoto, String letterName, String letterTranscription, int letterSound, int wordPhoto, String wordName, String wordTranscription, String wordTranslation, int wordSound) {
        this.letterPhoto=letterPhoto;
        this.letterName=letterName;
        this.letterTranscription=letterTranscription;
        this.letterSound=letterSound;
        this.wordPhoto=wordPhoto;
        this.wordName=wordName;
        this.wordTranscription=wordTranscription;
        this.wordTranslation=wordTranslation;
        this.wordSound=wordSound;
    }

    public int getLetterSound() { return letterSound; }

    public int getWordSound() { return wordSound; }

    public int getLetterPhoto() {
        return letterPhoto;
    }

    public String getLetterName() {
        return letterName;
    }

    public String getLetterTranscription() {
        return letterTranscription;
    }

    public int getWordPhoto() {
        return wordPhoto;
    }

    public String getWordName() {
        return wordName;
    }

    public String getWordTranscription() {
        return wordTranscription;
    }

    public String getWordTranslation() {
        return wordTranslation;
    }

}

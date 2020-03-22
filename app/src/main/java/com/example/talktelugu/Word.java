package com.example.talktelugu;

public class Word {

    private String mdefaultTranslation;
    private String mlearnTranslation;

    public Word(String defaultTranslation, String learnTranslation) {
        mdefaultTranslation = defaultTranslation;
        mlearnTranslation = learnTranslation;
    }

    public String getDefualtTranslation() {
        return mdefaultTranslation;
    }
    public String getLearnTranslation(){
        return mlearnTranslation;
    }
}

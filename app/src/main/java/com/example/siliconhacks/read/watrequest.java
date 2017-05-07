package com.example.siliconhacks.read;

/**
 * Created by SiliconHacks on 5/6/17.
 */

public class WatRequest {

    ToneAnalyzer service;

    Static void WatRequest(String user, String pass){

        service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_05_19);
        service.setUsernameAndPassword(user, pass);

    }

    public ToneAnalysis getToneOfMessage(String message) {
        ToneAnalysis tone;

        tone = service.getTone(message, null).execute();
        return (tone);
    }
}
/*


watrequest wat = new watrequest("isaac", "badpassword");

someTone = wat.getToneOfMessage("blah blah blah");
*/
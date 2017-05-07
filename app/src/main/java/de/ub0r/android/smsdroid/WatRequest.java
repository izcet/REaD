package de.ub0r.android.smsdroid;

import java.util.ArrayList;
import java.util.List;

import de.ub0r.android.smsdroid.ToneChatRequest;
import de.ub0r.android.smsdroid.Utterance;
import de.ub0r.android.smsdroid.UtterancesTone;
import de.ub0r.android.smsdroid.ToneAnalysis;


import android.os.AsyncTask;
import android.util.Log;

//import de.ub0r.android.smsdroid.ToneAnalyzer;

/**
 * Created by SiliconHacks on 5/6/17.
 */

public class WatRequest {

    //ToneAnalyzer service;

    public WatRequest(/*String user, String pass*/){

        /*service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_05_19);
        service.setUsernameAndPassword(user, pass);*/

    }

    public static ToneAnalysis getToneOfMessage(String message, String user, String pass) {
        ToneAnalysis tone;
        ToneAnalyzer service;

        service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_05_19);
        service.setUsernameAndPassword(user, pass);

        tone = null;
        try {
            service.getTone(message, null).execute();
        } catch (Exception e) {
            System.out.println(e);
            Log.e("MYAPP", "exception", e);
        }
        return (tone);
    }
}
/*


watrequest wat = new watrequest("isaac", "badpassword");

someTone = wat.getToneOfMessage("blah blah blah");
*/
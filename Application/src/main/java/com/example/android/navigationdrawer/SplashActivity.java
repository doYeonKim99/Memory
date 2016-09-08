package com.example.android.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by appcreator36 on 2016. 9. 6..
 */
public class SplashActivity extends Activity{

    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();;
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}

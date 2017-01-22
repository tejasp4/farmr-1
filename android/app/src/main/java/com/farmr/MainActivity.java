package com.farmr;

import com.facebook.react.ReactActivity;
import android.os.Bundle;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "farmr";
    }
    
    @Override
    public void onCreate (Bundle savedInstanceState){
        Guesser.init(getAssets());
    }
}

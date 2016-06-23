package in.wavelabs.cafeteria;

import android.app.Application;

import com.facebook.accountkit.AccountKit;


/**
 * Created by vivekkiran on 6/23/16.
 */

public class CafeteriaApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        AccountKit.initialize(this);
    }
}

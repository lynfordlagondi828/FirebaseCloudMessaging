package com.example.lynford.firebasecloudmessaging;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class GettingDeviceTokenService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("", "Refreshed token: " + refreshedToken);


    }

}

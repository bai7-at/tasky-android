package com.nytimes.android.push;

import android.content.Intent;
import android.os.Bundle;
import com.nytimes.android.logging.NYTLogger;
import defpackage.tc9;

/* loaded from: classes4.dex */
public class FcmIntentService extends b {
    MessagingHelper messagingHelper;

    public FcmIntentService() {
        super(FcmIntentService.class.getSimpleName());
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (!extras.isEmpty()) {
            this.messagingHelper.onMessage(getApplicationContext(), intent);
            NYTLogger.d("Received: " + extras.toString(), new Object[0]);
        }
        tc9.b(intent);
    }
}

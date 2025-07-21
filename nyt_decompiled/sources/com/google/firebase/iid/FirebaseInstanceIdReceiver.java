package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.e;
import com.google.firebase.messaging.n;
import defpackage.lm0;
import defpackage.vg8;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends lm0 {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // defpackage.lm0
    protected int b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) vg8.a(new e(context).k(cloudMessage.t0()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.lm0
    protected void c(Context context, Bundle bundle) {
        Intent g = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (n.A(g)) {
            n.s(g);
        }
    }
}

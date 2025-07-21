package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import defpackage.gp9;

/* loaded from: classes2.dex */
final class b extends gp9 {
    private final Context a;
    final /* synthetic */ GoogleApiAvailability b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = googleApiAvailability;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int isGooglePlayServicesAvailable = this.b.isGooglePlayServicesAvailable(this.a);
        if (this.b.isUserResolvableError(isGooglePlayServicesAvailable)) {
            this.b.showErrorNotification(this.a, isGooglePlayServicesAvailable);
        }
    }
}

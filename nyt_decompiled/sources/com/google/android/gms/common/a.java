package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import defpackage.j5;

/* loaded from: classes2.dex */
final class a implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity a;
    final /* synthetic */ int b;
    final /* synthetic */ j5 c;
    final /* synthetic */ GoogleApiAvailability d;

    a(GoogleApiAvailability googleApiAvailability, Activity activity, int i, j5 j5Var) {
        this.d = googleApiAvailability;
        this.a = activity;
        this.b = i;
        this.c = j5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.d.getErrorResolutionPendingIntent(this.a, this.b, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.c.a(new IntentSenderRequest.a(errorResolutionPendingIntent.getIntentSender()).a());
    }
}

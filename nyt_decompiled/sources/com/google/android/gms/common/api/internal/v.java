package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import defpackage.gp9;

/* loaded from: classes2.dex */
final class v extends gp9 {
    final /* synthetic */ zabe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(zabe zabeVar, Looper looper) {
        super(looper);
        this.a = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            zabe.zaj(this.a);
            return;
        }
        if (i == 2) {
            zabe.zai(this.a);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
    }
}

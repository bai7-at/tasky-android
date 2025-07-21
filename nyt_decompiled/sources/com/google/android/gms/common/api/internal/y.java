package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import defpackage.gp9;

/* loaded from: classes2.dex */
final class y extends gp9 {
    final /* synthetic */ zabi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(zabi zabiVar, Looper looper) {
        super(looper);
        this.a = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((x) message.obj).b(this.a);
        } else {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i);
        }
    }
}

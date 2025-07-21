package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.gp9;

/* loaded from: classes2.dex */
final class q0 extends gp9 {
    final /* synthetic */ zada a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(zada zadaVar, Looper looper) {
        super(looper);
        this.a = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zada zadaVar;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
            return;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        obj = this.a.zae;
        synchronized (obj) {
            try {
                zadaVar = this.a.zab;
                zada zadaVar2 = (zada) Preconditions.checkNotNull(zadaVar);
                if (pendingResult == null) {
                    zadaVar2.zaj(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacp) {
                    zadaVar2.zaj(((zacp) pendingResult).zaa());
                } else {
                    zadaVar2.zai(pendingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

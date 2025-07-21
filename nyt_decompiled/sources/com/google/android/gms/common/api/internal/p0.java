package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class p0 implements Runnable {
    final /* synthetic */ Result a;
    final /* synthetic */ zada b;

    p0(zada zadaVar, Result result) {
        this.b = zadaVar;
        this.a = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        q0 q0Var;
        q0 q0Var2;
        WeakReference weakReference2;
        GoogleApiClient googleApiClient;
        ResultTransform resultTransform;
        q0 q0Var3;
        q0 q0Var4;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                resultTransform = this.b.zaa;
                PendingResult onSuccess = ((ResultTransform) Preconditions.checkNotNull(resultTransform)).onSuccess(this.a);
                zada zadaVar = this.b;
                q0Var3 = zadaVar.zah;
                q0Var4 = zadaVar.zah;
                q0Var3.sendMessage(q0Var4.obtainMessage(0, onSuccess));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.b;
                zada.zan(this.a);
                weakReference3 = this.b.zag;
                googleApiClient = (GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.b;
                q0Var = zadaVar3.zah;
                q0Var2 = zadaVar3.zah;
                q0Var.sendMessage(q0Var2.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada zadaVar4 = this.b;
                zada.zan(this.a);
                weakReference2 = this.b.zag;
                googleApiClient = (GoogleApiClient) weakReference2.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.b);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada zadaVar5 = this.b;
            zada.zan(this.a);
            weakReference = this.b.zag;
            GoogleApiClient googleApiClient2 = (GoogleApiClient) weakReference.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.b);
            }
            throw th;
        }
    }
}

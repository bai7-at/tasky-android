package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.qg8;

/* loaded from: classes3.dex */
final class zzc extends ResultReceiver {
    final /* synthetic */ qg8 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(c cVar, Handler handler, qg8 qg8Var) {
        super(handler);
        this.zza = qg8Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.zza.e(null);
    }
}

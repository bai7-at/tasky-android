package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import defpackage.t7f;

/* loaded from: classes3.dex */
final class pm extends BroadcastReceiver implements Runnable {
    private final t7f a;
    private final Handler b;
    final /* synthetic */ qm c;

    public pm(qm qmVar, Handler handler, t7f t7fVar) {
        this.c = qmVar;
        this.b = handler;
        this.a = t7fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}

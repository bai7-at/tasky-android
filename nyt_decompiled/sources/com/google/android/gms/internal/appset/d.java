package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.util.DefaultClock;
import defpackage.v6f;

/* loaded from: classes3.dex */
final class d implements Runnable {
    final /* synthetic */ e a;

    /* synthetic */ d(e eVar, v6f v6fVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long a = this.a.a();
        if (a == -1 || DefaultClock.getInstance().currentTimeMillis() <= a) {
            return;
        }
        context = this.a.a;
        e.f(context);
    }
}

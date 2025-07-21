package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import defpackage.t7f;

/* loaded from: classes3.dex */
final class qm {
    private final Context a;
    private final pm b;

    public qm(Context context, Handler handler, t7f t7fVar) {
        this.a = context.getApplicationContext();
        this.b = new pm(this, handler, t7fVar);
    }
}

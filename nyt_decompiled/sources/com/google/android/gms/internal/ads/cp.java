package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes3.dex */
final class cp {
    private final PowerManager a;

    public cp(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}

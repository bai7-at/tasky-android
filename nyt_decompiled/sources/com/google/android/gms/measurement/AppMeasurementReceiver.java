package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import defpackage.mce;
import defpackage.oce;
import defpackage.tc9;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends tc9 implements mce {
    private oce c;

    @Override // defpackage.mce
    public void a(Context context, Intent intent) {
        tc9.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new oce(this);
        }
        this.c.a(context, intent);
    }
}

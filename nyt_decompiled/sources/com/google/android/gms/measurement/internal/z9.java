package com.google.android.gms.measurement.internal;

import defpackage.chb;

/* loaded from: classes3.dex */
final class z9 implements Runnable {
    final /* synthetic */ chb a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    z9(AppMeasurementDynamiteService appMeasurementDynamiteService, chb chbVar) {
        this.b = appMeasurementDynamiteService;
        this.a = chbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.M().C(this.a, this.b.a.j());
    }
}

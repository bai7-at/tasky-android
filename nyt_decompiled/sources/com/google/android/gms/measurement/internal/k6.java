package com.google.android.gms.measurement.internal;

import defpackage.chb;

/* loaded from: classes3.dex */
final class k6 implements Runnable {
    final /* synthetic */ chb a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    k6(AppMeasurementDynamiteService appMeasurementDynamiteService, chb chbVar) {
        this.b = appMeasurementDynamiteService;
        this.a = chbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.K().Q(this.a);
    }
}

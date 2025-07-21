package com.google.android.gms.measurement.internal;

import defpackage.chb;

/* loaded from: classes3.dex */
final class y9 implements Runnable {
    final /* synthetic */ chb a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    y9(AppMeasurementDynamiteService appMeasurementDynamiteService, chb chbVar, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = chbVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.K().S(this.a, this.b, this.c);
    }
}

package com.google.android.gms.measurement.internal;

import defpackage.chb;

/* loaded from: classes3.dex */
final class h7 implements Runnable {
    final /* synthetic */ chb a;
    final /* synthetic */ zzaw b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMeasurementDynamiteService d;

    h7(AppMeasurementDynamiteService appMeasurementDynamiteService, chb chbVar, zzaw zzawVar, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = chbVar;
        this.b = zzawVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.K().l(this.a, this.b, this.c);
    }
}

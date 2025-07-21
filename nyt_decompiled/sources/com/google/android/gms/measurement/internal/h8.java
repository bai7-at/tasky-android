package com.google.android.gms.measurement.internal;

import defpackage.chb;

/* loaded from: classes3.dex */
final class h8 implements Runnable {
    final /* synthetic */ chb a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ AppMeasurementDynamiteService e;

    h8(AppMeasurementDynamiteService appMeasurementDynamiteService, chb chbVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = chbVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.K().U(this.a, this.b, this.c, this.d);
    }
}

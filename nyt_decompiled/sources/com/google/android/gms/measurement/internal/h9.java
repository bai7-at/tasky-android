package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class h9 implements Runnable {
    final /* synthetic */ aa a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    h9(AppMeasurementDynamiteService appMeasurementDynamiteService, aa aaVar) {
        this.b = appMeasurementDynamiteService;
        this.a = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.H().I(this.a);
    }
}

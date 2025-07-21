package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import defpackage.dyf;
import defpackage.thf;

/* loaded from: classes3.dex */
final class a6 implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel a;
    final /* synthetic */ zzbvk b;

    a6(zzbvk zzbvkVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.a = adOverlayInfoParcel;
        this.b = zzbvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        dyf.k();
        activity = this.b.a;
        thf.a(activity, this.a, true);
    }
}

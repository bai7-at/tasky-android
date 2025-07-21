package com.google.android.gms.internal.ads;

import defpackage.fgb;
import defpackage.kp4;
import defpackage.tof;

/* loaded from: classes3.dex */
final class z5 implements tof {
    final /* synthetic */ zzbvk a;

    z5(zzbvk zzbvkVar) {
        this.a = zzbvkVar;
    }

    @Override // defpackage.tof
    public final void O() {
        fgb.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // defpackage.tof
    public final void Q1(int i) {
        kp4 kp4Var;
        fgb.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbvk zzbvkVar = this.a;
        kp4Var = zzbvkVar.b;
        kp4Var.p(zzbvkVar);
    }

    @Override // defpackage.tof
    public final void Y4() {
        fgb.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // defpackage.tof
    public final void h6() {
    }

    @Override // defpackage.tof
    public final void n4() {
        kp4 kp4Var;
        fgb.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbvk zzbvkVar = this.a;
        kp4Var = zzbvkVar.b;
        kp4Var.s(zzbvkVar);
    }

    @Override // defpackage.tof
    public final void s4() {
        fgb.b("AdMobCustomTabsAdapter overlay is paused.");
    }
}

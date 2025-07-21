package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.wlb;

/* loaded from: classes2.dex */
public final class e {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public e(wlb wlbVar) {
        this.b = wlbVar.getLayoutParams();
        ViewParent parent = wlbVar.getParent();
        this.d = wlbVar.D();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.c = viewGroup;
        this.a = viewGroup.indexOfChild(wlbVar.h());
        viewGroup.removeView(wlbVar.h());
        wlbVar.L0(true);
    }
}

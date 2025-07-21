package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import defpackage.c0b;
import defpackage.ccb;
import defpackage.d7b;
import defpackage.fgb;
import defpackage.h3b;
import defpackage.h7b;
import defpackage.k7b;
import defpackage.kgc;
import defpackage.kia;
import defpackage.m8b;
import defpackage.ocb;
import defpackage.oeb;
import defpackage.q4b;
import defpackage.qta;
import defpackage.rva;
import defpackage.sva;
import defpackage.thd;

/* loaded from: classes2.dex */
public final class n {
    private final i0 a;
    private final g0 b;
    private final thd c;
    private final rva d;
    private final ocb e;
    private final h7b f;
    private final sva g;
    private m8b h;

    public n(i0 i0Var, g0 g0Var, thd thdVar, rva rvaVar, ocb ocbVar, h7b h7bVar, sva svaVar) {
        this.a = i0Var;
        this.b = g0Var;
        this.c = thdVar;
        this.d = rvaVar;
        this.e = ocbVar;
        this.f = h7bVar;
        this.g = svaVar;
    }

    static /* bridge */ /* synthetic */ void p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        kia.b().p(context, kia.c().zza, "gmob-apps", bundle, true);
    }

    public final c0b c(Context context, String str, h3b h3bVar) {
        return (c0b) new k(this, context, str, h3bVar).d(context, false);
    }

    public final q4b d(Context context, zzq zzqVar, String str, h3b h3bVar) {
        return (q4b) new g(this, context, zzqVar, str, h3bVar).d(context, false);
    }

    public final q4b e(Context context, zzq zzqVar, String str, h3b h3bVar) {
        return (q4b) new i(this, context, zzqVar, str, h3bVar).d(context, false);
    }

    public final kgc f(Context context, h3b h3bVar) {
        return (kgc) new c(this, context, h3bVar).d(context, false);
    }

    public final qta g(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (qta) new l(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final d7b i(Context context, h3b h3bVar) {
        return (d7b) new e(this, context, h3bVar).d(context, false);
    }

    public final k7b k(Activity activity) {
        a aVar = new a(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            fgb.d("useClientJar flag not found in activity intent extras.");
        }
        return (k7b) aVar.d(activity, z);
    }

    public final ccb m(Context context, String str, h3b h3bVar) {
        return (ccb) new m(this, context, str, h3bVar).d(context, false);
    }

    public final oeb n(Context context, h3b h3bVar) {
        return (oeb) new d(this, context, h3bVar).d(context, false);
    }
}

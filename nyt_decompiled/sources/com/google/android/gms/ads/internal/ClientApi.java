package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcei;
import defpackage.aob;
import defpackage.axd;
import defpackage.c0b;
import defpackage.ccb;
import defpackage.d7b;
import defpackage.e0a;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.gvd;
import defpackage.h3b;
import defpackage.jrb;
import defpackage.k7b;
import defpackage.kgc;
import defpackage.lab;
import defpackage.llc;
import defpackage.mpa;
import defpackage.mwc;
import defpackage.nlc;
import defpackage.nod;
import defpackage.o0e;
import defpackage.oeb;
import defpackage.pla;
import defpackage.q4b;
import defpackage.qta;
import defpackage.uyd;
import defpackage.vta;
import defpackage.vv9;
import defpackage.vxf;
import defpackage.vya;
import defpackage.w7g;
import defpackage.wwf;
import defpackage.wy9;
import defpackage.xgd;
import defpackage.xya;
import defpackage.yeb;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ClientApi extends yeb {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // defpackage.cgb
    public final q4b A0(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i) {
        Context context = (Context) fc5.Q1(ee3Var);
        axd x = aob.g(context, h3bVar, i).x();
        x.b(context);
        x.a(zzqVar);
        x.f(str);
        return x.zzd().zza();
    }

    @Override // defpackage.cgb
    public final oeb B2(ee3 ee3Var, h3b h3bVar, int i) {
        return aob.g((Context) fc5.Q1(ee3Var), h3bVar, i).u();
    }

    @Override // defpackage.cgb
    public final c0b H3(ee3 ee3Var, String str, h3b h3bVar, int i) {
        Context context = (Context) fc5.Q1(ee3Var);
        return new xgd(aob.g(context, h3bVar, i), context, str);
    }

    @Override // defpackage.cgb
    public final q4b N0(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i) {
        Context context = (Context) fc5.Q1(ee3Var);
        uyd y = aob.g(context, h3bVar, i).y();
        y.b(context);
        y.a(zzqVar);
        y.f(str);
        return y.zzd().zza();
    }

    @Override // defpackage.cgb
    public final q4b P1(ee3 ee3Var, zzq zzqVar, String str, h3b h3bVar, int i) {
        Context context = (Context) fc5.Q1(ee3Var);
        gvd w = aob.g(context, h3bVar, i).w();
        w.a(str);
        w.b(context);
        return i >= ((Integer) pla.c().a(mpa.h5)).intValue() ? w.zzc().zza() : new nod();
    }

    @Override // defpackage.cgb
    public final d7b X0(ee3 ee3Var, h3b h3bVar, int i) {
        return aob.g((Context) fc5.Q1(ee3Var), h3bVar, i).r();
    }

    @Override // defpackage.cgb
    public final vta X2(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        return new llc((View) fc5.Q1(ee3Var), (HashMap) fc5.Q1(ee3Var2), (HashMap) fc5.Q1(ee3Var3));
    }

    @Override // defpackage.cgb
    public final q4b c4(ee3 ee3Var, zzq zzqVar, String str, int i) {
        return new wwf((Context) fc5.Q1(ee3Var), zzqVar, str, new zzcei(240304000, i, true, false));
    }

    @Override // defpackage.cgb
    public final ccb h2(ee3 ee3Var, String str, h3b h3bVar, int i) {
        Context context = (Context) fc5.Q1(ee3Var);
        o0e z = aob.g(context, h3bVar, i).z();
        z.b(context);
        z.a(str);
        return z.zzc().zza();
    }

    @Override // defpackage.cgb
    public final jrb l0(ee3 ee3Var, int i) {
        return aob.g((Context) fc5.Q1(ee3Var), null, i).h();
    }

    @Override // defpackage.cgb
    public final lab m3(ee3 ee3Var, h3b h3bVar, int i) {
        Context context = (Context) fc5.Q1(ee3Var);
        o0e z = aob.g(context, h3bVar, i).z();
        z.b(context);
        return z.zzc().zzb();
    }

    @Override // defpackage.cgb
    public final xya n1(ee3 ee3Var, h3b h3bVar, int i, vya vyaVar) {
        Context context = (Context) fc5.Q1(ee3Var);
        mwc o = aob.g(context, h3bVar, i).o();
        o.b(context);
        o.a(vyaVar);
        return o.zzc().zzd();
    }

    @Override // defpackage.cgb
    public final qta w2(ee3 ee3Var, ee3 ee3Var2) {
        return new nlc((FrameLayout) fc5.Q1(ee3Var), (FrameLayout) fc5.Q1(ee3Var2), 240304000);
    }

    @Override // defpackage.cgb
    public final kgc z5(ee3 ee3Var, h3b h3bVar, int i) {
        return aob.g((Context) fc5.Q1(ee3Var), h3bVar, i).q();
    }

    @Override // defpackage.cgb
    public final k7b zzm(ee3 ee3Var) {
        Activity activity = (Activity) fc5.Q1(ee3Var);
        AdOverlayInfoParcel t0 = AdOverlayInfoParcel.t0(activity.getIntent());
        if (t0 == null) {
            return new j(activity);
        }
        int i = t0.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new j(activity) : new vv9(activity) : new w7g(activity, t0) : new e0a(activity) : new wy9(activity) : new vxf(activity);
    }
}

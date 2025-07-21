package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.zzj;
import defpackage.cde;
import defpackage.d7b;
import defpackage.dyf;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.j7b;
import defpackage.k8e;
import defpackage.m8d;
import defpackage.mpa;
import defpackage.mx9;
import defpackage.n8d;
import defpackage.nwf;
import defpackage.pla;
import defpackage.q6b;
import defpackage.tof;
import defpackage.uuf;
import defpackage.wlb;
import defpackage.wxf;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class h extends j7b implements mx9 {
    static final int H = Color.argb(0, 0, 0, 0);
    protected final Activity a;
    AdOverlayInfoParcel b;
    wlb c;
    e d;
    nwf e;
    FrameLayout g;
    WebChromeClient.CustomViewCallback h;
    d k;
    private Runnable r;
    private boolean s;
    private boolean t;
    private Toolbar y;
    boolean f = false;
    boolean i = false;
    boolean j = false;
    boolean l = false;
    int B = 1;
    private final Object m = new Object();
    private final View.OnClickListener n = new c(this);
    private boolean u = false;
    private boolean w = false;
    private boolean x = true;

    public h(Activity activity) {
        this.a = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.F0)).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.E0)).booleanValue() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C6(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.a
            ss9 r4 = defpackage.dyf.s()
            boolean r6 = r4.d(r3, r6)
            boolean r3 = r5.j
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            zoa r0 = defpackage.mpa.F0
            kpa r3 = defpackage.pla.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            zoa r6 = defpackage.mpa.E0
            kpa r0 = defpackage.pla.c()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.b
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzj r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r5 = r5.a
            android.view.Window r5 = r5.getWindow()
            zoa r6 = defpackage.mpa.e1
            kpa r0 = defpackage.pla.c()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L83
            android.view.View r5 = r5.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r6 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r6 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r6 = 256(0x100, float:3.59E-43)
        L7f:
            r5.setSystemUiVisibility(r6)
            return
        L83:
            r6 = 2048(0x800, float:2.87E-42)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9b
            r5.addFlags(r0)
            r5.clearFlags(r6)
            if (r2 == 0) goto L9a
            android.view.View r5 = r5.getDecorView()
            r6 = 4098(0x1002, float:5.743E-42)
            r5.setSystemUiVisibility(r6)
        L9a:
            return
        L9b:
            r5.addFlags(r6)
            r5.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.h.C6(android.content.res.Configuration):void");
    }

    private static final void D6(k8e k8eVar, View view) {
        if (k8eVar == null || view == null) {
            return;
        }
        dyf.a().c(k8eVar, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void A6(boolean r27) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.h.A6(boolean):void");
    }

    @Override // defpackage.k7b
    public final void B(ee3 ee3Var) {
        C6((Configuration) fc5.Q1(ee3Var));
    }

    public final void B6(String str) {
        Toolbar toolbar = this.y;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void D() {
        synchronized (this.m) {
            try {
                this.s = true;
                Runnable runnable = this.r;
                if (runnable != null) {
                    cde cdeVar = wxf.l;
                    cdeVar.removeCallbacks(runnable);
                    cdeVar.post(this.r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k7b
    public final void E4(int i, int i2, Intent intent) {
    }

    public final void E6(n8d n8dVar) {
        d7b d7bVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (d7bVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        d7bVar.s0(fc5.l3(n8dVar));
    }

    public final void F6(boolean z) {
        if (this.b.zzw) {
            return;
        }
        int intValue = ((Integer) pla.c().a(mpa.N4)).intValue();
        boolean z2 = ((Boolean) pla.c().a(mpa.a1)).booleanValue() || z;
        uuf uufVar = new uuf();
        uufVar.d = 50;
        uufVar.a = true != z2 ? 0 : intValue;
        uufVar.b = true != z2 ? intValue : 0;
        uufVar.c = intValue;
        this.e = new nwf(this.a, uufVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        G6(z, this.b.zzg);
        this.k.addView(this.e, layoutParams);
    }

    public final void G6(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) pla.c().a(mpa.Y0)).booleanValue() && (adOverlayInfoParcel2 = this.b) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) pla.c().a(mpa.Z0)).booleanValue() && (adOverlayInfoParcel = this.b) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new q6b(this.c, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        nwf nwfVar = this.e;
        if (nwfVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            nwfVar.b(z3);
        }
    }

    @Override // defpackage.k7b
    public final void H1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.a;
            m8d e = n8d.e();
            e.a(activity);
            e.b(this.b.zzk == 5 ? this : null);
            try {
                this.b.zzv.w0(strArr, iArr, fc5.l3(e.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.k7b
    public final void a() {
        tof tofVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (tofVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        tofVar.h6();
    }

    @Override // defpackage.k7b
    public final void c() {
        if (((Boolean) pla.c().a(mpa.K4)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.d == null)) {
            this.c.onPause();
        }
        h();
    }

    @Override // defpackage.k7b
    public final void e() {
        this.t = true;
    }

    @Override // defpackage.k7b
    public final void g() {
        if (((Boolean) pla.c().a(mpa.K4)).booleanValue()) {
            wlb wlbVar = this.c;
            if (wlbVar == null || wlbVar.y()) {
                fgb.g("The webview does not exist. Ignoring action.");
            } else {
                this.c.onResume();
            }
        }
    }

    protected final void h() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        tof tofVar;
        if (!this.a.isFinishing() || this.u) {
            return;
        }
        this.u = true;
        wlb wlbVar = this.c;
        if (wlbVar != null) {
            wlbVar.Z(this.B - 1);
            synchronized (this.m) {
                try {
                    if (!this.s && this.c.e()) {
                        if (((Boolean) pla.c().a(mpa.I4)).booleanValue() && !this.w && (adOverlayInfoParcel = this.b) != null && (tofVar = adOverlayInfoParcel.zzc) != null) {
                            tofVar.O();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                h.this.zzc();
                            }
                        };
                        this.r = runnable;
                        wxf.l.postDelayed(runnable, ((Long) pla.c().a(mpa.X0)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    @Override // defpackage.k7b
    public final void j0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    @Override // defpackage.k7b
    public final boolean m() {
        this.B = 1;
        if (this.c == null) {
            return true;
        }
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && this.c.canGoBack()) {
            this.c.goBack();
            return false;
        }
        boolean J = this.c.J();
        if (!J) {
            this.c.t("onbackblocked", Collections.emptyMap());
        }
        return J;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[Catch: zzg -> 0x0033, TryCatch #0 {zzg -> 0x0033, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:16:0x0036, B:18:0x0041, B:19:0x0043, B:21:0x004b, B:22:0x0059, B:24:0x0060, B:27:0x006d, B:29:0x0071, B:31:0x0076, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:38:0x0091, B:40:0x0097, B:41:0x009a, B:43:0x00a0, B:45:0x00a4, B:46:0x00a7, B:48:0x00ad, B:49:0x00b0, B:56:0x00df, B:59:0x00e3, B:60:0x00ea, B:61:0x00eb, B:63:0x00ef, B:65:0x00fc, B:67:0x0067, B:69:0x006b, B:70:0x0080, B:71:0x0100, B:72:0x0107), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc A[Catch: zzg -> 0x0033, TryCatch #0 {zzg -> 0x0033, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:16:0x0036, B:18:0x0041, B:19:0x0043, B:21:0x004b, B:22:0x0059, B:24:0x0060, B:27:0x006d, B:29:0x0071, B:31:0x0076, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:38:0x0091, B:40:0x0097, B:41:0x009a, B:43:0x00a0, B:45:0x00a4, B:46:0x00a7, B:48:0x00ad, B:49:0x00b0, B:56:0x00df, B:59:0x00e3, B:60:0x00ea, B:61:0x00eb, B:63:0x00ef, B:65:0x00fc, B:67:0x0067, B:69:0x006b, B:70:0x0080, B:71:0x0100, B:72:0x0107), top: B:10:0x001b }] */
    @Override // defpackage.k7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p2(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.h.p2(android.os.Bundle):void");
    }

    public final void x6(int i) {
        if (this.a.getApplicationInfo().targetSdkVersion >= ((Integer) pla.c().a(mpa.Y5)).intValue()) {
            if (this.a.getApplicationInfo().targetSdkVersion <= ((Integer) pla.c().a(mpa.Z5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) pla.c().a(mpa.a6)).intValue()) {
                    if (i2 <= ((Integer) pla.c().a(mpa.b6)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.a.setRequestedOrientation(i);
        } catch (Throwable th) {
            dyf.q().v(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void y6(boolean z) {
        d dVar = this.k;
        if (z) {
            dVar.setBackgroundColor(0);
        } else {
            dVar.setBackgroundColor(-16777216);
        }
    }

    public final void z() {
        this.k.removeView(this.e);
        F6(true);
    }

    public final void z6(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.g.addView(view, -1, -1);
        this.a.setContentView(this.g);
        this.t = true;
        this.h = customViewCallback;
        this.f = true;
    }

    public final void zzb() {
        this.B = 3;
        this.a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.a.overridePendingTransition(0, 0);
    }

    final void zzc() {
        wlb wlbVar;
        tof tofVar;
        if (this.w) {
            return;
        }
        this.w = true;
        wlb wlbVar2 = this.c;
        if (wlbVar2 != null) {
            this.k.removeView(wlbVar2.h());
            e eVar = this.d;
            if (eVar != null) {
                this.c.g0(eVar.d);
                this.c.L0(false);
                ViewGroup viewGroup = this.d.c;
                View h = this.c.h();
                e eVar2 = this.d;
                viewGroup.addView(h, eVar2.a, eVar2.b);
                this.d = null;
            } else if (this.a.getApplicationContext() != null) {
                this.c.g0(this.a.getApplicationContext());
            }
            this.c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (tofVar = adOverlayInfoParcel.zzc) != null) {
            tofVar.Q1(this.B);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
        if (adOverlayInfoParcel2 == null || (wlbVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        D6(wlbVar.B(), this.b.zzd.h());
    }

    public final void zzd() {
        this.k.b = true;
    }

    protected final void zze() {
        this.c.T();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && this.f) {
            x6(adOverlayInfoParcel.zzj);
        }
        if (this.g != null) {
            this.a.setContentView(this.k);
            this.t = true;
            this.g.removeAllViews();
            this.g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.h = null;
        }
        this.f = false;
    }

    @Override // defpackage.k7b
    public final void zzi() {
        this.B = 1;
    }

    @Override // defpackage.mx9
    public final void zzj() {
        this.B = 2;
        this.a.finish();
    }

    @Override // defpackage.k7b
    public final void zzm() {
        wlb wlbVar = this.c;
        if (wlbVar != null) {
            try {
                this.k.removeView(wlbVar.h());
            } catch (NullPointerException unused) {
            }
        }
        h();
    }

    public final void zzn() {
        if (this.l) {
            this.l = false;
            zze();
        }
    }

    @Override // defpackage.k7b
    public final void zzo() {
        tof tofVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (tofVar = adOverlayInfoParcel.zzc) != null) {
            tofVar.s4();
        }
        if (!((Boolean) pla.c().a(mpa.K4)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.d == null)) {
            this.c.onPause();
        }
        h();
    }

    @Override // defpackage.k7b
    public final void zzq() {
    }

    @Override // defpackage.k7b
    public final void zzr() {
        tof tofVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (tofVar = adOverlayInfoParcel.zzc) != null) {
            tofVar.Y4();
        }
        C6(this.a.getResources().getConfiguration());
        if (((Boolean) pla.c().a(mpa.K4)).booleanValue()) {
            return;
        }
        wlb wlbVar = this.c;
        if (wlbVar == null || wlbVar.y()) {
            fgb.g("The webview does not exist. Ignoring action.");
        } else {
            this.c.onResume();
        }
    }
}

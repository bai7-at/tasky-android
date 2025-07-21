package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.n5;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class vmb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, wlb {
    public static final /* synthetic */ int z0 = 0;
    private boolean B;
    private Boolean H;
    private boolean L;
    private final String M;
    private ymb N;
    private boolean Q;
    private boolean S;
    private final pnb a;
    private final gfa b;
    private final w1e c;
    private final zqa d;
    private final zzcei e;
    private bta e0;
    private hdf f;
    private tsa f0;
    private final iq9 g;
    private tla g0;
    private final DisplayMetrics h;
    private int h0;
    private final float i;
    private int i0;
    private v0e j;
    private bqa j0;
    private y0e k;
    private final bqa k0;
    private boolean l;
    private bqa l0;
    private boolean m;
    private final cqa m0;
    private emb n;
    private int n0;
    private h o0;
    private boolean p0;
    private final erb q0;
    private h r;
    private int r0;
    private k8e s;
    private int s0;
    private unb t;
    private int t0;
    private final String u;
    private int u0;
    private Map v0;
    private boolean w;
    private final WindowManager w0;
    private boolean x;
    private final ina x0;
    private boolean y;
    private boolean y0;

    protected vmb(pnb pnbVar, unb unbVar, String str, boolean z, boolean z2, gfa gfaVar, zqa zqaVar, zzcei zzceiVar, eqa eqaVar, hdf hdfVar, iq9 iq9Var, ina inaVar, v0e v0eVar, y0e y0eVar, w1e w1eVar) {
        super(pnbVar);
        y0e y0eVar2;
        this.l = false;
        this.m = false;
        this.L = true;
        this.M = "";
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.a = pnbVar;
        this.t = unbVar;
        this.u = str;
        this.y = z;
        this.b = gfaVar;
        this.c = w1eVar;
        this.d = zqaVar;
        this.e = zzceiVar;
        this.f = hdfVar;
        this.g = iq9Var;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.w0 = windowManager;
        dyf.r();
        DisplayMetrics U = wxf.U(windowManager);
        this.h = U;
        this.i = U.density;
        this.x0 = inaVar;
        this.j = v0eVar;
        this.k = y0eVar;
        this.q0 = new erb(pnbVar.a(), this, this, null);
        this.y0 = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            fgb.e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) pla.c().a(mpa.Za)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(dyf.r().E(pnbVar, zzceiVar.zza));
        dyf.r();
        final Context context = getContext();
        ljb.a(context, new Callable() { // from class: saf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cde cdeVar = wxf.l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) pla.c().a(mpa.K0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        Y0();
        addJavascriptInterface(new cnb(this, new bnb(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        g1();
        cqa cqaVar = new cqa(new eqa(true, "make_wv", this.u));
        this.m0 = cqaVar;
        cqaVar.a().c(null);
        if (((Boolean) pla.c().a(mpa.Q1)).booleanValue() && (y0eVar2 = this.k) != null && y0eVar2.b != null) {
            cqaVar.a().d("gqi", this.k.b);
        }
        cqaVar.a();
        bqa f = eqa.f();
        this.k0 = f;
        cqaVar.b("native:view_create", f);
        this.l0 = null;
        this.j0 = null;
        lmb.a().b(pnbVar);
        dyf.q().t();
    }

    private final synchronized void Y0() {
        v0e v0eVar = this.j;
        if (v0eVar != null && v0eVar.n0) {
            fgb.b("Disabling hardware acceleration on an overlay.");
            a1();
            return;
        }
        if (!this.y && !this.t.i()) {
            fgb.b("Enabling hardware acceleration on an AdView.");
            c1();
            return;
        }
        fgb.b("Enabling hardware acceleration on an overlay.");
        c1();
    }

    private final synchronized void Z0() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        dyf.q().r();
    }

    private final synchronized void a1() {
        try {
            if (!this.B) {
                setLayerType(1, null);
            }
            this.B = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void b1(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        t("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void c1() {
        try {
            if (this.B) {
                setLayerType(0, null);
            }
            this.B = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void d1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            dyf.q().w(th, "AdWebViewImpl.loadUrlUnsafe");
            fgb.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void e1() {
        wpa.a(this.m0.a(), this.k0, "aeh2");
    }

    private final synchronized void f1() {
        try {
            Map map = this.v0;
            if (map != null) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((mkb) it2.next()).release();
                }
            }
            this.v0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void g1() {
        cqa cqaVar = this.m0;
        if (cqaVar == null) {
            return;
        }
        eqa a = cqaVar.a();
        upa g = dyf.q().g();
        if (g != null) {
            g.f(a);
        }
    }

    private final synchronized void h1() {
        Boolean l = dyf.q().l();
        this.H = l;
        if (l == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                W0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                W0(Boolean.FALSE);
            }
        }
    }

    @Override // defpackage.wlb
    public final WebView A() {
        return this;
    }

    @Override // defpackage.wlb
    public final j64 A0() {
        zqa zqaVar = this.d;
        return zqaVar == null ? zb.h(null) : zqaVar.a();
    }

    @Override // defpackage.wlb
    public final synchronized k8e B() {
        return this.s;
    }

    @Override // defpackage.wlb
    public final synchronized void B0(int i) {
        h hVar = this.r;
        if (hVar != null) {
            hVar.x6(i);
        }
    }

    @Override // defpackage.wlb
    public final synchronized void C(boolean z) {
        h hVar;
        int i = this.h0 + (true != z ? -1 : 1);
        this.h0 = i;
        if (i > 0 || (hVar = this.r) == null) {
            return;
        }
        hVar.D();
    }

    @Override // defpackage.gnb
    public final void C0(boolean z, int i, boolean z2) {
        this.n.M0(z, i, z2);
    }

    @Override // defpackage.wlb
    public final Context D() {
        return this.a.b();
    }

    @Override // defpackage.wlb
    public final void D0() {
        if (this.l0 == null) {
            this.m0.a();
            bqa f = eqa.f();
            this.l0 = f;
            this.m0.b("native:view_load", f);
        }
    }

    @Override // defpackage.wib
    public final synchronized mkb E(String str) {
        Map map = this.v0;
        if (map == null) {
            return null;
        }
        return (mkb) map.get(str);
    }

    @Override // defpackage.wib
    public final void F(int i) {
    }

    @Override // defpackage.wlb
    public final void F0(v0e v0eVar, y0e y0eVar) {
        this.j = v0eVar;
        this.k = y0eVar;
    }

    @Override // defpackage.wlb
    public final synchronized void G(h hVar) {
        this.r = hVar;
    }

    @Override // defpackage.gnb
    public final void G0(boolean z, int i, String str, String str2, boolean z2) {
        this.n.O0(z, i, str, str2, z2);
    }

    @Override // defpackage.wlb
    public final synchronized h H() {
        return this.o0;
    }

    @Override // defpackage.wib
    public final synchronized void I(int i) {
        this.n0 = i;
    }

    @Override // defpackage.wlb
    public final synchronized void I0(k8e k8eVar) {
        this.s = k8eVar;
    }

    @Override // defpackage.wlb
    public final synchronized boolean J() {
        return this.L;
    }

    @Override // defpackage.wlb
    public final synchronized void J0(String str, String str2, String str3) {
        String str4;
        try {
            if (y()) {
                fgb.g("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String str5 = (String) pla.c().a(mpa.P);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                fgb.h("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, hnb.a(str2, str4), Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wlb
    public final void K0() {
        this.q0.b();
    }

    @Override // defpackage.wlb
    public final synchronized void L(bta btaVar) {
        this.e0 = btaVar;
    }

    @Override // defpackage.wlb
    public final synchronized void L0(boolean z) {
        try {
            boolean z2 = this.y;
            this.y = z;
            Y0();
            if (z != z2) {
                if (((Boolean) pla.c().a(mpa.Q)).booleanValue()) {
                    if (!this.t.i()) {
                    }
                }
                new q6b(this, "").g(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wlb
    public final synchronized void M(boolean z) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = this.r;
        if (hVar != null) {
            hVar.y6(z);
        }
    }

    @Override // defpackage.q0b
    public final void M0(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // defpackage.hdf
    public final synchronized void O() {
        hdf hdfVar = this.f;
        if (hdfVar != null) {
            hdfVar.O();
        }
    }

    public final emb O0() {
        return this.n;
    }

    @Override // defpackage.wlb
    public final void P(boolean z) {
        this.n.w0(z);
    }

    final synchronized Boolean P0() {
        return this.H;
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        boolean z;
        synchronized (this) {
            z = uiaVar.j;
            this.Q = z;
        }
        b1(z);
    }

    @Override // defpackage.wlb
    public final boolean S() {
        return false;
    }

    protected final synchronized void S0(String str, ValueCallback valueCallback) {
        if (y()) {
            fgb.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // defpackage.wlb
    public final void T() {
        if (this.j0 == null) {
            cqa cqaVar = this.m0;
            wpa.a(cqaVar.a(), this.k0, "aes2");
            this.m0.a();
            bqa f = eqa.f();
            this.j0 = f;
            this.m0.b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.e.zza);
        t("onshow", hashMap);
    }

    protected final void T0(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            V0("javascript:".concat(str));
            return;
        }
        if (P0() == null) {
            h1();
        }
        if (P0().booleanValue()) {
            S0(str, null);
        } else {
            V0("javascript:".concat(str));
        }
    }

    @Override // defpackage.wlb
    public final void U() {
        throw null;
    }

    final /* synthetic */ void U0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // defpackage.wlb
    public final void V() {
        throw null;
    }

    protected final synchronized void V0(String str) {
        if (y()) {
            fgb.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // defpackage.wlb
    public final void W(boolean z) {
        this.y0 = true;
    }

    final void W0(Boolean bool) {
        synchronized (this) {
            this.H = bool;
        }
        dyf.q().x(bool);
    }

    @Override // defpackage.bgc
    public final void X() {
        emb embVar = this.n;
        if (embVar != null) {
            embVar.X();
        }
    }

    public final boolean X0() {
        int i;
        int i2;
        if (this.n.u() || this.n.s()) {
            kia.b();
            DisplayMetrics displayMetrics = this.h;
            int x = tfb.x(displayMetrics, displayMetrics.widthPixels);
            kia.b();
            DisplayMetrics displayMetrics2 = this.h;
            int x2 = tfb.x(displayMetrics2, displayMetrics2.heightPixels);
            Activity a = this.a.a();
            if (a == null || a.getWindow() == null) {
                i = x;
                i2 = x2;
            } else {
                dyf.r();
                int[] p = wxf.p(a);
                kia.b();
                int x3 = tfb.x(this.h, p[0]);
                kia.b();
                i2 = tfb.x(this.h, p[1]);
                i = x3;
            }
            int i3 = this.s0;
            if (i3 != x || this.r0 != x2 || this.t0 != i || this.u0 != i2) {
                boolean z = (i3 == x && this.r0 == x2) ? false : true;
                this.s0 = x;
                this.r0 = x2;
                this.t0 = i;
                this.u0 = i2;
                new q6b(this, "").e(x, x2, i, i2, this.h.density, this.w0.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // defpackage.wlb
    public final synchronized void Y(h hVar) {
        this.o0 = hVar;
    }

    @Override // defpackage.wlb
    public final void Z(int i) {
        if (i == 0) {
            cqa cqaVar = this.m0;
            wpa.a(cqaVar.a(), this.k0, "aebb2");
        }
        e1();
        this.m0.a();
        this.m0.a().d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.e.zza);
        t("onhide", hashMap);
    }

    @Override // defpackage.q0b
    public final void a(String str) {
        throw null;
    }

    @Override // defpackage.wlb
    public final synchronized bta a0() {
        return this.e0;
    }

    @Override // defpackage.wlb, defpackage.nlb
    public final v0e b() {
        return this.j;
    }

    @Override // defpackage.wlb
    public final boolean b0(final boolean z, final int i) {
        destroy();
        this.x0.b(new hna() { // from class: smb
            @Override // defpackage.hna
            public final void a(m3 m3Var) {
                int i2 = vmb.z0;
                m5 L = n5.L();
                boolean p = L.p();
                boolean z2 = z;
                if (p != z2) {
                    L.n(z2);
                }
                L.o(i);
                m3Var.w((n5) L.i());
            }
        });
        this.x0.c(10003);
        return true;
    }

    @Override // defpackage.wib
    public final void c() {
        h u = u();
        if (u != null) {
            u.zzd();
        }
    }

    @Override // defpackage.wlb
    public final synchronized tla d() {
        return this.g0;
    }

    @Override // defpackage.wib
    public final void d0(int i) {
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final synchronized void destroy() {
        try {
            g1();
            this.q0.a();
            h hVar = this.r;
            if (hVar != null) {
                hVar.zzb();
                this.r.zzm();
                this.r = null;
            }
            this.s = null;
            this.n.u0();
            this.g0 = null;
            this.f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.x) {
                return;
            }
            dyf.A().f(this);
            f1();
            this.x = true;
            if (!((Boolean) pla.c().a(mpa.na)).booleanValue()) {
                pzc.k("Destroying the WebView immediately...");
                q();
            } else {
                pzc.k("Initiating WebView self destruct sequence in 3...");
                pzc.k("Loading blank page in WebView, 2...");
                d1("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wlb
    public final synchronized boolean e() {
        return this.h0 > 0;
    }

    @Override // defpackage.wlb
    public final void e0(String str, uxa uxaVar) {
        emb embVar = this.n;
        if (embVar != null) {
            embVar.a(str, uxaVar);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (y()) {
            fgb.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) pla.c().a(mpa.oa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            pgb.e.l(new Runnable() { // from class: rmb
                @Override // java.lang.Runnable
                public final void run() {
                    vmb.this.U0(str, valueCallback);
                }
            });
        }
    }

    @Override // defpackage.wlb
    public final synchronized String f() {
        return this.u;
    }

    @Override // defpackage.wlb
    public final void f0() {
        setBackgroundColor(0);
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.x) {
                        this.n.u0();
                        dyf.A().f(this);
                        f1();
                        Z0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.wlb
    public final w1e g() {
        return this.c;
    }

    @Override // defpackage.wlb
    public final void g0(Context context) {
        this.a.setBaseContext(context);
        this.q0.e(this.a.a());
    }

    @Override // defpackage.wlb, defpackage.lnb
    public final View h() {
        return this;
    }

    @Override // defpackage.wlb
    public final void i() {
        e1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.e.zza);
        t("onhide", hashMap);
    }

    @Override // defpackage.wib
    public final void i0(int i) {
    }

    @Override // defpackage.wlb, defpackage.zmb
    public final y0e j() {
        return this.k;
    }

    @Override // defpackage.wib
    public final void j0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("duration", Long.toString(j));
        t("onCacheAccessComplete", hashMap);
    }

    @Override // defpackage.d0b
    public final void k(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        fgb.b("Dispatching AFMA event: ".concat(sb.toString()));
        T0(sb.toString());
    }

    @Override // defpackage.wib
    public final synchronized void l() {
        tsa tsaVar = this.f0;
        if (tsaVar != null) {
            final dpc dpcVar = (dpc) tsaVar;
            wxf.l.post(new Runnable() { // from class: yoc
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        dpc.this.zzd();
                    } catch (RemoteException e) {
                        fgb.i("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (y()) {
            fgb.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (y()) {
            fgb.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final synchronized void loadUrl(String str) {
        if (y()) {
            fgb.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            dyf.q().w(th, "AdWebViewImpl.loadUrl");
            fgb.h("Could not call loadUrl. ", th);
        }
    }

    @Override // defpackage.wlb
    public final WebViewClient m() {
        return this.n;
    }

    @Override // defpackage.wlb
    public final synchronized void m0(tla tlaVar) {
        this.g0 = tlaVar;
    }

    @Override // defpackage.wlb
    public final void n0(String str, uxa uxaVar) {
        emb embVar = this.n;
        if (embVar != null) {
            embVar.k(str, uxaVar);
        }
    }

    @Override // defpackage.wlb
    public final synchronized boolean o() {
        return this.w;
    }

    @Override // defpackage.wlb
    public final synchronized void o0(boolean z) {
        h hVar = this.r;
        if (hVar != null) {
            hVar.G6(this.n.u(), z);
        } else {
            this.w = z;
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!y()) {
                this.q0.c();
            }
            if (this.y0) {
                onResume();
                this.y0 = false;
            }
            boolean z = this.Q;
            emb embVar = this.n;
            if (embVar != null && embVar.s()) {
                if (!this.S) {
                    this.n.R();
                    this.n.c0();
                    this.S = true;
                }
                X0();
                z = true;
            }
            b1(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        emb embVar;
        synchronized (this) {
            try {
                if (!y()) {
                    this.q0.d();
                }
                super.onDetachedFromWindow();
                if (this.S && (embVar = this.n) != null && embVar.s() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.n.R();
                    this.n.c0();
                    this.S = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) pla.c().a(mpa.za)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            dyf.r();
            wxf.s(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            fgb.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            dyf.q().w(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (y()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean X0 = X0();
        h u = u();
        if (u == null || !X0) {
            return;
        }
        u.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01be A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01a6, B:96:0x01aa, B:98:0x01b1, B:103:0x01be, B:105:0x01c4, B:106:0x01c7, B:108:0x01cb, B:109:0x01d4, B:115:0x01df), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01a6, B:96:0x01aa, B:98:0x01b1, B:103:0x01be, B:105:0x01c4, B:106:0x01c7, B:108:0x01cb, B:109:0x01d4, B:115:0x01df), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01a6, B:96:0x01aa, B:98:0x01b1, B:103:0x01be, B:105:0x01c4, B:106:0x01c7, B:108:0x01cb, B:109:0x01d4, B:115:0x01df), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmb.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final void onPause() {
        if (y()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            fgb.e("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final void onResume() {
        if (y()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            fgb.e("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.n.s() || this.n.n()) {
            gfa gfaVar = this.b;
            if (gfaVar != null) {
                gfaVar.d(motionEvent);
            }
            zqa zqaVar = this.d;
            if (zqaVar != null) {
                zqaVar.b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    bta btaVar = this.e0;
                    if (btaVar != null) {
                        btaVar.a(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (y()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.wlb
    public final synchronized boolean p() {
        return this.y;
    }

    @Override // defpackage.wlb
    public final synchronized void p0(tsa tsaVar) {
        this.f0 = tsaVar;
    }

    @Override // defpackage.wlb
    public final synchronized void q() {
        pzc.k("Destroying WebView!");
        Z0();
        wxf.l.post(new umb(this));
    }

    @Override // defpackage.wlb, defpackage.jnb
    public final gfa r() {
        return this.b;
    }

    @Override // defpackage.wlb
    public final synchronized void r0(boolean z) {
        this.L = z;
    }

    @Override // defpackage.gnb
    public final void s(String str, String str2, int i) {
        this.n.G0(str, str2, 14);
    }

    @Override // defpackage.hdf
    public final synchronized void s0() {
        hdf hdfVar = this.f;
        if (hdfVar != null) {
            hdfVar.s0();
        }
    }

    @Override // android.webkit.WebView, defpackage.wlb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof emb) {
            this.n = (emb) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (y()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            fgb.e("Could not stop loading webview.", e);
        }
    }

    @Override // defpackage.d0b
    public final void t(String str, Map map) {
        try {
            k(str, kia.b().k(map));
        } catch (JSONException unused) {
            fgb.g("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.wlb
    public final synchronized void t0(unb unbVar) {
        this.t = unbVar;
        requestLayout();
    }

    @Override // defpackage.wlb
    public final synchronized h u() {
        return this.r;
    }

    @Override // defpackage.wib
    public final synchronized String u0() {
        return this.M;
    }

    @Override // defpackage.jq9
    public final void v() {
        emb embVar = this.n;
        if (embVar != null) {
            embVar.v();
        }
    }

    @Override // defpackage.wlb
    public final void v0(String str, Predicate predicate) {
        emb embVar = this.n;
        if (embVar != null) {
            embVar.l(str, predicate);
        }
    }

    @Override // defpackage.wlb, defpackage.wib
    public final synchronized void w(String str, mkb mkbVar) {
        try {
            if (this.v0 == null) {
                this.v0 = new HashMap();
            }
            this.v0.put(str, mkbVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gnb
    public final void w0(boolean z, int i, String str, boolean z2, boolean z3) {
        this.n.P0(z, i, str, z2, z3);
    }

    @Override // defpackage.wib
    public final void x(boolean z) {
        this.n.c(false);
    }

    @Override // defpackage.wlb
    public final synchronized boolean y() {
        return this.x;
    }

    @Override // defpackage.gnb
    public final void y0(zzc zzcVar, boolean z) {
        this.n.E0(zzcVar, z);
    }

    @Override // defpackage.wlb, defpackage.wib
    public final synchronized void z(ymb ymbVar) {
        if (this.N != null) {
            fgb.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.N = ymbVar;
        }
    }

    @Override // defpackage.wlb
    public final /* synthetic */ onb zzN() {
        return this.n;
    }

    @Override // defpackage.wlb, defpackage.inb
    public final synchronized unb zzO() {
        return this.t;
    }

    @Override // defpackage.q0b
    public final void zzb(String str, String str2) {
        T0(str + "(" + str2 + ");");
    }

    @Override // defpackage.wib
    public final synchronized int zzf() {
        return this.n0;
    }

    @Override // defpackage.wib
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // defpackage.wib
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // defpackage.wlb, defpackage.dnb, defpackage.wib
    public final Activity zzi() {
        return this.a.a();
    }

    @Override // defpackage.wlb, defpackage.wib
    public final iq9 zzj() {
        return this.g;
    }

    @Override // defpackage.wib
    public final bqa zzk() {
        return this.k0;
    }

    @Override // defpackage.wlb, defpackage.wib
    public final cqa zzm() {
        return this.m0;
    }

    @Override // defpackage.wlb, defpackage.knb, defpackage.wib
    public final zzcei zzn() {
        return this.e;
    }

    @Override // defpackage.wib
    public final lib zzo() {
        return null;
    }

    @Override // defpackage.wlb, defpackage.wib
    public final synchronized ymb zzq() {
        return this.N;
    }

    @Override // defpackage.wib
    public final synchronized String zzr() {
        y0e y0eVar = this.k;
        if (y0eVar == null) {
            return null;
        }
        return y0eVar.b;
    }

    @Override // defpackage.bgc
    public final void zzs() {
        emb embVar = this.n;
        if (embVar != null) {
            embVar.zzs();
        }
    }
}

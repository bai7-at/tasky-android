package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.b;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qq9 extends neb {
    protected static final List g0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List h0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List i0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List j0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private final zzcei H;
    private String L;
    private final List N;
    private final List Q;
    private final List S;
    private final List X;
    private final aob a;
    private Context b;
    private final gfa c;
    private final w1e d;
    private final t2e e;
    private final xqa f0;
    private final kke g;
    private final ScheduledExecutorService h;
    private zzbxr i;
    private final b m;
    private final evc n;
    private final d8e r;
    private uuc f = null;
    private Point j = new Point();
    private Point k = new Point();
    private final Set l = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger B = new AtomicInteger(0);
    private final AtomicBoolean Y = new AtomicBoolean(false);
    private final AtomicBoolean Z = new AtomicBoolean(false);
    private final AtomicInteger e0 = new AtomicInteger(0);
    private final boolean s = ((Boolean) pla.c().a(mpa.l7)).booleanValue();
    private final boolean t = ((Boolean) pla.c().a(mpa.k7)).booleanValue();
    private final boolean u = ((Boolean) pla.c().a(mpa.n7)).booleanValue();
    private final boolean w = ((Boolean) pla.c().a(mpa.p7)).booleanValue();
    private final String x = (String) pla.c().a(mpa.o7);
    private final String y = (String) pla.c().a(mpa.q7);
    private final String M = (String) pla.c().a(mpa.r7);

    public qq9(aob aobVar, Context context, gfa gfaVar, t2e t2eVar, kke kkeVar, ScheduledExecutorService scheduledExecutorService, evc evcVar, d8e d8eVar, zzcei zzceiVar, xqa xqaVar, w1e w1eVar) {
        List list;
        this.a = aobVar;
        this.b = context;
        this.c = gfaVar;
        this.d = w1eVar;
        this.e = t2eVar;
        this.g = kkeVar;
        this.h = scheduledExecutorService;
        this.m = aobVar.s();
        this.n = evcVar;
        this.r = d8eVar;
        this.H = zzceiVar;
        this.f0 = xqaVar;
        if (((Boolean) pla.c().a(mpa.s7)).booleanValue()) {
            this.N = Z6((String) pla.c().a(mpa.t7));
            this.Q = Z6((String) pla.c().a(mpa.u7));
            this.S = Z6((String) pla.c().a(mpa.v7));
            list = Z6((String) pla.c().a(mpa.w7));
        } else {
            this.N = g0;
            this.Q = h0;
            this.S = i0;
            list = j0;
        }
        this.X = list;
    }

    static /* bridge */ /* synthetic */ void F6(qq9 qq9Var, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (qq9Var.O6((Uri) it2.next())) {
                qq9Var.B.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void H6(final qq9 qq9Var, final String str, final String str2, final uuc uucVar) {
        if (((Boolean) pla.c().a(mpa.X6)).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.d7)).booleanValue()) {
                pgb.a.execute(new Runnable() { // from class: taf
                    @Override // java.lang.Runnable
                    public final void run() {
                        qq9.this.J6(str, str2, uucVar);
                    }
                });
            } else {
                qq9Var.m.d(str, str2, uucVar);
            }
        }
    }

    static final /* synthetic */ Uri Q6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? Y6(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final a1f R6(Context context, String str, String str2, zzq zzqVar, zzl zzlVar) {
        char c;
        q1e q1eVar = new q1e();
        if ("REWARDED".equals(str2)) {
            q1eVar.F().a(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            q1eVar.F().a(3);
        }
        iie t = this.a.t();
        e6c e6cVar = new e6c();
        e6cVar.e(context);
        if (str == null) {
            str = "adUnitId";
        }
        q1eVar.J(str);
        if (zzlVar == null) {
            zzlVar = new dff().a();
        }
        q1eVar.e(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            zzqVar = c != 0 ? (c == 1 || c == 2) ? zzq.K0() : c != 3 ? c != 4 ? new zzq() : zzq.G0() : zzq.H0() : new zzq(context, s7.i);
        }
        q1eVar.I(zzqVar);
        q1eVar.O(true);
        e6cVar.i(q1eVar.g());
        t.a(e6cVar.j());
        ju9 ju9Var = new ju9();
        ju9Var.a(str2);
        t.b(new ox9(ju9Var, null));
        new mdc();
        a1f zzc = t.zzc();
        this.f = zzc.a();
        return zzc;
    }

    private final j64 S6(final String str) {
        final cqc[] cqcVarArr = new cqc[1];
        j64 n = zb.n(this.e.a(), new ake() { // from class: zcf
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return qq9.this.l7(cqcVarArr, str, (cqc) obj);
            }
        }, this.g);
        n.a(new Runnable() { // from class: fff
            @Override // java.lang.Runnable
            public final void run() {
                qq9.this.I6(cqcVarArr);
            }
        }, this.g);
        return zb.e(zb.m((vb) zb.o(vb.C(n), ((Integer) pla.c().a(mpa.E7)).intValue(), TimeUnit.MILLISECONDS, this.h), new gge() { // from class: pwf
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                List list = qq9.g0;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.g), Exception.class, new gge() { // from class: xxf
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                List list = qq9.g0;
                fgb.e("", (Exception) obj);
                return null;
            }
        }, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T6() {
        zb.r(((Boolean) pla.c().a(mpa.Ba)).booleanValue() ? zb.k(new zje() { // from class: r6f
            @Override // defpackage.zje
            public final j64 zza() {
                return qq9.this.k7();
            }
        }, pgb.a) : R6(this.b, null, AdFormat.BANNER.name(), null, null).c(), new y7g(this), this.a.c());
    }

    private final void U6(List list, final ee3 ee3Var, d8b d8bVar, boolean z) {
        j64 j;
        if (!((Boolean) pla.c().a(mpa.D7)).booleanValue()) {
            fgb.g("The updating URL feature is not enabled.");
            try {
                d8bVar.b("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                fgb.e("", e);
                return;
            }
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (O6((Uri) it2.next())) {
                i++;
            }
        }
        if (i > 1) {
            fgb.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            final Uri uri = (Uri) it3.next();
            if (O6(uri)) {
                j = this.g.j(new Callable() { // from class: vhf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return qq9.this.c7(uri, ee3Var);
                    }
                });
                if (X6()) {
                    j = zb.n(j, new ake() { // from class: elf
                        @Override // defpackage.ake
                        public final j64 zza(Object obj) {
                            j64 m;
                            m = zb.m(r0.S6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new gge() { // from class: vof
                                @Override // defpackage.gge
                                public final Object apply(Object obj2) {
                                    return qq9.Q6(r2, (String) obj2);
                                }
                            }, qq9.this.g);
                            return m;
                        }
                    }, this.g);
                } else {
                    fgb.f("Asset view map is empty.");
                }
            } else {
                fgb.g("Not a Google URL: ".concat(String.valueOf(uri)));
                j = zb.h(uri);
            }
            arrayList.add(j);
        }
        zb.r(zb.d(arrayList), new p5g(this, d8bVar, z), this.a.c());
    }

    private final void V6(final List list, final ee3 ee3Var, d8b d8bVar, boolean z) {
        if (!((Boolean) pla.c().a(mpa.D7)).booleanValue()) {
            try {
                d8bVar.b("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                fgb.e("", e);
                return;
            }
        }
        j64 j = this.g.j(new Callable() { // from class: uyf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qq9.this.A6(list, ee3Var);
            }
        });
        if (X6()) {
            j = zb.n(j, new ake() { // from class: p0g
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return qq9.this.m7((ArrayList) obj);
                }
            }, this.g);
        } else {
            fgb.f("Asset view map is empty.");
        }
        zb.r(j, new k3g(this, d8bVar, z), this.a.c());
    }

    private static boolean W6(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (path.contains((String) it2.next())) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (host.endsWith((String) it3.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean X6() {
        Map map;
        zzbxr zzbxrVar = this.i;
        return (zzbxrVar == null || (map = zzbxrVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri Y6(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private static final List Z6(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!ehe.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    private final void g1() {
        if (((Boolean) pla.c().a(mpa.p9)).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.s9)).booleanValue()) {
                return;
            }
            if (((Boolean) pla.c().a(mpa.w9)).booleanValue() && this.Y.getAndSet(true)) {
                return;
            }
            T6();
        }
    }

    static /* bridge */ /* synthetic */ q7e h7(j64 j64Var, zzccx zzccxVar) {
        if (!v7e.a() || !((Boolean) jra.e.e()).booleanValue()) {
            return null;
        }
        try {
            q7e b = ((a1f) zb.p(j64Var)).b();
            b.d(new ArrayList(Collections.singletonList(zzccxVar.zzb)));
            zzl zzlVar = zzccxVar.zzd;
            b.b(zzlVar == null ? "" : zzlVar.zzp);
            return b;
        } catch (ExecutionException e) {
            dyf.q().w(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList A6(List list, ee3 ee3Var) {
        this.c.c();
        String zzh = this.c.c().zzh(this.b, (View) fc5.Q1(ee3Var), null);
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (P6(uri)) {
                arrayList.add(Y6(uri, "ms", zzh));
            } else {
                fgb.g("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    @Override // defpackage.oeb
    public final void B(ee3 ee3Var) {
        if (((Boolean) pla.c().a(mpa.D7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) fc5.Q1(ee3Var);
            zzbxr zzbxrVar = this.i;
            this.j = l9b.a(motionEvent, zzbxrVar == null ? null : zzbxrVar.zza);
            if (motionEvent.getAction() == 0) {
                this.k = this.j;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.j;
            obtain.setLocation(point.x, point.y);
            this.c.d(obtain);
            obtain.recycle();
        }
    }

    @Override // defpackage.oeb
    public final void F1(List list, ee3 ee3Var, d8b d8bVar) {
        V6(list, ee3Var, d8bVar, true);
    }

    @Override // defpackage.oeb
    public final void I2(List list, ee3 ee3Var, d8b d8bVar) {
        U6(list, ee3Var, d8bVar, false);
    }

    final /* synthetic */ void I6(cqc[] cqcVarArr) {
        cqc cqcVar = cqcVarArr[0];
        if (cqcVar != null) {
            this.e.b(zb.h(cqcVar));
        }
    }

    @Override // defpackage.oeb
    public final void J(ee3 ee3Var) {
        if (((Boolean) pla.c().a(mpa.o9)).booleanValue()) {
            zoa zoaVar = mpa.B7;
            if (!((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                g1();
            }
            WebView webView = (WebView) fc5.Q1(ee3Var);
            if (webView == null) {
                fgb.d("The webView cannot be null.");
                return;
            }
            if (this.l.contains(webView)) {
                fgb.f("This webview has already been registered.");
                return;
            }
            this.l.add(webView);
            webView.addJavascriptInterface(new yf8(webView, this.c, this.n, this.r, this.d), "gmaSdk");
            if (((Boolean) pla.c().a(mpa.y9)).booleanValue()) {
                dyf.q().s();
            }
            if (((Boolean) pla.c().a(zoaVar)).booleanValue()) {
                g1();
            }
        }
    }

    final /* synthetic */ void J6(String str, String str2, uuc uucVar) {
        this.m.d(str, str2, uucVar);
    }

    final boolean O6(Uri uri) {
        return W6(uri, this.N, this.Q);
    }

    final boolean P6(Uri uri) {
        return W6(uri, this.S, this.X);
    }

    @Override // defpackage.oeb
    public final void W1(zzbxr zzbxrVar) {
        this.i = zzbxrVar;
        this.e.c(1);
    }

    final /* synthetic */ Uri c7(Uri uri, ee3 ee3Var) {
        w1e w1eVar;
        try {
            uri = (!((Boolean) pla.c().a(mpa.rb)).booleanValue() || (w1eVar = this.d) == null) ? this.c.a(uri, this.b, (View) fc5.Q1(ee3Var), null) : w1eVar.a(uri, this.b, (View) fc5.Q1(ee3Var), null);
        } catch (zzavj e) {
            fgb.h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    @Override // defpackage.oeb
    public final void f3(List list, ee3 ee3Var, d8b d8bVar) {
        V6(list, ee3Var, d8bVar, false);
    }

    final /* synthetic */ a1f g7(zzccx zzccxVar) {
        return R6(this.b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
    }

    @Override // defpackage.oeb
    public final void i1(List list, ee3 ee3Var, d8b d8bVar) {
        U6(list, ee3Var, d8bVar, true);
    }

    final /* synthetic */ j64 k7() {
        return R6(this.b, null, AdFormat.BANNER.name(), null, null).c();
    }

    final /* synthetic */ j64 l7(cqc[] cqcVarArr, String str, cqc cqcVar) {
        cqcVarArr[0] = cqcVar;
        Context context = this.b;
        zzbxr zzbxrVar = this.i;
        Map map = zzbxrVar.zzb;
        JSONObject d = l9b.d(context, map, map, zzbxrVar.zza, null);
        JSONObject g = l9b.g(this.b, this.i.zza);
        JSONObject f = l9b.f(this.i.zza);
        JSONObject e = l9b.e(this.b, this.i.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d);
        jSONObject.put("ad_view_signal", g);
        jSONObject.put("scroll_view_signal", f);
        jSONObject.put("lock_screen_signal", e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", l9b.c(null, this.b, this.k, this.j));
        }
        return cqcVar.d(str, jSONObject);
    }

    final /* synthetic */ j64 m7(final ArrayList arrayList) {
        return zb.m(S6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new gge() { // from class: t8f
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return qq9.this.z6(arrayList, (String) obj);
            }
        }, this.g);
    }

    @Override // defpackage.oeb
    public final void p5(ee3 ee3Var, final zzccx zzccxVar, leb lebVar) {
        j64 h;
        j64 c;
        j64 j64Var;
        j64 j64Var2;
        Context context = (Context) fc5.Q1(ee3Var);
        this.b = context;
        f7e a = e7e.a(context, 22);
        a.zzh();
        if ("UNKNOWN".equals(zzccxVar.zzb)) {
            List arrayList = new ArrayList();
            zoa zoaVar = mpa.C7;
            if (!((String) pla.c().a(zoaVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) pla.c().a(zoaVar)).split(","));
            }
            if (arrayList.contains(ktd.b(zzccxVar.zzd))) {
                j64 g = zb.g(new IllegalArgumentException("Unknown format is no longer supported."));
                j64Var2 = g;
                j64Var = zb.g(new IllegalArgumentException("Unknown format is no longer supported."));
                zb.r(j64Var, new a2g(this, j64Var2, zzccxVar, lebVar, a, dyf.b().currentTimeMillis()), this.a.c());
            }
        }
        if (((Boolean) pla.c().a(mpa.Ba)).booleanValue()) {
            kke kkeVar = pgb.a;
            h = kkeVar.j(new Callable() { // from class: fsf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qq9.this.g7(zzccxVar);
                }
            });
            c = zb.n(h, new ake() { // from class: wuf
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return ((a1f) obj).c();
                }
            }, kkeVar);
        } else {
            a1f R6 = R6(this.b, zzccxVar.zza, zzccxVar.zzb, zzccxVar.zzc, zzccxVar.zzd);
            h = zb.h(R6);
            c = R6.c();
        }
        j64Var = c;
        j64Var2 = h;
        zb.r(j64Var, new a2g(this, j64Var2, zzccxVar, lebVar, a, dyf.b().currentTimeMillis()), this.a.c());
    }

    @Override // defpackage.oeb
    public final ee3 u2(ee3 ee3Var, ee3 ee3Var2, String str, ee3 ee3Var3) {
        if (!((Boolean) pla.c().a(mpa.z9)).booleanValue()) {
            return fc5.l3(null);
        }
        this.f0.g((Context) fc5.Q1(ee3Var), (g51) fc5.Q1(ee3Var2), str, (f51) fc5.Q1(ee3Var3));
        return fc5.l3(this.f0.b());
    }

    final /* synthetic */ ArrayList z6(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (!P6(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(Y6(uri, "nas", str));
            }
        }
        return arrayList;
    }
}

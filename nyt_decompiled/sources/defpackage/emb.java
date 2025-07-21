package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzavj;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public abstract class emb extends WebViewClient implements onb {
    public static final /* synthetic */ int e0 = 0;
    private ela B;
    protected kdb L;
    private boolean M;
    private boolean N;
    private int Q;
    private boolean S;
    private final l8d Y;
    private View.OnAttachStateChangeListener Z;
    private final wlb a;
    private final ina b;
    private jq9 e;
    private tof f;
    private mnb g;
    private nnb h;
    private awa i;
    private cwa j;
    private bgc k;
    private boolean l;
    private boolean m;
    private boolean t;
    private boolean u;
    private boolean w;
    private wq9 x;
    private p6b y;
    private final HashMap c = new HashMap();
    private final Object d = new Object();
    private int n = 0;
    private String r = "";
    private String s = "";
    private k6b H = null;
    private final HashSet X = new HashSet(Arrays.asList(((String) pla.c().a(mpa.E5)).split(",")));

    public emb(wlb wlbVar, ina inaVar, boolean z, p6b p6bVar, k6b k6bVar, l8d l8dVar) {
        this.b = inaVar;
        this.a = wlbVar;
        this.t = z;
        this.y = p6bVar;
        this.Y = l8dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Map map, List list, String str) {
        if (pzc.m()) {
            pzc.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                pzc.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((uxa) it2.next()).a(this.a, map);
        }
    }

    private final void F() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Z;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(final View view, final kdb kdbVar, final int i) {
        if (!kdbVar.zzi() || i <= 0) {
            return;
        }
        kdbVar.b(view);
        if (kdbVar.zzi()) {
            wxf.l.postDelayed(new Runnable() { // from class: xlb
                @Override // java.lang.Runnable
                public final void run() {
                    emb.this.C0(view, kdbVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean K(wlb wlbVar) {
        if (wlbVar.b() != null) {
            return wlbVar.b().j0;
        }
        return false;
    }

    private static final boolean O(boolean z, wlb wlbVar) {
        return (!z || wlbVar.zzO().i() || wlbVar.f().equals("interstitial_mb")) ? false : true;
    }

    private static WebResourceResponse t() {
        if (((Boolean) pla.c().a(mpa.J0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse x(String str, Map map) {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
                openConnection.setReadTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                dyf.r().H(this.a.getContext(), this.a.zzn().zza, false, httpURLConnection, false, 60000);
                webResourceResponse = null;
                egb egbVar = new egb(null);
                egbVar.c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                egbVar.e(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeader.LOCATION);
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (!headerField.startsWith("tel:")) {
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        fgb.g("Protocol is null");
                        webResourceResponse = t();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        fgb.g("Unsupported scheme: " + protocol);
                        webResourceResponse = t();
                        break;
                    }
                    fgb.b("Redirecting to " + headerField);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            dyf.r();
            dyf.r();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            dyf.r();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        if (split[i2].trim().startsWith("charset")) {
                            String[] split2 = split[i2].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = dyf.s().b(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    final /* synthetic */ void C0(View view, kdb kdbVar, int i) {
        I(view, kdbVar, i - 1);
    }

    public final void E0(zzc zzcVar, boolean z) {
        wlb wlbVar = this.a;
        boolean p = wlbVar.p();
        boolean O = O(p, wlbVar);
        boolean z2 = true;
        if (!O && z) {
            z2 = false;
        }
        jq9 jq9Var = O ? null : this.e;
        tof tofVar = p ? null : this.f;
        wq9 wq9Var = this.x;
        wlb wlbVar2 = this.a;
        N0(new AdOverlayInfoParcel(zzcVar, jq9Var, tofVar, wq9Var, wlbVar2.zzn(), wlbVar2, z2 ? null : this.k));
    }

    public final void G0(String str, String str2, int i) {
        l8d l8dVar = this.Y;
        wlb wlbVar = this.a;
        N0(new AdOverlayInfoParcel(wlbVar, wlbVar.zzn(), str, str2, 14, l8dVar));
    }

    @Override // defpackage.onb
    public final void H0(Uri uri) {
        pzc.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.c;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            pzc.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) pla.c().a(mpa.M6)).booleanValue() || dyf.q().g() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? Constants.NULL_VERSION_ID : path.substring(1);
            pgb.a.execute(new Runnable() { // from class: zlb
                @Override // java.lang.Runnable
                public final void run() {
                    int i = emb.e0;
                    dyf.q().g().e(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) pla.c().a(mpa.D5)).booleanValue() && this.X.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) pla.c().a(mpa.F5)).intValue()) {
                pzc.k("Parsing gmsg query params on BG thread: ".concat(path));
                zb.r(dyf.r().D(uri), new cmb(this, list, path, uri), pgb.e);
                return;
            }
        }
        dyf.r();
        E(wxf.o(uri), list, path);
    }

    public final void M0(boolean z, int i, boolean z2) {
        wlb wlbVar = this.a;
        boolean O = O(wlbVar.p(), wlbVar);
        boolean z3 = true;
        if (!O && z2) {
            z3 = false;
        }
        jq9 jq9Var = O ? null : this.e;
        tof tofVar = this.f;
        wq9 wq9Var = this.x;
        wlb wlbVar2 = this.a;
        N0(new AdOverlayInfoParcel(jq9Var, tofVar, wq9Var, wlbVar2, z, i, wlbVar2.zzn(), z3 ? null : this.k, K(this.a) ? this.Y : null));
    }

    @Override // defpackage.onb
    public final void N(mnb mnbVar) {
        this.g = mnbVar;
    }

    public final void N0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        k6b k6bVar = this.H;
        boolean m = k6bVar != null ? k6bVar.m() : false;
        dyf.k();
        thf.a(this.a.getContext(), adOverlayInfoParcel, !m);
        kdb kdbVar = this.L;
        if (kdbVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            kdbVar.zzh(str);
        }
    }

    public final void O0(boolean z, int i, String str, String str2, boolean z2) {
        wlb wlbVar = this.a;
        boolean p = wlbVar.p();
        boolean O = O(p, wlbVar);
        boolean z3 = true;
        if (!O && z2) {
            z3 = false;
        }
        jq9 jq9Var = O ? null : this.e;
        dmb dmbVar = p ? null : new dmb(this.a, this.f);
        awa awaVar = this.i;
        cwa cwaVar = this.j;
        wq9 wq9Var = this.x;
        wlb wlbVar2 = this.a;
        N0(new AdOverlayInfoParcel(jq9Var, dmbVar, awaVar, cwaVar, wq9Var, wlbVar2, z, i, str, str2, wlbVar2.zzn(), z3 ? null : this.k, K(this.a) ? this.Y : null));
    }

    public final void P0(boolean z, int i, String str, boolean z2, boolean z3) {
        wlb wlbVar = this.a;
        boolean p = wlbVar.p();
        boolean O = O(p, wlbVar);
        boolean z4 = true;
        if (!O && z2) {
            z4 = false;
        }
        jq9 jq9Var = O ? null : this.e;
        dmb dmbVar = p ? null : new dmb(this.a, this.f);
        awa awaVar = this.i;
        cwa cwaVar = this.j;
        wq9 wq9Var = this.x;
        wlb wlbVar2 = this.a;
        N0(new AdOverlayInfoParcel(jq9Var, dmbVar, awaVar, cwaVar, wq9Var, wlbVar2, z, i, str, wlbVar2.zzn(), z4 ? null : this.k, K(this.a) ? this.Y : null, z3));
    }

    @Override // defpackage.onb
    public final void Q(boolean z) {
        synchronized (this.d) {
            this.u = true;
        }
    }

    public final ViewTreeObserver.OnGlobalLayoutListener R() {
        synchronized (this.d) {
        }
        return null;
    }

    @Override // defpackage.bgc
    public final void X() {
        bgc bgcVar = this.k;
        if (bgcVar != null) {
            bgcVar.X();
        }
    }

    public final void a(String str, uxa uxaVar) {
        synchronized (this.d) {
            try {
                List list = (List) this.c.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.c.put(str, list);
                }
                list.add(uxaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z) {
        this.l = false;
    }

    public final ViewTreeObserver.OnScrollChangedListener c0() {
        synchronized (this.d) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[Catch: Exception | NoClassDefFoundError -> 0x0023, Exception | NoClassDefFoundError -> 0x0023, TRY_ENTER, TryCatch #3 {Exception | NoClassDefFoundError -> 0x0023, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0026, B:10:0x0032, B:12:0x004f, B:14:0x0068, B:16:0x007f, B:17:0x0082, B:18:0x0085, B:21:0x009f, B:21:0x009f, B:23:0x00b7, B:23:0x00b7, B:25:0x00d0, B:25:0x00d0, B:38:0x0177, B:38:0x0177, B:40:0x0159, B:40:0x0159, B:43:0x0245, B:43:0x0245, B:54:0x01cd, B:54:0x01cd, B:55:0x01f6, B:55:0x01f6, B:49:0x01a6, B:49:0x01a6, B:50:0x0132, B:50:0x0132, B:64:0x00c4, B:64:0x00c4, B:65:0x01f7, B:65:0x01f7, B:67:0x0201, B:67:0x0201, B:69:0x0207, B:69:0x0207, B:71:0x0239, B:71:0x0239, B:75:0x0254, B:75:0x0254, B:77:0x025a, B:77:0x025a, B:79:0x0268, B:79:0x0268), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0245 A[Catch: Exception | NoClassDefFoundError -> 0x0023, Exception | NoClassDefFoundError -> 0x0023, TryCatch #3 {Exception | NoClassDefFoundError -> 0x0023, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0026, B:10:0x0032, B:12:0x004f, B:14:0x0068, B:16:0x007f, B:17:0x0082, B:18:0x0085, B:21:0x009f, B:21:0x009f, B:23:0x00b7, B:23:0x00b7, B:25:0x00d0, B:25:0x00d0, B:38:0x0177, B:38:0x0177, B:40:0x0159, B:40:0x0159, B:43:0x0245, B:43:0x0245, B:54:0x01cd, B:54:0x01cd, B:55:0x01f6, B:55:0x01f6, B:49:0x01a6, B:49:0x01a6, B:50:0x0132, B:50:0x0132, B:64:0x00c4, B:64:0x00c4, B:65:0x01f7, B:65:0x01f7, B:67:0x0201, B:67:0x0201, B:69:0x0207, B:69:0x0207, B:71:0x0239, B:71:0x0239, B:75:0x0254, B:75:0x0254, B:77:0x025a, B:77:0x025a, B:79:0x0268, B:79:0x0268), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7 A[Catch: Exception | NoClassDefFoundError -> 0x0023, Exception | NoClassDefFoundError -> 0x0023, TryCatch #3 {Exception | NoClassDefFoundError -> 0x0023, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0026, B:10:0x0032, B:12:0x004f, B:14:0x0068, B:16:0x007f, B:17:0x0082, B:18:0x0085, B:21:0x009f, B:21:0x009f, B:23:0x00b7, B:23:0x00b7, B:25:0x00d0, B:25:0x00d0, B:38:0x0177, B:38:0x0177, B:40:0x0159, B:40:0x0159, B:43:0x0245, B:43:0x0245, B:54:0x01cd, B:54:0x01cd, B:55:0x01f6, B:55:0x01f6, B:49:0x01a6, B:49:0x01a6, B:50:0x0132, B:50:0x0132, B:64:0x00c4, B:64:0x00c4, B:65:0x01f7, B:65:0x01f7, B:67:0x0201, B:67:0x0201, B:69:0x0207, B:69:0x0207, B:71:0x0239, B:71:0x0239, B:75:0x0254, B:75:0x0254, B:77:0x025a, B:77:0x025a, B:79:0x0268, B:79:0x0268), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025a A[Catch: Exception | NoClassDefFoundError -> 0x0023, Exception | NoClassDefFoundError -> 0x0023, TryCatch #3 {Exception | NoClassDefFoundError -> 0x0023, blocks: (B:3:0x000a, B:5:0x001c, B:8:0x0026, B:10:0x0032, B:12:0x004f, B:14:0x0068, B:16:0x007f, B:17:0x0082, B:18:0x0085, B:21:0x009f, B:21:0x009f, B:23:0x00b7, B:23:0x00b7, B:25:0x00d0, B:25:0x00d0, B:38:0x0177, B:38:0x0177, B:40:0x0159, B:40:0x0159, B:43:0x0245, B:43:0x0245, B:54:0x01cd, B:54:0x01cd, B:55:0x01f6, B:55:0x01f6, B:49:0x01a6, B:49:0x01a6, B:50:0x0132, B:50:0x0132, B:64:0x00c4, B:64:0x00c4, B:65:0x01f7, B:65:0x01f7, B:67:0x0201, B:67:0x0201, B:69:0x0207, B:69:0x0207, B:71:0x0239, B:71:0x0239, B:75:0x0254, B:75:0x0254, B:77:0x025a, B:77:0x025a, B:79:0x0268, B:79:0x0268), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026d A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.webkit.WebResourceResponse d0(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emb.d0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // defpackage.onb
    public final void h() {
        synchronized (this.d) {
            this.l = false;
            this.t = true;
            pgb.e.execute(new Runnable() { // from class: ylb
                @Override // java.lang.Runnable
                public final void run() {
                    emb.this.y0();
                }
            });
        }
    }

    @Override // defpackage.onb
    public final void h0(boolean z) {
        synchronized (this.d) {
            this.w = z;
        }
    }

    public final void k(String str, uxa uxaVar) {
        synchronized (this.d) {
            try {
                List list = (List) this.c.get(str);
                if (list == null) {
                    return;
                }
                list.remove(uxaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.onb
    public final void k0(int i, int i2, boolean z) {
        p6b p6bVar = this.y;
        if (p6bVar != null) {
            p6bVar.h(i, i2);
        }
        k6b k6bVar = this.H;
        if (k6bVar != null) {
            k6bVar.k(i, i2, false);
        }
    }

    public final void l(String str, Predicate predicate) {
        synchronized (this.d) {
            try {
                List<uxa> list = (List) this.c.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (uxa uxaVar : list) {
                    if (predicate.apply(uxaVar)) {
                        arrayList.add(uxaVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.onb
    public final void l0(int i, int i2) {
        k6b k6bVar = this.H;
        if (k6bVar != null) {
            k6bVar.l(i, i2);
        }
    }

    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.w;
        }
        return z;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        pzc.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            H0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.d) {
            try {
                if (this.a.y()) {
                    pzc.k("Blank page loaded, 1...");
                    this.a.q();
                    return;
                }
                this.M = true;
                nnb nnbVar = this.h;
                if (nnbVar != null) {
                    nnbVar.zza();
                    this.h = null;
                }
                s0();
                if (this.a.u() != null) {
                    if (((Boolean) pla.c().a(mpa.mb)).booleanValue()) {
                        this.a.u().B6(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.m = true;
        this.n = i;
        this.r = str;
        this.s = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.a.b0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // defpackage.onb
    public final void q0(jq9 jq9Var, awa awaVar, tof tofVar, cwa cwaVar, wq9 wq9Var, boolean z, wxa wxaVar, ela elaVar, r6b r6bVar, kdb kdbVar, final a8d a8dVar, final d8e d8eVar, zuc zucVar, k6e k6eVar, nya nyaVar, final bgc bgcVar, mya myaVar, gya gyaVar, final gwb gwbVar) {
        ela elaVar2 = elaVar == null ? new ela(this.a.getContext(), kdbVar, null) : elaVar;
        this.H = new k6b(this.a, r6bVar);
        this.L = kdbVar;
        if (((Boolean) pla.c().a(mpa.R0)).booleanValue()) {
            a("/adMetadata", new zva(awaVar));
        }
        if (cwaVar != null) {
            a("/appEvent", new bwa(cwaVar));
        }
        a("/backButton", txa.j);
        a("/refresh", txa.k);
        a("/canOpenApp", txa.b);
        a("/canOpenURLs", txa.a);
        a("/canOpenIntents", txa.c);
        a("/close", txa.d);
        a("/customClose", txa.e);
        a("/instrument", txa.n);
        a("/delayPageLoaded", txa.p);
        a("/delayPageClosed", txa.q);
        a("/getLocationInfo", txa.r);
        a("/log", txa.g);
        a("/mraid", new aya(elaVar2, this.H, r6bVar));
        p6b p6bVar = this.y;
        if (p6bVar != null) {
            a("/mraidLoaded", p6bVar);
        }
        ela elaVar3 = elaVar2;
        a("/open", new fya(elaVar2, this.H, a8dVar, zucVar, k6eVar, gwbVar));
        a("/precache", new nkb());
        a("/touch", txa.i);
        a("/video", txa.l);
        a("/videoMeta", txa.m);
        if (a8dVar == null || d8eVar == null) {
            a("/click", new nwa(bgcVar, gwbVar));
            a("/httpTrack", txa.f);
        } else {
            a("/click", new uxa() { // from class: z1e
                @Override // defpackage.uxa
                public final void a(Object obj, Map map) {
                    wlb wlbVar = (wlb) obj;
                    txa.c(map, bgc.this);
                    String str = (String) map.get(QueryKeys.USER_ID);
                    if (str == null) {
                        fgb.g("URL missing from click GMSG.");
                        return;
                    }
                    a8d a8dVar2 = a8dVar;
                    d8e d8eVar2 = d8eVar;
                    zb.r(txa.a(wlbVar, str), new b2e(wlbVar, gwbVar, d8eVar2, a8dVar2), pgb.a);
                }
            });
            a("/httpTrack", new uxa() { // from class: a2e
                @Override // defpackage.uxa
                public final void a(Object obj, Map map) {
                    nlb nlbVar = (nlb) obj;
                    String str = (String) map.get(QueryKeys.USER_ID);
                    if (str == null) {
                        fgb.g("URL missing from httpTrack GMSG.");
                    } else if (nlbVar.b().j0) {
                        a8dVar.h(new c8d(dyf.b().currentTimeMillis(), ((zmb) nlbVar).j().b, str, 2));
                    } else {
                        d8e.this.c(str, null);
                    }
                }
            });
        }
        if (dyf.p().p(this.a.getContext())) {
            a("/logScionEvent", new zxa(this.a.getContext()));
        }
        if (wxaVar != null) {
            a("/setInterstitialProperties", new vxa(wxaVar));
        }
        if (nyaVar != null) {
            if (((Boolean) pla.c().a(mpa.N8)).booleanValue()) {
                a("/inspectorNetworkExtras", nyaVar);
            }
        }
        if (((Boolean) pla.c().a(mpa.g9)).booleanValue() && myaVar != null) {
            a("/shareSheet", myaVar);
        }
        if (((Boolean) pla.c().a(mpa.l9)).booleanValue() && gyaVar != null) {
            a("/inspectorOutOfContextTest", gyaVar);
        }
        if (((Boolean) pla.c().a(mpa.Ta)).booleanValue()) {
            a("/bindPlayStoreOverlay", txa.u);
            a("/presentPlayStoreOverlay", txa.v);
            a("/expandPlayStoreOverlay", txa.w);
            a("/collapsePlayStoreOverlay", txa.x);
            a("/closePlayStoreOverlay", txa.y);
        }
        if (((Boolean) pla.c().a(mpa.a3)).booleanValue()) {
            a("/setPAIDPersonalizationEnabled", txa.A);
            a("/resetPAID", txa.z);
        }
        if (((Boolean) pla.c().a(mpa.lb)).booleanValue()) {
            wlb wlbVar = this.a;
            if (wlbVar.b() != null && wlbVar.b().r0) {
                a("/writeToLocalStorage", txa.B);
                a("/clearLocalStorageKeys", txa.C);
            }
        }
        this.e = jq9Var;
        this.f = tofVar;
        this.i = awaVar;
        this.j = cwaVar;
        this.x = wq9Var;
        this.B = elaVar3;
        this.k = bgcVar;
        this.l = z;
    }

    public final boolean s() {
        boolean z;
        synchronized (this.d) {
            z = this.u;
        }
        return z;
    }

    public final void s0() {
        if (this.g != null && ((this.M && this.Q <= 0) || this.N || this.m)) {
            if (((Boolean) pla.c().a(mpa.Q1)).booleanValue() && this.a.zzm() != null) {
                wpa.a(this.a.zzm().a(), this.a.zzk(), "awfllc");
            }
            mnb mnbVar = this.g;
            boolean z = false;
            if (!this.N && !this.m) {
                z = true;
            }
            mnbVar.a(z, this.n, this.r, this.s);
            this.g = null;
        }
        this.a.D0();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return d0(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        pzc.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            H0(parse);
        } else {
            if (this.l && webView == this.a.A()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    jq9 jq9Var = this.e;
                    if (jq9Var != null) {
                        jq9Var.v();
                        kdb kdbVar = this.L;
                        if (kdbVar != null) {
                            kdbVar.zzh(str);
                        }
                        this.e = null;
                    }
                    bgc bgcVar = this.k;
                    if (bgcVar != null) {
                        bgcVar.zzs();
                        this.k = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.a.A().willNotDraw()) {
                fgb.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    gfa r = this.a.r();
                    w1e g = this.a.g();
                    if (!((Boolean) pla.c().a(mpa.rb)).booleanValue() || g == null) {
                        if (r != null && r.f(parse)) {
                            Context context = this.a.getContext();
                            wlb wlbVar = this.a;
                            parse = r.a(parse, context, (View) wlbVar, wlbVar.zzi());
                        }
                    } else if (r != null && r.f(parse)) {
                        Context context2 = this.a.getContext();
                        wlb wlbVar2 = this.a;
                        parse = g.a(parse, context2, (View) wlbVar2, wlbVar2.zzi());
                    }
                } catch (zzavj unused) {
                    fgb.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                ela elaVar = this.B;
                if (elaVar == null || elaVar.c()) {
                    E0(new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    elaVar.b(str);
                }
            }
        }
        return true;
    }

    @Override // defpackage.onb
    public final boolean u() {
        boolean z;
        synchronized (this.d) {
            z = this.t;
        }
        return z;
    }

    public final void u0() {
        kdb kdbVar = this.L;
        if (kdbVar != null) {
            kdbVar.zze();
            this.L = null;
        }
        F();
        synchronized (this.d) {
            try {
                this.c.clear();
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.l = false;
                this.t = false;
                this.u = false;
                this.x = null;
                this.B = null;
                this.y = null;
                k6b k6bVar = this.H;
                if (k6bVar != null) {
                    k6bVar.h(true);
                    this.H = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jq9
    public final void v() {
        jq9 jq9Var = this.e;
        if (jq9Var != null) {
            jq9Var.v();
        }
    }

    public final void w0(boolean z) {
        this.S = z;
    }

    @Override // defpackage.onb
    public final void x0(nnb nnbVar) {
        this.h = nnbVar;
    }

    final /* synthetic */ void y0() {
        this.a.K0();
        h u = this.a.u();
        if (u != null) {
            u.z();
        }
    }

    final /* synthetic */ void z0(boolean z, long j) {
        this.a.j0(z, j);
    }

    @Override // defpackage.onb
    public final ela zzd() {
        return this.B;
    }

    @Override // defpackage.onb
    public final void zzk() {
        ina inaVar = this.b;
        if (inaVar != null) {
            inaVar.c(10005);
        }
        this.N = true;
        this.n = 10004;
        this.r = "Page loaded delay cancel.";
        s0();
        this.a.destroy();
    }

    @Override // defpackage.onb
    public final void zzl() {
        synchronized (this.d) {
        }
        this.Q++;
        s0();
    }

    @Override // defpackage.onb
    public final void zzm() {
        this.Q--;
        s0();
    }

    @Override // defpackage.onb
    public final void zzr() {
        kdb kdbVar = this.L;
        if (kdbVar != null) {
            WebView A = this.a.A();
            if (k99.O(A)) {
                I(A, kdbVar, 10);
                return;
            }
            F();
            bmb bmbVar = new bmb(this, kdbVar);
            this.Z = bmbVar;
            ((View) this.a).addOnAttachStateChangeListener(bmbVar);
        }
    }

    @Override // defpackage.bgc
    public final void zzs() {
        bgc bgcVar = this.k;
        if (bgcVar != null) {
            bgcVar.zzs();
        }
    }
}

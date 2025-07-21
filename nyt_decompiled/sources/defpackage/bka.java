package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bka extends Thread {
    private boolean a;
    private boolean b;
    private final Object c;
    private final sja d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final String m;
    private final boolean n;
    private final boolean r;
    private final boolean s;

    public bka() {
        sja sjaVar = new sja();
        this.a = false;
        this.b = false;
        this.d = sjaVar;
        this.c = new Object();
        this.f = ((Long) ira.d.e()).intValue();
        this.g = ((Long) ira.a.e()).intValue();
        this.h = ((Long) ira.e.e()).intValue();
        this.i = ((Long) ira.c.e()).intValue();
        this.j = ((Integer) pla.c().a(mpa.S)).intValue();
        this.k = ((Integer) pla.c().a(mpa.T)).intValue();
        this.l = ((Integer) pla.c().a(mpa.U)).intValue();
        this.e = ((Long) ira.f.e()).intValue();
        this.m = (String) pla.c().a(mpa.W);
        this.n = ((Boolean) pla.c().a(mpa.X)).booleanValue();
        this.r = ((Boolean) pla.c().a(mpa.Y)).booleanValue();
        this.s = ((Boolean) pla.c().a(mpa.Z)).booleanValue();
        setName("ContentFetchTask");
    }

    public final rja a() {
        return this.d.a(this.s);
    }

    final aka b(View view, rja rjaVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    rjaVar.k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new aka(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof wlb)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    rjaVar.h();
                    webView.post(new zja(this, rjaVar, webView, globalVisibleRect));
                    return new aka(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    aka b = b(viewGroup.getChildAt(i3), rjaVar);
                    i += b.a;
                    i2 += b.b;
                }
                return new aka(this, i, i2);
            }
        }
        return new aka(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r11 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void c(android.view.View r11) {
        /*
            r10 = this;
            rja r9 = new rja     // Catch: java.lang.Exception -> L53
            int r1 = r10.f     // Catch: java.lang.Exception -> L53
            int r2 = r10.g     // Catch: java.lang.Exception -> L53
            int r3 = r10.h     // Catch: java.lang.Exception -> L53
            int r4 = r10.i     // Catch: java.lang.Exception -> L53
            int r5 = r10.j     // Catch: java.lang.Exception -> L53
            int r6 = r10.k     // Catch: java.lang.Exception -> L53
            int r7 = r10.l     // Catch: java.lang.Exception -> L53
            boolean r8 = r10.r     // Catch: java.lang.Exception -> L53
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L53
            wja r0 = defpackage.dyf.d()     // Catch: java.lang.Exception -> L53
            android.content.Context r0 = r0.b()     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.m     // Catch: java.lang.Exception -> L53
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L55
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L53
            zoa r2 = defpackage.mpa.V     // Catch: java.lang.Exception -> L53
            kpa r3 = defpackage.pla.c()     // Catch: java.lang.Exception -> L53
            java.lang.Object r2 = r3.a(r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L53
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.m     // Catch: java.lang.Exception -> L53
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L7a
            goto L55
        L53:
            r10 = move-exception
            goto L81
        L55:
            aka r11 = r10.b(r11, r9)     // Catch: java.lang.Exception -> L53
            r9.m()     // Catch: java.lang.Exception -> L53
            int r0 = r11.a     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L64
            int r0 = r11.b     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L7a
        L64:
            int r11 = r11.b     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L6f
            int r11 = r9.c()     // Catch: java.lang.Exception -> L53
            if (r11 == 0) goto L7a
            goto L71
        L6f:
            if (r11 != 0) goto L7b
        L71:
            sja r11 = r10.d     // Catch: java.lang.Exception -> L53
            boolean r11 = r11.d(r9)     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            sja r10 = r10.d     // Catch: java.lang.Exception -> L53
            r10.b(r9)     // Catch: java.lang.Exception -> L53
            return
        L81:
            java.lang.String r11 = "Exception in fetchContentOnUIThread"
            defpackage.fgb.e(r11, r10)
            java.lang.String r11 = "ContentFetchTask.fetchContent"
            kfb r0 = defpackage.dyf.q()
            r0.w(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bka.c(android.view.View):void");
    }

    final void d(rja rjaVar, WebView webView, String str, boolean z) {
        rjaVar.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.n || TextUtils.isEmpty(webView.getTitle())) {
                    rjaVar.l(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    rjaVar.l(webView.getTitle() + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (rjaVar.o()) {
                this.d.c(rjaVar);
            }
        } catch (JSONException unused) {
            fgb.b("Json string may be malformed.");
        } catch (Throwable th) {
            fgb.c("Failed to get webview content.", th);
            dyf.q().w(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.c) {
            try {
                if (this.a) {
                    fgb.b("Content hash thread already started, quitting...");
                } else {
                    this.a = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.c) {
            this.b = true;
            fgb.b("ContentFetchThread: paused, pause = true");
        }
    }

    public final void g() {
        synchronized (this.c) {
            this.b = false;
            this.c.notifyAll();
            fgb.b("ContentFetchThread: wakeup");
        }
    }

    public final boolean h() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = defpackage.dyf.d().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        defpackage.fgb.b("ContentFetchThread: no activity. Sleeping.");
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:
    
        defpackage.dyf.q().w(r0, "ContentFetchTask.extractContent");
        defpackage.fgb.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        defpackage.fgb.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c7, code lost:
    
        defpackage.fgb.e("Error in ContentFetchTask", r0);
        defpackage.dyf.q().w(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00de->B:16:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bka.run():void");
    }
}

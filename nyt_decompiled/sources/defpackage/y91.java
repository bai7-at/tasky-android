package defpackage;

import android.app.Application;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.a;
import defpackage.pg1;
import defpackage.sd5;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class y91 {
    private final Application a;
    private final Cache b;
    private final b04 c;
    private final so1 d;
    private final pg1 e;

    public y91(Application application, Cache cache, b04 b04Var, so1 so1Var) {
        zq3.h(application, "application");
        zq3.h(cache, "cache");
        zq3.h(b04Var, "okHttpClient");
        zq3.h(so1Var, "config");
        this.a = application;
        this.b = cache;
        this.c = b04Var;
        this.d = so1Var;
        pg1 a = new pg1.b(application).a();
        zq3.g(a, "build(...)");
        this.e = a;
    }

    private final boolean b(Uri uri) {
        String host = uri.getHost();
        return host != null && host.equals("nyt.simplecastaudio.com");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call d(y91 y91Var, Request request) {
        zq3.h(y91Var, "this$0");
        zq3.h(request, "it");
        return ((OkHttpClient) y91Var.c.get()).newCall(request);
    }

    private final String f(Uri uri) {
        return (uri == null || !b(uri)) ? this.d.i() : "NYTimes-Android";
    }

    public final a.InterfaceC0194a c(Uri uri) {
        sd5.b c = new sd5.b(new Call.Factory() { // from class: x91
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                Call d;
                d = y91.d(y91.this, request);
                return d;
            }
        }).d(f(uri)).c(this.e);
        zq3.g(c, "setTransferListener(...)");
        return c;
    }

    public final a.InterfaceC0194a e(Uri uri) {
        a.c e = new a.c().d(this.b).f(c(uri)).e(1);
        zq3.g(e, "setFlags(...)");
        return e;
    }
}

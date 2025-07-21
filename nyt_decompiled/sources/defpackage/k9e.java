package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class k9e {
    private nae a;
    private long b;
    private int c;

    public k9e() {
        b();
        this.a = new nae(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.a.get();
    }

    public final void b() {
        this.b = System.nanoTime();
        this.c = 1;
    }

    public void c() {
        this.a.clear();
    }

    public final void d(String str, long j) {
        if (j < this.b || this.c == 3) {
            return;
        }
        this.c = 3;
        d9e.a().g(a(), str);
    }

    public final void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        q9e.e(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        d9e.a().f(a(), jSONObject);
    }

    public final void f(String str, long j) {
        if (j >= this.b) {
            this.c = 2;
            d9e.a().g(a(), str);
        }
    }

    public void g(n8e n8eVar, m8e m8eVar) {
        h(n8eVar, m8eVar, null);
    }

    protected final void h(n8e n8eVar, m8e m8eVar, JSONObject jSONObject) {
        String h = n8eVar.h();
        JSONObject jSONObject2 = new JSONObject();
        q9e.e(jSONObject2, "environment", "app");
        q9e.e(jSONObject2, "adSessionType", m8eVar.d());
        JSONObject jSONObject3 = new JSONObject();
        q9e.e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        q9e.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        q9e.e(jSONObject3, "os", "Android");
        q9e.e(jSONObject2, "deviceInfo", jSONObject3);
        q9e.e(jSONObject2, "deviceCategory", p9e.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        q9e.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        q9e.e(jSONObject4, "partnerName", m8eVar.e().b());
        q9e.e(jSONObject4, "partnerVersion", m8eVar.e().c());
        q9e.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        q9e.e(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        q9e.e(jSONObject5, "appId", z8e.b().a().getApplicationContext().getPackageName());
        q9e.e(jSONObject2, "app", jSONObject5);
        if (m8eVar.f() != null) {
            q9e.e(jSONObject2, "contentUrl", m8eVar.f());
        }
        q9e.e(jSONObject2, "customReferenceData", m8eVar.g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it2 = m8eVar.h().iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
        d9e.a().h(a(), h, jSONObject2, jSONObject6, jSONObject);
    }

    public final void i(float f) {
        d9e.a().e(a(), f);
    }

    final void j(WebView webView) {
        this.a = new nae(webView);
    }

    public void k() {
    }

    public final boolean l() {
        return this.a.get() != 0;
    }
}

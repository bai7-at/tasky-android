package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i3g {
    private dfe f;
    private wlb c = null;
    private boolean e = false;
    private String a = null;
    private qee d = null;
    private String b = null;

    private final ffe l() {
        efe c = ffe.c();
        if (!((Boolean) pla.c().a(mpa.Ra)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                c.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.a(this.b);
        }
        return c.c();
    }

    private final void m() {
        if (this.f == null) {
            this.f = new y1g(this);
        }
    }

    public final synchronized void a(wlb wlbVar, Context context) {
        this.c = wlbVar;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        e("on_play_store_bind", hashMap);
    }

    public final void b() {
        qee qeeVar;
        if (!this.e || (qeeVar = this.d) == null) {
            pzc.k("LastMileDelivery not connected");
        } else {
            qeeVar.b(l(), this.f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        qee qeeVar;
        if (!this.e || (qeeVar = this.d) == null) {
            pzc.k("LastMileDelivery not connected");
            return;
        }
        oee c = pee.c();
        if (!((Boolean) pla.c().a(mpa.Ra)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                c.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.a(this.b);
        }
        qeeVar.a(c.c(), this.f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        pgb.e.execute(new Runnable() { // from class: n0g
            @Override // java.lang.Runnable
            public final void run() {
                i3g.this.h(str, map);
            }
        });
    }

    final void f(String str, String str2) {
        pzc.k(str);
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            e("onError", hashMap);
        }
    }

    public final void g() {
        qee qeeVar;
        if (!this.e || (qeeVar = this.d) == null) {
            pzc.k("LastMileDelivery not connected");
        } else {
            qeeVar.d(l(), this.f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(String str, Map map) {
        wlb wlbVar = this.c;
        if (wlbVar != null) {
            wlbVar.t(str, map);
        }
    }

    final void i(cfe cfeVar) {
        if (!TextUtils.isEmpty(cfeVar.b())) {
            if (!((Boolean) pla.c().a(mpa.Ra)).booleanValue()) {
                this.a = cfeVar.b();
            }
        }
        switch (cfeVar.a()) {
            case 8152:
                d("onLMDOverlayOpened");
                break;
            case 8153:
                d("onLMDOverlayClicked");
                break;
            case 8155:
                d("onLMDOverlayClose");
                break;
            case 8157:
                this.a = null;
                this.b = null;
                this.e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(cfeVar.a()));
                e("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    public final void j(wlb wlbVar, afe afeVar) {
        if (wlbVar == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.c = wlbVar;
        if (!this.e && !k(wlbVar.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) pla.c().a(mpa.Ra)).booleanValue()) {
            this.b = afeVar.g();
        }
        m();
        qee qeeVar = this.d;
        if (qeeVar != null) {
            qeeVar.c(afeVar, this.f);
        }
    }

    public final synchronized boolean k(Context context) {
        if (!wfe.a(context)) {
            return false;
        }
        try {
            this.d = ree.a(context);
        } catch (NullPointerException e) {
            pzc.k("Error connecting LMD Overlay service");
            dyf.q().w(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.d == null) {
            this.e = false;
            return false;
        }
        m();
        this.e = true;
        return true;
    }
}

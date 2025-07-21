package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class myc implements tof, mnb {
    private final Context a;
    private final zzcei b;
    private eyc c;
    private wlb d;
    private boolean e;
    private boolean f;
    private long g;
    private y5c h;
    private boolean i;

    myc(Context context, zzcei zzceiVar) {
        this.a = context;
        this.b = zzceiVar;
    }

    private final synchronized boolean g(y5c y5cVar) {
        if (!((Boolean) pla.c().a(mpa.N8)).booleanValue()) {
            fgb.g("Ad inspector had an internal error.");
            try {
                y5cVar.T1(w2e.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.c == null) {
            fgb.g("Ad inspector had an internal error.");
            try {
                dyf.q().w(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                y5cVar.T1(w2e.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.e && !this.f) {
            if (dyf.b().currentTimeMillis() >= this.g + ((Integer) pla.c().a(mpa.Q8)).intValue()) {
                return true;
            }
        }
        fgb.g("Ad inspector cannot be opened because it is already open.");
        try {
            y5cVar.T1(w2e.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // defpackage.tof
    public final void O() {
    }

    @Override // defpackage.tof
    public final synchronized void Q1(int i) {
        this.d.destroy();
        if (!this.i) {
            pzc.k("Inspector closed.");
            y5c y5cVar = this.h;
            if (y5cVar != null) {
                try {
                    y5cVar.T1(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f = false;
        this.e = false;
        this.g = 0L;
        this.i = false;
        this.h = null;
    }

    @Override // defpackage.tof
    public final void Y4() {
    }

    @Override // defpackage.mnb
    public final synchronized void a(boolean z, int i, String str, String str2) {
        if (z) {
            pzc.k("Ad inspector loaded.");
            this.e = true;
            f("");
            return;
        }
        fgb.g("Ad inspector failed to load.");
        try {
            dyf.q().w(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            y5c y5cVar = this.h;
            if (y5cVar != null) {
                y5cVar.T1(w2e.d(17, null, null));
            }
        } catch (RemoteException e) {
            dyf.q().w(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.i = true;
        this.d.destroy();
    }

    public final Activity b() {
        wlb wlbVar = this.d;
        if (wlbVar == null || wlbVar.y()) {
            return null;
        }
        return this.d.zzi();
    }

    public final void c(eyc eycVar) {
        this.c = eycVar;
    }

    final /* synthetic */ void d(String str) {
        JSONObject e = this.c.e();
        if (!TextUtils.isEmpty(str)) {
            try {
                e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.d.zzb("window.inspectorInfo", e.toString());
    }

    public final synchronized void e(y5c y5cVar, nya nyaVar, gya gyaVar) {
        if (g(y5cVar)) {
            try {
                dyf.B();
                wlb a = imb.a(this.a, unb.a(), "", false, false, null, null, this.b, null, null, null, ina.a(), null, null, null, null);
                this.d = a;
                onb zzN = a.zzN();
                if (zzN == null) {
                    fgb.g("Failed to obtain a web view for the ad inspector");
                    try {
                        dyf.q().w(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        y5cVar.T1(w2e.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        dyf.q().w(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.h = y5cVar;
                zzN.q0(null, null, null, null, null, false, null, null, null, null, null, null, null, null, nyaVar, null, new mya(this.a), gyaVar, null);
                zzN.N(this);
                this.d.loadUrl((String) pla.c().a(mpa.O8));
                dyf.k();
                thf.a(this.a, new AdOverlayInfoParcel(this, this.d, 1, this.b), true);
                this.g = dyf.b().currentTimeMillis();
            } catch (zzcjw e2) {
                fgb.h("Failed to obtain a web view for the ad inspector", e2);
                try {
                    dyf.q().w(e2, "InspectorUi.openInspector 0");
                    y5cVar.T1(w2e.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    dyf.q().w(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void f(final String str) {
        if (this.e && this.f) {
            pgb.e.execute(new Runnable() { // from class: lyc
                @Override // java.lang.Runnable
                public final void run() {
                    myc.this.d(str);
                }
            });
        }
    }

    @Override // defpackage.tof
    public final void h6() {
    }

    @Override // defpackage.tof
    public final synchronized void n4() {
        this.f = true;
        f("");
    }

    @Override // defpackage.tof
    public final void s4() {
    }
}

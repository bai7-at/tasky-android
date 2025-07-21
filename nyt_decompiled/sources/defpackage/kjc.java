package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kjc implements zkc {
    private bwb B;
    private final Context a;
    private final clc b;
    private final JSONObject c;
    private final cqc d;
    private final rkc e;
    private final gfa f;
    private final r7c g;
    private final u6c h;
    private final zfc i;
    private final v0e j;
    private final zzcei k;
    private final s1e l;
    private final gxb m;
    private final ylc n;
    private final Clock o;
    private final vfc p;
    private final d8e q;
    private final q7e r;
    private final l8d s;
    private boolean u;
    private boolean t = false;
    private boolean v = false;
    private boolean w = false;
    private Point x = new Point();
    private Point y = new Point();
    private long z = 0;
    private long A = 0;

    public kjc(Context context, clc clcVar, JSONObject jSONObject, cqc cqcVar, rkc rkcVar, gfa gfaVar, r7c r7cVar, u6c u6cVar, zfc zfcVar, v0e v0eVar, zzcei zzceiVar, s1e s1eVar, gxb gxbVar, ylc ylcVar, Clock clock, vfc vfcVar, d8e d8eVar, q7e q7eVar, l8d l8dVar) {
        this.a = context;
        this.b = clcVar;
        this.c = jSONObject;
        this.d = cqcVar;
        this.e = rkcVar;
        this.f = gfaVar;
        this.g = r7cVar;
        this.h = u6cVar;
        this.i = zfcVar;
        this.j = v0eVar;
        this.k = zzceiVar;
        this.l = s1eVar;
        this.m = gxbVar;
        this.n = ylcVar;
        this.o = clock;
        this.p = vfcVar;
        this.q = d8eVar;
        this.r = q7eVar;
        this.s = l8dVar;
    }

    private final String r(View view) {
        if (!((Boolean) pla.c().a(mpa.p3)).booleanValue()) {
            return null;
        }
        try {
            return this.f.c().zzh(this.a, view, null);
        } catch (Exception unused) {
            fgb.d("Exception getting data.");
            return null;
        }
    }

    private final String s(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int P = this.e.P();
        if (P == 1) {
            return "1099";
        }
        if (P == 2) {
            return "2099";
        }
        if (P != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean t(String str) {
        JSONObject optJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean u() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean w(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) pla.c().a(mpa.p3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.a;
            JSONObject jSONObject7 = new JSONObject();
            dyf.r();
            DisplayMetrics U = wxf.U((WindowManager) context.getSystemService("window"));
            gjc gjcVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                jSONObject7.put("width", kia.b().e(context, U.widthPixels));
                jSONObject7.put("height", kia.b().e(context, U.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) pla.c().a(mpa.t8)).booleanValue()) {
                this.d.i("/clickRecorded", new hjc(this, gjcVar));
            } else {
                this.d.i("/logScionEvent", new fjc(this, objArr == true ? 1 : 0));
            }
            this.d.i("/nativeImpression", new jjc(this, objArr2 == true ? 1 : 0));
            sgb.a(this.d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.t) {
                return true;
            }
            this.t = dyf.u().n(this.a, this.k.zza, this.j.D.toString(), this.l.f);
            return true;
        } catch (JSONException e) {
            fgb.e("Unable to create impression JSON.", e);
            return false;
        }
    }

    protected final void B(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.b.c(this.e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.P());
            jSONObject8.put("view_aware_api_used", z);
            zzbjb zzbjbVar = this.l.i;
            jSONObject8.put("custom_mute_requested", zzbjbVar != null && zzbjbVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.e.h().isEmpty() || this.e.X() == null) ? false : true);
            if (this.n.a() != null && this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.o.currentTimeMillis());
            if (this.w && u()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.b.c(this.e.a()) != null);
            try {
                JSONObject optJSONObject = this.c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f.c().c(this.a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                fgb.e("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) pla.c().a(mpa.z4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) pla.c().a(mpa.x8)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) pla.c().a(mpa.y8)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.o.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.z);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.A);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.j.j0) {
                JSONObject jSONObject10 = (JSONObject) this.c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.s.E6(string, this.e);
                }
            }
            sgb.a(this.d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            fgb.e("Unable to create click JSON.", e2);
        }
    }

    @Override // defpackage.zkc
    public final void a() {
        this.w = true;
    }

    @Override // defpackage.zkc
    public final void b(View view, MotionEvent motionEvent, View view2) {
        this.x = l9b.a(motionEvent, view2);
        long currentTimeMillis = this.o.currentTimeMillis();
        this.A = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.z = currentTimeMillis;
            this.y = this.x;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.x;
        obtain.setLocation(point.x, point.y);
        this.f.d(obtain);
        obtain.recycle();
    }

    @Override // defpackage.zkc
    public final void c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        w(l9b.g(context, view), l9b.d(context, map, map2, view, scaleType), l9b.f(view), l9b.e(context, view), r(view), null, l9b.h(context, this.j));
    }

    @Override // defpackage.zkc
    public final void d(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        View view3 = view2;
        Context context = this.a;
        JSONObject d = l9b.d(context, map, map2, view2, scaleType);
        JSONObject g = l9b.g(context, view2);
        JSONObject f = l9b.f(view2);
        JSONObject e = l9b.e(context, view2);
        String s = s(view, map);
        JSONObject c = l9b.c(s, context, this.y, this.x);
        if (true != ((Boolean) pla.c().a(mpa.w3)).booleanValue()) {
            view3 = view;
        }
        B(view3, g, d, f, e, s, c, null, z, false);
    }

    @Override // defpackage.zkc
    public final void e(Bundle bundle) {
        if (bundle == null) {
            fgb.b("Click data is null. No click is reported.");
        } else if (!t("click_reporting")) {
            fgb.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            B(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, kia.b().l(bundle, null), false, false);
        }
    }

    @Override // defpackage.zkc
    public final void f(bwb bwbVar) {
        this.B = bwbVar;
    }

    @Override // defpackage.zkc
    public final void g(mva mvaVar) {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.c(mvaVar);
        } else {
            fgb.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // defpackage.zkc
    public final void h(View view, Map map) {
        this.x = new Point();
        this.y = new Point();
        if (view != null) {
            this.p.N0(view);
        }
        this.u = false;
    }

    @Override // defpackage.zkc
    public final boolean i(Bundle bundle) {
        if (t("impression_reporting")) {
            return w(null, null, null, null, ((Boolean) pla.c().a(mpa.Pa)).booleanValue() ? r(null) : null, kia.b().l(bundle, null), false);
        }
        fgb.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // defpackage.zkc
    public final void j(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            fgb.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ylc ylcVar = this.n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(ylcVar);
        view.setClickable(true);
        ylcVar.g = new WeakReference(view);
    }

    @Override // defpackage.zkc
    public final void k(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.x = new Point();
        this.y = new Point();
        if (!this.u) {
            this.p.M0(view);
            this.u = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.m.k(this);
        boolean i = l9b.i(this.k.zzc);
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null) {
                    if (i) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it3 = map2.entrySet().iterator();
            while (it3.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it3.next()).getValue()).get();
                if (view3 != null) {
                    if (i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // defpackage.zkc
    public final void l(Bundle bundle) {
        if (bundle == null) {
            fgb.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!t("touch_reporting")) {
            fgb.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f.c().zzl((int) bundle.getFloat(QueryKeys.SCROLL_POSITION_TOP), (int) bundle.getFloat(QueryKeys.CONTENT_HEIGHT), bundle.getInt("duration_ms"));
    }

    @Override // defpackage.zkc
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject d = l9b.d(context, map, map2, view, scaleType);
        JSONObject g = l9b.g(context, view);
        JSONObject f = l9b.f(view);
        JSONObject e = l9b.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", g);
            jSONObject.put("scroll_view_signal", f);
            jSONObject.put("lock_screen_signal", e);
            return jSONObject;
        } catch (JSONException e2) {
            fgb.e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    @Override // defpackage.zkc
    public final void n(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) pla.c().a(mpa.Ua)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.w) {
                fgb.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!u()) {
                fgb.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject d = l9b.d(this.a, map, map2, view2, scaleType);
        JSONObject g = l9b.g(this.a, view2);
        JSONObject f = l9b.f(view2);
        JSONObject e = l9b.e(this.a, view2);
        String s = s(view, map);
        JSONObject c = l9b.c(s, this.a, this.y, this.x);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.c;
                Point point = this.y;
                Point point2 = this.x;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put(QueryKeys.SCROLL_POSITION_TOP, point.x);
                            jSONObject3.put(QueryKeys.CONTENT_HEIGHT, point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put(QueryKeys.SCROLL_POSITION_TOP, point2.x);
                            jSONObject4.put(QueryKeys.CONTENT_HEIGHT, point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e2) {
                        e = e2;
                        fgb.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        B(view2, g, d, f, e, s, c, null, z, true);
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e4) {
                fgb.e("Error occurred while adding CustomClickGestureSignals to adJson.", e4);
                dyf.q().w(e4, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        B(view2, g, d, f, e, s, c, null, z, true);
    }

    @Override // defpackage.zkc
    public final boolean o() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) pla.c().a(mpa.Ua)).booleanValue()) {
            return this.l.i.zzj;
        }
        return true;
    }

    @Override // defpackage.zkc
    public final void p(m0c m0cVar) {
        try {
            if (this.v) {
                return;
            }
            if (m0cVar == null) {
                rkc rkcVar = this.e;
                if (rkcVar.X() != null) {
                    this.v = true;
                    this.q.c(rkcVar.X().zzf(), this.r);
                    zzg();
                    return;
                }
            }
            this.v = true;
            this.q.c(m0cVar.zzf(), this.r);
            zzg();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zkc
    public final JSONObject q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject m = m(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.w && u()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (m != null) {
                jSONObject.put("nas", m);
            }
        } catch (JSONException e) {
            fgb.e("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // defpackage.zkc
    public final boolean v() {
        return u();
    }

    @Override // defpackage.zkc
    public final void x(String str) {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // defpackage.zkc
    public final int zza() {
        if (this.l.i == null) {
            return 0;
        }
        if (((Boolean) pla.c().a(mpa.Ua)).booleanValue()) {
            return this.l.i.zzi;
        }
        return 0;
    }

    @Override // defpackage.zkc
    public final void zzg() {
        try {
            bwb bwbVar = this.B;
            if (bwbVar != null) {
                bwbVar.zze();
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.zkc
    public final void zzh() {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.b();
        }
    }

    @Override // defpackage.zkc
    public final void zzi() {
        this.d.f();
    }

    @Override // defpackage.zkc
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            sgb.a(this.d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            fgb.e("", e);
        }
    }

    @Override // defpackage.zkc
    public final void zzr() {
        w(null, null, null, null, null, null, false);
    }
}

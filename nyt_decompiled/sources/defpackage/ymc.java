package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ymc implements zkc {
    private final c4b a;
    private final r7c b;
    private final u6c c;
    private final zfc d;
    private final Context e;
    private final v0e f;
    private final zzcei g;
    private final s1e h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = true;
    private final y3b l;
    private final z3b m;

    public ymc(y3b y3bVar, z3b z3bVar, c4b c4bVar, r7c r7cVar, u6c u6cVar, zfc zfcVar, Context context, v0e v0eVar, zzcei zzceiVar, s1e s1eVar) {
        this.l = y3bVar;
        this.m = z3bVar;
        this.a = c4bVar;
        this.b = r7cVar;
        this.c = u6cVar;
        this.d = zfcVar;
        this.e = context;
        this.f = v0eVar;
        this.g = zzceiVar;
        this.h = s1eVar;
    }

    private final void r(View view) {
        try {
            c4b c4bVar = this.a;
            if (c4bVar != null && !c4bVar.o()) {
                this.a.X5(fc5.l3(view));
                this.c.v();
                if (((Boolean) pla.c().a(mpa.ma)).booleanValue()) {
                    this.d.zzs();
                    return;
                }
                return;
            }
            y3b y3bVar = this.l;
            if (y3bVar != null && !y3bVar.A6()) {
                this.l.x6(fc5.l3(view));
                this.c.v();
                if (((Boolean) pla.c().a(mpa.ma)).booleanValue()) {
                    this.d.zzs();
                    return;
                }
                return;
            }
            z3b z3bVar = this.m;
            if (z3bVar == null || z3bVar.a()) {
                return;
            }
            this.m.x6(fc5.l3(view));
            this.c.v();
            if (((Boolean) pla.c().a(mpa.ma)).booleanValue()) {
                this.d.zzs();
            }
        } catch (RemoteException e) {
            fgb.h("Failed to call handleClick", e);
        }
    }

    private static final HashMap s(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            hashMap.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hashMap;
    }

    @Override // defpackage.zkc
    public final void a() {
        this.j = true;
    }

    @Override // defpackage.zkc
    public final void b(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // defpackage.zkc
    public final void c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.i) {
                this.i = dyf.u().n(this.e, this.g.zza, this.f.D.toString(), this.h.f);
            }
            if (this.k) {
                c4b c4bVar = this.a;
                if (c4bVar != null && !c4bVar.v()) {
                    this.a.e();
                    this.b.zza();
                    return;
                }
                y3b y3bVar = this.l;
                if (y3bVar != null && !y3bVar.B6()) {
                    this.l.g();
                    this.b.zza();
                    return;
                }
                z3b z3bVar = this.m;
                if (z3bVar == null || z3bVar.B6()) {
                    return;
                }
                this.m.zzr();
                this.b.zza();
            }
        } catch (RemoteException e) {
            fgb.h("Failed to call recordImpression", e);
        }
    }

    @Override // defpackage.zkc
    public final void d(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.j && this.f.M) {
            return;
        }
        r(view);
    }

    @Override // defpackage.zkc
    public final void e(Bundle bundle) {
    }

    @Override // defpackage.zkc
    public final void f(bwb bwbVar) {
        fgb.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.zkc
    public final void g(mva mvaVar) {
    }

    @Override // defpackage.zkc
    public final void h(View view, Map map) {
        try {
            ee3 l3 = fc5.l3(view);
            c4b c4bVar = this.a;
            if (c4bVar != null) {
                c4bVar.j5(l3);
                return;
            }
            y3b y3bVar = this.l;
            if (y3bVar != null) {
                y3bVar.X5(l3);
                return;
            }
            z3b z3bVar = this.m;
            if (z3bVar != null) {
                z3bVar.A6(l3);
            }
        } catch (RemoteException e) {
            fgb.h("Failed to call untrackView", e);
        }
    }

    @Override // defpackage.zkc
    public final boolean i(Bundle bundle) {
        return false;
    }

    @Override // defpackage.zkc
    public final void j(View view) {
    }

    @Override // defpackage.zkc
    public final void k(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ee3 zzn;
        try {
            ee3 l3 = fc5.l3(view);
            JSONObject jSONObject = this.f.k0;
            boolean z = true;
            if (((Boolean) pla.c().a(mpa.x1)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) pla.c().a(mpa.y1)).booleanValue() && next.equals("3010")) {
                                c4b c4bVar = this.a;
                                Object obj2 = null;
                                if (c4bVar != null) {
                                    try {
                                        zzn = c4bVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    y3b y3bVar = this.l;
                                    if (y3bVar != null) {
                                        zzn = y3bVar.v6();
                                    } else {
                                        z3b z3bVar = this.m;
                                        zzn = z3bVar != null ? z3bVar.h6() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = fc5.Q1(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                t6b.c(optJSONArray, arrayList);
                                dyf.r();
                                ClassLoader classLoader = this.e.getClassLoader();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (Class.forName((String) it2.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.k = z;
            HashMap s = s(map);
            HashMap s2 = s(map2);
            c4b c4bVar2 = this.a;
            if (c4bVar2 != null) {
                c4bVar2.N3(l3, fc5.l3(s), fc5.l3(s2));
                return;
            }
            y3b y3bVar2 = this.l;
            if (y3bVar2 != null) {
                y3bVar2.z6(l3, fc5.l3(s), fc5.l3(s2));
                this.l.y6(l3);
                return;
            }
            z3b z3bVar2 = this.m;
            if (z3bVar2 != null) {
                z3bVar2.z6(l3, fc5.l3(s), fc5.l3(s2));
                this.m.y6(l3);
            }
        } catch (RemoteException e) {
            fgb.h("Failed to call trackView", e);
        }
    }

    @Override // defpackage.zkc
    public final void l(Bundle bundle) {
    }

    @Override // defpackage.zkc
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.zkc
    public final void n(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.j) {
            fgb.g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f.M) {
            r(view2);
        } else {
            fgb.g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // defpackage.zkc
    public final boolean o() {
        return true;
    }

    @Override // defpackage.zkc
    public final void p(m0c m0cVar) {
        fgb.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.zkc
    public final JSONObject q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.zkc
    public final boolean v() {
        return this.f.M;
    }

    @Override // defpackage.zkc
    public final void x(String str) {
    }

    @Override // defpackage.zkc
    public final int zza() {
        return 0;
    }

    @Override // defpackage.zkc
    public final void zzg() {
        throw null;
    }

    @Override // defpackage.zkc
    public final void zzh() {
    }

    @Override // defpackage.zkc
    public final void zzi() {
    }

    @Override // defpackage.zkc
    public final void zzp() {
    }

    @Override // defpackage.zkc
    public final void zzr() {
    }
}

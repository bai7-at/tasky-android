package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.a;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import defpackage.au0;
import defpackage.bc8;
import defpackage.cy0;
import defpackage.fl1;
import defpackage.gj2;
import defpackage.hi2;
import defpackage.ij2;
import defpackage.jj2;
import defpackage.og8;
import defpackage.rh2;
import defpackage.uh2;
import defpackage.vg8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {
    public static final byte[] l = new byte[0];
    private final Context a;
    private final uh2 b;
    private final rh2 c;
    private final Executor d;
    private final com.google.firebase.remoteconfig.internal.a e;
    private final com.google.firebase.remoteconfig.internal.a f;
    private final com.google.firebase.remoteconfig.internal.a g;
    private final com.google.firebase.remoteconfig.internal.c h;
    private final au0 i;
    private final d j;
    private final hi2 k;

    a(Context context, uh2 uh2Var, hi2 hi2Var, rh2 rh2Var, Executor executor, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2, com.google.firebase.remoteconfig.internal.a aVar3, com.google.firebase.remoteconfig.internal.c cVar, au0 au0Var, d dVar) {
        this.a = context;
        this.b = uh2Var;
        this.k = hi2Var;
        this.c = rh2Var;
        this.d = executor;
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = cVar;
        this.i = au0Var;
        this.j = dVar;
    }

    public static a i() {
        return j(uh2.k());
    }

    public static a j(uh2 uh2Var) {
        return ((c) uh2Var.i(c.class)).e();
    }

    private static boolean l(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return bVar2 == null || !bVar.e().equals(bVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 m(og8 og8Var, og8 og8Var2, og8 og8Var3) {
        if (!og8Var.q() || og8Var.m() == null) {
            return vg8.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) og8Var.m();
        return (!og8Var2.q() || l(bVar, (com.google.firebase.remoteconfig.internal.b) og8Var2.m())) ? this.f.k(bVar).i(this.d, new cy0() { // from class: fj2
            @Override // defpackage.cy0
            public final Object then(og8 og8Var4) {
                boolean q;
                q = a.this.q(og8Var4);
                return Boolean.valueOf(q);
            }
        }) : vg8.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ og8 n(c.a aVar) {
        return vg8.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void o(ij2 ij2Var) {
        this.j.h(ij2Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ og8 p(com.google.firebase.remoteconfig.internal.b bVar) {
        return vg8.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(og8 og8Var) {
        if (!og8Var.q()) {
            return false;
        }
        this.e.d();
        if (og8Var.m() != null) {
            w(((com.google.firebase.remoteconfig.internal.b) og8Var.m()).c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    private og8 t(Map map) {
        try {
            return this.g.k(com.google.firebase.remoteconfig.internal.b.g().b(map).a()).r(new bc8() { // from class: bj2
                @Override // defpackage.bc8
                public final og8 then(Object obj) {
                    og8 p;
                    p = a.p((b) obj);
                    return p;
                }
            });
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            return vg8.e(null);
        }
    }

    static List v(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public og8 f() {
        final og8 e = this.e.e();
        final og8 e2 = this.f.e();
        return vg8.i(e, e2).k(this.d, new cy0() { // from class: dj2
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                og8 m;
                m = a.this.m(e, e2, og8Var);
                return m;
            }
        });
    }

    public og8 g(long j) {
        return this.h.h(j).r(new bc8() { // from class: ej2
            @Override // defpackage.bc8
            public final og8 then(Object obj) {
                og8 n;
                n = a.n((c.a) obj);
                return n;
            }
        });
    }

    public gj2 h() {
        return this.j.c();
    }

    public jj2 k(String str) {
        return this.i.f(str);
    }

    public og8 r(final ij2 ij2Var) {
        return vg8.c(this.d, new Callable() { // from class: cj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void o;
                o = a.this.o(ij2Var);
                return o;
            }
        });
    }

    public og8 s(int i) {
        return t(fl1.a(this.a, i));
    }

    void u() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    void w(JSONArray jSONArray) {
        if (this.c == null) {
            return;
        }
        try {
            this.c.k(v(jSONArray));
        } catch (AbtException e) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
        }
    }
}

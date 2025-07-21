package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fae implements f9e {
    private static final fae i = new fae();
    private static final Handler j = new Handler(Looper.getMainLooper());
    private static Handler k = null;
    private static final Runnable l = new bae();
    private static final Runnable m = new eae();
    private int b;
    private long h;
    private final List a = new ArrayList();
    private boolean c = false;
    private final List d = new ArrayList();
    private final y9e f = new y9e();
    private final h9e e = new h9e();
    private final z9e g = new z9e(new iae());

    fae() {
    }

    public static fae d() {
        return i;
    }

    static /* bridge */ /* synthetic */ void g(fae faeVar) {
        faeVar.b = 0;
        faeVar.d.clear();
        faeVar.c = false;
        for (n8e n8eVar : v8e.a().b()) {
        }
        faeVar.h = System.nanoTime();
        faeVar.f.i();
        long nanoTime = System.nanoTime();
        g9e a = faeVar.e.a();
        if (faeVar.f.e().size() > 0) {
            Iterator it2 = faeVar.f.e().iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                JSONObject zza = a.zza(null);
                View a2 = faeVar.f.a(str);
                g9e b = faeVar.e.b();
                String c = faeVar.f.c(str);
                if (c != null) {
                    JSONObject zza2 = b.zza(a2);
                    q9e.b(zza2, str);
                    try {
                        zza2.put("notVisibleReason", c);
                    } catch (JSONException e) {
                        r9e.a("Error with setting not visible reason", e);
                    }
                    q9e.c(zza, zza2);
                }
                q9e.f(zza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                faeVar.g.c(zza, hashSet, nanoTime);
            }
        }
        if (faeVar.f.f().size() > 0) {
            JSONObject zza3 = a.zza(null);
            faeVar.k(null, a, zza3, 1, false);
            q9e.f(zza3);
            faeVar.g.d(zza3, faeVar.f.f(), nanoTime);
        } else {
            faeVar.g.b();
        }
        faeVar.f.g();
        long nanoTime2 = System.nanoTime() - faeVar.h;
        if (faeVar.a.size() > 0) {
            Iterator it3 = faeVar.a.iterator();
            if (it3.hasNext()) {
                lh4.a(it3.next());
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw null;
            }
        }
    }

    private final void k(View view, g9e g9eVar, JSONObject jSONObject, int i2, boolean z) {
        g9eVar.a(view, jSONObject, this, i2 == 1, z);
    }

    private static final void l() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    @Override // defpackage.f9e
    public final void a(View view, g9e g9eVar, JSONObject jSONObject, boolean z) {
        int k2;
        boolean z2;
        if (w9e.a(view) != null || (k2 = this.f.k(view)) == 3) {
            return;
        }
        JSONObject zza = g9eVar.zza(view);
        q9e.c(jSONObject, zza);
        String d = this.f.d(view);
        if (d != null) {
            q9e.b(zza, d);
            try {
                zza.put("hasWindowFocus", Boolean.valueOf(this.f.j(view)));
            } catch (JSONException e) {
                r9e.a("Error with setting has window focus", e);
            }
            this.f.h();
        } else {
            x9e b = this.f.b(view);
            if (b != null) {
                y8e a = b.a();
                JSONArray jSONArray = new JSONArray();
                ArrayList b2 = b.b();
                int size = b2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) b2.get(i2));
                }
                try {
                    zza.put("isFriendlyObstructionFor", jSONArray);
                    zza.put("friendlyObstructionClass", a.d());
                    zza.put("friendlyObstructionPurpose", a.a());
                    zza.put("friendlyObstructionReason", a.c());
                } catch (JSONException e2) {
                    r9e.a("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            k(view, g9eVar, zza, k2, z || z2);
        }
        this.b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    public final void j() {
        l();
        this.a.clear();
        j.post(new aae(this));
    }
}

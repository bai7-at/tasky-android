package defpackage;

import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class odd {
    private final Clock a;
    private final qdd b;
    private final d8e c;
    private final LinkedHashMap d = new LinkedHashMap();
    private final boolean e = ((Boolean) pla.c().a(mpa.S6)).booleanValue();
    private final k9d f;
    private boolean g;
    private long h;
    private long i;

    public odd(Clock clock, qdd qddVar, k9d k9dVar, d8e d8eVar) {
        this.a = clock;
        this.b = qddVar;
        this.f = k9dVar;
        this.c = d8eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean q(v0e v0eVar) {
        ndd nddVar = (ndd) this.d.get(v0eVar);
        if (nddVar == null) {
            return false;
        }
        return nddVar.c == 8;
    }

    public final synchronized long a() {
        return this.h;
    }

    final synchronized j64 f(g1e g1eVar, v0e v0eVar, j64 j64Var, z7e z7eVar) {
        y0e y0eVar = g1eVar.b.b;
        long elapsedRealtime = this.a.elapsedRealtime();
        String str = v0eVar.x;
        if (str != null) {
            this.d.put(v0eVar, new ndd(str, v0eVar.g0, 9, 0L, null));
            zb.r(j64Var, new mdd(this, elapsedRealtime, y0eVar, v0eVar, str, z7eVar, g1eVar), pgb.f);
        }
        return j64Var;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it2 = this.d.entrySet().iterator();
            while (it2.hasNext()) {
                ndd nddVar = (ndd) ((Map.Entry) it2.next()).getValue();
                if (nddVar.c != Integer.MAX_VALUE) {
                    arrayList.add(nddVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join(QueryKeys.END_MARKER, arrayList);
    }

    public final synchronized void i(v0e v0eVar) {
        try {
            this.h = this.a.elapsedRealtime() - this.i;
            if (v0eVar != null) {
                this.f.e(v0eVar);
            }
            this.g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.h = this.a.elapsedRealtime() - this.i;
    }

    public final synchronized void k(List list) {
        this.i = this.a.elapsedRealtime();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            v0e v0eVar = (v0e) it2.next();
            if (!TextUtils.isEmpty(v0eVar.x)) {
                this.d.put(v0eVar, new ndd(v0eVar.x, v0eVar.g0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.i = this.a.elapsedRealtime();
    }

    public final synchronized void m(v0e v0eVar) {
        ndd nddVar = (ndd) this.d.get(v0eVar);
        if (nddVar == null || this.g) {
            return;
        }
        nddVar.c = 8;
    }
}

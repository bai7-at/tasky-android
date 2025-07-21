package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.nc;
import com.google.android.gms.internal.ads.zzeml;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class wcd {
    private final nc c;
    private pdd f;
    private final String h;
    private final int i;
    private final odd j;
    private v0e k;
    private final Map a = new HashMap();
    private final List b = new ArrayList();
    private final List d = new ArrayList();
    private final Set e = new HashSet();
    private int g = Integer.MAX_VALUE;

    wcd(g1e g1eVar, odd oddVar, nc ncVar) {
        this.i = g1eVar.b.b.p;
        this.j = oddVar;
        this.c = ncVar;
        this.h = udd.b(g1eVar);
        List list = g1eVar.b.a;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((v0e) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    private final synchronized void f() {
        this.j.i(this.k);
        pdd pddVar = this.f;
        if (pddVar != null) {
            this.c.f(pddVar);
        } else {
            this.c.g(new zzeml(3, this.h));
        }
    }

    private final synchronized boolean g(boolean z) {
        try {
            for (v0e v0eVar : this.b) {
                Integer num = (Integer) this.a.get(v0eVar);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.e.contains(v0eVar.t0)) {
                    int i = this.g;
                    if (intValue < i) {
                        return true;
                    }
                    if (intValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean h() {
        try {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) this.a.get((v0e) it2.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean i() {
        if (!g(true)) {
            if (!h()) {
                return false;
            }
        }
        return true;
    }

    final synchronized v0e a() {
        for (int i = 0; i < this.b.size(); i++) {
            try {
                v0e v0eVar = (v0e) this.b.get(i);
                String str = v0eVar.t0;
                if (!this.e.contains(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        this.e.add(str);
                    }
                    this.d.add(v0eVar);
                    return (v0e) this.b.remove(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    final synchronized void b(Throwable th, v0e v0eVar) {
        this.d.remove(v0eVar);
        this.e.remove(v0eVar.t0);
        if (d() || i()) {
            return;
        }
        f();
    }

    final synchronized void c(pdd pddVar, v0e v0eVar) {
        this.d.remove(v0eVar);
        if (d()) {
            pddVar.zzq();
            return;
        }
        Integer num = (Integer) this.a.get(v0eVar);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.g) {
            this.j.m(v0eVar);
            return;
        }
        if (this.f != null) {
            this.j.m(this.k);
        }
        this.g = intValue;
        this.f = pddVar;
        this.k = v0eVar;
        if (i()) {
            return;
        }
        f();
    }

    final synchronized boolean d() {
        return this.c.isDone();
    }

    final synchronized boolean e() {
        if (!d()) {
            List list = this.d;
            if (list.size() < this.i) {
                if (g(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}

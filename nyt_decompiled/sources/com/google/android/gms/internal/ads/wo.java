package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import defpackage.a0g;
import defpackage.b0g;
import defpackage.cza;
import defpackage.ezd;
import defpackage.f6f;
import defpackage.hpf;
import defpackage.khe;
import defpackage.kod;
import defpackage.n1c;
import defpackage.ozf;
import defpackage.qgf;
import defpackage.s2g;
import defpackage.s7g;
import defpackage.sef;
import defpackage.uzf;
import defpackage.wad;
import defpackage.xzf;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class wo {
    private final hpf a;
    private final sef e;
    private final qgf h;
    private final kod i;
    private boolean j;
    private f6f k;
    private s2g l = new s2g(0);
    private final IdentityHashMap c = new IdentityHashMap();
    private final Map d = new HashMap();
    private final List b = new ArrayList();
    private final HashMap f = new HashMap();
    private final Set g = new HashSet();

    public wo(sef sefVar, qgf qgfVar, kod kodVar, hpf hpfVar) {
        this.a = hpfVar;
        this.e = sefVar;
        this.h = qgfVar;
        this.i = kodVar;
    }

    private final void q(int i, int i2) {
        while (i < this.b.size()) {
            ((vo) this.b.get(i)).d += i2;
            i++;
        }
    }

    private final void r(vo voVar) {
        uo uoVar = (uo) this.f.get(voVar);
        if (uoVar != null) {
            uoVar.a.e(uoVar.b);
        }
    }

    private final void s() {
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            vo voVar = (vo) it2.next();
            if (voVar.c.isEmpty()) {
                r(voVar);
                it2.remove();
            }
        }
    }

    private final void t(vo voVar) {
        if (voVar.e && voVar.c.isEmpty()) {
            uo uoVar = (uo) this.f.remove(voVar);
            uoVar.getClass();
            uoVar.a.m(uoVar.b);
            uoVar.a.n(uoVar.c);
            uoVar.a.c(uoVar.c);
            this.g.remove(voVar);
        }
    }

    private final void u(vo voVar) {
        uzf uzfVar = voVar.a;
        a0g a0gVar = new a0g() { // from class: com.google.android.gms.internal.ads.no
            @Override // defpackage.a0g
            public final void a(b0g b0gVar, n1c n1cVar) {
                wo.this.f(b0gVar, n1cVar);
            }
        };
        to toVar = new to(this, voVar);
        this.f.put(voVar, new uo(uzfVar, a0gVar, toVar));
        uzfVar.g(new Handler(khe.M(), null), toVar);
        uzfVar.k(new Handler(khe.M(), null), toVar);
        uzfVar.i(a0gVar, this.k, this.a);
    }

    private final void v(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            vo voVar = (vo) this.b.remove(i2);
            this.d.remove(voVar.b);
            q(i2, -voVar.a.J().c());
            voVar.e = true;
            if (this.j) {
                t(voVar);
            }
        }
    }

    public final int a() {
        return this.b.size();
    }

    public final n1c b() {
        if (this.b.isEmpty()) {
            return n1c.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            vo voVar = (vo) this.b.get(i2);
            voVar.d = i;
            i += voVar.a.J().c();
        }
        return new zo(this.b, this.l);
    }

    public final n1c c(int i, int i2, List list) {
        wad.d(i >= 0 && i <= i2 && i2 <= a());
        wad.d(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((vo) this.b.get(i3)).a.h((cza) list.get(i3 - i));
        }
        return b();
    }

    final /* synthetic */ void f(b0g b0gVar, n1c n1cVar) {
        this.e.zzh();
    }

    public final void g(f6f f6fVar) {
        wad.f(!this.j);
        this.k = f6fVar;
        for (int i = 0; i < this.b.size(); i++) {
            vo voVar = (vo) this.b.get(i);
            u(voVar);
            this.g.add(voVar);
        }
        this.j = true;
    }

    public final void h() {
        for (uo uoVar : this.f.values()) {
            try {
                uoVar.a.m(uoVar.b);
            } catch (RuntimeException e) {
                ezd.d("MediaSourceList", "Failed to release child source.", e);
            }
            uoVar.a.n(uoVar.c);
            uoVar.a.c(uoVar.c);
        }
        this.f.clear();
        this.g.clear();
        this.j = false;
    }

    public final void i(xzf xzfVar) {
        vo voVar = (vo) this.c.remove(xzfVar);
        voVar.getClass();
        voVar.a.j(xzfVar);
        voVar.c.remove(((ozf) xzfVar).a);
        if (!this.c.isEmpty()) {
            s();
        }
        t(voVar);
    }

    public final boolean j() {
        return this.j;
    }

    public final n1c k(int i, List list, s2g s2gVar) {
        if (!list.isEmpty()) {
            this.l = s2gVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                vo voVar = (vo) list.get(i2 - i);
                if (i2 > 0) {
                    vo voVar2 = (vo) this.b.get(i2 - 1);
                    voVar.a(voVar2.d + voVar2.a.J().c());
                } else {
                    voVar.a(0);
                }
                q(i2, voVar.a.J().c());
                this.b.add(i2, voVar);
                this.d.put(voVar.b, voVar);
                if (this.j) {
                    u(voVar);
                    if (this.c.isEmpty()) {
                        this.g.add(voVar);
                    } else {
                        r(voVar);
                    }
                }
            }
        }
        return b();
    }

    public final n1c l(int i, int i2, s2g s2gVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= a()) {
            z = true;
        }
        wad.d(z);
        this.l = s2gVar;
        v(i, i2);
        return b();
    }

    public final n1c m(List list, s2g s2gVar) {
        v(0, this.b.size());
        return k(this.b.size(), list, s2gVar);
    }

    public final n1c n(s2g s2gVar) {
        int a = a();
        if (s2gVar.c() != a) {
            s2gVar = s2gVar.f().g(0, a);
        }
        this.l = s2gVar;
        return b();
    }

    public final xzf o(zzf zzfVar, s7g s7gVar, long j) {
        int i = zo.o;
        Object obj = zzfVar.a;
        Object obj2 = ((Pair) obj).first;
        zzf a = zzfVar.a(((Pair) obj).second);
        vo voVar = (vo) this.d.get(obj2);
        voVar.getClass();
        this.g.add(voVar);
        uo uoVar = (uo) this.f.get(voVar);
        if (uoVar != null) {
            uoVar.a.f(uoVar.b);
        }
        voVar.c.add(a);
        ozf l = voVar.a.l(a, s7gVar, j);
        this.c.put(l, voVar);
        s();
        return l;
    }

    public final s2g p() {
        return this.l;
    }
}

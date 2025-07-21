package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DecodeJob;
import defpackage.b12;
import defpackage.cx8;
import defpackage.cz6;
import defpackage.ov3;
import defpackage.rr1;
import defpackage.sk5;
import defpackage.to;
import defpackage.tr1;
import defpackage.wz6;
import defpackage.xq8;
import defpackage.yu4;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class f {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private com.bumptech.glide.c c;
    private Object d;
    private int e;
    private int f;
    private Class g;
    private DecodeJob.e h;
    private sk5 i;
    private Map j;
    private Class k;
    private boolean l;
    private boolean m;
    private ov3 n;
    private Priority o;
    private tr1 p;
    private boolean q;
    private boolean r;

    f() {
    }

    void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    to b() {
        return this.c.a();
    }

    List c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                yu4.a aVar = (yu4.a) g.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    rr1 d() {
        return this.h.a();
    }

    tr1 e() {
        return this.p;
    }

    int f() {
        return this.f;
    }

    List g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i = this.c.g().i(this.d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                yu4.a a = ((yu4) i.get(i2)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }

    o h(Class cls) {
        return this.c.g().h(cls, this.g, this.k);
    }

    Class i() {
        return this.d.getClass();
    }

    List j(File file) {
        return this.c.g().i(file);
    }

    sk5 k() {
        return this.i;
    }

    Priority l() {
        return this.o;
    }

    List m() {
        return this.c.g().j(this.d.getClass(), this.g, this.k);
    }

    wz6 n(cz6 cz6Var) {
        return this.c.g().k(cz6Var);
    }

    ov3 o() {
        return this.n;
    }

    b12 p(Object obj) {
        return this.c.g().m(obj);
    }

    Class q() {
        return this.k;
    }

    xq8 r(Class cls) {
        xq8 xq8Var = (xq8) this.j.get(cls);
        if (xq8Var == null) {
            Iterator it2 = this.j.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    xq8Var = (xq8) entry.getValue();
                    break;
                }
            }
        }
        if (xq8Var != null) {
            return xq8Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return cx8.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int s() {
        return this.e;
    }

    boolean t(Class cls) {
        return h(cls) != null;
    }

    void u(com.bumptech.glide.c cVar, Object obj, ov3 ov3Var, int i, int i2, tr1 tr1Var, Class cls, Class cls2, Priority priority, sk5 sk5Var, Map map, boolean z, boolean z2, DecodeJob.e eVar) {
        this.c = cVar;
        this.d = obj;
        this.n = ov3Var;
        this.e = i;
        this.f = i2;
        this.p = tr1Var;
        this.g = cls;
        this.h = eVar;
        this.k = cls2;
        this.o = priority;
        this.i = sk5Var;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    boolean v(cz6 cz6Var) {
        return this.c.g().n(cz6Var);
    }

    boolean w() {
        return this.r;
    }

    boolean x(ov3 ov3Var) {
        List g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (((yu4.a) g.get(i)).a.equals(ov3Var)) {
                return true;
            }
        }
        return false;
    }
}

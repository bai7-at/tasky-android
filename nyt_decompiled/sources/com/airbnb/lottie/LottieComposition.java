package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import defpackage.bf4;
import defpackage.j94;
import defpackage.l29;
import defpackage.lb4;
import defpackage.nu4;
import defpackage.py7;
import defpackage.rc4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class LottieComposition {
    private Map c;
    private Map d;
    private float e;
    private Map f;
    private List g;
    private py7 h;
    private lb4 i;
    private List j;
    private Rect k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private final p a = new p();
    private final HashSet b = new HashSet();
    private int p = 0;

    public void a(String str) {
        j94.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.k;
    }

    public py7 c() {
        return this.h;
    }

    public float d() {
        return (long) ((e() / this.n) * 1000.0f);
    }

    public float e() {
        return this.m - this.l;
    }

    public float f() {
        return this.m;
    }

    public Map g() {
        return this.f;
    }

    public float h(float f) {
        return nu4.i(this.l, this.m, f);
    }

    public float i() {
        return this.n;
    }

    public Map j() {
        float e = l29.e();
        if (e != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                this.d.put((String) entry.getKey(), ((rc4) entry.getValue()).a(this.e / e));
            }
        }
        this.e = e;
        return this.d;
    }

    public List k() {
        return this.j;
    }

    public bf4 l(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            bf4 bf4Var = (bf4) this.g.get(i);
            if (bf4Var.a(str)) {
                return bf4Var;
            }
        }
        return null;
    }

    public int m() {
        return this.p;
    }

    public p n() {
        return this.a;
    }

    public List o(String str) {
        return (List) this.c.get(str);
    }

    public float p() {
        return this.l;
    }

    public boolean q() {
        return this.o;
    }

    public boolean r() {
        return !this.d.isEmpty();
    }

    public void s(int i) {
        this.p += i;
    }

    public void t(Rect rect, float f, float f2, float f3, List list, lb4 lb4Var, Map map, Map map2, float f4, py7 py7Var, Map map3, List list2) {
        this.k = rect;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.j = list;
        this.i = lb4Var;
        this.c = map;
        this.d = map2;
        this.e = f4;
        this.h = py7Var;
        this.f = map3;
        this.g = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it2 = this.j.iterator();
        while (it2.hasNext()) {
            sb.append(((Layer) it2.next()).z("\t"));
        }
        return sb.toString();
    }

    public Layer u(long j) {
        return (Layer) this.i.d(j);
    }

    public void v(boolean z) {
        this.o = z;
    }

    public void w(boolean z) {
        this.a.b(z);
    }
}

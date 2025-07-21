package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.LBlendMode;
import defpackage.dh;
import defpackage.iw1;
import defpackage.l90;
import defpackage.nh;
import defpackage.oh;
import defpackage.qh;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Layer {
    private final List a;
    private final LottieComposition b;
    private final String c;
    private final long d;
    private final LayerType e;
    private final long f;
    private final String g;
    private final List h;
    private final qh i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final float o;
    private final float p;
    private final nh q;
    private final oh r;
    private final dh s;
    private final List t;
    private final MatteType u;
    private final boolean v;
    private final l90 w;
    private final iw1 x;
    private final LBlendMode y;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List list, LottieComposition lottieComposition, String str, long j, LayerType layerType, long j2, String str2, List list2, qh qhVar, int i, int i2, int i3, float f, float f2, float f3, float f4, nh nhVar, oh ohVar, List list3, MatteType matteType, dh dhVar, boolean z, l90 l90Var, iw1 iw1Var, LBlendMode lBlendMode) {
        this.a = list;
        this.b = lottieComposition;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = qhVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = nhVar;
        this.r = ohVar;
        this.t = list3;
        this.u = matteType;
        this.s = dhVar;
        this.v = z;
        this.w = l90Var;
        this.x = iw1Var;
        this.y = lBlendMode;
    }

    public LBlendMode a() {
        return this.y;
    }

    public l90 b() {
        return this.w;
    }

    LottieComposition c() {
        return this.b;
    }

    public iw1 d() {
        return this.x;
    }

    public long e() {
        return this.d;
    }

    List f() {
        return this.t;
    }

    public LayerType g() {
        return this.e;
    }

    List h() {
        return this.h;
    }

    MatteType i() {
        return this.u;
    }

    public String j() {
        return this.c;
    }

    long k() {
        return this.f;
    }

    float l() {
        return this.p;
    }

    float m() {
        return this.o;
    }

    public String n() {
        return this.g;
    }

    List o() {
        return this.a;
    }

    int p() {
        return this.l;
    }

    int q() {
        return this.k;
    }

    int r() {
        return this.j;
    }

    float s() {
        return this.n / this.b.e();
    }

    nh t() {
        return this.q;
    }

    public String toString() {
        return z("");
    }

    oh u() {
        return this.r;
    }

    dh v() {
        return this.s;
    }

    float w() {
        return this.m;
    }

    qh x() {
        return this.i;
    }

    public boolean y() {
        return this.v;
    }

    public String z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j());
        sb.append("\n");
        Layer u = this.b.u(k());
        if (u != null) {
            sb.append("\t\tParents: ");
            sb.append(u.j());
            Layer u2 = this.b.u(u.k());
            while (u2 != null) {
                sb.append("->");
                sb.append(u2.j());
                u2 = this.b.u(u2.k());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!h().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(h().size());
            sb.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

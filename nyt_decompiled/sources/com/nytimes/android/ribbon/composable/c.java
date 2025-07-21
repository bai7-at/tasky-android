package com.nytimes.android.ribbon.composable;

import com.nytimes.android.tpl.TPLSize;
import defpackage.bu1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c {
    public static final a Companion = new a(null);
    private static final c i;
    private static final c j;
    private static final c k;
    private static final c l;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.k;
        }

        public final c b() {
            return c.l;
        }

        public final c c() {
            return c.i;
        }

        public final c d() {
            return c.j;
        }

        private a() {
        }
    }

    static {
        TPLSize tPLSize = TPLSize.spacing0_5;
        float m765getValueD9Ej5fM = tPLSize.m765getValueD9Ej5fM();
        float m765getValueD9Ej5fM2 = tPLSize.m765getValueD9Ej5fM();
        TPLSize tPLSize2 = TPLSize.spacing1;
        float m765getValueD9Ej5fM3 = tPLSize2.m765getValueD9Ej5fM();
        TPLSize tPLSize3 = TPLSize.spacing1_5;
        i = new c(tPLSize3.m765getValueD9Ej5fM(), m765getValueD9Ej5fM, m765getValueD9Ej5fM2, m765getValueD9Ej5fM3, tPLSize3.m765getValueD9Ej5fM(), tPLSize3.m765getValueD9Ej5fM(), tPLSize.m765getValueD9Ej5fM(), 0.0f, 128, null);
        j = new c(tPLSize2.m765getValueD9Ej5fM(), 0.0f, 0.0f, tPLSize.m765getValueD9Ej5fM(), tPLSize2.m765getValueD9Ej5fM(), 0.0f, 0.0f, 0.0f, 230, null);
        float f = 0.0f;
        k = new c(tPLSize3.m765getValueD9Ej5fM(), tPLSize.m765getValueD9Ej5fM(), f, tPLSize2.m765getValueD9Ej5fM(), tPLSize3.m765getValueD9Ej5fM(), 0.0f, 0.0f, tPLSize3.m765getValueD9Ej5fM(), 100, null);
        l = new c(tPLSize3.m765getValueD9Ej5fM(), TPLSize.spacing2.m765getValueD9Ej5fM(), 0.0f, tPLSize.m765getValueD9Ej5fM(), 0.0f, tPLSize3.m765getValueD9Ej5fM(), tPLSize.m765getValueD9Ej5fM(), 0.0f, 148, null);
    }

    public /* synthetic */ c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8);
    }

    public final c e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new c(f, f2, f3, f4, f5, f6, f7, f8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return bu1.j(this.a, cVar.a) && bu1.j(this.b, cVar.b) && bu1.j(this.c, cVar.c) && bu1.j(this.d, cVar.d) && bu1.j(this.e, cVar.e) && bu1.j(this.f, cVar.f) && bu1.j(this.g, cVar.g) && bu1.j(this.h, cVar.h);
    }

    public final float g() {
        return this.f;
    }

    public final float h() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((bu1.k(this.a) * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e)) * 31) + bu1.k(this.f)) * 31) + bu1.k(this.g)) * 31) + bu1.k(this.h);
    }

    public final float i() {
        return this.c;
    }

    public final float j() {
        return this.a;
    }

    public final float k() {
        return this.h;
    }

    public final float l() {
        return this.b;
    }

    public final float m() {
        return this.e;
    }

    public final float n() {
        return this.d;
    }

    public String toString() {
        return "XpnComponentVerticalSpacing(headline=" + bu1.l(this.a) + ", media=" + bu1.l(this.b) + ", credit=" + bu1.l(this.c) + ", upperLabel=" + bu1.l(this.d) + ", summary=" + bu1.l(this.e) + ", byline=" + bu1.l(this.f) + ", cookingStars=" + bu1.l(this.g) + ", lowerLabel=" + bu1.l(this.h) + ")";
    }

    private c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
    }

    public /* synthetic */ c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? bu1.g(0) : f, (i2 & 2) != 0 ? bu1.g(0) : f2, (i2 & 4) != 0 ? bu1.g(0) : f3, (i2 & 8) != 0 ? bu1.g(0) : f4, (i2 & 16) != 0 ? bu1.g(0) : f5, (i2 & 32) != 0 ? bu1.g(0) : f6, (i2 & 64) != 0 ? bu1.g(0) : f7, (i2 & 128) != 0 ? bu1.g(0) : f8, null);
    }
}

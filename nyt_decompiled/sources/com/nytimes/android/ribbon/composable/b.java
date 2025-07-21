package com.nytimes.android.ribbon.composable;

import com.nytimes.android.tpl.TPLSize;
import defpackage.bu1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b {
    public static final a Companion;
    private static final b c;
    private static final b d;
    private final float a;
    private final float b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.d;
        }

        public final b b() {
            return b.c;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new a(defaultConstructorMarker);
        float f = 0.0f;
        c = new b(f, f, 3, defaultConstructorMarker);
        TPLSize tPLSize = TPLSize.spacing2_5;
        d = new b(tPLSize.m765getValueD9Ej5fM(), tPLSize.m765getValueD9Ej5fM(), defaultConstructorMarker);
    }

    public /* synthetic */ b(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bu1.j(this.a, bVar.a) && bu1.j(this.b, bVar.b);
    }

    public int hashCode() {
        return (bu1.k(this.a) * 31) + bu1.k(this.b);
    }

    public String toString() {
        return "XpnComponentHorizontalSpacing(start=" + bu1.l(this.a) + ", end=" + bu1.l(this.b) + ")";
    }

    private b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* synthetic */ b(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? bu1.g(0) : f, (i & 2) != 0 ? bu1.g(0) : f2, null);
    }
}

package com.google.accompanist.swiperefresh;

import defpackage.bu1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
final class a {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public /* synthetic */ a(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    public final float a() {
        return this.b;
    }

    public final float b() {
        return this.e;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return bu1.j(this.a, aVar.a) && bu1.j(this.b, aVar.b) && bu1.j(this.c, aVar.c) && bu1.j(this.d, aVar.d) && bu1.j(this.e, aVar.e);
    }

    public int hashCode() {
        return (((((((bu1.k(this.a) * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e);
    }

    public String toString() {
        return "SwipeRefreshIndicatorSizes(size=" + ((Object) bu1.l(this.a)) + ", arcRadius=" + ((Object) bu1.l(this.b)) + ", strokeWidth=" + ((Object) bu1.l(this.c)) + ", arrowWidth=" + ((Object) bu1.l(this.d)) + ", arrowHeight=" + ((Object) bu1.l(this.e)) + ')';
    }

    private a(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }
}

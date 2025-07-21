package com.nytimes.android.ribbon.config;

import defpackage.bu1;
import defpackage.nn0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b {
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final long e;
    private final float f;

    public /* synthetic */ b(String str, String str2, long j, long j2, long j3, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, j3, f);
    }

    public final String a() {
        return this.b;
    }

    public final float b() {
        return this.f;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && nn0.t(this.c, bVar.c) && nn0.t(this.d, bVar.d) && nn0.t(this.e, bVar.e) && bu1.j(this.f, bVar.f);
    }

    public final RibbonConfig f() {
        return RibbonConfig.Companion.a(this.a);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + bu1.k(this.f);
    }

    public String toString() {
        return "RibbonTabItem(identifier=" + this.a + ", displayName=" + this.b + ", selectedBackground=" + nn0.A(this.c) + ", selectedText=" + nn0.A(this.d) + ", unselectedText=" + nn0.A(this.e) + ", indicatorHeight=" + bu1.l(this.f) + ")";
    }

    private b(String str, String str2, long j, long j2, long j3, float f) {
        zq3.h(str, "identifier");
        zq3.h(str2, "displayName");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = f;
    }
}

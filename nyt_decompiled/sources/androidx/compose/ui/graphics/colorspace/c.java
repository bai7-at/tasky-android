package androidx.compose.ui.graphics.colorspace;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class c {
    public static final a d = new a(null);
    private final String a;
    private final long b;
    private final int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public final int a() {
        return b.f(this.b);
    }

    public final int b() {
        return this.c;
    }

    public abstract float c(int i);

    public abstract float d(int i);

    public final long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c && zq3.c(this.a, cVar.a)) {
            return b.e(this.b, cVar.b);
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f, float f2, float f3);

    public int hashCode() {
        return (((this.a.hashCode() * 31) + b.g(this.b)) * 31) + this.c;
    }

    public abstract float i(float f, float f2, float f3);

    public abstract long j(float f, float f2, float f3, float f4, c cVar);

    public String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) b.h(this.b)) + ')';
    }

    private c(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}

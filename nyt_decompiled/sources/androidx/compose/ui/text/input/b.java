package androidx.compose.ui.text.input;

import defpackage.ku5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b {
    public static final a f = new a(null);
    private static final b g = new b(false, 0, false, 0, 0, null, 63, null);
    private final boolean a;
    private final int b;
    private final boolean c;
    private final int d;
    private final int e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.g;
        }

        private a() {
        }
    }

    public /* synthetic */ b(boolean z, int i, boolean z2, int i2, int i3, ku5 ku5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3, ku5Var);
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a != bVar.a || !c.f(this.b, bVar.b) || this.c != bVar.c || !d.k(this.d, bVar.d) || !androidx.compose.ui.text.input.a.l(this.e, bVar.e)) {
            return false;
        }
        bVar.getClass();
        return zq3.c(null, null);
    }

    public final ku5 f() {
        return null;
    }

    public final boolean g() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((Boolean.hashCode(this.a) * 31) + c.g(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + d.l(this.d)) * 31) + androidx.compose.ui.text.input.a.m(this.e)) * 31;
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) c.h(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) d.m(this.d)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.a.n(this.e)) + ", platformImeOptions=" + ((Object) null) + ')';
    }

    private b(boolean z, int i, boolean z2, int i2, int i3, ku5 ku5Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ b(boolean z, int i, boolean z2, int i2, int i3, ku5 ku5Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? c.a.b() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? d.a.h() : i2, (i4 & 16) != 0 ? androidx.compose.ui.text.input.a.b.a() : i3, (i4 & 32) != 0 ? null : ku5Var, null);
    }
}

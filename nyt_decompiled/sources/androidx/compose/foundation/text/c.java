package androidx.compose.foundation.text;

import defpackage.ku5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c {
    public static final a e = new a(null);
    private static final c f = new c(0, false, 0, 0, null, 31, null);
    private final int a;
    private final boolean b;
    private final int c;
    private final int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f;
        }

        private a() {
        }
    }

    public /* synthetic */ c(int i, boolean z, int i2, int i3, ku5 ku5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3, ku5Var);
    }

    public static /* synthetic */ c c(c cVar, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cVar.a;
        }
        if ((i4 & 2) != 0) {
            z = cVar.b;
        }
        if ((i4 & 4) != 0) {
            i2 = cVar.c;
        }
        if ((i4 & 8) != 0) {
            i3 = cVar.d;
        }
        return cVar.b(i, z, i2, i3);
    }

    public static /* synthetic */ c e(c cVar, int i, boolean z, int i2, int i3, ku5 ku5Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cVar.a;
        }
        if ((i4 & 2) != 0) {
            z = cVar.b;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = cVar.c;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = cVar.d;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            cVar.getClass();
            ku5Var = null;
        }
        return cVar.d(i, z2, i5, i6, ku5Var);
    }

    public final /* synthetic */ c b(int i, boolean z, int i2, int i3) {
        return new c(i, z, i2, i3, (ku5) null, (DefaultConstructorMarker) null);
    }

    public final c d(int i, boolean z, int i2, int i3, ku5 ku5Var) {
        return new c(i, z, i2, i3, ku5Var, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!androidx.compose.ui.text.input.c.f(this.a, cVar.a) || this.b != cVar.b || !androidx.compose.ui.text.input.d.k(this.c, cVar.c) || !androidx.compose.ui.text.input.a.l(this.d, cVar.d)) {
            return false;
        }
        cVar.getClass();
        return zq3.c(null, null);
    }

    public final androidx.compose.ui.text.input.b f(boolean z) {
        return new androidx.compose.ui.text.input.b(z, this.a, this.b, this.c, this.d, null, null);
    }

    public int hashCode() {
        return ((((((androidx.compose.ui.text.input.c.g(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + androidx.compose.ui.text.input.d.l(this.c)) * 31) + androidx.compose.ui.text.input.a.m(this.d)) * 31;
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) androidx.compose.ui.text.input.c.h(this.a)) + ", autoCorrect=" + this.b + ", keyboardType=" + ((Object) androidx.compose.ui.text.input.d.m(this.c)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.a.n(this.d)) + ", platformImeOptions=" + ((Object) null) + ')';
    }

    public /* synthetic */ c(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3);
    }

    private c(int i, boolean z, int i2, int i3, ku5 ku5Var) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = i3;
    }

    public /* synthetic */ c(int i, boolean z, int i2, int i3, ku5 ku5Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? androidx.compose.ui.text.input.c.a.b() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? androidx.compose.ui.text.input.d.a.h() : i2, (i4 & 8) != 0 ? androidx.compose.ui.text.input.a.b.a() : i3, (i4 & 16) != 0 ? null : ku5Var, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ c(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? androidx.compose.ui.text.input.c.a.b() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? androidx.compose.ui.text.input.d.a.h() : i2, (i4 & 8) != 0 ? androidx.compose.ui.text.input.a.b.a() : i3, (DefaultConstructorMarker) null);
    }

    private c(int i, boolean z, int i2, int i3) {
        this(i, z, i2, i3, (ku5) null, (DefaultConstructorMarker) null);
    }
}

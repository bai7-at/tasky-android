package defpackage;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class uu8 {
    private final e a;
    private final o b;
    private final int c;
    private final int d;
    private final Object e;

    public /* synthetic */ uu8(e eVar, o oVar, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, oVar, i, i2, obj);
    }

    public static /* synthetic */ uu8 b(uu8 uu8Var, e eVar, o oVar, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            eVar = uu8Var.a;
        }
        if ((i3 & 2) != 0) {
            oVar = uu8Var.b;
        }
        o oVar2 = oVar;
        if ((i3 & 4) != 0) {
            i = uu8Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = uu8Var.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = uu8Var.e;
        }
        return uu8Var.a(eVar, oVar2, i4, i5, obj);
    }

    public final uu8 a(e eVar, o oVar, int i, int i2, Object obj) {
        return new uu8(eVar, oVar, i, i2, obj, null);
    }

    public final e c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu8)) {
            return false;
        }
        uu8 uu8Var = (uu8) obj;
        return zq3.c(this.a, uu8Var.a) && zq3.c(this.b, uu8Var.b) && l.f(this.c, uu8Var.c) && m.h(this.d, uu8Var.d) && zq3.c(this.e, uu8Var.e);
    }

    public final o f() {
        return this.b;
    }

    public int hashCode() {
        e eVar = this.a;
        int hashCode = (((((((eVar == null ? 0 : eVar.hashCode()) * 31) + this.b.hashCode()) * 31) + l.g(this.c)) * 31) + m.i(this.d)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) l.h(this.c)) + ", fontSynthesis=" + ((Object) m.l(this.d)) + ", resourceLoaderCacheKey=" + this.e + ')';
    }

    private uu8(e eVar, o oVar, int i, int i2, Object obj) {
        this.a = eVar;
        this.b = oVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }
}

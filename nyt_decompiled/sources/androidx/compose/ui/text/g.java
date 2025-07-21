package androidx.compose.ui.text;

import androidx.compose.ui.text.font.d;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.kj8;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g {
    private final a a;
    private final j b;
    private final List c;
    private final int d;
    private final boolean e;
    private final int f;
    private final fm1 g;
    private final LayoutDirection h;
    private final e.b i;
    private final long j;
    private d.a k;

    public /* synthetic */ g(a aVar, j jVar, List list, int i, boolean z, int i2, fm1 fm1Var, LayoutDirection layoutDirection, e.b bVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, list, i, z, i2, fm1Var, layoutDirection, bVar, j);
    }

    public final long a() {
        return this.j;
    }

    public final fm1 b() {
        return this.g;
    }

    public final e.b c() {
        return this.i;
    }

    public final LayoutDirection d() {
        return this.h;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c) && this.d == gVar.d && this.e == gVar.e && kj8.e(this.f, gVar.f) && zq3.c(this.g, gVar.g) && this.h == gVar.h && zq3.c(this.i, gVar.i) && fv0.g(this.j, gVar.j);
    }

    public final int f() {
        return this.f;
    }

    public final List g() {
        return this.c;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + Boolean.hashCode(this.e)) * 31) + kj8.f(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + fv0.q(this.j);
    }

    public final j i() {
        return this.b;
    }

    public final a j() {
        return this.a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) kj8.g(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) fv0.s(this.j)) + ')';
    }

    private g(a aVar, j jVar, List list, int i, boolean z, int i2, fm1 fm1Var, LayoutDirection layoutDirection, d.a aVar2, e.b bVar, long j) {
        this.a = aVar;
        this.b = jVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = fm1Var;
        this.h = layoutDirection;
        this.i = bVar;
        this.j = j;
        this.k = aVar2;
    }

    private g(a aVar, j jVar, List list, int i, boolean z, int i2, fm1 fm1Var, LayoutDirection layoutDirection, e.b bVar, long j) {
        this(aVar, jVar, list, i, z, i2, fm1Var, layoutDirection, (d.a) null, bVar, j);
    }
}

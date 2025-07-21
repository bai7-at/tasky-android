package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.e;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.aj8;

/* loaded from: classes.dex */
public final class d {
    public static final int g = aj8.g;
    private final long a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final aj8 f;

    public d(long j, int i, int i2, int i3, int i4, aj8 aj8Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = aj8Var;
    }

    private final ResolvedTextDirection b() {
        ResolvedTextDirection b;
        b = SelectionLayoutKt.b(this.f, this.d);
        return b;
    }

    private final ResolvedTextDirection j() {
        ResolvedTextDirection b;
        b = SelectionLayoutKt.b(this.f, this.c);
        return b;
    }

    public final e.a a(int i) {
        ResolvedTextDirection b;
        b = SelectionLayoutKt.b(this.f, i);
        return new e.a(b, i, this.a);
    }

    public final String c() {
        return this.f.l().j().j();
    }

    public final CrossStatus d() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final int g() {
        return this.c;
    }

    public final long h() {
        return this.a;
    }

    public final int i() {
        return this.b;
    }

    public final aj8 k() {
        return this.f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(d dVar) {
        return (this.a == dVar.a && this.c == dVar.c && this.d == dVar.d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.a + ", range=(" + this.c + '-' + j() + ',' + this.d + '-' + b() + "), prevOffset=" + this.e + ')';
    }
}

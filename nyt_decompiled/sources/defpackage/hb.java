package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.hn3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class hb implements xz5 {
    private final Alignment a;
    private final long b;

    public /* synthetic */ hb(Alignment alignment, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }

    @Override // defpackage.xz5
    public long a(bn3 bn3Var, long j, LayoutDirection layoutDirection, long j2) {
        Alignment alignment = this.a;
        hn3.a aVar = hn3.b;
        long a = alignment.a(aVar.a(), bn3Var.f(), layoutDirection);
        long a2 = this.a.a(aVar.a(), j2, layoutDirection);
        long a3 = wm3.a(-vm3.j(a2), -vm3.k(a2));
        long a4 = wm3.a(vm3.j(this.b) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), vm3.k(this.b));
        long h = bn3Var.h();
        long a5 = wm3.a(vm3.j(h) + vm3.j(a), vm3.k(h) + vm3.k(a));
        long a6 = wm3.a(vm3.j(a5) + vm3.j(a3), vm3.k(a5) + vm3.k(a3));
        return wm3.a(vm3.j(a6) + vm3.j(a4), vm3.k(a6) + vm3.k(a4));
    }

    private hb(Alignment alignment, long j) {
        this.a = alignment;
        this.b = j;
    }
}

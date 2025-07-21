package defpackage;

import com.nytimes.android.designsystem.uicompose.utils.ComposableSingletons$MessageStateKt;
import com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class xn8 implements yr4 {
    private ScrollObserver a;
    private final TooltipArrowPosition b;
    private final long c;
    private final sq4 d;
    private final gt2 e;
    private final qs2 f;

    public /* synthetic */ xn8(ScrollObserver scrollObserver, TooltipArrowPosition tooltipArrowPosition, long j, sq4 sq4Var, gt2 gt2Var, qs2 qs2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(scrollObserver, tooltipArrowPosition, j, sq4Var, gt2Var, qs2Var);
    }

    public final long a() {
        return this.c;
    }

    public final TooltipArrowPosition b() {
        return this.b;
    }

    public final gt2 c() {
        return this.e;
    }

    public final qs2 d() {
        return this.f;
    }

    public final ScrollObserver e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn8)) {
            return false;
        }
        xn8 xn8Var = (xn8) obj;
        return zq3.c(this.a, xn8Var.a) && this.b == xn8Var.b && eu1.f(this.c, xn8Var.c) && zq3.c(this.d, xn8Var.d) && zq3.c(this.e, xn8Var.e) && zq3.c(this.f, xn8Var.f);
    }

    public final void f(ScrollObserver scrollObserver) {
        this.a = scrollObserver;
    }

    public int hashCode() {
        ScrollObserver scrollObserver = this.a;
        return ((((((((((scrollObserver == null ? 0 : scrollObserver.hashCode()) * 31) + this.b.hashCode()) * 31) + eu1.i(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "TooltipMediumMessageState(scrollObserver=" + this.a + ", arrowPosition=" + this.b + ", anchorOffset=" + eu1.j(this.c) + ", action=" + this.d + ", content=" + this.e + ", onDismiss=" + this.f + ")";
    }

    private xn8(ScrollObserver scrollObserver, TooltipArrowPosition tooltipArrowPosition, long j, sq4 sq4Var, gt2 gt2Var, qs2 qs2Var) {
        zq3.h(tooltipArrowPosition, "arrowPosition");
        zq3.h(sq4Var, "action");
        zq3.h(gt2Var, "content");
        zq3.h(qs2Var, "onDismiss");
        this.a = scrollObserver;
        this.b = tooltipArrowPosition;
        this.c = j;
        this.d = sq4Var;
        this.e = gt2Var;
        this.f = qs2Var;
    }

    public /* synthetic */ xn8(ScrollObserver scrollObserver, TooltipArrowPosition tooltipArrowPosition, long j, sq4 sq4Var, gt2 gt2Var, qs2 qs2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : scrollObserver, tooltipArrowPosition, j, sq4Var, (i & 16) != 0 ? ComposableSingletons$MessageStateKt.a.a() : gt2Var, qs2Var, null);
    }
}

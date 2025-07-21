package defpackage;

import androidx.compose.animation.core.RepeatMode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class oj3 implements ci {
    public static final int d = 8;
    private final sw1 a;
    private final RepeatMode b;
    private final long c;

    public /* synthetic */ oj3(sw1 sw1Var, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(sw1Var, repeatMode, j);
    }

    @Override // defpackage.ci
    public i49 a(hu8 hu8Var) {
        return new p49(this.a.a(hu8Var), this.b, this.c, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof oj3)) {
            return false;
        }
        oj3 oj3Var = (oj3) obj;
        return zq3.c(oj3Var.a, this.a) && oj3Var.b == this.b && l08.d(oj3Var.c, this.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + l08.e(this.c);
    }

    private oj3(sw1 sw1Var, RepeatMode repeatMode, long j) {
        this.a = sw1Var;
        this.b = repeatMode;
        this.c = j;
    }
}

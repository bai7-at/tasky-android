package defpackage;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c90 extends qn0 {
    private final long c;
    private final int d;

    public /* synthetic */ c90(long j, int i, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, colorFilter);
    }

    public final int b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return nn0.t(this.c, c90Var.c) && b90.E(this.d, c90Var.d);
    }

    public int hashCode() {
        return (nn0.z(this.c) * 31) + b90.F(this.d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) nn0.A(this.c)) + ", blendMode=" + ((Object) b90.G(this.d)) + ')';
    }

    public /* synthetic */ c90(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    private c90(long j, int i, ColorFilter colorFilter) {
        super(colorFilter);
        this.c = j;
        this.d = i;
    }

    private c90(long j, int i) {
        this(j, i, ae.a(j, i), null);
    }
}

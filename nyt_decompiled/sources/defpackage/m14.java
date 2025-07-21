package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class m14 {
    private final h14 a;
    private final r04 b;
    private final long c;

    public /* synthetic */ m14(long j, boolean z, h14 h14Var, r04 r04Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, h14Var, r04Var);
    }

    public abstract l14 a(int i, Object obj, Object obj2, List list);

    public final l14 b(int i) {
        return a(i, this.a.c(i), this.a.d(i), this.b.T(i, this.c));
    }

    public final long c() {
        return this.c;
    }

    public final q04 d() {
        return this.a.f();
    }

    private m14(long j, boolean z, h14 h14Var, r04 r04Var) {
        this.a = h14Var;
        this.b = r04Var;
        this.c = iv0.b(0, z ? fv0.n(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : fv0.m(j), 5, null);
    }
}

package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class f40 extends g40 {
    private final Pair a;
    private final Pair b;

    /* synthetic */ f40(Pair pair, Pair pair2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pair, (i & 2) != 0 ? null : pair2);
    }

    public final Pair a() {
        return this.a;
    }

    public final Pair b() {
        return this.b;
    }

    private f40(Pair pair, Pair pair2) {
        super(null);
        this.a = pair;
        this.b = pair2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f40(float f, float f2) {
        this(new Pair(Float.valueOf(f), Float.valueOf(f2)), null, 2, 0 == true ? 1 : 0);
    }
}

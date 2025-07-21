package defpackage;

import defpackage.m62;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class xa3 implements m62.b {
    public static final a g = new a(null);
    private final long c;
    private final long d;
    private final int e;
    private final List f;

    public static final class a implements m62.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public xa3(long j, long j2, int i, List list) {
        zq3.h(list, "headers");
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = list;
    }

    public final List f() {
        return this.f;
    }

    @Override // m62.b
    public m62.c getKey() {
        return g;
    }
}

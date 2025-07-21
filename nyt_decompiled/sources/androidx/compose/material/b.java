package androidx.compose.material;

import defpackage.bg;
import defpackage.cg;
import defpackage.ip5;
import defpackage.sp5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class b {
    private final ip5 a;
    private final sp5 b;
    private final ip5 c;

    public b(ip5 ip5Var, sp5 sp5Var, ip5 ip5Var2) {
        this.a = ip5Var;
        this.b = sp5Var;
        this.c = ip5Var2;
    }

    public final ip5 a() {
        return this.a;
    }

    public final sp5 b() {
        return this.b;
    }

    public final ip5 c() {
        return this.c;
    }

    public /* synthetic */ b(ip5 ip5Var, sp5 sp5Var, ip5 ip5Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? cg.a() : ip5Var, (i & 2) != 0 ? bg.a() : sp5Var, (i & 4) != 0 ? cg.a() : ip5Var2);
    }
}

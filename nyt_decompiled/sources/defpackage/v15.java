package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class v15 extends ue4 {
    public /* synthetic */ v15(lz8 lz8Var, wt6 wt6Var, e32 e32Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lz8Var, (i & 2) != 0 ? null : wt6Var, (i & 4) != 0 ? null : e32Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v15(lz8 lz8Var, wt6 wt6Var, e32 e32Var) {
        super(du8.a("user", lz8Var), du8.a("referring_source", wt6Var), du8.a("asset", e32Var));
        zq3.h(lz8Var, "user");
    }
}

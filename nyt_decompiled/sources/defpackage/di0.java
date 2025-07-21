package defpackage;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class di0 extends ue4 {
    private final g90 b;

    public /* synthetic */ di0(g90 g90Var, ai0 ai0Var, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g90Var, ai0Var, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(g90 g90Var, ai0 ai0Var, Map map) {
        super(du8.a("block", g90Var), du8.a("card", ai0Var), du8.a("algos", map));
        zq3.h(g90Var, "block");
        zq3.h(ai0Var, "card");
        this.b = g90Var;
    }
}

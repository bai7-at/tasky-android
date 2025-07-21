package androidx.compose.runtime;

import defpackage.tw7;
import defpackage.zq3;

/* loaded from: classes.dex */
abstract /* synthetic */ class a0 {
    public static final tw7 a() {
        n nVar = n.a;
        zq3.f(nVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return nVar;
    }

    public static final tw7 b() {
        p pVar = p.a;
        zq3.f(pVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return pVar;
    }

    public static final tw7 c() {
        e0 e0Var = e0.a;
        zq3.f(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return e0Var;
    }
}

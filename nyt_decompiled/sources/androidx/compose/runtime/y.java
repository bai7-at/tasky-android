package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.tw7;
import defpackage.vy4;
import defpackage.x08;
import java.util.Collection;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public abstract class y {
    public static final x08 a(Flow flow, Object obj, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.b(flow, obj, coroutineContext, composer, i, i2);
    }

    public static final x08 b(StateFlow stateFlow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.c(stateFlow, coroutineContext, composer, i, i2);
    }

    public static final vy4 c() {
        return z.b();
    }

    public static final x08 d(qs2 qs2Var) {
        return z.c(qs2Var);
    }

    public static final x08 e(tw7 tw7Var, qs2 qs2Var) {
        return z.d(tw7Var, qs2Var);
    }

    public static final SnapshotStateList f() {
        return b0.a();
    }

    public static final SnapshotStateList g(Object... objArr) {
        return b0.b(objArr);
    }

    public static final androidx.compose.runtime.snapshots.k h() {
        return b0.c();
    }

    public static final sy4 i(Object obj, tw7 tw7Var) {
        return b0.d(obj, tw7Var);
    }

    public static final tw7 k() {
        return a0.a();
    }

    public static final x08 l(Object obj, gt2 gt2Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.a(obj, gt2Var, composer, i);
    }

    public static final x08 m(Object obj, Object obj2, Object obj3, gt2 gt2Var, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.b(obj, obj2, obj3, gt2Var, composer, i);
    }

    public static final tw7 n() {
        return a0.b();
    }

    public static final x08 o(Object obj, Composer composer, int i) {
        return b0.f(obj, composer, i);
    }

    public static final Flow p(qs2 qs2Var) {
        return SnapshotStateKt__SnapshotFlowKt.e(qs2Var);
    }

    public static final tw7 q() {
        return a0.c();
    }

    public static final SnapshotStateList r(Collection collection) {
        return b0.g(collection);
    }
}

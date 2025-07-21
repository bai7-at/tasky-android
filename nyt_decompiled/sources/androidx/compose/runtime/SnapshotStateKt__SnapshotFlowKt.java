package androidx.compose.runtime;

import defpackage.py4;
import defpackage.qs2;
import defpackage.x08;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
abstract /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final x08 b(Flow flow, Object obj, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        composer.z(-606625098);
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (b.G()) {
            b.S(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i3 = i >> 3;
        x08 m = y.m(obj, flow, coroutineContext2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(coroutineContext2, flow, null), composer, (i3 & 8) | 4672 | (i3 & 14));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return m;
    }

    public static final x08 c(StateFlow stateFlow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        composer.z(-1439883919);
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (b.G()) {
            b.S(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        x08 a = y.a(stateFlow, stateFlow.getValue(), coroutineContext2, composer, 520, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(py4 py4Var, Set set) {
        Object[] objArr = py4Var.b;
        long[] jArr = py4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                        return true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    public static final Flow e(qs2 qs2Var) {
        return FlowKt.flow(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(qs2Var, null));
    }
}

package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
public interface c extends Modifier.b {
    sg4 d(f fVar, qg4 qg4Var, long j);

    default int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return MeasuringIntrinsics.a.d(this, yq3Var, xq3Var, i);
    }

    default int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return MeasuringIntrinsics.a.a(this, yq3Var, xq3Var, i);
    }

    default int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return MeasuringIntrinsics.a.c(this, yq3Var, xq3Var, i);
    }

    default int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return MeasuringIntrinsics.a.b(this, yq3Var, xq3Var, i);
    }
}

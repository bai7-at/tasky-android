package androidx.compose.ui.node;

import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import defpackage.qg4;
import defpackage.ql1;
import defpackage.sg4;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
public interface c extends ql1 {

    static final class a implements NodeMeasuringIntrinsics.c {
        a() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
            return c.this.d(fVar, qg4Var, j);
        }
    }

    static final class b implements NodeMeasuringIntrinsics.c {
        b() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
            return c.this.d(fVar, qg4Var, j);
        }
    }

    /* renamed from: androidx.compose.ui.node.c$c, reason: collision with other inner class name */
    static final class C0062c implements NodeMeasuringIntrinsics.c {
        C0062c() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
            return c.this.d(fVar, qg4Var, j);
        }
    }

    static final class d implements NodeMeasuringIntrinsics.c {
        d() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.c
        public final sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
            return c.this.d(fVar, qg4Var, j);
        }
    }

    sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j);

    default int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return NodeMeasuringIntrinsics.a.d(new d(), yq3Var, xq3Var, i);
    }

    default int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return NodeMeasuringIntrinsics.a.a(new a(), yq3Var, xq3Var, i);
    }

    default int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return NodeMeasuringIntrinsics.a.c(new C0062c(), yq3Var, xq3Var, i);
    }

    default int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return NodeMeasuringIntrinsics.a.b(new b(), yq3Var, xq3Var, i);
    }
}

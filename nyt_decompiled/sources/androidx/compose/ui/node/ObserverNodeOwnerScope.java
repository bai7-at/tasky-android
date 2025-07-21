package androidx.compose.ui.node;

import defpackage.km5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xc5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements km5 {
    public static final a b = new a(null);
    public static final int c = 8;
    private static final ss2 d = new ss2() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void b(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.M0()) {
                observerNodeOwnerScope.b().g0();
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ObserverNodeOwnerScope) obj);
            return ww8.a;
        }
    };
    private final xc5 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss2 a() {
            return ObserverNodeOwnerScope.d;
        }

        private a() {
        }
    }

    public ObserverNodeOwnerScope(xc5 xc5Var) {
        this.a = xc5Var;
    }

    @Override // defpackage.km5
    public boolean M0() {
        return this.a.c0().L1();
    }

    public final xc5 b() {
        return this.a;
    }
}

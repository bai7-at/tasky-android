package androidx.constraintlayout.compose;

import defpackage.qq1;
import defpackage.ss2;
import defpackage.u08;
import defpackage.zq3;

/* loaded from: classes.dex */
public interface Dimension {
    public static final Companion a = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final Dimension a() {
            return new qq1(new ss2() { // from class: androidx.constraintlayout.compose.Dimension$Companion$wrapContent$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final androidx.constraintlayout.core.state.b invoke(u08 u08Var) {
                    zq3.h(u08Var, "it");
                    androidx.constraintlayout.core.state.b b = androidx.constraintlayout.core.state.b.b(androidx.constraintlayout.core.state.b.j);
                    zq3.g(b, "Fixed(WRAP_DIMENSION)");
                    return b;
                }
            });
        }
    }
}

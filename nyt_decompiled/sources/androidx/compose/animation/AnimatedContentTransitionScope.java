package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import defpackage.di;
import defpackage.ic9;
import defpackage.ph2;
import defpackage.ss2;
import defpackage.vm3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope extends Transition.b {

    public static final class a {
        public static final C0017a a = new C0017a(null);
        private static final int b = g(0);
        private static final int c = g(1);
        private static final int d = g(2);
        private static final int e = g(3);
        private static final int f = g(4);
        private static final int g = g(5);

        /* renamed from: androidx.compose.animation.AnimatedContentTransitionScope$a$a, reason: collision with other inner class name */
        public static final class C0017a {
            public /* synthetic */ C0017a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.e;
            }

            public final int b() {
                return a.g;
            }

            public final int c() {
                return a.b;
            }

            public final int d() {
                return a.c;
            }

            public final int e() {
                return a.f;
            }

            public final int f() {
                return a.d;
            }

            private C0017a() {
            }
        }

        public static int g(int i) {
            return i;
        }

        public static final boolean h(int i, int i2) {
            return i == i2;
        }
    }

    static /* synthetic */ e b(AnimatedContentTransitionScope animatedContentTransitionScope, int i, ph2 ph2Var, ss2 ss2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i2 & 2) != 0) {
            ph2Var = di.i(0.0f, 0.0f, vm3.b(ic9.c(vm3.b)), 3, null);
        }
        if ((i2 & 4) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final Integer b(int i3) {
                    return Integer.valueOf(i3);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.g(i, ph2Var, ss2Var);
    }

    static /* synthetic */ c e(AnimatedContentTransitionScope animatedContentTransitionScope, int i, ph2 ph2Var, ss2 ss2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i2 & 2) != 0) {
            ph2Var = di.i(0.0f, 0.0f, vm3.b(ic9.c(vm3.b)), 3, null);
        }
        if ((i2 & 4) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final Integer b(int i3) {
                    return Integer.valueOf(i3);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.c(i, ph2Var, ss2Var);
    }

    c c(int i, ph2 ph2Var, ss2 ss2Var);

    e g(int i, ph2 ph2Var, ss2 ss2Var);
}

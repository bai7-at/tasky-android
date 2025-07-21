package androidx.compose.foundation.lazy;

import defpackage.it2;
import defpackage.kt2;
import defpackage.ss2;

/* loaded from: classes.dex */
public interface LazyListScope {
    static /* synthetic */ void c(LazyListScope lazyListScope, Object obj, Object obj2, it2 it2Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.a(obj, obj2, it2Var);
    }

    static /* synthetic */ void d(LazyListScope lazyListScope, Object obj, Object obj2, it2 it2Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.f(obj, obj2, it2Var);
    }

    static /* synthetic */ void e(LazyListScope lazyListScope, int i, ss2 ss2Var, ss2 ss2Var2, kt2 kt2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            ss2Var = null;
        }
        if ((i2 & 4) != 0) {
            ss2Var2 = new ss2() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                public final Void b(int i3) {
                    return null;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.b(i, ss2Var, ss2Var2, kt2Var);
    }

    void a(Object obj, Object obj2, it2 it2Var);

    void b(int i, ss2 ss2Var, ss2 ss2Var2, kt2 kt2Var);

    void f(Object obj, Object obj2, it2 it2Var);
}

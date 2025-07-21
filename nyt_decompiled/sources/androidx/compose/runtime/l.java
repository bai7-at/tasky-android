package androidx.compose.runtime;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface l extends CoroutineContext.a {
    public static final b E = b.a;

    public static final class a {
        public static Object a(l lVar, Object obj, gt2 gt2Var) {
            return CoroutineContext.a.C0497a.a(lVar, obj, gt2Var);
        }

        public static CoroutineContext.a b(l lVar, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.b(lVar, bVar);
        }

        public static CoroutineContext c(l lVar, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.c(lVar, bVar);
        }

        public static CoroutineContext d(l lVar, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0497a.d(lVar, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    Object b(ss2 ss2Var, by0 by0Var);

    @Override // kotlin.coroutines.CoroutineContext.a
    default CoroutineContext.b getKey() {
        return E;
    }
}

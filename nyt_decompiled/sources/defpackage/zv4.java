package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface zv4 extends CoroutineContext.a {
    public static final b A = b.a;

    public static final class a {
        public static Object a(zv4 zv4Var, Object obj, gt2 gt2Var) {
            return CoroutineContext.a.C0497a.a(zv4Var, obj, gt2Var);
        }

        public static CoroutineContext.a b(zv4 zv4Var, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.b(zv4Var, bVar);
        }

        public static CoroutineContext c(zv4 zv4Var, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0497a.c(zv4Var, bVar);
        }

        public static CoroutineContext d(zv4 zv4Var, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0497a.d(zv4Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    float d();

    @Override // kotlin.coroutines.CoroutineContext.a
    default CoroutineContext.b getKey() {
        return A;
    }
}

package kotlin.coroutines;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface c extends CoroutineContext.a {
    public static final b P = b.a;

    public static final class a {
        public static CoroutineContext.a a(c cVar, CoroutineContext.b bVar) {
            CoroutineContext.a tryCast$kotlin_stdlib;
            zq3.h(bVar, TransferTable.COLUMN_KEY);
            if (!(bVar instanceof kotlin.coroutines.b)) {
                if (c.P != bVar) {
                    return null;
                }
                zq3.f(cVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return cVar;
            }
            kotlin.coroutines.b bVar2 = (kotlin.coroutines.b) bVar;
            if (!bVar2.isSubKey$kotlin_stdlib(cVar.getKey()) || (tryCast$kotlin_stdlib = bVar2.tryCast$kotlin_stdlib(cVar)) == null) {
                return null;
            }
            return tryCast$kotlin_stdlib;
        }

        public static CoroutineContext b(c cVar, CoroutineContext.b bVar) {
            zq3.h(bVar, TransferTable.COLUMN_KEY);
            if (!(bVar instanceof kotlin.coroutines.b)) {
                return c.P == bVar ? EmptyCoroutineContext.a : cVar;
            }
            kotlin.coroutines.b bVar2 = (kotlin.coroutines.b) bVar;
            return (!bVar2.isSubKey$kotlin_stdlib(cVar.getKey()) || bVar2.tryCast$kotlin_stdlib(cVar) == null) ? cVar : EmptyCoroutineContext.a;
        }
    }

    public static final class b implements CoroutineContext.b {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    by0 interceptContinuation(by0 by0Var);

    void releaseInterceptedContinuation(by0 by0Var);
}

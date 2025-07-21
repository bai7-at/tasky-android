package kotlin.coroutines;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gt2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;

/* loaded from: classes5.dex */
public interface CoroutineContext {

    public static final class DefaultImpls {
        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            zq3.h(coroutineContext2, "context");
            return coroutineContext2 == EmptyCoroutineContext.a ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, new gt2() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                @Override // defpackage.gt2
                public final CoroutineContext invoke(CoroutineContext coroutineContext3, CoroutineContext.a aVar) {
                    CombinedContext combinedContext;
                    zq3.h(coroutineContext3, "acc");
                    zq3.h(aVar, "element");
                    CoroutineContext minusKey = coroutineContext3.minusKey(aVar.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
                    if (minusKey == emptyCoroutineContext) {
                        return aVar;
                    }
                    c.b bVar = c.P;
                    c cVar = (c) minusKey.get(bVar);
                    if (cVar == null) {
                        combinedContext = new CombinedContext(minusKey, aVar);
                    } else {
                        CoroutineContext minusKey2 = minusKey.minusKey(bVar);
                        if (minusKey2 == emptyCoroutineContext) {
                            return new CombinedContext(aVar, cVar);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(minusKey2, aVar), cVar);
                    }
                    return combinedContext;
                }
            });
        }
    }

    public interface a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a, reason: collision with other inner class name */
        public static final class C0497a {
            public static Object a(a aVar, Object obj, gt2 gt2Var) {
                zq3.h(gt2Var, "operation");
                return gt2Var.invoke(obj, aVar);
            }

            public static a b(a aVar, b bVar) {
                zq3.h(bVar, TransferTable.COLUMN_KEY);
                if (!zq3.c(aVar.getKey(), bVar)) {
                    return null;
                }
                zq3.f(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }

            public static CoroutineContext c(a aVar, b bVar) {
                zq3.h(bVar, TransferTable.COLUMN_KEY);
                return zq3.c(aVar.getKey(), bVar) ? EmptyCoroutineContext.a : aVar;
            }

            public static CoroutineContext d(a aVar, CoroutineContext coroutineContext) {
                zq3.h(coroutineContext, "context");
                return DefaultImpls.a(aVar, coroutineContext);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        a get(b bVar);

        b getKey();
    }

    public interface b {
    }

    Object fold(Object obj, gt2 gt2Var);

    a get(b bVar);

    CoroutineContext minusKey(b bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}

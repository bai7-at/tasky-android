package kotlin.coroutines;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.a element;
    private final CoroutineContext left;

    private static final class Serialized implements Serializable {
        public static final a a = new a(null);
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public Serialized(CoroutineContext[] coroutineContextArr) {
            zq3.h(coroutineContextArr, "elements");
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.a;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(coroutineContext2);
            }
            return coroutineContext;
        }
    }

    public CombinedContext(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        zq3.h(coroutineContext, "left");
        zq3.h(aVar, "element");
        this.left = coroutineContext;
        this.element = aVar;
    }

    private final boolean a(CoroutineContext.a aVar) {
        return zq3.c(get(aVar.getKey()), aVar);
    }

    private final boolean c(CombinedContext combinedContext) {
        while (a(combinedContext.element)) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                zq3.f(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((CoroutineContext.a) coroutineContext);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
        return false;
    }

    private final int e() {
        int i = 2;
        while (true) {
            CoroutineContext coroutineContext = this.left;
            this = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int e = e();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[e];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(ww8.a, new gt2() { // from class: kotlin.coroutines.CombinedContext$writeReplace$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(ww8 ww8Var, CoroutineContext.a aVar) {
                zq3.h(ww8Var, "<anonymous parameter 0>");
                zq3.h(aVar, "element");
                CoroutineContext[] coroutineContextArr2 = coroutineContextArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i = ref$IntRef2.element;
                ref$IntRef2.element = i + 1;
                coroutineContextArr2[i] = aVar;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((ww8) obj, (CoroutineContext.a) obj2);
                return ww8.a;
            }
        });
        if (ref$IntRef.element == e) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.e() != e() || !combinedContext.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, gt2 gt2Var) {
        zq3.h(gt2Var, "operation");
        return gt2Var.invoke(this.left.fold(obj, gt2Var), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.a get(CoroutineContext.b bVar) {
        zq3.h(bVar, TransferTable.COLUMN_KEY);
        while (true) {
            CoroutineContext.a aVar = this.element.get(bVar);
            if (aVar != null) {
                return aVar;
            }
            CoroutineContext coroutineContext = this.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(bVar);
            }
            this = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        zq3.h(bVar, TransferTable.COLUMN_KEY);
        if (this.element.get(bVar) != null) {
            return this.left;
        }
        CoroutineContext minusKey = this.left.minusKey(bVar);
        return minusKey == this.left ? this : minusKey == EmptyCoroutineContext.a ? this.element : new CombinedContext(minusKey, this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold("", new gt2() { // from class: kotlin.coroutines.CombinedContext$toString$1
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str, CoroutineContext.a aVar) {
                zq3.h(str, "acc");
                zq3.h(aVar, "element");
                if (str.length() == 0) {
                    return aVar.toString();
                }
                return str + ", " + aVar;
            }
        })) + ']';
    }
}

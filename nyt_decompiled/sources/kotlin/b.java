package kotlin;

import defpackage.by0;
import defpackage.hc1;
import defpackage.it2;
import defpackage.ku8;
import defpackage.od1;
import defpackage.zq3;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes5.dex */
final class b extends od1 implements by0 {
    private it2 a;
    private Object b;
    private by0 c;
    private Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(it2 it2Var, Object obj) {
        super(null);
        Object obj2;
        zq3.h(it2Var, "block");
        this.a = it2Var;
        this.b = obj;
        zq3.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.c = this;
        obj2 = a.a;
        this.d = obj2;
    }

    @Override // defpackage.od1
    public Object a(Object obj, by0 by0Var) {
        zq3.f(by0Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.c = by0Var;
        this.b = obj;
        Object h = kotlin.coroutines.intrinsics.a.h();
        if (h == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return h;
    }

    public final Object b() {
        Object obj;
        Object obj2;
        while (true) {
            Object obj3 = this.d;
            by0 by0Var = this.c;
            if (by0Var == null) {
                f.b(obj3);
                return obj3;
            }
            obj = a.a;
            if (Result.d(obj, obj3)) {
                try {
                    it2 it2Var = this.a;
                    Object obj4 = this.b;
                    Object g = !(it2Var instanceof BaseContinuationImpl) ? kotlin.coroutines.intrinsics.a.g(it2Var, this, obj4, by0Var) : ((it2) ku8.f(it2Var, 3)).invoke(this, obj4, by0Var);
                    if (g != kotlin.coroutines.intrinsics.a.h()) {
                        by0Var.resumeWith(Result.b(g));
                    }
                } catch (Throwable th) {
                    Result.a aVar = Result.a;
                    by0Var.resumeWith(Result.b(f.a(th)));
                }
            } else {
                obj2 = a.a;
                this.d = obj2;
                by0Var.resumeWith(obj3);
            }
        }
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.a;
    }

    @Override // defpackage.by0
    public void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}

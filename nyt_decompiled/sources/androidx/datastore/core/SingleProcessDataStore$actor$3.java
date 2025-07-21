package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleProcessDataStore$actor$3 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$actor$3(SingleProcessDataStore singleProcessDataStore, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleProcessDataStore;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(SingleProcessDataStore.b bVar, by0 by0Var) {
        return ((SingleProcessDataStore$actor$3) create(bVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, by0Var);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object s;
        Object r;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            SingleProcessDataStore.b bVar = (SingleProcessDataStore.b) this.L$0;
            if (bVar instanceof SingleProcessDataStore.b.a) {
                this.label = 1;
                r = this.this$0.r((SingleProcessDataStore.b.a) bVar, this);
                if (r == h) {
                    return h;
                }
            } else if (bVar instanceof SingleProcessDataStore.b.C0075b) {
                this.label = 2;
                s = this.this$0.s((SingleProcessDataStore.b.C0075b) bVar, this);
                if (s == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}

package androidx.compose.runtime;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnapshotStateKt__ProduceStateKt$produceState$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $producer;
    final /* synthetic */ sy4 $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__ProduceStateKt$produceState$3(gt2 gt2Var, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$producer = gt2Var;
        this.$result = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SnapshotStateKt__ProduceStateKt$produceState$3 snapshotStateKt__ProduceStateKt$produceState$3 = new SnapshotStateKt__ProduceStateKt$produceState$3(this.$producer, this.$result, by0Var);
        snapshotStateKt__ProduceStateKt$produceState$3.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            gt2 gt2Var = this.$producer;
            o oVar = new o(this.$result, coroutineScope.getCoroutineContext());
            this.label = 1;
            if (gt2Var.invoke(oVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

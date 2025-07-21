package com.nytimes.android.abra.sources;

import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.models.TestSpec;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.abra.sources.AbraLocalSource$loadTests$1$1", f = "AbraLocalSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraLocalSource$loadTests$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ TestSpec $it;
    int label;
    final /* synthetic */ AbraLocalSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraLocalSource$loadTests$1$1(AbraLocalSource abraLocalSource, TestSpec testSpec, by0<? super AbraLocalSource$loadTests$1$1> by0Var) {
        super(2, by0Var);
        this.this$0 = abraLocalSource;
        this.$it = testSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new AbraLocalSource$loadTests$1$1(this.this$0, this.$it, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbraTest buildAbraTest;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        buildAbraTest = this.this$0.buildAbraTest(this.$it, this.this$0.getAbraAllocator().getVariant(this.$it.getTestName()));
        return buildAbraTest;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super AbraTest> by0Var) {
        return ((AbraLocalSource$loadTests$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

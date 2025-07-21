package com.nytimes.android.abra.sources;

import com.nytimes.android.abra.models.AbraTest;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.abra.sources.AbraLocalSource$getTest$1", f = "AbraLocalSource.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraLocalSource$getTest$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $testName;
    int label;
    final /* synthetic */ AbraLocalSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraLocalSource$getTest$1(AbraLocalSource abraLocalSource, String str, by0<? super AbraLocalSource$getTest$1> by0Var) {
        super(2, by0Var);
        this.this$0 = abraLocalSource;
        this.$testName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new AbraLocalSource$getTest$1(this.this$0, this.$testName, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AbraLocalSource abraLocalSource = this.this$0;
            String str = this.$testName;
            this.label = 1;
            obj = abraLocalSource.awaitTest(str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super AbraTest> by0Var) {
        return ((AbraLocalSource$getTest$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

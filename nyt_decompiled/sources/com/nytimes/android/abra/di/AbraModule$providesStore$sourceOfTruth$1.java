package com.nytimes.android.abra.di;

import com.nytimes.android.abra.models.AbraPackage;
import com.nytimes.android.abra.models.AbraStoreKey;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.abra.di.AbraModule$providesStore$sourceOfTruth$1", f = "AbraComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraModule$providesStore$sourceOfTruth$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $reader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraModule$providesStore$sourceOfTruth$1(qs2 qs2Var, by0<? super AbraModule$providesStore$sourceOfTruth$1> by0Var) {
        super(2, by0Var);
        this.$reader = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new AbraModule$providesStore$sourceOfTruth$1(this.$reader, by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(AbraStoreKey abraStoreKey, by0<? super AbraPackage> by0Var) {
        return ((AbraModule$providesStore$sourceOfTruth$1) create(abraStoreKey, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return this.$reader.mo865invoke();
    }
}

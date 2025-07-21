package com.nytimes.android.abra.di;

import com.nytimes.android.abra.models.AbraStoreKey;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.abra.di.AbraModule$providesStore$sourceOfTruth$2", f = "AbraComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraModule$providesStore$sourceOfTruth$2 extends SuspendLambda implements it2 {
    final /* synthetic */ ss2 $writer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraModule$providesStore$sourceOfTruth$2(ss2 ss2Var, by0<? super AbraModule$providesStore$sourceOfTruth$2> by0Var) {
        super(3, by0Var);
        this.$writer = ss2Var;
    }

    @Override // defpackage.it2
    public final Object invoke(AbraStoreKey abraStoreKey, Pair<byte[], byte[]> pair, by0<? super ww8> by0Var) {
        AbraModule$providesStore$sourceOfTruth$2 abraModule$providesStore$sourceOfTruth$2 = new AbraModule$providesStore$sourceOfTruth$2(this.$writer, by0Var);
        abraModule$providesStore$sourceOfTruth$2.L$0 = pair;
        return abraModule$providesStore$sourceOfTruth$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$writer.invoke((Pair) this.L$0);
        return ww8.a;
    }
}

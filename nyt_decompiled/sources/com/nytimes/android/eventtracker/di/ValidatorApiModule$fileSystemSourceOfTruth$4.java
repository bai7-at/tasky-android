package com.nytimes.android.eventtracker.di;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.eventtracker.di.ValidatorApiModule$fileSystemSourceOfTruth$4", f = "Dagger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ValidatorApiModule$fileSystemSourceOfTruth$4 extends SuspendLambda implements ss2 {
    final /* synthetic */ xe2 $fileSystem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidatorApiModule$fileSystemSourceOfTruth$4(xe2 xe2Var, by0 by0Var) {
        super(1, by0Var);
        this.$fileSystem = xe2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new ValidatorApiModule$fileSystemSourceOfTruth$4(this.$fileSystem, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((ValidatorApiModule$fileSystemSourceOfTruth$4) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$fileSystem.b("store_validator_file");
        return ww8.a;
    }
}

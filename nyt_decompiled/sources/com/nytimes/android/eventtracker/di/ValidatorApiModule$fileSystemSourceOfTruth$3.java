package com.nytimes.android.eventtracker.di;

import com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.eventtracker.di.ValidatorApiModule$fileSystemSourceOfTruth$3", f = "Dagger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ValidatorApiModule$fileSystemSourceOfTruth$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ xe2 $fileSystem;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidatorApiModule$fileSystemSourceOfTruth$3(xe2 xe2Var, by0 by0Var) {
        super(2, by0Var);
        this.$fileSystem = xe2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(EventTrackerScriptFetcher.Script script, by0 by0Var) {
        return ((ValidatorApiModule$fileSystemSourceOfTruth$3) create(script, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ValidatorApiModule$fileSystemSourceOfTruth$3 validatorApiModule$fileSystemSourceOfTruth$3 = new ValidatorApiModule$fileSystemSourceOfTruth$3(this.$fileSystem, by0Var);
        validatorApiModule$fileSystemSourceOfTruth$3.L$0 = obj;
        return validatorApiModule$fileSystemSourceOfTruth$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$fileSystem.a(((EventTrackerScriptFetcher.Script) this.L$0).toString());
        return ww8.a;
    }
}

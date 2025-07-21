package com.nytimes.android.libs.messagingarchitecture.di;

import android.content.Context;
import com.nytimes.android.libs.messagingarchitecture.betasettings.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.di.LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4", f = "LibsMessagingArchitectureModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4 libsMessagingArchitectureModule$Companion$provideDevSettingItem$4 = new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$4(by0Var);
        libsMessagingArchitectureModule$Companion$provideDevSettingItem$4.L$0 = obj;
        return libsMessagingArchitectureModule$Companion$provideDevSettingItem$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        com.nytimes.android.libs.messagingarchitecture.betasettings.c.a((Context) this.L$0, b.g.c);
        return ww8.a;
    }
}

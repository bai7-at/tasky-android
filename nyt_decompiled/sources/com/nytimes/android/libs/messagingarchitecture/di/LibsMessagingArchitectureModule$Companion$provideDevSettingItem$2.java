package com.nytimes.android.libs.messagingarchitecture.di;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.v34;
import defpackage.ww8;
import defpackage.xr4;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.threeten.bp.LocalDateTime;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.di.LibsMessagingArchitectureModule$Companion$provideDevSettingItem$2", f = "LibsMessagingArchitectureModule.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LibsMessagingArchitectureModule$Companion$provideDevSettingItem$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ xr4 $messageQueue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LibsMessagingArchitectureModule$Companion$provideDevSettingItem$2(xr4 xr4Var, by0 by0Var) {
        super(1, by0Var);
        this.$messageQueue = xr4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new LibsMessagingArchitectureModule$Companion$provideDevSettingItem$2(this.$messageQueue, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((LibsMessagingArchitectureModule$Companion$provideDevSettingItem$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String b;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            xr4 xr4Var = this.$messageQueue;
            this.label = 1;
            obj = xr4Var.i(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (localDateTime != null) {
            StringBuilder sb = new StringBuilder();
            b = v34.b(localDateTime);
            sb.append("prev: " + b);
            str = sb.toString();
            zq3.g(str, "toString(...)");
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }
}

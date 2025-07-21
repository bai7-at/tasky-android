package com.nytimes.android.features.settings.legal;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.n34;
import defpackage.o34;
import defpackage.u14;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.settings.legal.LibrariesViewModel$loadLibraries$1", f = "LibrariesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LibrariesViewModel$loadLibraries$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LibrariesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LibrariesViewModel$loadLibraries$1(LibrariesViewModel librariesViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = librariesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LibrariesViewModel$loadLibraries$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        n34 n34Var;
        o34 o34Var;
        MutableStateFlow mutableStateFlow2;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            n34Var = this.this$0.a;
            String a = n34Var.a();
            o34Var = this.this$0.b;
            Map c = o34Var.c(a);
            mutableStateFlow2 = this.this$0.c;
            mutableStateFlow2.setValue(new u14.c(c));
        } catch (Exception e) {
            mutableStateFlow = this.this$0.c;
            mutableStateFlow.setValue(new u14.a(e));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LibrariesViewModel$loadLibraries$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

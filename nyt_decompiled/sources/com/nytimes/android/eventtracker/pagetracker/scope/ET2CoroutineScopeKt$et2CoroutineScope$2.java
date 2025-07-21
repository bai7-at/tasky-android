package com.nytimes.android.eventtracker.pagetracker.scope;

import com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt$et2CoroutineScope$2", f = "ET2CoroutineScope.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ET2CoroutineScopeKt$et2CoroutineScope$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ET2SinglePageClient $et2SinglePageClient;
    final /* synthetic */ x08 $onPageLoadedCallback$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ET2CoroutineScopeKt$et2CoroutineScope$2(ET2SinglePageClient eT2SinglePageClient, x08 x08Var, by0 by0Var) {
        super(2, by0Var);
        this.$et2SinglePageClient = eT2SinglePageClient;
        this.$onPageLoadedCallback$delegate = x08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ET2CoroutineScopeKt$et2CoroutineScope$2 eT2CoroutineScopeKt$et2CoroutineScope$2 = new ET2CoroutineScopeKt$et2CoroutineScope$2(this.$et2SinglePageClient, this.$onPageLoadedCallback$delegate, by0Var);
        eT2CoroutineScopeKt$et2CoroutineScope$2.L$0 = obj;
        return eT2CoroutineScopeKt$et2CoroutineScope$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gt2 f;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ET2CoroutineScope eT2CoroutineScope = new ET2CoroutineScope(this.$et2SinglePageClient, (CoroutineScope) this.L$0);
            f = ET2CoroutineScopeKt.f(this.$onPageLoadedCallback$delegate);
            this.label = 1;
            if (f.invoke(eT2CoroutineScope, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ET2CoroutineScopeKt$et2CoroutineScope$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

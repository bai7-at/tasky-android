package com.nytimes.android.ribbon.destinations.more;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.destinations.more.SectionsDestinationKt$SectionsDestination$1", f = "SectionsDestination.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionsDestinationKt$SectionsDestination$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $defaultTabLoaded;
    final /* synthetic */ SectionsViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionsDestinationKt$SectionsDestination$1(boolean z, SectionsViewModel sectionsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$defaultTabLoaded = z;
        this.$viewModel = sectionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SectionsDestinationKt$SectionsDestination$1(this.$defaultTabLoaded, this.$viewModel, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (this.$defaultTabLoaded) {
            SectionsViewModel.k(this.$viewModel, null, 1, null);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SectionsDestinationKt$SectionsDestination$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

package com.nytimes.android.ribbon;

import com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentKt$SearchDialog$2", f = "DestinationContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentKt$SearchDialog$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $searchText;
    final /* synthetic */ DiscoverySearchViewModel $searchViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentKt$SearchDialog$2(DiscoverySearchViewModel discoverySearchViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.$searchViewModel = discoverySearchViewModel;
        this.$searchText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationContentKt$SearchDialog$2(this.$searchViewModel, this.$searchText, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$searchViewModel.m(this.$searchText);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DestinationContentKt$SearchDialog$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

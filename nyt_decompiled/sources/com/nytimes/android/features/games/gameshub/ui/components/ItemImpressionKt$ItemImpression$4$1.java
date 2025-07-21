package com.nytimes.android.features.games.gameshub.ui.components;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$4$1", f = "ItemImpression.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ItemImpressionKt$ItemImpression$4$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ sy4 $onCorrectET2Page$delegate;
    final /* synthetic */ qs2 $onItemViewed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemImpressionKt$ItemImpression$4$1(qs2 qs2Var, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$onItemViewed = qs2Var;
        this.$onCorrectET2Page$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ItemImpressionKt$ItemImpression$4$1(this.$onItemViewed, this.$onCorrectET2Page$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$onItemViewed.mo865invoke();
        ItemImpressionKt.c(this.$onCorrectET2Page$delegate, false);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ItemImpressionKt$ItemImpression$4$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

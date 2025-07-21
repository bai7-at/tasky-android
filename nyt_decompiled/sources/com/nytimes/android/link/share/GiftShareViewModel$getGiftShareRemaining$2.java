package com.nytimes.android.link.share;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.link.share.GiftShareViewModel$getGiftShareRemaining$2", f = "GiftShareViewModel.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GiftShareViewModel$getGiftShareRemaining$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ GiftShareViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GiftShareViewModel$getGiftShareRemaining$2(GiftShareViewModel giftShareViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = giftShareViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GiftShareViewModel$getGiftShareRemaining$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        GiftShareRemainingDataFetcher giftShareRemainingDataFetcher;
        Object h = a.h();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                giftShareRemainingDataFetcher = this.this$0.a;
                this.label = 1;
                obj = giftShareRemainingDataFetcher.a(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            i = ((Number) obj).intValue();
        } catch (Exception e) {
            NYTLogger.h(e);
            i = 0;
        }
        return cc0.c(i);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GiftShareViewModel$getGiftShareRemaining$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

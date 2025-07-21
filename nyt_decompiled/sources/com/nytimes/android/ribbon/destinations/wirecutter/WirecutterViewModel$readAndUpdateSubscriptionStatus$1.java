package com.nytimes.android.ribbon.destinations.wirecutter;

import com.comscore.streaming.ContentType;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$readAndUpdateSubscriptionStatus$1", f = "WirecutterViewModel.kt", l = {ContentType.SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WirecutterViewModel$readAndUpdateSubscriptionStatus$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $newsletterCode;
    int label;
    final /* synthetic */ WirecutterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WirecutterViewModel$readAndUpdateSubscriptionStatus$1(WirecutterViewModel wirecutterViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = wirecutterViewModel;
        this.$newsletterCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WirecutterViewModel$readAndUpdateSubscriptionStatus$1(this.this$0, this.$newsletterCode, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DestinationAssetRepository destinationAssetRepository;
        MutableStateFlow mutableStateFlow;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                destinationAssetRepository = this.this$0.a;
                this.label = 1;
                obj = destinationAssetRepository.o(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            mutableStateFlow = this.this$0.k;
            mutableStateFlow.setValue(cc0.a(((Set) obj).contains(this.$newsletterCode)));
        } catch (Exception e) {
            NYTLogger.h(e);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WirecutterViewModel$readAndUpdateSubscriptionStatus$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

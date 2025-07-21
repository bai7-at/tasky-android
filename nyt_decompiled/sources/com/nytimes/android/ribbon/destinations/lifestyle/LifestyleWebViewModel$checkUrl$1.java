package com.nytimes.android.ribbon.destinations.lifestyle;

import com.nytimes.android.api.config.model.RibbonConfigDTO;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.k44;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.lifestyle.LifestyleWebViewModel$checkUrl$1", f = "LifestyleWebViewModel.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LifestyleWebViewModel$checkUrl$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LifestyleWebViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifestyleWebViewModel$checkUrl$1(LifestyleWebViewModel lifestyleWebViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = lifestyleWebViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LifestyleWebViewModel$checkUrl$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String url;
        MutableStateFlow mutableStateFlow;
        Object value;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            LifestyleWebViewModel lifestyleWebViewModel = this.this$0;
            this.label = 1;
            obj = lifestyleWebViewModel.g(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        RibbonConfigDTO ribbonConfigDTO = (RibbonConfigDTO) obj;
        if (ribbonConfigDTO != null && (url = ribbonConfigDTO.getUrl()) != null) {
            mutableStateFlow = this.this$0.c;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ((k44) value).a(url)));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LifestyleWebViewModel$checkUrl$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

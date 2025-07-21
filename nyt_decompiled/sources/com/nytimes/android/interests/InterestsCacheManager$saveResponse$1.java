package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsCacheManager", f = "InterestsCacheManager.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "saveResponse")
/* loaded from: classes4.dex */
final class InterestsCacheManager$saveResponse$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsCacheManager$saveResponse$1(InterestsCacheManager interestsCacheManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsCacheManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.o(null, this);
    }
}

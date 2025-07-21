package com.nytimes.android.features.home.data;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.data.HomeRepository", f = "HomeRepository.kt", l = {72, ModuleDescriptor.MODULE_VERSION}, m = "deleteOldHomeSources")
/* loaded from: classes4.dex */
final class HomeRepository$deleteOldHomeSources$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeRepository$deleteOldHomeSources$1(HomeRepository homeRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        f = this.this$0.f(this);
        return f;
    }
}

package com.nytimes.android.subauth.core.devsettings;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService", f = "DevSettingsTargetingService.kt", l = {52}, m = "fromDataStore")
/* loaded from: classes4.dex */
final class DevSettingsTargetingService$fromDataStore$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DevSettingsTargetingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingsTargetingService$fromDataStore$1(DevSettingsTargetingService devSettingsTargetingService, by0 by0Var) {
        super(by0Var);
        this.this$0 = devSettingsTargetingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(this);
    }
}

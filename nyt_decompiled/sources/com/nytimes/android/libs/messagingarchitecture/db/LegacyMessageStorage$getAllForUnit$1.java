package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage", f = "MessageStorage.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "getAllForUnit")
/* loaded from: classes4.dex */
final class LegacyMessageStorage$getAllForUnit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyMessageStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyMessageStorage$getAllForUnit$1(LegacyMessageStorage legacyMessageStorage, by0 by0Var) {
        super(by0Var);
        this.this$0 = legacyMessageStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, this);
    }
}

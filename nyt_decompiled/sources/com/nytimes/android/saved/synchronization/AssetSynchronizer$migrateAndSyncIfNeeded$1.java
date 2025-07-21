package com.nytimes.android.saved.synchronization;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.synchronization.AssetSynchronizer", f = "AssetSynchronizer.kt", l = {BuildConfig.VERSION_CODE, 30}, m = "migrateAndSyncIfNeeded")
/* loaded from: classes4.dex */
final class AssetSynchronizer$migrateAndSyncIfNeeded$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetSynchronizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetSynchronizer$migrateAndSyncIfNeeded$1(AssetSynchronizer assetSynchronizer, by0 by0Var) {
        super(by0Var);
        this.this$0 = assetSynchronizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(this);
    }
}

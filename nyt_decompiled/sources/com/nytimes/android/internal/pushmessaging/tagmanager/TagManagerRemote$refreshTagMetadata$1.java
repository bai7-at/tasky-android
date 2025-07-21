package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote", f = "TagManagerRemote.kt", l = {27, BuildConfig.VERSION_CODE}, m = "refreshTagMetadata")
/* loaded from: classes4.dex */
final class TagManagerRemote$refreshTagMetadata$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagManagerRemote this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagManagerRemote$refreshTagMetadata$1(TagManagerRemote tagManagerRemote, by0 by0Var) {
        super(by0Var);
        this.this$0 = tagManagerRemote;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}

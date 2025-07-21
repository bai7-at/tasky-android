package com.nytimes.subauth.ui.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt", f = "SubauthUiParamsUtil.kt", l = {EventType.SUBS}, m = "applyPurrToSubauthUserUI")
/* loaded from: classes4.dex */
final class SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return SubauthUiParamsUtilKt.c(null, null, null, this);
    }
}

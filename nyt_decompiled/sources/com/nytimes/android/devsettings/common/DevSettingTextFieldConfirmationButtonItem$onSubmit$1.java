package com.nytimes.android.devsettings.common;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.sn1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem$onSubmit$1", f = "DevSettingTextFieldItem.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DevSettingTextFieldConfirmationButtonItem$onSubmit$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $text;
    final /* synthetic */ ss2 $updateText;
    int label;
    final /* synthetic */ DevSettingTextFieldConfirmationButtonItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingTextFieldConfirmationButtonItem$onSubmit$1(DevSettingTextFieldConfirmationButtonItem devSettingTextFieldConfirmationButtonItem, Context context, String str, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = devSettingTextFieldConfirmationButtonItem;
        this.$context = context;
        this.$text = str;
        this.$updateText = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DevSettingTextFieldConfirmationButtonItem$onSubmit$1(this.this$0, this.$context, this.$text, this.$updateText, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            it2 s = this.this$0.s();
            Context context = this.$context;
            String str = this.$text;
            this.label = 1;
            if (s.invoke(context, str, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        ww8 ww8Var = ww8.a;
        if (this.this$0.getRequestRestart()) {
            sn1.a.b();
        }
        if (this.this$0.r()) {
            this.$updateText.invoke("");
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DevSettingTextFieldConfirmationButtonItem$onSubmit$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

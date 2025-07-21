package com.nytimes.android.comments.menu.item;

import android.app.Activity;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.oa4;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.menu.item.CommentHandler$login$2", f = "CommentHandler.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentHandler$login$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $onSuccess;
    int label;
    final /* synthetic */ CommentHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentHandler$login$2(CommentHandler commentHandler, qs2 qs2Var, by0<? super CommentHandler$login$2> by0Var) {
        super(2, by0Var);
        this.this$0 = commentHandler;
        this.$onSuccess = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentHandler$login$2(this.this$0, this.$onSuccess, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.entitlements.a aVar;
        Activity activity;
        com.nytimes.android.entitlements.a aVar2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.eCommClient;
            activity = this.this$0.activity;
            RegiInterface regiInterface = RegiInterface.RegiSavePrompt;
            this.label = 1;
            obj = aVar.s(activity, regiInterface, "Save Log In Prompt", this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        aVar2 = this.this$0.eCommClient;
        if (aVar2.v((oa4) obj)) {
            this.$onSuccess.mo865invoke();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((CommentHandler$login$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

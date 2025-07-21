package com.nytimes.subauth.ui.purr.tcf;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q96;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$trackLinkedText$1", f = "TCFViewModel.kt", l = {167, 171}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$trackLinkedText$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$trackLinkedText$1(String str, TCFViewModel tCFViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$text = str;
        this.this$0 = tCFViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TCFViewModel$trackLinkedText$1(this.$text, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            String str = this.$text;
            if (zq3.c(str, "https://www.nytimes.com/cookie-policy?gdpr-purr=true")) {
                MutableSharedFlow mutableSharedFlow = this.this$0.c;
                q96.b.C0516b c0516b = q96.b.C0516b.d;
                this.label = 1;
                if (mutableSharedFlow.emit(c0516b, this) == h) {
                    return h;
                }
            } else if (zq3.c(str, "https://help.nytimes.com/hc/en-us/articles/10940941449492-The-New-York-Times-Company-Privacy-Policy-")) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.c;
                q96.b.f fVar = q96.b.f.d;
                this.label = 2;
                if (mutableSharedFlow2.emit(fVar, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TCFViewModel$trackLinkedText$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

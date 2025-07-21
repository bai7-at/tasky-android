package com.nytimes.android.feedback;

import defpackage.by0;
import defpackage.du8;
import defpackage.ed2;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wc2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

@fc1(c = "com.nytimes.android.feedback.FeedbackViewModel$retrieveAppInfo$1", f = "FeedbackViewModel.kt", l = {43, 49}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackViewModel$retrieveAppInfo$1 extends SuspendLambda implements gt2 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FeedbackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackViewModel$retrieveAppInfo$1(FeedbackViewModel feedbackViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FeedbackViewModel$retrieveAppInfo$1 feedbackViewModel$retrieveAppInfo$1 = new FeedbackViewModel$retrieveAppInfo$1(this.this$0, by0Var);
        feedbackViewModel$retrieveAppInfo$1.L$0 = obj;
        return feedbackViewModel$retrieveAppInfo$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred deferred;
        String str;
        ed2 ed2Var;
        wc2 wc2Var;
        ed2 ed2Var2;
        wc2 wc2Var2;
        wc2 wc2Var3;
        ed2 ed2Var3;
        String str2;
        ed2 ed2Var4;
        Pair[] pairArr;
        int i;
        String str3;
        Pair[] pairArr2;
        ed2 ed2Var5;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FeedbackViewModel$retrieveAppInfo$1$userAccountDef$1(this.this$0, null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new FeedbackViewModel$retrieveAppInfo$1$status$1(this.this$0, null), 3, null);
            this.L$0 = async$default2;
            this.label = 1;
            Object await = async$default.await(this);
            if (await == h) {
                return h;
            }
            deferred = async$default2;
            obj = await;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                str3 = (String) this.L$3;
                pairArr = (Pair[]) this.L$2;
                pairArr2 = (Pair[]) this.L$1;
                str = (String) this.L$0;
                kotlin.f.b(obj);
                pairArr[i] = du8.a(str3, obj);
                this.this$0.j().n(new Pair(str, t.m(pairArr2)));
                return ww8.a;
            }
            deferred = (Deferred) this.L$0;
            kotlin.f.b(obj);
        }
        str = (String) obj;
        Pair[] pairArr3 = new Pair[4];
        ed2Var = this.this$0.c;
        String C = ed2Var.C();
        wc2Var = this.this$0.b;
        pairArr3[0] = du8.a(C, wc2Var.getOsVersion());
        ed2Var2 = this.this$0.c;
        String h2 = ed2Var2.h();
        wc2Var2 = this.this$0.b;
        String appVersion = wc2Var2.getAppVersion();
        wc2Var3 = this.this$0.b;
        pairArr3[1] = du8.a(h2, appVersion + "(" + wc2Var3.b() + ")");
        ed2Var3 = this.this$0.c;
        String B = ed2Var3.B();
        FeedbackViewModel feedbackViewModel = this.this$0;
        if (str.length() == 0) {
            ed2Var5 = feedbackViewModel.c;
            str2 = ed2Var5.f();
        } else {
            str2 = str;
        }
        pairArr3[2] = du8.a(B, str2);
        ed2Var4 = this.this$0.c;
        String g = ed2Var4.g();
        this.L$0 = str;
        this.L$1 = pairArr3;
        this.L$2 = pairArr3;
        this.L$3 = g;
        this.I$0 = 3;
        this.label = 2;
        Object await2 = deferred.await(this);
        if (await2 == h) {
            return h;
        }
        pairArr = pairArr3;
        i = 3;
        obj = await2;
        str3 = g;
        pairArr2 = pairArr;
        pairArr[i] = du8.a(str3, obj);
        this.this$0.j().n(new Pair(str, t.m(pairArr2)));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedbackViewModel$retrieveAppInfo$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

package com.nytimes.android.feedback;

import com.nytimes.android.feedback.Status;
import defpackage.by0;
import defpackage.du8;
import defpackage.ed2;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.so1;
import defpackage.tc2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.feedback.FeedbackFieldProviderImpl$generateFields$2", f = "FeedbackFieldProviderImpl.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackFieldProviderImpl$generateFields$2 extends SuspendLambda implements gt2 {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ FeedbackFieldProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackFieldProviderImpl$generateFields$2(FeedbackFieldProviderImpl feedbackFieldProviderImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackFieldProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackFieldProviderImpl$generateFields$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Status.a aVar;
        tc2 tc2Var;
        boolean z;
        ed2 ed2Var;
        so1 so1Var;
        ed2 ed2Var2;
        so1 so1Var2;
        ed2 ed2Var3;
        tc2 tc2Var2;
        ed2 ed2Var4;
        tc2 tc2Var3;
        ed2 ed2Var5;
        ed2 ed2Var6;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            aVar = Status.Companion;
            tc2Var = this.this$0.d;
            boolean a = tc2Var.h().a();
            FeedbackFieldProviderImpl feedbackFieldProviderImpl = this.this$0;
            this.L$0 = aVar;
            this.Z$0 = a;
            this.label = 1;
            Object e = feedbackFieldProviderImpl.e(this);
            if (e == h) {
                return h;
            }
            z = a;
            obj = e;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            aVar = (Status.a) this.L$0;
            kotlin.f.b(obj);
        }
        Status a2 = aVar.a(z, (String) obj);
        ed2Var = this.this$0.e;
        String w = ed2Var.w();
        so1Var = this.this$0.a;
        Pair a3 = du8.a(w, so1Var.d());
        ed2Var2 = this.this$0.e;
        String b = ed2Var2.b();
        so1Var2 = this.this$0.a;
        Pair a4 = du8.a(b, so1Var2.h());
        ed2Var3 = this.this$0.e;
        String x = ed2Var3.x();
        tc2Var2 = this.this$0.d;
        Pair a5 = du8.a(x, tc2Var2.a());
        ed2Var4 = this.this$0.e;
        String n = ed2Var4.n();
        tc2Var3 = this.this$0.d;
        Pair a6 = du8.a(n, tc2Var3.k());
        ed2Var5 = this.this$0.e;
        String F = ed2Var5.F();
        ed2Var6 = this.this$0.e;
        return t.m(a3, a4, a5, a6, du8.a(F, a2.getResString(ed2Var6).b()));
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedbackFieldProviderImpl$generateFields$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

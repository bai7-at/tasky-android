package com.nytimes.android.ribbon.destinations.wirecutter;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$toggleNewsletterSubscription$1", f = "WirecutterViewModel.kt", l = {127, 131}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WirecutterViewModel$toggleNewsletterSubscription$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $newsletterCode;
    int label;
    final /* synthetic */ WirecutterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WirecutterViewModel$toggleNewsletterSubscription$1(WirecutterViewModel wirecutterViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = wirecutterViewModel;
        this.$newsletterCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WirecutterViewModel$toggleNewsletterSubscription$1(this.this$0, this.$newsletterCode, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        NewsletterSubscriptionMutator newsletterSubscriptionMutator;
        NewsletterSubscriptionMutator newsletterSubscriptionMutator2;
        MutableStateFlow mutableStateFlow5;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                mutableStateFlow3 = this.this$0.j;
                mutableStateFlow3.setValue(u14.b.b);
                this.this$0.t(this.$newsletterCode);
                mutableStateFlow4 = this.this$0.k;
                boolean booleanValue = ((Boolean) mutableStateFlow4.getValue()).booleanValue();
                if (booleanValue) {
                    newsletterSubscriptionMutator2 = this.this$0.c;
                    String str = this.$newsletterCode;
                    this.label = 1;
                    if (newsletterSubscriptionMutator2.d(str, this) == h) {
                        return h;
                    }
                } else if (!booleanValue) {
                    newsletterSubscriptionMutator = this.this$0.c;
                    String str2 = this.$newsletterCode;
                    this.label = 2;
                    if (newsletterSubscriptionMutator.c(str2, this) == h) {
                        return h;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            this.this$0.t(this.$newsletterCode);
            mutableStateFlow5 = this.this$0.j;
            mutableStateFlow5.setValue(new u14.c(cc0.a(true)));
        } catch (ApolloException e) {
            mutableStateFlow2 = this.this$0.j;
            mutableStateFlow2.setValue(new u14.a(e));
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.j;
            mutableStateFlow.setValue(new u14.a(e2));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WirecutterViewModel$toggleNewsletterSubscription$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

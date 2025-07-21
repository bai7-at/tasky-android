package com.nytimes.android.entitlements;

import android.content.Context;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.oa4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$loginObservable$1", f = "ECommClientImpl.kt", l = {309, 310}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ECommClientImpl$loginObservable$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $referer;
    final /* synthetic */ RegiInterface $regiInterface;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ECommClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ECommClientImpl$loginObservable$1(ECommClientImpl eCommClientImpl, Context context, RegiInterface regiInterface, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = eCommClientImpl;
        this.$context = context;
        this.$regiInterface = regiInterface;
        this.$referer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ECommClientImpl$loginObservable$1 eCommClientImpl$loginObservable$1 = new ECommClientImpl$loginObservable$1(this.this$0, this.$context, this.$regiInterface, this.$referer, by0Var);
        eCommClientImpl$loginObservable$1.L$0 = obj;
        return eCommClientImpl$loginObservable$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            producerScope = (ProducerScope) this.L$0;
            ECommClientImpl eCommClientImpl = this.this$0;
            Context context = this.$context;
            RegiInterface regiInterface = this.$regiInterface;
            String str = this.$referer;
            this.L$0 = producerScope;
            this.label = 1;
            obj = eCommClientImpl.s(context, regiInterface, str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            producerScope = (ProducerScope) this.L$0;
            f.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (producerScope.send((oa4) obj, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((ECommClientImpl$loginObservable$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}

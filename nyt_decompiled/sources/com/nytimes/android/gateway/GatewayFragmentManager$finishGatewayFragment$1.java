package com.nytimes.android.gateway;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.gateway.GatewayFragmentManager$finishGatewayFragment$1", f = "GatewayFragmentManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GatewayFragmentManager$finishGatewayFragment$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ Fragment $gatewayFragment;
    int label;
    final /* synthetic */ GatewayFragmentManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GatewayFragmentManager$finishGatewayFragment$1(GatewayFragmentManager gatewayFragmentManager, FragmentManager fragmentManager, Fragment fragment, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gatewayFragmentManager;
        this.$fm = fragmentManager;
        this.$gatewayFragment = fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GatewayFragmentManager$finishGatewayFragment$1(this.this$0, this.$fm, this.$gatewayFragment, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            GatewayFragmentManager gatewayFragmentManager = this.this$0;
            FragmentManager fragmentManager = this.$fm;
            final Fragment fragment = this.$gatewayFragment;
            GatewayFragmentManager.p(gatewayFragmentManager, fragmentManager, false, new ss2() { // from class: com.nytimes.android.gateway.GatewayFragmentManager$finishGatewayFragment$1.1
                {
                    super(1);
                }

                public final void b(r rVar) {
                    zq3.h(rVar, "$this$tryCommitNow");
                    rVar.p(Fragment.this);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((r) obj2);
                    return ww8.a;
                }
            }, 1, null);
        } catch (Exception e) {
            NYTLogger.g("Sorry, we could not remove gateway fragment", e);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GatewayFragmentManager$finishGatewayFragment$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

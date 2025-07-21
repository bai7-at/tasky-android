package com.nytimes.subauth.ui.purr.tcf;

import com.nytimes.subauth.ui.purr.tcf.TCFViewModel;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.mm6;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$tcfAcceptRejectAll$1", f = "TCFViewModel.kt", l = {372, 374, 381}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TCFViewModel$tcfAcceptRejectAll$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $analyticsAction;
    final /* synthetic */ ss2 $applyPreferenceAction;
    int label;
    final /* synthetic */ TCFViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFViewModel$tcfAcceptRejectAll$1(TCFViewModel tCFViewModel, ss2 ss2Var, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = tCFViewModel;
        this.$applyPreferenceAction = ss2Var;
        this.$analyticsAction = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TCFViewModel$tcfAcceptRejectAll$1(this.this$0, this.$applyPreferenceAction, this.$analyticsAction, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            ul8.a.z("PURR").e(e);
            gt2 gt2Var = this.$analyticsAction;
            Boolean a = cc0.a(false);
            this.label = 3;
            if (gt2Var.invoke(a, this) == h) {
                return h;
            }
        }
        if (i == 0) {
            f.b(obj);
            if (!this.this$0.t()) {
                this.this$0.D(cc0.c(mm6.purr_ui_error_device_offline));
                this.this$0.G(TCFViewModel.Companion.TCFScreenValue.HIDDEN);
                return ww8.a;
            }
            this.this$0.C(true);
            ss2 ss2Var = this.$applyPreferenceAction;
            this.label = 1;
            obj = ss2Var.invoke(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    f.b(obj);
                    this.this$0.C(false);
                    this.this$0.G(TCFViewModel.Companion.TCFScreenValue.HIDDEN);
                    return ww8.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this.this$0.C(false);
                this.this$0.D(cc0.c(mm6.tcf_save_failure));
                this.this$0.G(TCFViewModel.Companion.TCFScreenValue.HIDDEN);
                return ww8.a;
            }
            f.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            throw new TCFException("TCF apply preference failed", null, 2, null);
        }
        gt2 gt2Var2 = this.$analyticsAction;
        Boolean a2 = cc0.a(true);
        this.label = 2;
        if (gt2Var2.invoke(a2, this) == h) {
            return h;
        }
        this.this$0.C(false);
        this.this$0.G(TCFViewModel.Companion.TCFScreenValue.HIDDEN);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TCFViewModel$tcfAcceptRejectAll$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

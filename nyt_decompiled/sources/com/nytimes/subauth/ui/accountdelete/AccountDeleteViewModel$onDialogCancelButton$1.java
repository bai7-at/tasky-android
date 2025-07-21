package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.e58;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$onDialogCancelButton$1", f = "AccountDeleteViewModel.kt", l = {78, 81, 83, 87}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountDeleteViewModel$onDialogCancelButton$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AccountDeleteViewModel.AccountDeleteDialogState $state;
    int label;
    final /* synthetic */ AccountDeleteViewModel this$0;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AccountDeleteViewModel.AccountDeleteDialogState.values().length];
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.CONFIRM_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.ERROR_ACTIVE_SUBSCRIPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountDeleteViewModel.AccountDeleteDialogState.ERROR_GENERAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountDeleteViewModel$onDialogCancelButton$1(AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState, AccountDeleteViewModel accountDeleteViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$state = accountDeleteDialogState;
        this.this$0 = accountDeleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountDeleteViewModel$onDialogCancelButton$1(this.$state, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            int i2 = a.a[this.$state.ordinal()];
            if (i2 == 1) {
                ul8.a.u("dialog cancel button clicked in unknown state", new Object[0]);
            } else if (i2 == 2) {
                MutableSharedFlow m = this.this$0.m();
                e58.b.e eVar = e58.b.e.g;
                this.label = 1;
                if (m.emit(eVar, this) == h) {
                    return h;
                }
            } else if (i2 == 3) {
                MutableSharedFlow m2 = this.this$0.m();
                e58.b.a aVar = e58.b.a.g;
                this.label = 2;
                if (m2.emit(aVar, this) == h) {
                    return h;
                }
            } else if (i2 == 4) {
                MutableSharedFlow m3 = this.this$0.m();
                e58.b.d dVar = e58.b.d.g;
                this.label = 3;
                if (m3.emit(dVar, this) == h) {
                    return h;
                }
            } else if (i2 == 5) {
                MutableSharedFlow m4 = this.this$0.m();
                e58.b.f fVar = e58.b.f.g;
                this.label = 4;
                if (m4.emit(fVar, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AccountDeleteViewModel$onDialogCancelButton$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

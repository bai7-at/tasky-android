package com.nytimes.subauth.ui.accountdelete;

import com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel;
import defpackage.by0;
import defpackage.e58;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.subauth.ui.accountdelete.AccountDeleteViewModel$onDialogVisible$1", f = "AccountDeleteViewModel.kt", l = {54, 58, 62, 66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountDeleteViewModel$onDialogVisible$1 extends SuspendLambda implements gt2 {
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
    AccountDeleteViewModel$onDialogVisible$1(AccountDeleteViewModel.AccountDeleteDialogState accountDeleteDialogState, AccountDeleteViewModel accountDeleteViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$state = accountDeleteDialogState;
        this.this$0 = accountDeleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountDeleteViewModel$onDialogVisible$1(this.$state, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            int i2 = a.a[this.$state.ordinal()];
            if (i2 == 2) {
                MutableSharedFlow m = this.this$0.m();
                e58.a.d dVar = e58.a.d.d;
                this.label = 1;
                if (m.emit(dVar, this) == h) {
                    return h;
                }
            } else if (i2 == 3) {
                MutableSharedFlow m2 = this.this$0.m();
                e58.a.b bVar = e58.a.b.d;
                this.label = 2;
                if (m2.emit(bVar, this) == h) {
                    return h;
                }
            } else if (i2 == 4) {
                MutableSharedFlow m3 = this.this$0.m();
                e58.a.C0478a c0478a = e58.a.C0478a.d;
                this.label = 3;
                if (m3.emit(c0478a, this) == h) {
                    return h;
                }
            } else if (i2 == 5) {
                MutableSharedFlow m4 = this.this$0.m();
                e58.a.e eVar = e58.a.e.d;
                this.label = 4;
                if (m4.emit(eVar, this) == h) {
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
        return ((AccountDeleteViewModel$onDialogVisible$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

package com.nytimes.android.features.settings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.settings.AccountSettingsPresenter$setupAccountPreferences$1", f = "AccountSettingsArchitecture.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AccountSettingsPresenter$setupAccountPreferences$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AccountSettingsPresenter this$0;

    @fc1(c = "com.nytimes.android.features.settings.AccountSettingsPresenter$setupAccountPreferences$1$1", f = "AccountSettingsArchitecture.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.settings.AccountSettingsPresenter$setupAccountPreferences$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ c $renderedState;
        int label;
        final /* synthetic */ AccountSettingsPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountSettingsPresenter accountSettingsPresenter, c cVar, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = accountSettingsPresenter;
            this.$renderedState = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, this.$renderedState, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            q3 e = this.this$0.e();
            if (e != null) {
                e.render(this.$renderedState);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSettingsPresenter$setupAccountPreferences$1(AccountSettingsPresenter accountSettingsPresenter, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = accountSettingsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AccountSettingsPresenter$setupAccountPreferences$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c g;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            g = this.this$0.g();
            CoroutineDispatcher d = this.this$0.d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, g, null);
            this.label = 1;
            if (BuildersKt.withContext(d, anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AccountSettingsPresenter$setupAccountPreferences$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

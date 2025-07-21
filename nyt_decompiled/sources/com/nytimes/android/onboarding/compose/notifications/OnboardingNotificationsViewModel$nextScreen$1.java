package com.nytimes.android.onboarding.compose.notifications;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.onboarding.compose.c;
import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$nextScreen$1", f = "OnboardingNotificationsViewModel.kt", l = {69, 70}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingNotificationsViewModel$nextScreen$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ OnboardingNotificationsViewModel this$0;

    @fc1(c = "com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$nextScreen$1$1", f = "OnboardingNotificationsViewModel.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel$nextScreen$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ OnboardingNotificationsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnboardingNotificationsViewModel onboardingNotificationsViewModel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = onboardingNotificationsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object F;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                OnboardingNotificationsViewModel onboardingNotificationsViewModel = this.this$0;
                List list = (List) onboardingNotificationsViewModel.q().getValue();
                this.label = 1;
                F = onboardingNotificationsViewModel.F(list, this);
                if (F == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingNotificationsViewModel$nextScreen$1(OnboardingNotificationsViewModel onboardingNotificationsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = onboardingNotificationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingNotificationsViewModel$nextScreen$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        b bVar;
        CoroutineDispatcher coroutineDispatcher;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            eT2SimpleScope = this.this$0.l;
            ET2PageScope.DefaultImpls.a(eT2SimpleScope, new e52.e(), new s42("asset tap", "continue", null, null, null, null, null, null, "push notifications", 252, null), new u32(null, "onboarding", "tap", 1, null), null, 8, null);
            this.this$0.x("onboarding");
            bVar = this.this$0.n;
            c.C0372c c0372c = c.C0372c.b;
            this.label = 1;
            if (bVar.d(c0372c, this) == h) {
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
            f.b(obj);
        }
        coroutineDispatcher = this.this$0.r;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((OnboardingNotificationsViewModel$nextScreen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

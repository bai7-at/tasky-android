package com.nytimes.android.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import defpackage.by0;
import defpackage.cu;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@fc1(c = "com.nytimes.android.utils.OnboardingActivityManager$initSmartLockTask$1", f = "OnboardingActivityManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingActivityManager$initSmartLockTask$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $launchingWelcome;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ LifecycleCoroutineScope $lifecycleScope;
    int label;
    final /* synthetic */ OnboardingActivityManager this$0;

    @fc1(c = "com.nytimes.android.utils.OnboardingActivityManager$initSmartLockTask$1$1", f = "OnboardingActivityManager.kt", l = {98}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.utils.OnboardingActivityManager$initSmartLockTask$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ OnboardingActivityManager this$0;

        /* renamed from: com.nytimes.android.utils.OnboardingActivityManager$initSmartLockTask$1$1$a */
        static final class a implements FlowCollector {
            final /* synthetic */ OnboardingActivityManager a;

            a(OnboardingActivityManager onboardingActivityManager) {
                this.a = onboardingActivityManager;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(cu cuVar, by0 by0Var) {
                Object h;
                h = this.a.h(cuVar, by0Var);
                return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnboardingActivityManager onboardingActivityManager, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = onboardingActivityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SmartLockLifecycleObserver smartLockLifecycleObserver;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                smartLockLifecycleObserver = this.this$0.e;
                StateFlow e = smartLockLifecycleObserver.e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (e.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingActivityManager$initSmartLockTask$1(boolean z, Lifecycle lifecycle, OnboardingActivityManager onboardingActivityManager, LifecycleCoroutineScope lifecycleCoroutineScope, by0 by0Var) {
        super(2, by0Var);
        this.$launchingWelcome = z;
        this.$lifecycle = lifecycle;
        this.this$0 = onboardingActivityManager;
        this.$lifecycleScope = lifecycleCoroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingActivityManager$initSmartLockTask$1(this.$launchingWelcome, this.$lifecycle, this.this$0, this.$lifecycleScope, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SmartLockLifecycleObserver smartLockLifecycleObserver;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (!this.$launchingWelcome) {
            Lifecycle lifecycle = this.$lifecycle;
            smartLockLifecycleObserver = this.this$0.e;
            lifecycle.a(smartLockLifecycleObserver);
            this.$lifecycleScope.b(new AnonymousClass1(this.this$0, null));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((OnboardingActivityManager$initSmartLockTask$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

package com.nytimes.android.onboarding.compose;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import defpackage.by0;
import defpackage.cu;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@fc1(c = "com.nytimes.android.onboarding.compose.OnboardingViewModel$observeLoginAndSmartlockEvents$1", f = "OnboardingViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingViewModel$observeLoginAndSmartlockEvents$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ SmartLockLifecycleObserver $smartLock;
    int label;
    final /* synthetic */ OnboardingViewModel this$0;

    @fc1(c = "com.nytimes.android.onboarding.compose.OnboardingViewModel$observeLoginAndSmartlockEvents$1$1", f = "OnboardingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.onboarding.compose.OnboardingViewModel$observeLoginAndSmartlockEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ OnboardingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnboardingViewModel onboardingViewModel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = onboardingViewModel;
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.this$0.j();
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.onboarding.compose.OnboardingViewModel$observeLoginAndSmartlockEvents$1$2", f = "OnboardingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.onboarding.compose.OnboardingViewModel$observeLoginAndSmartlockEvents$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.i((Throwable) this.L$0, "Login Failed", new Object[0]);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ OnboardingViewModel a;

        a(OnboardingViewModel onboardingViewModel) {
            this.a = onboardingViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(cu cuVar, by0 by0Var) {
            this.a.k(cuVar);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingViewModel$observeLoginAndSmartlockEvents$1(OnboardingViewModel onboardingViewModel, SmartLockLifecycleObserver smartLockLifecycleObserver, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = onboardingViewModel;
        this.$smartLock = smartLockLifecycleObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new OnboardingViewModel$observeLoginAndSmartlockEvents$1(this.this$0, this.$smartLock, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.entitlements.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.b;
            FlowKt.m911catch(FlowKt.onEach(aVar.e(), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null));
            StateFlow e = this.$smartLock.e();
            a aVar2 = new a(this.this$0);
            this.label = 1;
            if (e.collect(aVar2, this) == h) {
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
        return ((OnboardingViewModel$observeLoginAndSmartlockEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

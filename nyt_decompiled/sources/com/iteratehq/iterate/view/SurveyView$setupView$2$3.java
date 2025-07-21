package com.iteratehq.iterate.view;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zj8;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.net.URL;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;

@fc1(c = "com.iteratehq.iterate.view.SurveyView$setupView$2$3", f = "SurveyView.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SurveyView$setupView$2$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$ObjectRef<Exception> $error;
    final /* synthetic */ Ref$ObjectRef<String> $response;
    final /* synthetic */ String $url;
    int label;

    @fc1(c = "com.iteratehq.iterate.view.SurveyView$setupView$2$3$1", f = "SurveyView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.iteratehq.iterate.view.SurveyView$setupView$2$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Ref$ObjectRef<String> $response;
        final /* synthetic */ String $url;
        private /* synthetic */ Object L$0;
        int label;

        @fc1(c = "com.iteratehq.iterate.view.SurveyView$setupView$2$3$1$1", f = "SurveyView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.iteratehq.iterate.view.SurveyView$setupView$2$3$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02231 extends SuspendLambda implements gt2 {
            final /* synthetic */ Ref$ObjectRef<String> $response;
            final /* synthetic */ String $url;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02231(Ref$ObjectRef ref$ObjectRef, String str, by0 by0Var) {
                super(2, by0Var);
                this.$response = ref$ObjectRef;
                this.$url = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new C02231(this.$response, this.$url, by0Var);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                Ref$ObjectRef<String> ref$ObjectRef = this.$response;
                URL url = new URL(this.$url);
                ref$ObjectRef.element = new String(zj8.e(url), yj0.b);
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((C02231) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$ObjectRef ref$ObjectRef, String str, by0 by0Var) {
            super(2, by0Var);
            this.$response = ref$ObjectRef;
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, this.$url, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            launch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new C02231(this.$response, this.$url, null), 2, null);
            return launch$default;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SurveyView$setupView$2$3(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, String str, by0 by0Var) {
        super(2, by0Var);
        this.$error = ref$ObjectRef;
        this.$response = ref$ObjectRef2;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SurveyView$setupView$2$3(this.$error, this.$response, this.$url, by0Var);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Exception] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, this.$url, null);
                this.label = 1;
                obj = TimeoutKt.withTimeout(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, anonymousClass1, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return obj;
        } catch (Exception e) {
            this.$error.element = e;
            return ww8.a;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SurveyView$setupView$2$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

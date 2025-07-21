package com.nytimes.android;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import defpackage.by0;
import defpackage.d44;
import defpackage.ec7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.ScreenshotTracker$registerScreenshotEventProvider$1", f = "ScreenshotTracker.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScreenshotTracker$registerScreenshotEventProvider$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ d44 $lifecycleOwner;
    int label;
    final /* synthetic */ ScreenshotTracker this$0;

    @fc1(c = "com.nytimes.android.ScreenshotTracker$registerScreenshotEventProvider$1$1", f = "ScreenshotTracker.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ScreenshotTracker$registerScreenshotEventProvider$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ ScreenshotTracker this$0;

        /* renamed from: com.nytimes.android.ScreenshotTracker$registerScreenshotEventProvider$1$1$a */
        static final class a implements FlowCollector {
            final /* synthetic */ ScreenshotTracker a;

            a(ScreenshotTracker screenshotTracker) {
                this.a = screenshotTracker;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(File file, by0 by0Var) {
                Object h;
                this.a.n();
                h = this.a.h(file, by0Var);
                return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScreenshotTracker screenshotTracker, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = screenshotTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ec7 ec7Var;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                ec7Var = this.this$0.a;
                Flow a2 = ec7Var.a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (a2.collect(aVar, this) == h) {
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
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenshotTracker$registerScreenshotEventProvider$1(d44 d44Var, ScreenshotTracker screenshotTracker, by0 by0Var) {
        super(2, by0Var);
        this.$lifecycleOwner = d44Var;
        this.this$0 = screenshotTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ScreenshotTracker$registerScreenshotEventProvider$1(this.$lifecycleOwner, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            d44 d44Var = this.$lifecycleOwner;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(d44Var, state, anonymousClass1, this) == h) {
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
        return ((ScreenshotTracker$registerScreenshotEventProvider$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

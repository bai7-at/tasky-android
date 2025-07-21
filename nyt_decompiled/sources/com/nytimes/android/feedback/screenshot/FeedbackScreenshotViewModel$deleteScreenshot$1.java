package com.nytimes.android.feedback.screenshot;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@fc1(c = "com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$deleteScreenshot$1", f = "FeedbackScreenshotViewModel.kt", l = {ContentType.LIVE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackScreenshotViewModel$deleteScreenshot$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FeedbackScreenshotViewModel this$0;

    @fc1(c = "com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$deleteScreenshot$1$1", f = "FeedbackScreenshotViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$deleteScreenshot$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ FeedbackScreenshotViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeedbackScreenshotViewModel feedbackScreenshotViewModel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = feedbackScreenshotViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.this$0.k();
            this.this$0.n().n(new u14.c(du8.a(null, null)));
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackScreenshotViewModel$deleteScreenshot$1(FeedbackScreenshotViewModel feedbackScreenshotViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackScreenshotViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackScreenshotViewModel$deleteScreenshot$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == h) {
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
        return ((FeedbackScreenshotViewModel$deleteScreenshot$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

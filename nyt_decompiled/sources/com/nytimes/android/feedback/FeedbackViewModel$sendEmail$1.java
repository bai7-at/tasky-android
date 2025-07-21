package com.nytimes.android.feedback;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cr5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

@fc1(c = "com.nytimes.android.feedback.FeedbackViewModel$sendEmail$1", f = "FeedbackViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackViewModel$sendEmail$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $body;
    final /* synthetic */ String $email;
    final /* synthetic */ List<String> $extraFeedbackData;
    final /* synthetic */ String $screenshotPath;
    int label;
    final /* synthetic */ FeedbackViewModel this$0;

    @fc1(c = "com.nytimes.android.feedback.FeedbackViewModel$sendEmail$1$1", f = "FeedbackViewModel.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.feedback.FeedbackViewModel$sendEmail$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ String $body;
        final /* synthetic */ String $email;
        final /* synthetic */ List<String> $extraFeedbackData;
        final /* synthetic */ String $screenshotPath;
        int label;
        final /* synthetic */ FeedbackViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeedbackViewModel feedbackViewModel, String str, String str2, String str3, List list, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = feedbackViewModel;
            this.$email = str;
            this.$body = str2;
            this.$screenshotPath = str3;
            this.$extraFeedbackData = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, this.$email, this.$body, this.$screenshotPath, this.$extraFeedbackData, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FeedbackProvider feedbackProvider;
            cr5 cr5Var;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                feedbackProvider = this.this$0.a;
                String str = this.$email;
                String str2 = this.$body;
                String str3 = this.$screenshotPath;
                List<String> list = this.$extraFeedbackData;
                this.label = 1;
                if (feedbackProvider.a(str, str2, str3, list, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            cr5Var = this.this$0.d;
            cr5Var.c("User Sent Feedback");
            this.this$0.k().n(new u14.c(""));
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackViewModel$sendEmail$1(FeedbackViewModel feedbackViewModel, String str, String str2, String str3, List list, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackViewModel;
        this.$email = str;
        this.$body = str2;
        this.$screenshotPath = str3;
        this.$extraFeedbackData = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackViewModel$sendEmail$1(this.this$0, this.$email, this.$body, this.$screenshotPath, this.$extraFeedbackData, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$email, this.$body, this.$screenshotPath, this.$extraFeedbackData, null);
                this.label = 1;
                Object withTimeout = TimeoutKt.withTimeout(10000L, anonymousClass1, this);
                this = withTimeout;
                if (withTimeout == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                this = this;
            }
        } catch (Exception e) {
            NYTLogger.h(e);
            this.this$0.k().n(new u14.a(e));
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedbackViewModel$sendEmail$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

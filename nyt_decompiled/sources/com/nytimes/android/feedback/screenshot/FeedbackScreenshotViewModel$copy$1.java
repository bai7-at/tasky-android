package com.nytimes.android.feedback.screenshot;

import android.net.Uri;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@fc1(c = "com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$copy$1", f = "FeedbackScreenshotViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackScreenshotViewModel$copy$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Uri $screenshot;
    int label;
    final /* synthetic */ FeedbackScreenshotViewModel this$0;

    @fc1(c = "com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$copy$1$1", f = "FeedbackScreenshotViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$copy$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Uri $screenshot;
        int label;
        final /* synthetic */ FeedbackScreenshotViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeedbackScreenshotViewModel feedbackScreenshotViewModel, Uri uri, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = feedbackScreenshotViewModel;
            this.$screenshot = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, this.$screenshot, by0Var);
        }

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0066: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0066 */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0082 -> B:16:0x00a2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.a.h()
                int r0 = r5.label
                if (r0 != 0) goto Lb0
                kotlin.f.b(r6)
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel r6 = r5.this$0
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel.f(r6)
                r6 = 2
                r0 = 0
                java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel r2 = r5.this$0     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                android.app.Application r2 = r2.m()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                android.net.Uri r3 = r5.$screenshot     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                java.io.InputStream r2 = r2.openInputStream(r3)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
                int r2 = r1.available()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r1.mark(r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r2.<init>()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r3 = 1
                r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel r3 = r5.this$0     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                int r3 = com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel.e(r3, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r2.inSampleSize = r3     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r3 = 0
                r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r1.reset()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                if (r2 == 0) goto L6a
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel r3 = r5.this$0     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                java.io.File r4 = com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel.g(r3, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                kotlin.Pair r2 = defpackage.du8.a(r2, r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                fy4 r3 = r3.n()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                u14$c r4 = new u14$c     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r3.n(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                ww8 r2 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                goto L6b
            L65:
                r5 = move-exception
                r0 = r1
                goto La5
            L68:
                r2 = move-exception
                goto L8a
            L6a:
                r2 = r0
            L6b:
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel r3 = r5.this$0     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                if (r2 != 0) goto L7d
                fy4 r2 = r3.n()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                u14$a r3 = new u14$a     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                java.lang.String r4 = "Decoding bitmap failed"
                r3.<init>(r4, r0, r6, r0)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r2.n(r3)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
            L7d:
                r1.close()     // Catch: java.io.IOException -> L81
                goto La2
            L81:
                r5 = move-exception
                com.nytimes.android.logging.NYTLogger.h(r5)
                goto La2
            L86:
                r5 = move-exception
                goto La5
            L88:
                r2 = move-exception
                r1 = r0
            L8a:
                com.nytimes.android.logging.NYTLogger.h(r2)     // Catch: java.lang.Throwable -> L65
                com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel r5 = r5.this$0     // Catch: java.lang.Throwable -> L65
                fy4 r5 = r5.n()     // Catch: java.lang.Throwable -> L65
                u14$a r2 = new u14$a     // Catch: java.lang.Throwable -> L65
                java.lang.String r3 = "Image not found on disk"
                r2.<init>(r3, r0, r6, r0)     // Catch: java.lang.Throwable -> L65
                r5.n(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto La2
                r1.close()     // Catch: java.io.IOException -> L81
            La2:
                ww8 r5 = defpackage.ww8.a
                return r5
            La5:
                if (r0 == 0) goto Laf
                r0.close()     // Catch: java.io.IOException -> Lab
                goto Laf
            Lab:
                r6 = move-exception
                com.nytimes.android.logging.NYTLogger.h(r6)
            Laf:
                throw r5
            Lb0:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.screenshot.FeedbackScreenshotViewModel$copy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackScreenshotViewModel$copy$1(FeedbackScreenshotViewModel feedbackScreenshotViewModel, Uri uri, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackScreenshotViewModel;
        this.$screenshot = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackScreenshotViewModel$copy$1(this.this$0, this.$screenshot, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$screenshot, null);
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
        return ((FeedbackScreenshotViewModel$copy$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

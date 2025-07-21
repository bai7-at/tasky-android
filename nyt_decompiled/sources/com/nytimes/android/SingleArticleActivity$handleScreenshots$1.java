package com.nytimes.android;

import android.os.Handler;
import android.view.Window;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.ScreenshotTracker;
import com.nytimes.android.SingleArticleActivity$handleScreenshots$1;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jc7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.SingleArticleActivity$handleScreenshots$1", f = "SingleArticleActivity.kt", l = {617}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$handleScreenshots$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$handleScreenshots$1(SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleArticleActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SingleArticleActivity$handleScreenshots$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Flow j = this.this$0.getScreenshotTracker().j();
            final SingleArticleActivity singleArticleActivity = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.nytimes.android.SingleArticleActivity$handleScreenshots$1.1

                /* renamed from: com.nytimes.android.SingleArticleActivity$handleScreenshots$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C02301 extends Lambda implements ss2 {
                    final /* synthetic */ Handler $handler;
                    final /* synthetic */ SingleArticleActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02301(Handler handler, SingleArticleActivity singleArticleActivity) {
                        super(1);
                        this.$handler = handler;
                        this.this$0 = singleArticleActivity;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void c(SingleArticleActivity singleArticleActivity, File file) {
                        zq3.h(singleArticleActivity, "this$0");
                        zq3.h(file, "$file");
                        singleArticleActivity.A1(file);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((File) obj);
                        return ww8.a;
                    }

                    public final void invoke(final File file) {
                        zq3.h(file, TransferTable.COLUMN_FILE);
                        Handler handler = this.$handler;
                        final SingleArticleActivity singleArticleActivity = this.this$0;
                        handler.post(new Runnable() { // from class: com.nytimes.android.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                SingleArticleActivity$handleScreenshots$1.AnonymousClass1.C02301.c(SingleArticleActivity.this, file);
                            }
                        });
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(ScreenshotTracker.a aVar, by0 by0Var) {
                    boolean t1;
                    t1 = SingleArticleActivity.this.t1(SingleArticleActivity.this.X().k());
                    if (t1) {
                        Handler handler = new Handler(SingleArticleActivity.this.getMainLooper());
                        int f = DeviceUtils.f();
                        int i2 = DeviceUtils.i();
                        File cacheDir = SingleArticleActivity.this.getApplication().getCacheDir();
                        Window window = SingleArticleActivity.this.getWindow();
                        zq3.e(cacheDir);
                        zq3.e(window);
                        jc7.c(cacheDir, window, handler, i2, f, new C02301(handler, SingleArticleActivity.this), new qs2() { // from class: com.nytimes.android.SingleArticleActivity.handleScreenshots.1.1.2
                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m191invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m191invoke() {
                                NYTLogger.g("Error on taking the screenshot", new Object[0]);
                            }
                        });
                    }
                    return ww8.a;
                }
            };
            this.label = 1;
            if (j.collect(flowCollector, this) == h) {
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
        return ((SingleArticleActivity$handleScreenshots$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

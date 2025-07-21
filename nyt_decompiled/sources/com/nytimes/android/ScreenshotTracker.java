package com.nytimes.android;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.nytimes.android.ScreenshotTracker;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.by0;
import defpackage.d44;
import defpackage.e44;
import defpackage.e52;
import defpackage.ec7;
import defpackage.ei1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s42;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes2.dex */
public final class ScreenshotTracker {
    private final ec7 a;
    private final ET2Scope b;
    private final Context c;
    private final boolean d;
    private final MutableSharedFlow e;

    @fc1(c = "com.nytimes.android.ScreenshotTracker$1", f = "ScreenshotTracker.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ScreenshotTracker$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ d44 $lifecycleOwner;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d44 d44Var, by0 by0Var) {
            super(2, by0Var);
            this.$lifecycleOwner = d44Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return ScreenshotTracker.this.new AnonymousClass1(this.$lifecycleOwner, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            if (ScreenshotTracker.this.d) {
                ScreenshotTracker.this.k(this.$lifecycleOwner);
            } else {
                ScreenshotTracker.this.m(this.$lifecycleOwner);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        private final File a;
        private final String b;

        public a(File file, String str) {
            this.a = file;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            File file = this.a;
            int hashCode = (file == null ? 0 : file.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Screenshot(file=" + this.a + ", url=" + this.b + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenshotTracker(ec7 ec7Var, ET2Scope eT2Scope, Context context) {
        zq3.h(ec7Var, "screenshotEventProvider");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(context, "activityContext");
        this.a = ec7Var;
        this.b = eT2Scope;
        this.c = context;
        this.d = Build.VERSION.SDK_INT >= 34;
        this.e = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        zq3.f(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        d44 d44Var = (d44) context;
        BuildersKt__Builders_commonKt.launch$default(e44.a(d44Var), null, null, new AnonymousClass1(d44Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(File file, by0 by0Var) {
        Object emit;
        tx1 c = this.b.c();
        return (c == null || (emit = this.e.emit(new a(file, c.j()), by0Var)) != kotlin.coroutines.intrinsics.a.h()) ? ww8.a : emit;
    }

    static /* synthetic */ Object i(ScreenshotTracker screenshotTracker, File file, by0 by0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            file = null;
        }
        return screenshotTracker.h(file, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(final d44 d44Var) {
        final Activity.ScreenCaptureCallback screenCaptureCallback = new Activity.ScreenCaptureCallback() { // from class: fc7
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                ScreenshotTracker.l(d44.this, this);
            }
        };
        d44Var.getLifecycle().a(new ei1() { // from class: com.nytimes.android.ScreenshotTracker$registerAndroid14ScreenCaptureCallback$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ei1
            public void onStart(d44 d44Var2) {
                zq3.h(d44Var2, "owner");
                Activity activity = (Activity) d44Var2;
                super.onStart(d44Var2);
                activity.registerScreenCaptureCallback(activity.getMainExecutor(), screenCaptureCallback);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ei1
            public void onStop(d44 d44Var2) {
                zq3.h(d44Var2, "owner");
                super.onStop(d44Var2);
                ((Activity) d44Var2).unregisterScreenCaptureCallback(screenCaptureCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(d44 d44Var, ScreenshotTracker screenshotTracker) {
        zq3.h(d44Var, "$lifecycleOwner");
        zq3.h(screenshotTracker, "this$0");
        BuildersKt__Builders_commonKt.launch$default(e44.a(d44Var), null, null, new ScreenshotTracker$registerAndroid14ScreenCaptureCallback$screenCaptureCallback$1$1(screenshotTracker, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(d44 d44Var) {
        BuildersKt__Builders_commonKt.launch$default(e44.a(d44Var), null, null, new ScreenshotTracker$registerScreenshotEventProvider$1(d44Var, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        ET2PageScope.DefaultImpls.a(this.b, new e52.e(), new s42("screenshot", null, null, null, null, null, null, null, "app-screenshot", 254, null), null, null, 12, null);
    }

    public final Flow j() {
        return this.e;
    }
}

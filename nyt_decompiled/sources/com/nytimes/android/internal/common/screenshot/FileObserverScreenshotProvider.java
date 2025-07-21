package com.nytimes.android.internal.common.screenshot;

import android.os.Environment;
import android.os.FileObserver;
import defpackage.by0;
import defpackage.ec7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class FileObserverScreenshotProvider implements ec7 {
    private final CoroutineScope a;
    private FileObserver b;
    private final MutableSharedFlow c;

    @fc1(c = "com.nytimes.android.internal.common.screenshot.FileObserverScreenshotProvider$2", f = "FileObserverScreenshotProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.internal.common.screenshot.FileObserverScreenshotProvider$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        /* synthetic */ int I$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = FileObserverScreenshotProvider.this.new AnonymousClass2(by0Var);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i, by0 by0Var) {
            return ((AnonymousClass2) create(Integer.valueOf(i), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            int i = this.I$0;
            if (i == 0) {
                FileObserverScreenshotProvider.this.h();
            } else if (i == 1) {
                FileObserverScreenshotProvider.this.g();
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (by0) obj2);
        }
    }

    public FileObserverScreenshotProvider(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.c = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        try {
            Result.a aVar = Result.a;
            final Set f = f();
            final List X0 = i.X0(f);
            this.b = new FileObserver(X0) { // from class: com.nytimes.android.internal.common.screenshot.FileObserverScreenshotProvider$1$1$1
                @Override // android.os.FileObserver
                public void onEvent(int i, String str) {
                    CoroutineScope coroutineScope2;
                    coroutineScope2 = FileObserverScreenshotProvider.this.a;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new FileObserverScreenshotProvider$1$1$1$onEvent$1(FileObserverScreenshotProvider.this, f, str, null), 3, null);
                }
            };
            Result.b(ww8.a);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            Result.b(f.a(th));
        }
        FlowKt.launchIn(FlowKt.onEach(this.c.getSubscriptionCount(), new AnonymousClass2(null)), this.a);
    }

    private final Set f() {
        String str = Environment.DIRECTORY_SCREENSHOTS;
        return b0.j(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str), new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        FileObserver fileObserver = this.b;
        if (fileObserver != null) {
            fileObserver.startWatching();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        FileObserver fileObserver = this.b;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
    }

    @Override // defpackage.ec7
    public Flow a() {
        return FlowKt.distinctUntilChanged(this.c);
    }
}

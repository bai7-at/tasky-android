package io.embrace.android.embracesdk.capture.startup;

import android.view.View;
import android.view.Window;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class StartupTracker$onActivityCreated$1 extends Lambda implements qs2 {
    final /* synthetic */ Window $window;
    final /* synthetic */ StartupTracker this$0;

    /* renamed from: io.embrace.android.embracesdk.capture.startup.StartupTracker$onActivityCreated$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends Lambda implements qs2 {
        final /* synthetic */ View $decorView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view) {
            super(0);
            this.$decorView = view;
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            invoke();
            return ww8.a;
        }

        public final void invoke() {
            boolean z;
            z = StartupTracker$onActivityCreated$1.this.this$0.isFirstDraw;
            if (z) {
                return;
            }
            StartupTracker$onActivityCreated$1.this.this$0.isFirstDraw = true;
            final qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.capture.startup.StartupTracker$onActivityCreated$1$1$callback$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    invoke();
                    return ww8.a;
                }

                public final void invoke() {
                    AppStartupTraceEmitter appStartupTraceEmitter;
                    appStartupTraceEmitter = StartupTracker$onActivityCreated$1.this.this$0.appStartupTraceEmitter;
                    AppStartupTraceEmitter.firstFrameRendered$default(appStartupTraceEmitter, null, 1, null);
                }
            };
            this.$decorView.getViewTreeObserver().registerFrameCommitCallback(new Runnable() { // from class: io.embrace.android.embracesdk.capture.startup.StartupTracker$sam$java_lang_Runnable$0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zq3.g(qs2.this.mo865invoke(), "invoke(...)");
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartupTracker$onActivityCreated$1(StartupTracker startupTracker, Window window) {
        super(0);
        this.this$0 = startupTracker;
        this.$window = window;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        invoke();
        return ww8.a;
    }

    public final void invoke() {
        Window window = this.$window;
        zq3.g(window, "window");
        View decorView = window.getDecorView();
        zq3.g(decorView, "window.decorView");
        StartupTracker.Companion.onNextDraw(decorView, new AnonymousClass1(decorView));
    }
}

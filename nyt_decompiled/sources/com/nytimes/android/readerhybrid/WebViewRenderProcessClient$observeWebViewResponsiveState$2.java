package com.nytimes.android.readerhybrid;

import android.webkit.WebView;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.WebViewRenderProcessClient;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.oe9;
import defpackage.ww8;
import defpackage.ze9;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2", f = "WebViewRenderProcessClient.kt", l = {49, 90}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewRenderProcessClient$observeWebViewResponsiveState$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ HybridType $hybridType;
    final /* synthetic */ WebView $webView;
    final /* synthetic */ ze9 $webViewPerformanceTracker;
    Object L$0;
    Object L$1;
    int label;

    @fc1(c = "com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$1", f = "WebViewRenderProcessClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ MutableStateFlow<WebViewResponsiveState> $flow;
        final /* synthetic */ Ref$ObjectRef<Timer> $freezeTimer;
        final /* synthetic */ WebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebView webView, MutableStateFlow mutableStateFlow, Ref$ObjectRef ref$ObjectRef, by0 by0Var) {
            super(2, by0Var);
            this.$webView = webView;
            this.$flow = mutableStateFlow;
            this.$freezeTimer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$webView, this.$flow, this.$freezeTimer, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            oe9.h(this.$webView, new WebViewRenderProcessClient.a(this.$flow, this.$freezeTimer.element));
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$2", f = "WebViewRenderProcessClient.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        final /* synthetic */ Ref$ObjectRef<Timer> $freezeTimer;
        final /* synthetic */ WebView $webView;
        /* synthetic */ Object L$0;
        int label;

        @fc1(c = "com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$2$1", f = "WebViewRenderProcessClient.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements gt2 {
            final /* synthetic */ WebView $webView;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WebView webView, by0 by0Var) {
                super(2, by0Var);
                this.$webView = webView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass1(this.$webView, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                oe9.h(this.$webView, null);
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Ref$ObjectRef ref$ObjectRef, WebView webView, by0 by0Var) {
            super(3, by0Var);
            this.$freezeTimer = ref$ObjectRef;
            this.$webView = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                if (((Throwable) this.L$0) instanceof CancellationException) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$webView, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass1, this) == h) {
                        return h;
                    }
                }
                return ww8.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            Timer timer = this.$freezeTimer.element;
            if (timer != null) {
                timer.cancel();
            }
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$freezeTimer, this.$webView, by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    /* renamed from: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4, reason: invalid class name */
    static final class AnonymousClass4 implements FlowCollector {
        final /* synthetic */ ze9 a;
        final /* synthetic */ HybridType b;
        final /* synthetic */ WebView c;

        /* renamed from: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[WebViewResponsiveState.values().length];
                try {
                    iArr[WebViewResponsiveState.FROZEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WebViewResponsiveState.RESPONSIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WebViewResponsiveState.FREEZE_TIMEOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        AnonymousClass4(ze9 ze9Var, HybridType hybridType, WebView webView) {
            this.a = ze9Var;
            this.b = hybridType;
            this.c = webView;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(1:9)(2:27|28))(2:29|(1:31))|10|11|12|13|(2:15|(2:17|(1:19))(1:23))(1:24)|20|21))|32|6|(0)(0)|10|11|12|13|(0)(0)|20|21) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            com.nytimes.android.logging.NYTLogger.l("Webview did not have a parseable URL: " + r8, new java.lang.Object[0]);
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.nytimes.android.readerhybrid.WebViewResponsiveState r7, defpackage.by0 r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1
                if (r0 == 0) goto L13
                r0 = r8
                com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1 r0 = (com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1 r0 = new com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$emit$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r6 = r0.L$1
                r7 = r6
                com.nytimes.android.readerhybrid.WebViewResponsiveState r7 = (com.nytimes.android.readerhybrid.WebViewResponsiveState) r7
                java.lang.Object r6 = r0.L$0
                com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4 r6 = (com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass4) r6
                kotlin.f.b(r8)
                goto L56
            L33:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3b:
                kotlin.f.b(r8)
                kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
                com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1 r2 = new com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4$webUrl$1
                android.webkit.WebView r5 = r6.c
                r2.<init>(r5, r4)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                java.lang.String r8 = (java.lang.String) r8
                r0 = 0
                android.net.Uri r4 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L5e
                goto L74
            L5e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Webview did not have a parseable URL: "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.nytimes.android.logging.NYTLogger.l(r8, r1)
            L74:
                int[] r8 = com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass4.a.a
                int r7 = r7.ordinal()
                r7 = r8[r7]
                if (r7 == r3) goto L95
                r8 = 2
                if (r7 == r8) goto L8d
                r8 = 3
                if (r7 == r8) goto L85
                goto L9c
            L85:
                ze9 r7 = r6.a
                com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType r6 = r6.b
                r7.d(r3, r0, r6)
                goto L9c
            L8d:
                ze9 r7 = r6.a
                com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType r6 = r6.b
                r7.d(r0, r0, r6)
                goto L9c
            L95:
                ze9 r7 = r6.a
                com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType r6 = r6.b
                r7.a(r4, r6)
            L9c:
                ww8 r6 = defpackage.ww8.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass4.emit(com.nytimes.android.readerhybrid.WebViewResponsiveState, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewRenderProcessClient$observeWebViewResponsiveState$2(WebView webView, ze9 ze9Var, HybridType hybridType, by0 by0Var) {
        super(2, by0Var);
        this.$webView = webView;
        this.$webViewPerformanceTracker = ze9Var;
        this.$hybridType = hybridType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebViewRenderProcessClient$observeWebViewResponsiveState$2(this.$webView, this.$webViewPerformanceTracker, this.$hybridType, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.f.b(r9)
            goto L8b
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1c:
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = (kotlinx.coroutines.flow.MutableStateFlow) r5
            kotlin.f.b(r9)
            goto L5a
        L28:
            kotlin.f.b(r9)
            com.nytimes.android.readerhybrid.WebViewResponsiveState r9 = com.nytimes.android.readerhybrid.WebViewResponsiveState.UNKNOWN
            kotlinx.coroutines.flow.MutableStateFlow r5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r9)
            java.lang.String r1 = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"
            boolean r1 = defpackage.re9.a(r1)
            if (r1 != 0) goto L3d
            r5.setValue(r9)
            goto L8b
        L3d:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
            com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$1 r6 = new com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$1
            android.webkit.WebView r7 = r8.$webView
            r6.<init>(r7, r5, r1, r4)
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r6, r8)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            com.nytimes.android.readerhybrid.WebViewResponsiveState r9 = com.nytimes.android.readerhybrid.WebViewResponsiveState.RESPONSIVE
            r5.setValue(r9)
            com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$2 r9 = new com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$2
            android.webkit.WebView r6 = r8.$webView
            r9.<init>(r1, r6, r4)
            kotlinx.coroutines.flow.FlowKt.onCompletion(r5, r9)
            com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$3 r9 = new defpackage.gt2() { // from class: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.3
                static {
                    /*
                        com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$3 r0 = new com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$3) com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.3.a com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass3.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 2
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass3.<init>():void");
                }

                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(com.nytimes.android.readerhybrid.WebViewResponsiveState r1, com.nytimes.android.readerhybrid.WebViewResponsiveState r2) {
                    /*
                        r0 = this;
                        java.lang.String r0 = "old"
                        defpackage.zq3.h(r1, r0)
                        java.lang.String r0 = "new"
                        defpackage.zq3.h(r2, r0)
                        if (r1 == r2) goto Le
                        r0 = 1
                        goto Lf
                    Le:
                        r0 = 0
                    Lf:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass3.invoke(com.nytimes.android.readerhybrid.WebViewResponsiveState, com.nytimes.android.readerhybrid.WebViewResponsiveState):java.lang.Boolean");
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    /*
                        r0 = this;
                        com.nytimes.android.readerhybrid.WebViewResponsiveState r1 = (com.nytimes.android.readerhybrid.WebViewResponsiveState) r1
                        com.nytimes.android.readerhybrid.WebViewResponsiveState r2 = (com.nytimes.android.readerhybrid.WebViewResponsiveState) r2
                        java.lang.Boolean r0 = r0.invoke(r1, r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.AnonymousClass3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r5, r9)
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.drop(r9, r3)
            com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4 r1 = new com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2$4
            ze9 r3 = r8.$webViewPerformanceTracker
            com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType r5 = r8.$hybridType
            android.webkit.WebView r6 = r8.$webView
            r1.<init>(r3, r5, r6)
            r8.L$0 = r4
            r8.L$1 = r4
            r8.label = r2
            java.lang.Object r8 = r9.collect(r1, r8)
            if (r8 != r0) goto L8b
            return r0
        L8b:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$observeWebViewResponsiveState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebViewRenderProcessClient$observeWebViewResponsiveState$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

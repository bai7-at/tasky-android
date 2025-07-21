package com.nytimes.android.eventtracker.engine;

import android.webkit.JavascriptInterface;
import com.nytimes.android.eventtracker.validator.Validator;
import defpackage.n01;
import defpackage.qs2;
import defpackage.rf9;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes4.dex */
public final class WebviewEngine implements JavascriptEngine {
    public static final a Companion = new a(null);
    private final rf9 a;
    private final n01 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements qs2 {
        private final CancellableContinuation a;

        public b(rf9 rf9Var, String str, CancellableContinuation cancellableContinuation) {
            zq3.h(rf9Var, "webview");
            zq3.h(str, "script");
            zq3.h(cancellableContinuation, "continuation");
            this.a = cancellableContinuation;
            ul8.a.z("ET2").t("Engine loading script...", new Object[0]);
            rf9Var.a(this, "WebviewEngine");
            rf9Var.b(str);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m364invoke();
            return ww8.a;
        }

        @JavascriptInterface
        /* renamed from: invoke, reason: collision with other method in class */
        public void m364invoke() {
            ul8.a.z("ET2").t("Engine successfully loaded script", new Object[0]);
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(Boolean.TRUE));
        }
    }

    public WebviewEngine(rf9 rf9Var, n01 n01Var) {
        zq3.h(rf9Var, "webview");
        zq3.h(n01Var, "dispatchers");
        this.a = rf9Var;
        this.b = n01Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        defpackage.ul8.a.z("ET2").f(r4, "Engine failed to load script", new java.lang.Object[0]);
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.eventtracker.engine.JavascriptEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$1 r0 = (com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$1 r0 = new com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L47
        L29:
            r4 = move-exception
            goto L4e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$2 r6 = new com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$2     // Catch: java.lang.Exception -> L29
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            r4 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r6 = kotlinx.coroutines.TimeoutKt.withTimeout(r4, r6, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L29
            boolean r4 = r6.booleanValue()     // Catch: java.lang.Exception -> L29
            goto L5f
        L4e:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "ET2"
            ul8$c r5 = r5.z(r6)
            java.lang.String r6 = "Engine failed to load script"
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r5.f(r4, r6, r1)
            r4 = r0
        L5f:
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.engine.WebviewEngine.a(java.lang.String, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.eventtracker.engine.JavascriptEngine
    public void b(Validator validator) {
        zq3.h(validator, "validator");
        ul8.a.z("ET2").t("attachValidator", new Object[0]);
        this.a.a(validator, "eventTracker");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.nytimes.android.eventtracker.engine.JavascriptEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$1 r0 = (com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$1 r0 = new com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "ET2"
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L2c
            goto L66
        L2c:
            r7 = move-exception
            goto L69
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.f.b(r9)
            ul8$b r9 = defpackage.ul8.a     // Catch: java.lang.Exception -> L2c
            ul8$c r9 = r9.z(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r2.<init>()     // Catch: java.lang.Exception -> L2c
            java.lang.String r6 = "Evaluate "
            r2.append(r6)     // Catch: java.lang.Exception -> L2c
            r2.append(r8)     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2c
            r9.t(r2, r6)     // Catch: java.lang.Exception -> L2c
            com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$2 r9 = new com.nytimes.android.eventtracker.engine.WebviewEngine$evaluate$2     // Catch: java.lang.Exception -> L2c
            r2 = 0
            r9.<init>(r7, r8, r2)     // Catch: java.lang.Exception -> L2c
            r0.label = r5     // Catch: java.lang.Exception -> L2c
            r7 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.withTimeout(r7, r9, r0)     // Catch: java.lang.Exception -> L2c
            if (r9 != r1) goto L66
            return r1
        L66:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L2c
            goto L78
        L69:
            ul8$b r8 = defpackage.ul8.a
            ul8$c r8 = r8.z(r4)
            java.lang.String r9 = "Engine evaluate Failed"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.f(r7, r9, r0)
            java.lang.String r9 = "null"
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.engine.WebviewEngine.c(java.lang.String, by0):java.lang.Object");
    }
}

package com.nytimes.android.eventtracker.validator;

import android.webkit.JavascriptInterface;
import com.nytimes.android.eventtracker.data.encoder.ResultJsonAdapter;
import com.nytimes.android.eventtracker.engine.JavascriptEngine;
import com.nytimes.android.eventtracker.validator.Validator;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lc7;
import defpackage.mj6;
import defpackage.n01;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.x52;
import defpackage.yz6;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public final class JavascriptValidator implements Validator {
    private final JavascriptEngine a;
    private final x52 b;
    private final yz6 c;
    private final n01 d;
    private final ResultJsonAdapter e;
    private final AtomicBoolean f;

    @fc1(c = "com.nytimes.android.eventtracker.validator.JavascriptValidator$1", f = "JavascriptValidator.kt", l = {52, 54}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.eventtracker.validator.JavascriptValidator$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ lc7 $validationFetcher;
        Object L$0;
        int label;
        final /* synthetic */ JavascriptValidator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(lc7 lc7Var, JavascriptValidator javascriptValidator, by0 by0Var) {
            super(2, by0Var);
            this.$validationFetcher = lc7Var;
            this.this$0 = javascriptValidator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$validationFetcher, this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicBoolean atomicBoolean;
            Object h = a.h();
            int i = this.label;
            try {
            } catch (Exception unused) {
                this.this$0.e().set(false);
            }
            if (i == 0) {
                f.b(obj);
                lc7 lc7Var = this.$validationFetcher;
                this.label = 1;
                obj = lc7Var.a(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atomicBoolean = (AtomicBoolean) this.L$0;
                    f.b(obj);
                    atomicBoolean.set(((Boolean) obj).booleanValue());
                    ul8.a.z("ET2").t("Validator Initialized: " + this.this$0.e().get(), new Object[0]);
                    return ww8.a;
                }
                f.b(obj);
            }
            String str = (String) this.this$0.c.a(mj6.validation_html_wrapper, (String) obj);
            AtomicBoolean e = this.this$0.e();
            JavascriptEngine javascriptEngine = this.this$0.a;
            this.L$0 = e;
            this.label = 2;
            obj = javascriptEngine.a(str, this);
            if (obj == h) {
                return h;
            }
            atomicBoolean = e;
            atomicBoolean.set(((Boolean) obj).booleanValue());
            ul8.a.z("ET2").t("Validator Initialized: " + this.this$0.e().get(), new Object[0]);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public JavascriptValidator(JavascriptEngine javascriptEngine, lc7 lc7Var, x52 x52Var, yz6 yz6Var, n01 n01Var) {
        zq3.h(javascriptEngine, "engine");
        zq3.h(lc7Var, "validationFetcher");
        zq3.h(x52Var, "wrapper");
        zq3.h(yz6Var, "resourceInflater");
        zq3.h(n01Var, "dispatchers");
        this.a = javascriptEngine;
        this.b = x52Var;
        this.c = yz6Var;
        this.d = n01Var;
        this.e = new ResultJsonAdapter();
        this.f = new AtomicBoolean(false);
        ul8.a.z("ET2").t("init Validator", new Object[0]);
        javascriptEngine.b(this);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(n01Var.a()), null, null, new AnonymousClass1(lc7Var, this, null), 3, null);
    }

    private final Validator.Result d() {
        return new Validator.Result(null, false, "N/A", i.e("Javascript Engine not Initialized"));
    }

    private final Validator.Result g(String str) {
        Validator.Result a = this.e.a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Could not parse json");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.nytimes.android.eventtracker.validator.Validator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.nytimes.android.eventtracker.model.Event r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$1 r0 = (com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$1 r0 = new com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.eventtracker.validator.JavascriptValidator r5 = (com.nytimes.android.eventtracker.validator.JavascriptValidator) r5
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L30
            goto L71
        L30:
            r6 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.eventtracker.validator.JavascriptValidator r5 = (com.nytimes.android.eventtracker.validator.JavascriptValidator) r5
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L30
            goto L58
        L42:
            kotlin.f.b(r7)
            boolean r7 = r5.f()     // Catch: java.lang.Exception -> L30
            if (r7 == 0) goto L78
            x52 r7 = r5.b     // Catch: java.lang.Exception -> L30
            r0.L$0 = r5     // Catch: java.lang.Exception -> L30
            r0.label = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r7 = r7.a(r6, r0)     // Catch: java.lang.Exception -> L30
            if (r7 != r1) goto L58
            return r1
        L58:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L30
            n01 r6 = r5.d     // Catch: java.lang.Exception -> L30
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.b()     // Catch: java.lang.Exception -> L30
            com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$eventResult$1 r2 = new com.nytimes.android.eventtracker.validator.JavascriptValidator$isValid$eventResult$1     // Catch: java.lang.Exception -> L30
            r4 = 0
            r2.<init>(r5, r7, r4)     // Catch: java.lang.Exception -> L30
            r0.L$0 = r5     // Catch: java.lang.Exception -> L30
            r0.label = r3     // Catch: java.lang.Exception -> L30
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)     // Catch: java.lang.Exception -> L30
            if (r7 != r1) goto L71
            return r1
        L71:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L30
            com.nytimes.android.eventtracker.validator.Validator$Result r5 = r5.g(r7)     // Catch: java.lang.Exception -> L30
            goto L94
        L78:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "Validator not initialized, returning default"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L30
            throw r6     // Catch: java.lang.Exception -> L30
        L80:
            ul8$b r7 = defpackage.ul8.a
            java.lang.String r0 = "ET2"
            ul8$c r7 = r7.z(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Exception when calling Validator.isValid"
            r7.f(r6, r1, r0)
            com.nytimes.android.eventtracker.validator.Validator$Result r5 = r5.d()
        L94:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.validator.JavascriptValidator.a(com.nytimes.android.eventtracker.model.Event, by0):java.lang.Object");
    }

    public final AtomicBoolean e() {
        return this.f;
    }

    public boolean f() {
        return this.f.get();
    }

    @Override // com.nytimes.android.eventtracker.validator.Validator
    @JavascriptInterface
    public void log(String str) {
        zq3.h(str, "message");
        ul8.a.z("ET2").u(str, new Object[0]);
    }
}

package com.nytimes.android.eventtracker.engine;

import com.nytimes.android.eventtracker.engine.WebviewEngine;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.n01;
import defpackage.rf9;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$2", f = "WebviewEngine.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebviewEngine$loadData$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ WebviewEngine this$0;

    @fc1(c = "com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$2$1", f = "WebviewEngine.kt", l = {116}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.eventtracker.engine.WebviewEngine$loadData$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ String $code;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ WebviewEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebviewEngine webviewEngine, String str, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = webviewEngine;
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, this.$code, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            rf9 rf9Var;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                WebviewEngine webviewEngine = this.this$0;
                String str = this.$code;
                this.L$0 = webviewEngine;
                this.L$1 = str;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(this), 1);
                cancellableContinuationImpl.initCancellability();
                rf9Var = webviewEngine.a;
                new WebviewEngine.b(rf9Var, str + "<script type=\"text/javascript\">WebviewEngine.invoke();</script>", cancellableContinuationImpl);
                obj = cancellableContinuationImpl.getResult();
                if (obj == a.h()) {
                    hc1.c(this);
                }
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return obj;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebviewEngine$loadData$2(WebviewEngine webviewEngine, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = webviewEngine;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WebviewEngine$loadData$2(this.this$0, this.$code, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n01 n01Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            n01Var = this.this$0.b;
            CoroutineDispatcher b = n01Var.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$code, null);
            this.label = 1;
            obj = BuildersKt.withContext(b, anonymousClass1, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WebviewEngine$loadData$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

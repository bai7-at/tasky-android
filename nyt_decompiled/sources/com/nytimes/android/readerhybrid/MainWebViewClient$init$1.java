package com.nytimes.android.readerhybrid;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fz8;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.readerhybrid.MainWebViewClient$init$1", f = "MainWebViewClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainWebViewClient$init$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainWebViewClient this$0;

    @fc1(c = "com.nytimes.android.readerhybrid.MainWebViewClient$init$1$1", f = "MainWebViewClient.kt", l = {82, 86}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.readerhybrid.MainWebViewClient$init$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ fz8 $it;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MainWebViewClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainWebViewClient mainWebViewClient, fz8 fz8Var, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = mainWebViewClient;
            this.$it = fz8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$it, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            ?? r1 = this.label;
            try {
            } catch (Exception e) {
                NYTLogger.i(e, "cannot redirect to url", new Object[0]);
            }
            if (r1 == 0) {
                f.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                MainWebViewClient mainWebViewClient = this.this$0;
                fz8 fz8Var = this.$it;
                zq3.g(fz8Var, "$it");
                this.L$0 = flowCollector;
                this.label = 1;
                r1 = flowCollector;
                if (mainWebViewClient.j(fz8Var, this) == h) {
                    return h;
                }
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return ww8.a;
                }
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                f.b(obj);
                r1 = flowCollector2;
            }
            fz8 fz8Var2 = this.$it;
            zq3.g(fz8Var2, "$it");
            this.L$0 = null;
            this.label = 2;
            if (r1.emit(fz8Var2, this) == h) {
                return h;
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
            return ((AnonymousClass1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainWebViewClient$init$1(MainWebViewClient mainWebViewClient, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = mainWebViewClient;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fz8 fz8Var, by0 by0Var) {
        return ((MainWebViewClient$init$1) create(fz8Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MainWebViewClient$init$1 mainWebViewClient$init$1 = new MainWebViewClient$init$1(this.this$0, by0Var);
        mainWebViewClient$init$1.L$0 = obj;
        return mainWebViewClient$init$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return FlowKt.flowOn(FlowKt.flow(new AnonymousClass1(this.this$0, (fz8) this.L$0, null)), Dispatchers.getDefault());
    }
}

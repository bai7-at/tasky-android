package com.nytimes.android.ads.analytics;

import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.by0;
import defpackage.cc0;
import defpackage.d6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i7;
import defpackage.sb;
import defpackage.tb;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.y5;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.ads.analytics.AdEventTracker$trackAdEvents$1", f = "AdEventTracker.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdEventTracker$trackAdEvents$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<d6> $adEventFlow;
    int label;
    final /* synthetic */ AdEventTracker this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ AdEventTracker a;
        final /* synthetic */ String b;

        a(AdEventTracker adEventTracker, String str) {
            this.a = adEventTracker;
            this.b = str;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(d6 d6Var, by0 by0Var) {
            i7 i7Var;
            i7 i7Var2;
            i7 i7Var3;
            i7 i7Var4;
            i7 i7Var5;
            i7 i7Var6;
            i7 i7Var7;
            if (d6Var instanceof d6.b) {
                i7Var7 = this.a.b;
                String str = this.b;
                d6.b bVar = (d6.b) d6Var;
                Map b = bVar.b();
                i7Var7.t(str, cc0.a(b != null ? y5.c(b) : false), tb.a(bVar.b()), tb.b(bVar.b()), tb.c(bVar.b()), d6Var.a(), bVar.c());
            } else if (d6Var instanceof d6.a) {
                i7Var6 = this.a.b;
                i7Var6.o(this.b, ((d6.a) d6Var).b(), d6Var.a());
            } else if (d6Var instanceof d6.c) {
                i7Var5 = this.a.b;
                i7Var5.m(this.b, ((d6.c) d6Var).b(), d6Var.a());
            } else if (d6Var instanceof d6.d) {
                i7Var4 = this.a.b;
                i7Var4.n(this.b, ((d6.d) d6Var).b(), d6Var.a());
            } else if (d6Var instanceof sb.a) {
                i7Var3 = this.a.b;
                i7Var3.u(d6Var.a());
            } else if (d6Var instanceof sb.b) {
                i7Var2 = this.a.b;
                i7Var2.r(d6Var.a());
            } else if (d6Var instanceof sb.c) {
                i7Var = this.a.b;
                i7Var.s(d6Var.a());
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdEventTracker$trackAdEvents$1(AdEventTracker adEventTracker, Flow flow, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = adEventTracker;
        this.$adEventFlow = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AdEventTracker$trackAdEvents$1(this.this$0, this.$adEventFlow, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2Scope eT2Scope;
        String str;
        PageContext i;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i2 = this.label;
        if (i2 == 0) {
            f.b(obj);
            eT2Scope = this.this$0.a;
            tx1 c = eT2Scope.c();
            if (c == null || (i = c.i()) == null || (str = i.g()) == null) {
                str = "";
            }
            Flow<d6> flow = this.$adEventFlow;
            a aVar = new a(this.this$0, str);
            this.label = 1;
            if (flow.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AdEventTracker$trackAdEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

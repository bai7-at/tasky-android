package com.nytimes.xwords.hybrid.view;

import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.xwords.hybrid.GamesHybridManager;
import com.nytimes.xwords.hybrid.analytics.HybridGamesReferringSourceData;
import defpackage.by0;
import defpackage.cc0;
import defpackage.dn5;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.t42;
import defpackage.ww8;
import defpackage.zu2;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.xwords.hybrid.view.PageEventReporter$sendPageEvent$1", f = "PageEventReporter.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PageEventReporter$sendPageEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ e52 $eventSubject;
    int label;
    final /* synthetic */ PageEventReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEventReporter$sendPageEvent$1(PageEventReporter pageEventReporter, e52 e52Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageEventReporter;
        this.$eventSubject = e52Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PageEventReporter$sendPageEvent$1(this.this$0, this.$eventSubject, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object first;
        PageContext pageContext;
        String str;
        String str2;
        HybridGamesReferringSourceData hybridGamesReferringSourceData;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow f = GamesHybridManager.a.f();
            this.label = 1;
            first = FlowKt.first(f, this);
            if (first == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            first = obj;
        }
        zu2 zu2Var = (zu2) first;
        EventTracker eventTracker = EventTracker.a;
        pageContext = this.this$0.a;
        e52 e52Var = this.$eventSubject;
        t42 t42Var = t42.a;
        str = this.this$0.b;
        String e = zu2Var.e();
        String f2 = zu2Var.f();
        String a = zu2Var.a();
        Set c = zu2Var.c();
        if (c == null || (str2 = i.u0(c, null, null, null, 0, null, null, 63, null)) == null) {
            str2 = "";
        }
        String str3 = str2;
        Boolean a2 = cc0.a(zu2Var.h());
        hybridGamesReferringSourceData = this.this$0.d;
        eventTracker.h(pageContext, e52Var, t42Var.c(new dn5(str, null, e, f2, a, str3, a2, hybridGamesReferringSourceData, 2, null)));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PageEventReporter$sendPageEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

package com.nytimes.android.sectionfront;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s55;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.sectionfront.SectionFrontPageEventSender$trackPage$1", f = "SectionFrontPageEventSender.kt", l = {10}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionFrontPageEventSender$trackPage$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $sectionName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionFrontPageEventSender$trackPage$1(String str, by0 by0Var) {
        super(2, by0Var);
        this.$sectionName = str;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        return ((SectionFrontPageEventSender$trackPage$1) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SectionFrontPageEventSender$trackPage$1 sectionFrontPageEventSender$trackPage$1 = new SectionFrontPageEventSender$trackPage$1(this.$sectionName, by0Var);
        sectionFrontPageEventSender$trackPage$1.L$0 = obj;
        return sectionFrontPageEventSender$trackPage$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object h2 = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ET2CoroutineScope eT2CoroutineScope = (ET2CoroutineScope) this.L$0;
            s55.l lVar = new s55.l(this.$sectionName);
            this.label = 1;
            h = eT2CoroutineScope.h(lVar, (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Void mo865invoke() {
                    return null;
                }
            } : null, (r23 & 64) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$3
                public final void b(tx1 tx1Var) {
                    zq3.h(tx1Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((tx1) obj2);
                    return ww8.a;
                }
            } : null, (r23 & 128) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$4
                public final void b(tx1 tx1Var) {
                    zq3.h(tx1Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((tx1) obj2);
                    return ww8.a;
                }
            } : null, this);
            if (h == h2) {
                return h2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}

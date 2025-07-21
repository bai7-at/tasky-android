package com.nytimes.android.menu.item;

import android.view.MenuItem;
import com.nytimes.android.menu.MenuData;
import defpackage.by0;
import defpackage.cc0;
import defpackage.eg6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jc;
import defpackage.lh6;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.yc2;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* loaded from: classes4.dex */
public final class Feedback extends MenuData {

    @fc1(c = "com.nytimes.android.menu.item.Feedback$1", f = "Feedback.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.item.Feedback$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ jc $analyticsClient;
        final /* synthetic */ yc2 $feedback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(jc jcVar, yc2 yc2Var, by0 by0Var) {
            super(2, by0Var);
            this.$analyticsClient = jcVar;
            this.$feedback = yc2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$analyticsClient, this.$feedback, by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(MenuItem menuItem, by0 by0Var) {
            return ((AnonymousClass1) create(menuItem, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.$analyticsClient.B(-1);
            yc2.a.a(this.$feedback, null, 1, null);
            return cc0.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback(jc jcVar, yc2 yc2Var) {
        super(xk6.settings_feedback, eg6.feedback, 1, Integer.valueOf(lh6.main_menu_order_feedback), Boolean.TRUE, 0, null, null, false, null, null, 1984, null);
        zq3.h(jcVar, "analyticsClient");
        zq3.h(yc2Var, "feedback");
        setHandler(new AnonymousClass1(jcVar, yc2Var, null));
    }
}

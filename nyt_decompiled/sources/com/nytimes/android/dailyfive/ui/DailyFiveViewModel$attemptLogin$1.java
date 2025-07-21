package com.nytimes.android.dailyfive.ui;

import androidx.fragment.app.f;
import com.comscore.streaming.ContentType;
import com.nytimes.android.dailyfive.ui.a;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.oa4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.dailyfive.ui.DailyFiveViewModel$attemptLogin$1", f = "DailyFiveViewModel.kt", l = {ContentType.USER_GENERATED_LIVE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveViewModel$attemptLogin$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ f $activity;
    int label;
    final /* synthetic */ DailyFiveViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveViewModel$attemptLogin$1(DailyFiveViewModel dailyFiveViewModel, f fVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dailyFiveViewModel;
        this.$activity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DailyFiveViewModel$attemptLogin$1(this.this$0, this.$activity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.entitlements.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                aVar = this.this$0.c;
                f fVar = this.$activity;
                this.label = 1;
                obj = b.a.a(aVar, fVar, null, null, this, 6, null);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            oa4 oa4Var = (oa4) obj;
            if (!(oa4Var instanceof oa4.c) && (oa4Var instanceof oa4.b)) {
                this.this$0.i().p(a.d.a);
            }
        } catch (Exception e) {
            NYTLogger.h(e);
            this.this$0.i().p(a.d.a);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DailyFiveViewModel$attemptLogin$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

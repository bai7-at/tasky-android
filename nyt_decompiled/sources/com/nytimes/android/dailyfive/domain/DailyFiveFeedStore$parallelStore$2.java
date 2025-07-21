package com.nytimes.android.dailyfive.domain;

import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j91;
import defpackage.l81;
import defpackage.sn2;
import defpackage.ww8;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScopeKt;

@fc1(c = "com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$2", f = "DailyFiveFeedStore.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveFeedStore$parallelStore$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ MoshiFileSystemPersister $feedPersister;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DailyFiveFeedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveFeedStore$parallelStore$2(DailyFiveFeedStore dailyFiveFeedStore, MoshiFileSystemPersister moshiFileSystemPersister, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dailyFiveFeedStore;
        this.$feedPersister = moshiFileSystemPersister;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(l81 l81Var, by0 by0Var) {
        return ((DailyFiveFeedStore$parallelStore$2) create(l81Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DailyFiveFeedStore$parallelStore$2 dailyFiveFeedStore$parallelStore$2 = new DailyFiveFeedStore$parallelStore$2(this.this$0, this.$feedPersister, by0Var);
        dailyFiveFeedStore$parallelStore$2.L$0 = obj;
        return dailyFiveFeedStore$parallelStore$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j91 j91Var;
        sn2 e;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1 dailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1 = new DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1(null, this.$feedPersister, (l81) this.L$0, this.this$0);
                this.label = 1;
                obj = CoroutineScopeKt.coroutineScope(dailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            Pair pair = (Pair) obj;
            List list = (List) pair.a();
            List list2 = (List) pair.b();
            j91Var = this.this$0.b;
            e = this.this$0.e(list, list2, j91Var.d());
            return e;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}

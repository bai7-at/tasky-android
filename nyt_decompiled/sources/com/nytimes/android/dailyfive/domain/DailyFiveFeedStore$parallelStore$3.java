package com.nytimes.android.dailyfive.domain;

import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j91;
import defpackage.l81;
import defpackage.sn2;
import defpackage.ww8;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.threeten.bp.Instant;

@fc1(c = "com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$3", f = "DailyFiveFeedStore.kt", l = {135, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveFeedStore$parallelStore$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ MoshiFileSystemPersister $feedPersister;
    final /* synthetic */ com.nytimes.android.coroutinesutils.d $feedStore;
    final /* synthetic */ com.nytimes.android.coroutinesutils.d $followStatusStore;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DailyFiveFeedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveFeedStore$parallelStore$3(DailyFiveFeedStore dailyFiveFeedStore, com.nytimes.android.coroutinesutils.d dVar, MoshiFileSystemPersister moshiFileSystemPersister, com.nytimes.android.coroutinesutils.d dVar2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = dailyFiveFeedStore;
        this.$feedStore = dVar;
        this.$feedPersister = moshiFileSystemPersister;
        this.$followStatusStore = dVar2;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(l81 l81Var, by0 by0Var) {
        return ((DailyFiveFeedStore$parallelStore$3) create(l81Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DailyFiveFeedStore$parallelStore$3 dailyFiveFeedStore$parallelStore$3 = new DailyFiveFeedStore$parallelStore$3(this.this$0, this.$feedStore, this.$feedPersister, this.$followStatusStore, by0Var);
        dailyFiveFeedStore$parallelStore$3.L$0 = obj;
        return dailyFiveFeedStore$parallelStore$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j91 j91Var;
        Object g;
        List list;
        Instant instant;
        List list2;
        sn2 e;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            DailyFiveFeedStore$parallelStore$3$invokeSuspend$$inlined$combine$1 dailyFiveFeedStore$parallelStore$3$invokeSuspend$$inlined$combine$1 = new DailyFiveFeedStore$parallelStore$3$invokeSuspend$$inlined$combine$1(null, this.$feedStore, this.$feedPersister, (l81) this.L$0, this.$followStatusStore, this.this$0);
            this.label = 1;
            obj = CoroutineScopeKt.coroutineScope(dailyFiveFeedStore$parallelStore$3$invokeSuspend$$inlined$combine$1, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                instant = (Instant) this.L$2;
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                f.b(obj);
                e = this.this$0.e(list, list2, instant);
                return e;
            }
            f.b(obj);
        }
        Pair pair = (Pair) obj;
        List list3 = (List) pair.a();
        List list4 = (List) pair.b();
        j91Var = this.this$0.b;
        Instant b = j91Var.b();
        DailyFiveFeedStore dailyFiveFeedStore = this.this$0;
        this.L$0 = list3;
        this.L$1 = list4;
        this.L$2 = b;
        this.label = 2;
        g = dailyFiveFeedStore.g(list3, b, this);
        if (g == h) {
            return h;
        }
        list = list3;
        instant = b;
        list2 = list4;
        e = this.this$0.e(list, list2, instant);
        return e;
    }
}

package com.nytimes.android.features.you.youtab;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.bq3;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.fp3;
import defpackage.mm9;
import defpackage.mt2;
import defpackage.s25;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.you.youtab.YouTabFactory$badge$1", f = "YouTabFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouTabFactory$badge$1 extends SuspendLambda implements mt2 {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ YouTabFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouTabFactory$badge$1(YouTabFactory youTabFactory, by0 by0Var) {
        super(5, by0Var);
        this.this$0 = youTabFactory;
    }

    public final Object b(mm9 mm9Var, boolean z, DownloadState downloadState, long j, by0 by0Var) {
        YouTabFactory$badge$1 youTabFactory$badge$1 = new YouTabFactory$badge$1(this.this$0, by0Var);
        youTabFactory$badge$1.L$0 = mm9Var;
        youTabFactory$badge$1.Z$0 = z;
        youTabFactory$badge$1.L$1 = downloadState;
        youTabFactory$badge$1.J$0 = j;
        return youTabFactory$badge$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.mt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b((mm9) obj, ((Boolean) obj2).booleanValue(), (DownloadState) obj3, ((Number) obj4).longValue(), (by0) obj5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cb2 cb2Var;
        Collection l;
        fp3 c;
        List a;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        mm9 mm9Var = (mm9) this.L$0;
        boolean z = this.Z$0;
        DownloadState downloadState = (DownloadState) this.L$1;
        long j = this.J$0;
        cb2Var = this.this$0.a;
        if (cb2Var.u() && z) {
            bq3 bq3Var = (bq3) downloadState.a();
            if (bq3Var == null || (c = bq3Var.c()) == null || (a = c.a()) == null) {
                l = i.l();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : a) {
                    if (!((com.nytimes.android.interests.db.a) obj2).j()) {
                        arrayList.add(obj2);
                    }
                }
                l = new ArrayList(i.w(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    l.add(cc0.d(((com.nytimes.android.interests.db.a) it2.next()).i()));
                }
            }
        } else {
            l = i.l();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : l) {
            if (((Number) obj3).longValue() > j) {
                arrayList2.add(obj3);
            }
        }
        return mm9Var.a() ? s25.a.a : !arrayList2.isEmpty() ? new s25.c(arrayList2.size()) : s25.b.a;
    }
}

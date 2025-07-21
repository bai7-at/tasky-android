package androidx.work.impl.constraints;

import androidx.work.impl.constraints.a;
import defpackage.by0;
import defpackage.dk9;
import defpackage.fc1;
import defpackage.h94;
import defpackage.i28;
import defpackage.it2;
import defpackage.kq8;
import defpackage.m45;
import defpackage.p55;
import defpackage.qs2;
import defpackage.s35;
import defpackage.ss2;
import defpackage.w60;
import defpackage.ww8;
import defpackage.y35;
import defpackage.yu0;
import defpackage.z60;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes.dex */
public final class WorkConstraintsTracker {
    private final List a;

    public WorkConstraintsTracker(List list) {
        zq3.h(list, "controllers");
        this.a = list;
    }

    public final boolean a(dk9 dk9Var) {
        String str;
        zq3.h(dk9Var, "workSpec");
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((yu0) obj).a(dk9Var)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            h94 e = h94.e();
            str = WorkConstraintsTrackerKt.a;
            e.a(str, "Work " + dk9Var.a + " constrained by " + i.u0(arrayList, null, null, null, 0, null, new ss2() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$areAllConstraintsMet$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(yu0 yu0Var) {
                    zq3.h(yu0Var, "it");
                    String simpleName = yu0Var.getClass().getSimpleName();
                    zq3.g(simpleName, "it.javaClass.simpleName");
                    return simpleName;
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final Flow b(dk9 dk9Var) {
        zq3.h(dk9Var, "spec");
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((yu0) obj).c(dk9Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((yu0) it2.next()).b(dk9Var.j));
        }
        final Flow[] flowArr = (Flow[]) i.X0(arrayList2).toArray(new Flow[0]);
        return FlowKt.distinctUntilChanged(new Flow() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            @fc1(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements it2 {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(by0 by0Var) {
                    super(3, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    a aVar;
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        a[] aVarArr = (a[]) ((Object[]) this.L$1);
                        int length = aVarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                aVar = null;
                                break;
                            }
                            aVar = aVarArr[i2];
                            if (!zq3.c(aVar, a.C0124a.a)) {
                                break;
                            }
                            i2++;
                        }
                        if (aVar == null) {
                            aVar = a.C0124a.a;
                        }
                        this.label = 1;
                        if (flowCollector.emit(aVar, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.it2
                public final Object invoke(FlowCollector flowCollector, Object[] objArr, by0 by0Var) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(by0Var);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = objArr;
                    return anonymousClass3.invokeSuspend(ww8.a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                final Flow[] flowArr2 = flowArr;
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new qs2() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Object[] mo865invoke() {
                        return new a[flowArr2.length];
                    }
                }, new AnonymousClass3(null), by0Var);
                return combineInternal == kotlin.coroutines.intrinsics.a.h() ? combineInternal : ww8.a;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(kq8 kq8Var) {
        this(i.q(new w60(kq8Var.a()), new z60(kq8Var.b()), new i28(kq8Var.e()), new s35(kq8Var.d()), new p55(kq8Var.d()), new m45(kq8Var.d()), new y35(kq8Var.d()), WorkConstraintsTrackerKt.a(kq8Var.c())));
        zq3.h(kq8Var, "trackers");
    }
}

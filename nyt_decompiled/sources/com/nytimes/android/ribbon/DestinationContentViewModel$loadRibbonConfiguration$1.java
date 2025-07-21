package com.nytimes.android.ribbon;

import com.nytimes.android.api.config.model.RibbonConfigDTO;
import com.nytimes.android.coroutinesutils.b;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import defpackage.by0;
import defpackage.cn8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.in1;
import defpackage.tp0;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.DestinationContentViewModel$loadRibbonConfiguration$1", f = "DestinationContentViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationContentViewModel$loadRibbonConfiguration$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DestinationContentViewModel this$0;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(((RibbonConfigDTO) obj).getPosition()), Integer.valueOf(((RibbonConfigDTO) obj2).getPosition()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationContentViewModel$loadRibbonConfiguration$1(DestinationContentViewModel destinationContentViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = destinationContentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationContentViewModel$loadRibbonConfiguration$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cn8 cn8Var;
        b bVar;
        RibbonTabConfigRepository ribbonTabConfigRepository;
        DestinationContentViewModel destinationContentViewModel;
        MutableStateFlow mutableStateFlow;
        Object value;
        in1 in1Var;
        ArrayList arrayList;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            cn8Var = this.this$0.e;
            DestinationContentViewModel destinationContentViewModel2 = this.this$0;
            b c = cn8Var.c("LoadRibbonConfig");
            c.b(false, (Pair[]) Arrays.copyOf(new Pair[0], 0));
            try {
                ribbonTabConfigRepository = destinationContentViewModel2.d;
                this.L$0 = destinationContentViewModel2;
                this.L$1 = c;
                this.label = 1;
                Object a2 = ribbonTabConfigRepository.a(this);
                if (a2 == h) {
                    return h;
                }
                bVar = c;
                obj = a2;
                destinationContentViewModel = destinationContentViewModel2;
            } catch (Exception e) {
                e = e;
                bVar = c;
                bVar.error(e);
                throw e;
            } catch (Throwable th) {
                th = th;
                bVar = c;
                bVar.a();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) this.L$1;
            destinationContentViewModel = (DestinationContentViewModel) this.L$0;
            try {
                try {
                    f.b(obj);
                } catch (Exception e2) {
                    e = e2;
                    bVar.error(e);
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar.a();
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((RibbonConfigDTO) obj2).getEnabled()) {
                arrayList2.add(obj2);
            }
        }
        List N0 = i.N0(arrayList2, new a());
        mutableStateFlow = destinationContentViewModel.f;
        do {
            value = mutableStateFlow.getValue();
            in1Var = (in1) value;
            if (in1Var == null) {
                in1Var = new in1(null, null, false, false, 15, null);
            }
            List list = N0;
            arrayList = new ArrayList(i.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((RibbonConfigDTO) it2.next()).getId());
            }
        } while (!mutableStateFlow.compareAndSet(value, in1.b(in1Var, N0, arrayList, false, false, 12, null)));
        ww8 ww8Var = ww8.a;
        bVar.a();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DestinationContentViewModel$loadRibbonConfiguration$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

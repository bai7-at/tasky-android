package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PagedList$dispatchStateChangeAsync$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ d $state;
    final /* synthetic */ LoadType $type;
    int label;
    final /* synthetic */ PagedList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagedList$dispatchStateChangeAsync$1(PagedList pagedList, LoadType loadType, d dVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pagedList;
        this.$type = loadType;
        this.$state = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PagedList$dispatchStateChangeAsync$1(this.this$0, this.$type, this.$state, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        list = this.this$0.i;
        kotlin.collections.i.I(list, new ss2() { // from class: androidx.paging.PagedList$dispatchStateChangeAsync$1.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference weakReference) {
                zq3.h(weakReference, "it");
                return Boolean.valueOf(weakReference.get() == null);
            }
        });
        list2 = this.this$0.i;
        LoadType loadType = this.$type;
        d dVar = this.$state;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            gt2 gt2Var = (gt2) ((WeakReference) it2.next()).get();
            if (gt2Var != null) {
                gt2Var.invoke(loadType, dVar);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PagedList$dispatchStateChangeAsync$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

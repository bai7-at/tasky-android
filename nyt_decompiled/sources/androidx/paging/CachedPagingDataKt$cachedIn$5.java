package androidx.paging;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.h4;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {ContentType.SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CachedPagingDataKt$cachedIn$5 extends SuspendLambda implements it2 {
    final /* synthetic */ h4 $tracker;
    int label;

    CachedPagingDataKt$cachedIn$5(h4 h4Var, by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        return new CachedPagingDataKt$cachedIn$5(null, by0Var).invokeSuspend(ww8.a);
    }
}

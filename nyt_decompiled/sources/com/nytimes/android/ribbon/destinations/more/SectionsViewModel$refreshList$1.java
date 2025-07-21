package com.nytimes.android.ribbon.destinations.more;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tv4;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.more.SectionsViewModel$refreshList$1", f = "SectionsViewModel.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SectionsViewModel$refreshList$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ tv4 $data;
    int label;
    final /* synthetic */ SectionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionsViewModel$refreshList$1(SectionsViewModel sectionsViewModel, tv4 tv4Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = sectionsViewModel;
        this.$data = tv4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SectionsViewModel$refreshList$1(this.this$0, this.$data, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        SectionsRepository sectionsRepository;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableStateFlow = this.this$0.d;
            tv4 tv4Var = this.$data;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, tv4Var != null ? new DownloadState.d(tv4Var) : DownloadState.c.b));
            sectionsRepository = this.this$0.a;
            this.label = 1;
            obj = sectionsRepository.a(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        List list = (List) obj;
        mutableStateFlow2 = this.this$0.d;
        tv4 tv4Var2 = this.$data;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, !list.isEmpty() ? new DownloadState.e(new tv4(list)) : DownloadState.Companion.a(tv4Var2, new Throwable("Empty fetch from SectionsRepository"))));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SectionsViewModel$refreshList$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

package androidx.paging;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xn5;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(PageFetcherSnapshot pageFetcherSnapshot, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s sVar, by0 by0Var) {
        return ((PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create(sVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, by0Var);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.L$0 = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xn5 xn5Var;
        boolean z;
        xn5 xn5Var2;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        s sVar = (s) this.L$0;
        int d = sVar.d() * (-1);
        xn5Var = this.this$0.c;
        if (d <= xn5Var.f) {
            int c = sVar.c() * (-1);
            xn5Var2 = this.this$0.c;
            if (c <= xn5Var2.f) {
                z = false;
                return cc0.a(z);
            }
        }
        z = true;
        return cc0.a(z);
    }
}

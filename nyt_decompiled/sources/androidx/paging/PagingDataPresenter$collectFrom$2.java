package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yn5;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PagingDataPresenter$collectFrom$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ PagingData $pagingData;
    int label;
    final /* synthetic */ PagingDataPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataPresenter$collectFrom$2(PagingDataPresenter pagingDataPresenter, PagingData pagingData, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = pagingDataPresenter;
        this.$pagingData = pagingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new PagingDataPresenter$collectFrom$2(this.this$0, this.$pagingData, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((PagingDataPresenter$collectFrom$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.this$0.c = this.$pagingData.d();
            Flow b = this.$pagingData.b();
            final PagingDataPresenter pagingDataPresenter = this.this$0;
            final PagingData pagingData = this.$pagingData;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.paging.PagingDataPresenter$collectFrom$2.1

                @fc1(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {138, 155, 167, 219}, m = "invokeSuspend")
                /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                    final /* synthetic */ PageEvent $event;
                    final /* synthetic */ PagingData $pagingData;
                    int label;
                    final /* synthetic */ PagingDataPresenter this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(PageEvent pageEvent, PagingDataPresenter pagingDataPresenter, PagingData pagingData, by0 by0Var) {
                        super(2, by0Var);
                        this.$event = pageEvent;
                        this.this$0 = pagingDataPresenter;
                        this.$pagingData = pagingData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new AnonymousClass2(this.$event, this.this$0, this.$pagingData, by0Var);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                        /*
                            Method dump skipped, instructions count: 535
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter$collectFrom$2.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(PageEvent pageEvent, by0 by0Var) {
                    CoroutineContext coroutineContext;
                    yn5 yn5Var = yn5.a;
                    if (yn5Var.a(2)) {
                        yn5Var.b(2, "Collected " + pageEvent, null);
                    }
                    coroutineContext = PagingDataPresenter.this.a;
                    Object withContext = BuildersKt.withContext(coroutineContext, new AnonymousClass2(pageEvent, PagingDataPresenter.this, pagingData, null), by0Var);
                    return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
                }
            };
            this.label = 1;
            if (b.collect(flowCollector, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}

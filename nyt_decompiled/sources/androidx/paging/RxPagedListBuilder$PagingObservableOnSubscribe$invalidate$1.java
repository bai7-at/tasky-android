package androidx.paging;

import androidx.paging.RxPagedListBuilder;
import androidx.paging.d;
import com.comscore.streaming.WindowState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1", f = "RxPagedListBuilder.kt", l = {395, WindowState.MINIMIZED}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RxPagedListBuilder.PagingObservableOnSubscribe this$0;

    @fc1(c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1$1", f = "RxPagedListBuilder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ RxPagedListBuilder.PagingObservableOnSubscribe this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RxPagedListBuilder.PagingObservableOnSubscribe pagingObservableOnSubscribe, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = pagingObservableOnSubscribe;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PagedList pagedList;
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            pagedList = this.this$0.f;
            pagedList.Q(LoadType.REFRESH, d.b.b);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1(RxPagedListBuilder.PagingObservableOnSubscribe pagingObservableOnSubscribe, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pagingObservableOnSubscribe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

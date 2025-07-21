package androidx.paging;

import androidx.paging.PagingSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import zendesk.core.BuildConfig;

@fc1(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.jvm.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LegacyPageFetcher$scheduleLoad$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PagingSource.a $params;
    final /* synthetic */ LoadType $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyPageFetcher this$0;

    @fc1(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.jvm.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ LoadType $type;
        final /* synthetic */ PagingSource.b $value;
        int label;
        final /* synthetic */ LegacyPageFetcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagingSource.b bVar, LegacyPageFetcher legacyPageFetcher, LoadType loadType, by0 by0Var) {
            super(2, by0Var);
            this.$value = bVar;
            this.this$0 = legacyPageFetcher;
            this.$type = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$value, this.this$0, this.$type, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            PagingSource.b bVar = this.$value;
            if (bVar instanceof PagingSource.b.C0106b) {
                this.this$0.j(this.$type, (PagingSource.b.C0106b) bVar);
            } else if (bVar instanceof PagingSource.b.a) {
                this.this$0.i(this.$type, ((PagingSource.b.a) bVar).a());
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyPageFetcher$scheduleLoad$1(LegacyPageFetcher legacyPageFetcher, PagingSource.a aVar, LoadType loadType, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = legacyPageFetcher;
        this.$params = aVar;
        this.$type = loadType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = new LegacyPageFetcher$scheduleLoad$1(this.this$0, this.$params, this.$type, by0Var);
        legacyPageFetcher$scheduleLoad$1.L$0 = obj;
        return legacyPageFetcher$scheduleLoad$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineDispatcher coroutineDispatcher;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            PagingSource g = this.this$0.g();
            PagingSource.a aVar = this.$params;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object load = g.load(aVar, this);
            if (load == h) {
                return h;
            }
            coroutineScope = coroutineScope2;
            obj = load;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            kotlin.f.b(obj);
        }
        PagingSource.b bVar = (PagingSource.b) obj;
        if (this.this$0.g().getInvalid()) {
            this.this$0.d();
            return ww8.a;
        }
        coroutineDispatcher = this.this$0.d;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatcher, null, new AnonymousClass1(bVar, this.this$0, this.$type, null), 2, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LegacyPageFetcher$scheduleLoad$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

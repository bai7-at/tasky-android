package androidx.paging;

import androidx.paging.PageFetcher;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.lt2;
import defpackage.ns7;
import defpackage.qs2;
import defpackage.st2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcher$flow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ RemoteMediator $remoteMediator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcher this$0;

    @fc1(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {63, 63}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ p $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(p pVar, by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$remoteMediatorAccessor, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.f.b(r7)
                goto L53
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.f.b(r7)
                goto L3a
            L23:
                kotlin.f.b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                androidx.paging.p r7 = r6.$remoteMediatorAccessor
                if (r7 == 0) goto L3d
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L3a
                return r0
            L3a:
                androidx.paging.RemoteMediator$InitializeAction r7 = (androidx.paging.RemoteMediator.InitializeAction) r7
                goto L3e
            L3d:
                r7 = r2
            L3e:
                androidx.paging.RemoteMediator$InitializeAction r5 = androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH
                if (r7 != r5) goto L43
                goto L44
            L43:
                r4 = 0
            L44:
                java.lang.Boolean r7 = defpackage.cc0.a(r4)
                r6.L$0 = r2
                r6.label = r3
                java.lang.Object r6 = r1.emit(r7, r6)
                if (r6 != r0) goto L53
                return r0
            L53:
                ww8 r6 = defpackage.ww8.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
            return ((AnonymousClass1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {ModuleDescriptor.MODULE_VERSION, AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        final /* synthetic */ p $remoteMediatorAccessor;
        /* synthetic */ Object L$0;
        Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ PageFetcher this$0;

        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qs2 {
            AnonymousClass1(Object obj) {
                super(0, obj, PageFetcher.class, "refresh", "refresh()V", 0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m124invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m124invoke() {
                ((PageFetcher) this.receiver).l();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(p pVar, PageFetcher pageFetcher, by0 by0Var) {
            super(3, by0Var);
            this.this$0 = pageFetcher;
        }

        public final Object b(PageFetcher.a aVar, boolean z, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$remoteMediatorAccessor, this.this$0, by0Var);
            anonymousClass2.L$0 = aVar;
            anonymousClass2.Z$0 = z;
            return anonymousClass2.invokeSuspend(ww8.a);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((PageFetcher.a) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* synthetic */ class a implements FlowCollector, st2 {
        final /* synthetic */ ns7 a;

        a(ns7 ns7Var) {
            this.a = ns7Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PagingData pagingData, by0 by0Var) {
            Object send = this.a.send(pagingData, by0Var);
            return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return new FunctionReferenceImpl(2, this.a, ns7.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$flow$1(RemoteMediator remoteMediator, PageFetcher pageFetcher, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = pageFetcher;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ns7 ns7Var, by0 by0Var) {
        return ((PageFetcher$flow$1) create(ns7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(null, this.this$0, by0Var);
        pageFetcher$flow$1.L$0 = obj;
        return pageFetcher$flow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConflatedEventBus conflatedEventBus;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ns7 ns7Var = (ns7) this.L$0;
            conflatedEventBus = this.this$0.d;
            Flow d = FlowExtKt.d(FlowKt.filterNotNull(FlowExtKt.c(FlowKt.onStart(conflatedEventBus.a(), new AnonymousClass1(null, null)), null, new AnonymousClass2(null, this.this$0, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this.this$0, null));
            a aVar = new a(ns7Var);
            this.label = 1;
            if (d.collect(aVar, this) == h) {
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

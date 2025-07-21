package com.nytimes.android.recentlyviewed;

import androidx.paging.RxPagedListBuilder;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import defpackage.b28;
import defpackage.c28;
import defpackage.hs;
import defpackage.os6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.z18;
import defpackage.zq3;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public final class RecentlyViewedManager implements os6 {
    public static final a Companion = new a(null);
    private final hs a;
    private final RecentlyViewedParams b;
    private final Scheduler c;
    private final MutableStateFlow d;
    private final StateFlow e;
    private final ReentrantLock f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RecentlyViewedManager(hs hsVar, RecentlyViewedParams recentlyViewedParams, Scheduler scheduler) {
        zq3.h(hsVar, "dao");
        zq3.h(recentlyViewedParams, "params");
        zq3.h(scheduler, "workingScheduler");
        this.a = hsVar;
        this.b = recentlyViewedParams;
        this.c = scheduler;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(b0.e());
        this.d = MutableStateFlow;
        this.e = FlowKt.asStateFlow(MutableStateFlow);
        this.f = new ReentrantLock();
        Single subscribeOn = hsVar.a().subscribeOn(scheduler);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager.1
            {
                super(1);
            }

            public final void b(List list) {
                RecentlyViewedManager recentlyViewedManager = RecentlyViewedManager.this;
                ReentrantLock reentrantLock = recentlyViewedManager.f;
                reentrantLock.lock();
                try {
                    MutableStateFlow mutableStateFlow = recentlyViewedManager.d;
                    Set set = (Set) recentlyViewedManager.d.getValue();
                    zq3.e(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String a2 = ((b28) it2.next()).a();
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    mutableStateFlow.setValue(b0.m(set, arrayList));
                    ww8 ww8Var = ww8.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: gs6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecentlyViewedManager.k(ss2.this, obj);
            }
        };
        final AnonymousClass2 anonymousClass2 = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager.2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error reading recently viewed", new Object[0]);
            }
        };
        subscribeOn.subscribe(consumer, new Consumer() { // from class: hs6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecentlyViewedManager.l(ss2.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z18 B(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (z18) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(z18 z18Var) {
        this.a.b(z18Var);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.d;
            Set set = (Set) this.d.getValue();
            if (z18Var.n() != null) {
                set = b0.n(set, z18Var.n());
            }
            mutableStateFlow.setValue(set);
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final boolean t(z18 z18Var) {
        return !zq3.c(z18Var.c(), "legacycollection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z18 w(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (z18) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(z18 z18Var) {
        this.a.e(z18Var);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.d;
            Set set = (Set) this.d.getValue();
            if (z18Var.n() != null) {
                set = b0.n(set, z18Var.n());
            }
            mutableStateFlow.setValue(set);
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Disposable A(final z18 z18Var, final int i) {
        zq3.h(z18Var, "asset");
        Single c = this.a.c(z18Var.e());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager$updateCommentCountOnAsset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final z18 invoke(z18 z18Var2) {
                zq3.h(z18Var2, "it");
                return c28.e(z18Var2, i);
            }
        };
        Single subscribeOn = c.map(new Function() { // from class: ls6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                z18 B;
                B = RecentlyViewedManager.B(ss2.this, obj);
                return B;
            }
        }).subscribeOn(this.c);
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager$updateCommentCountOnAsset$2
            {
                super(1);
            }

            public final void b(z18 z18Var2) {
                RecentlyViewedManager recentlyViewedManager = RecentlyViewedManager.this;
                zq3.e(z18Var2);
                recentlyViewedManager.z(z18Var2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((z18) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: ms6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecentlyViewedManager.C(ss2.this, obj);
            }
        };
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager$updateCommentCountOnAsset$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                RecentlyViewedManager.this.s(z18Var);
            }
        };
        Disposable subscribe = subscribeOn.subscribe(consumer, new Consumer() { // from class: ns6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecentlyViewedManager.D(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        return subscribe;
    }

    @Override // defpackage.os6
    public void a(final z18 z18Var, final OffsetDateTime offsetDateTime) {
        zq3.h(z18Var, "asset");
        zq3.h(offsetDateTime, "timestamp");
        if (t(z18Var)) {
            Single c = this.a.c(z18Var.e());
            final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager$registerViewedAsset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final z18 invoke(z18 z18Var2) {
                    zq3.h(z18Var2, "it");
                    return c28.d(z18Var2, OffsetDateTime.this, z18Var.i(), 0);
                }
            };
            Single subscribeOn = c.map(new Function() { // from class: is6
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    z18 w;
                    w = RecentlyViewedManager.w(ss2.this, obj);
                    return w;
                }
            }).subscribeOn(this.c);
            final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager$registerViewedAsset$2
                {
                    super(1);
                }

                public final void b(z18 z18Var2) {
                    RecentlyViewedManager recentlyViewedManager = RecentlyViewedManager.this;
                    zq3.e(z18Var2);
                    recentlyViewedManager.z(z18Var2);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((z18) obj);
                    return ww8.a;
                }
            };
            Consumer consumer = new Consumer() { // from class: js6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RecentlyViewedManager.x(ss2.this, obj);
                }
            };
            final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewedManager$registerViewedAsset$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    RecentlyViewedManager.this.s(z18Var);
                }
            };
            subscribeOn.subscribe(consumer, new Consumer() { // from class: ks6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RecentlyViewedManager.y(ss2.this, obj);
                }
            });
        }
    }

    @Override // defpackage.os6
    public Flowable b(int i) {
        return new RxPagedListBuilder(this.a.f(), i).a(BackpressureStrategy.LATEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.recentlyviewed.RecentlyViewedManager$flushOlderAssets$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.recentlyviewed.RecentlyViewedManager$flushOlderAssets$1 r0 = (com.nytimes.android.recentlyviewed.RecentlyViewedManager$flushOlderAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.recentlyviewed.RecentlyViewedManager$flushOlderAssets$1 r0 = new com.nytimes.android.recentlyviewed.RecentlyViewedManager$flushOlderAssets$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.L$0
            hs r7 = (defpackage.hs) r7
            kotlin.f.b(r8)
            goto L62
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.recentlyviewed.RecentlyViewedManager r7 = (com.nytimes.android.recentlyviewed.RecentlyViewedManager) r7
            kotlin.f.b(r8)
            goto L50
        L40:
            kotlin.f.b(r8)
            r0.L$0 = r7
            r0.label = r4
            r4 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            hs r8 = r7.a
            com.nytimes.android.recentlyviewed.RecentlyViewedParams r7 = r7.b
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r6 = r8
            r8 = r7
            r7 = r6
        L62:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r7 = r7.d(r8)
            if (r7 <= 0) goto L8a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Flushed "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = " rows from history"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.nytimes.android.logging.NYTLogger.l(r7, r8)
        L8a:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.recentlyviewed.RecentlyViewedManager.q(by0):java.lang.Object");
    }

    public final StateFlow r() {
        return this.e;
    }

    public final boolean u(String str) {
        zq3.h(str, "uri");
        return ((Set) this.d.getValue()).contains(str);
    }

    public final void v() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.d;
            mutableStateFlow.setValue(b0.e());
            ww8 ww8Var = ww8.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}

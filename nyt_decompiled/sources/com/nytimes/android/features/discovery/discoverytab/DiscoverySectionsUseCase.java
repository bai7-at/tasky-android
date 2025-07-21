package com.nytimes.android.features.discovery.discoverytab;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionMeta;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsRepository;
import com.nytimes.android.features.discovery.discoverytab.data.SectionLinksRepository;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.section.sectionfront.SectionFrontPersister;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.se7;
import defpackage.te7;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class DiscoverySectionsUseCase {
    public static final a Companion = new a(null);
    public static final int i = 8;
    private static final List j = i.o(new se7("discover/mostpopular", "mostpopular", false, false, "https://www.nytimes.com/trending", "nytimes://reader/sf/mostemailed", 12, null), new se7("discover/play", "play", true, false, "https://www.nytimes.com/crosswords", "https://www.nytimes.com/crosswords"), new se7("discover/opinion", "opinion", true, false, "https://www.nytimes.com/section/opinion", "nytimes://reader/sf/opinion", 8, null), new se7("discover/world", "world", true, false, "https://www.nytimes.com/section/world", "nytimes://reader/sf/world", 8, null), new se7("discover/us", "us", true, false, "https://www.nytimes.com/section/us", "nytimes://reader/sf/us", 8, null), new se7("discover/business", "business", true, false, "https://www.nytimes.com/section/business", "nytimes://reader/sf/business", 8, null));
    private final FeedStore a;
    private final CoroutineDispatcher b;
    private final SectionLinksRepository c;
    private final SectionCarouselsRepository d;
    private final RecentlyViewedManager e;
    private final te7 f;
    private final SectionFrontPersister g;
    private final cb2 h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return DiscoverySectionsUseCase.j;
        }

        private a() {
        }
    }

    public DiscoverySectionsUseCase(FeedStore feedStore, CoroutineDispatcher coroutineDispatcher, SectionLinksRepository sectionLinksRepository, SectionCarouselsRepository sectionCarouselsRepository, RecentlyViewedManager recentlyViewedManager, te7 te7Var, SectionFrontPersister sectionFrontPersister, cb2 cb2Var) {
        zq3.h(feedStore, "feedStore");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(sectionLinksRepository, "sectionLinksRepository");
        zq3.h(sectionCarouselsRepository, "sectionCarouselsRepository");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(te7Var, "sectionCarouselsLockupsCreator");
        zq3.h(sectionFrontPersister, "sectionFrontPersister");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = feedStore;
        this.b = coroutineDispatcher;
        this.c = sectionLinksRepository;
        this.d = sectionCarouselsRepository;
        this.e = recentlyViewedManager;
        this.f = te7Var;
        this.g = sectionFrontPersister;
        this.h = cb2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0183, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00fb -> B:20:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0160 -> B:18:0x016c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r26, java.util.Set r27, com.nytimes.android.coroutinesutils.ParallelDownloadStrategy r28, defpackage.by0 r29) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase.c(java.util.List, java.util.Set, com.nytimes.android.coroutinesutils.ParallelDownloadStrategy, by0):java.lang.Object");
    }

    private final Object d(LatestFeed latestFeed, String str, by0 by0Var) {
        Object obj;
        List<SectionMeta> sections = latestFeed.getSections();
        if (sections == null) {
            sections = i.l();
        }
        Iterator<T> it2 = sections.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(((SectionMeta) obj).getName(), str)) {
                break;
            }
        }
        SectionMeta sectionMeta = (SectionMeta) obj;
        return sectionMeta != null ? this.g.l(sectionMeta, by0Var) : cc0.a(false);
    }

    public final Flow e(ParallelDownloadStrategy parallelDownloadStrategy, final Pair pair) {
        zq3.h(parallelDownloadStrategy, "strategy");
        final Flow flowCombine = FlowKt.flowCombine(this.e.r(), this.d.b(parallelDownloadStrategy, j), new DiscoverySectionsUseCase$load$1(this, parallelDownloadStrategy, null));
        return FlowKt.flowOn(new Flow() { // from class: com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1

            /* renamed from: com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ Pair b;

                @fc1(c = "com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1$2", f = "DiscoverySectionsUseCase.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Pair pair) {
                    this.a = flowCollector;
                    this.b = pair;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1$2$1 r0 = (com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1$2$1 r0 = new com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        com.nytimes.android.coroutinesutils.DownloadState r5 = (com.nytimes.android.coroutinesutils.DownloadState) r5
                        kotlin.Pair r4 = r4.b
                        com.nytimes.android.coroutinesutils.DownloadState r4 = com.nytimes.android.coroutinesutils.a.a(r5, r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.DiscoverySectionsUseCase$load$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, pair), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, this.b);
    }
}

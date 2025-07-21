package com.nytimes.android;

import androidx.compose.runtime.b0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.config.model.Marketing;
import com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.bp0;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.qv6;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.xn8;
import defpackage.yr4;
import defpackage.z58;
import defpackage.zq3;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.threeten.bp.Instant;

/* loaded from: classes2.dex */
public final class MainViewModel extends q {
    private final FeedStore a;
    private final bp0 b;
    private final qv6 c;
    private final AbraManager d;
    private final MessageStateFactory e;
    private final MessageQueueUpdater f;
    private final AppPreferences g;
    private final z58 h;
    private final MutableStateFlow i;
    private final sy4 j;

    @fc1(c = "com.nytimes.android.MainViewModel$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.MainViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LatestFeed latestFeed, by0 by0Var) {
            return ((AnonymousClass1) create(latestFeed, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = MainViewModel.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            LatestFeed latestFeed = (LatestFeed) this.L$0;
            bp0 bp0Var = MainViewModel.this.b;
            Marketing marketing = latestFeed.getMarketing();
            boolean z = true;
            if (marketing != null && !marketing.getDisableComScore()) {
                z = false;
            }
            bp0Var.c(z);
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.MainViewModel$2", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.MainViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            NYTLogger.i((Throwable) this.L$0, "Unable to refresh LatestFeed", new Object[0]);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ ScrollObserver b;

        a(ScrollObserver scrollObserver) {
            this.b = scrollObserver;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(yr4 yr4Var, by0 by0Var) {
            sy4 l = MainViewModel.this.l();
            ScrollObserver scrollObserver = this.b;
            if (yr4Var instanceof xn8) {
                xn8 xn8Var = (xn8) yr4Var;
                if (xn8Var.b() == TooltipArrowPosition.TOP) {
                    xn8Var.f(scrollObserver);
                }
            }
            l.setValue(yr4Var);
            return ww8.a;
        }
    }

    public MainViewModel(FeedStore feedStore, bp0 bp0Var, qv6 qv6Var, AbraManager abraManager, MessageStateFactory messageStateFactory, MessageQueueUpdater messageQueueUpdater, AppPreferences appPreferences, z58 z58Var) {
        zq3.h(feedStore, "feedStore");
        zq3.h(bp0Var, "comScoreWrapper");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(abraManager, "abraManager");
        zq3.h(messageStateFactory, "messageStateFactory");
        zq3.h(messageQueueUpdater, "messageQueueUpdater");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(z58Var, "subauthClient");
        this.a = feedStore;
        this.b = bp0Var;
        this.c = qv6Var;
        this.d = abraManager;
        this.e = messageStateFactory;
        this.f = messageQueueUpdater;
        this.g = appPreferences;
        this.h = z58Var;
        this.i = StateFlowKt.MutableStateFlow(t.i());
        this.j = b0.e(null, null, 2, null);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(feedStore.e(), new AnonymousClass1(null)), new AnonymousClass2(null)), r.a(this));
    }

    private final Flow k(String str) {
        return MessageStateFactoryKt.c(this, str, this.i, this.e);
    }

    public final MutableStateFlow j() {
        return this.i;
    }

    public final sy4 l() {
        return this.j;
    }

    public final void m() {
        if (this.h.q()) {
            this.g.c("lastSeenUserInterests", Instant.now().getEpochSecond());
        }
    }

    public final Object n(String str, ScrollObserver scrollObserver, by0 by0Var) {
        Object collect = k(str).collect(new a(scrollObserver), by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    public final void o() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new MainViewModel$refreshConfigs$1(this, null), 3, null);
        this.c.d();
    }
}

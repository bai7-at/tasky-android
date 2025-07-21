package com.nytimes.android.dailyfive.ui;

import androidx.fragment.app.f;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.dailyfive.ui.a;
import com.nytimes.android.designsystem.uiview.ProgressVisibility;
import com.nytimes.android.logging.NYTLogger;
import defpackage.fy4;
import defpackage.m81;
import defpackage.ot7;
import defpackage.p81;
import defpackage.p94;
import defpackage.sn2;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class DailyFiveViewModel extends q {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final m81 a;
    private final CoroutineDispatcher b;
    private final com.nytimes.android.entitlements.a c;
    private final fy4 d;
    private final ot7 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DailyFiveViewModel(m81 m81Var, CoroutineDispatcher coroutineDispatcher, com.nytimes.android.entitlements.a aVar) {
        zq3.h(m81Var, "repository");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(aVar, "eCommClient");
        this.a = m81Var;
        this.b = coroutineDispatcher;
        this.c = aVar;
        this.d = new fy4(new p81(null, null, 3, null));
        this.e = new ot7();
    }

    private final void n(ParallelDownloadStrategy parallelDownloadStrategy) {
        m81 m81Var = this.a;
        p81 p81Var = (p81) this.d.f();
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(FlowKt.flowOn(m81Var.a(parallelDownloadStrategy, p81Var != null ? p81Var.c() : null), this.b), new DailyFiveViewModel$refresh$1(this, null)), new DailyFiveViewModel$refresh$2(this, null)), r.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p81 o(p81 p81Var, DownloadState downloadState) {
        if (zq3.c(downloadState, DownloadState.c.b)) {
            return p81.b(p81Var, null, ProgressVisibility.INDICATOR_ONLY, 1, null);
        }
        if (downloadState instanceof DownloadState.e) {
            return p81Var.a((sn2) ((DownloadState.e) downloadState).a(), ProgressVisibility.INVISIBLE);
        }
        if (downloadState instanceof DownloadState.d) {
            return p81Var.a((sn2) ((DownloadState.d) downloadState).a(), ProgressVisibility.INDICATOR_WITH_TEXT);
        }
        if (downloadState instanceof DownloadState.b) {
            DownloadState.b bVar = (DownloadState.b) downloadState;
            p94.a(NYTLogger.a, "daily_five", bVar.c());
            this.e.p(new a.C0253a(((sn2) bVar.a()).a()));
            return p81Var.a((sn2) bVar.a(), ProgressVisibility.INVISIBLE);
        }
        if (!(downloadState instanceof DownloadState.a)) {
            throw new NoWhenBranchMatchedException();
        }
        p94.a(NYTLogger.a, "daily_five", ((DownloadState.a) downloadState).c());
        this.e.p(a.c.a);
        return p81.b(p81Var, null, ProgressVisibility.INVISIBLE, 1, null);
    }

    public final void g(f fVar) {
        zq3.h(fVar, "activity");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DailyFiveViewModel$attemptLogin$1(this, fVar, null), 3, null);
    }

    public final ot7 i() {
        return this.e;
    }

    public final fy4 j() {
        return this.d;
    }

    public final void k() {
        n(ParallelDownloadStrategy.FETCH_ALWAYS);
    }

    public final void l(boolean z) {
        n(z ? ParallelDownloadStrategy.GET : ParallelDownloadStrategy.FETCH_IF_STALE);
    }

    public final void m() {
        n(ParallelDownloadStrategy.FETCH_ALWAYS);
    }
}

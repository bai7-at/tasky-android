package com.nytimes.android.analytics.handler;

import android.app.Application;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.purr.PurrTrackerTypeWrapper;
import defpackage.a19;
import defpackage.b19;
import defpackage.ci2;
import defpackage.gc;
import defpackage.m98;
import defpackage.p86;
import defpackage.zq3;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class FirebaseChannelHandler extends gc {
    public static final a Companion = new a(null);
    private final a19 f;
    private final p86 g;
    private final BehaviorSubject h;
    private final CoroutineDispatcher i;
    private final String j;
    private final Channel k;
    private FirebaseAnalytics l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseChannelHandler(a19 a19Var, p86 p86Var, BehaviorSubject behaviorSubject, CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        zq3.h(a19Var, "userPropertiesProvider");
        zq3.h(p86Var, "purrAnalyticsHelper");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.f = a19Var;
        this.g = p86Var;
        this.h = behaviorSubject;
        this.i = coroutineDispatcher;
        this.j = "firebase handler";
        this.k = Channel.Firebase;
    }

    private final boolean s() {
        return this.g.b(PurrTrackerTypeWrapper.PROCESSOR);
    }

    private final void w() {
        FlowKt.launchIn(FlowKt.onEach(this.g.a(PurrTrackerTypeWrapper.PROCESSOR), new FirebaseChannelHandler$setupPurrTrackerSettingsListener$1(this, null)), a());
    }

    private final String x() {
        m98 m98Var = (m98) this.h.getValue();
        if (m98Var != null) {
            return m98Var.c();
        }
        return null;
    }

    @Override // defpackage.hj0
    public Channel b() {
        return this.k;
    }

    @Override // defpackage.hj0
    public void e(Application application) {
        zq3.h(application, "application");
        this.l = q(application);
        u();
        w();
    }

    @Override // defpackage.gc
    public void o(m98 m98Var) {
        zq3.h(m98Var, "user");
        FirebaseAnalytics firebaseAnalytics = this.l;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.c(m98Var.c());
        }
    }

    public final void p(boolean z) {
        FirebaseAnalytics firebaseAnalytics = this.l;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.b(z);
        }
    }

    public final FirebaseAnalytics q(Application application) {
        zq3.h(application, "application");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(application);
        zq3.g(firebaseAnalytics, "getInstance(...)");
        firebaseAnalytics.b(s());
        return firebaseAnalytics;
    }

    @Override // defpackage.hj0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(ci2 ci2Var) {
        zq3.h(ci2Var, "event");
        if (this.l == null || !s()) {
            return;
        }
        Bundle j = j(ci2Var, false);
        String x = x();
        if (x != null) {
            j.putString("userId", x);
        }
        FirebaseAnalytics firebaseAnalytics = this.l;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(ci2Var.c(Channel.Firebase), j);
        }
    }

    public final void u() {
        if (this.f.b()) {
            return;
        }
        for (b19 b19Var : this.f.a()) {
            v(b19Var.a(), b19Var.b());
        }
    }

    public final void v(String str, String str2) {
        FirebaseAnalytics firebaseAnalytics;
        if (str == null || (firebaseAnalytics = this.l) == null) {
            return;
        }
        firebaseAnalytics.d(str, str2);
    }
}

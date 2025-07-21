package com.nytimes.android.eventtracker.coordinator;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.buffer.ValidationStatus;
import com.nytimes.android.eventtracker.clock.Clock;
import com.nytimes.android.eventtracker.model.Agent;
import com.nytimes.android.eventtracker.model.Event;
import com.nytimes.android.eventtracker.model.PreviousEventIds;
import com.nytimes.android.eventtracker.model.Timestamp;
import com.nytimes.android.eventtracker.validator.Validator;
import defpackage.ab;
import defpackage.an;
import defpackage.b42;
import defpackage.c44;
import defpackage.cm0;
import defpackage.d44;
import defpackage.e52;
import defpackage.f52;
import defpackage.fu;
import defpackage.g32;
import defpackage.jl7;
import defpackage.k42;
import defpackage.l32;
import defpackage.ls4;
import defpackage.n01;
import defpackage.sb6;
import defpackage.u42;
import defpackage.ul8;
import defpackage.z32;
import defpackage.zq3;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class DefaultEventCoordinator implements l32 {
    private final f52 a;
    public ab agentProvider;
    public an appStateProvider;
    public fu asyncDataProvider;
    private final Set b;
    private final d44 c;
    public cm0 clockProvider;
    public EventTracker.a configuration;
    public n01 coroutineDispatchers;
    private final Set d;
    public CoroutineScope e;
    public g32 eventBuffer;
    public c44 eventFlushLifecycleObserver;
    public c44 eventJobManagerLifecycleObserver;
    public u42 eventReporter;
    private final Mutex f;
    public z32 jobManager;
    public ls4 metaProvider;
    public String secureDeviceId;
    public jl7 sessionProvider;
    public Validator validator;

    public DefaultEventCoordinator(f52 f52Var, Set set, d44 d44Var, Set set2) {
        zq3.h(f52Var, "component");
        zq3.h(d44Var, "lifecycleOwner");
        this.a = f52Var;
        this.b = set;
        this.c = d44Var;
        this.d = set2;
        this.f = MutexKt.Mutex$default(false, 1, null);
        f52Var.a(this);
    }

    private final boolean A(e52 e52Var, Map map) {
        Set set = this.d;
        if (set == null) {
            return true;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (!((b42) it2.next()).a(e52Var, map)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String str, String str2, String str3) {
        ul8.a.z("ET2").l("Event[" + str + "] - " + str3 + " " + str2 + " - T[" + Thread.currentThread().getId() + "]", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(defpackage.sb6 r22, defpackage.by0 r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator.C(sb6, by0):java.lang.Object");
    }

    private final ValidationStatus D(Event event, Validator.Result result) {
        if (!result.b().isEmpty()) {
            ul8.a.z("ET2").u("Event[" + event.g() + "][" + event.p() + "] - Validator Messages: " + i.u0(result.b(), ", ", null, null, 0, null, null, 62, null), new Object[0]);
        }
        Boolean c = result.c();
        return zq3.c(c, Boolean.TRUE) ? ValidationStatus.VALID : zq3.c(c, Boolean.FALSE) ? ValidationStatus.INVALID : ValidationStatus.UNKNOWN;
    }

    private final Event j(String str, String str2, String str3, String str4, String str5, Timestamp timestamp, e52 e52Var, Agent agent, Map map, String str6, String str7) {
        Event event = new Event(str, str2, PreviousEventIds.Companion.a(str4, str5), str3, "et2-v4.2.0", o().i(), "et2sdk", timestamp, agent, y().a(timestamp), e52Var.a(), w().a(e52Var), l().get(), map, str6, str7);
        k42.a.g(timestamp, event);
        return event;
    }

    public final void E(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "<set-?>");
        this.e = coroutineScope;
    }

    @Override // defpackage.l32
    public void a(e52 e52Var, Map map, String str, String str2, String str3, String str4, String str5) {
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        zq3.h(str, "contextId");
        zq3.h(str3, "pageviewId");
        zq3.h(str5, "eventId");
        if (A(e52Var, map)) {
            BuildersKt__Builders_commonKt.launch$default(u(), null, null, new DefaultEventCoordinator$sendEvent$1(this, str5, e52Var, new sb6(Clock.a.b(), e52Var, map, str, str2, str3, str4, str5), null), 3, null);
        }
    }

    @Override // defpackage.l32
    public void b() {
        ul8.a.z("ET2").l("Removing EventFlush Job", new Object[0]);
        v().c();
    }

    @Override // defpackage.l32
    public void c() {
        Set set = this.b;
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                k42.a.a((k42.a) it2.next());
            }
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(p().a());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new DefaultEventCoordinator$setup$2$1(this, null), 3, null);
        E(CoroutineScope);
        Lifecycle lifecycle = this.c.getLifecycle();
        lifecycle.a(s());
        lifecycle.a(r());
    }

    @Override // defpackage.l32
    public void d() {
        ul8.a.z("ET2").l("Enabling EventFlush job", new Object[0]);
        v().a();
    }

    @Override // defpackage.l32
    public void e() {
        ul8.a.z("ET2").l("Disabling EventFlush Job", new Object[0]);
        v().b();
    }

    @Override // defpackage.l32
    public void f() {
        CoroutineScopeKt.cancel$default(u(), null, 1, null);
        k42.a.i();
        Lifecycle lifecycle = this.c.getLifecycle();
        lifecycle.d(s());
        lifecycle.d(r());
    }

    @Override // defpackage.l32
    public void flush() {
        t().a();
    }

    public final ab k() {
        ab abVar = this.agentProvider;
        if (abVar != null) {
            return abVar;
        }
        zq3.z("agentProvider");
        return null;
    }

    public final an l() {
        an anVar = this.appStateProvider;
        if (anVar != null) {
            return anVar;
        }
        zq3.z("appStateProvider");
        return null;
    }

    public final fu m() {
        fu fuVar = this.asyncDataProvider;
        if (fuVar != null) {
            return fuVar;
        }
        zq3.z("asyncDataProvider");
        return null;
    }

    public final cm0 n() {
        cm0 cm0Var = this.clockProvider;
        if (cm0Var != null) {
            return cm0Var;
        }
        zq3.z("clockProvider");
        return null;
    }

    public final EventTracker.a o() {
        EventTracker.a aVar = this.configuration;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("configuration");
        return null;
    }

    public final n01 p() {
        n01 n01Var = this.coroutineDispatchers;
        if (n01Var != null) {
            return n01Var;
        }
        zq3.z("coroutineDispatchers");
        return null;
    }

    public final g32 q() {
        g32 g32Var = this.eventBuffer;
        if (g32Var != null) {
            return g32Var;
        }
        zq3.z("eventBuffer");
        return null;
    }

    public final c44 r() {
        c44 c44Var = this.eventFlushLifecycleObserver;
        if (c44Var != null) {
            return c44Var;
        }
        zq3.z("eventFlushLifecycleObserver");
        return null;
    }

    public final c44 s() {
        c44 c44Var = this.eventJobManagerLifecycleObserver;
        if (c44Var != null) {
            return c44Var;
        }
        zq3.z("eventJobManagerLifecycleObserver");
        return null;
    }

    public final u42 t() {
        u42 u42Var = this.eventReporter;
        if (u42Var != null) {
            return u42Var;
        }
        zq3.z("eventReporter");
        return null;
    }

    public final CoroutineScope u() {
        CoroutineScope coroutineScope = this.e;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        zq3.z("eventTrackerScope");
        return null;
    }

    public final z32 v() {
        z32 z32Var = this.jobManager;
        if (z32Var != null) {
            return z32Var;
        }
        zq3.z("jobManager");
        return null;
    }

    public final ls4 w() {
        ls4 ls4Var = this.metaProvider;
        if (ls4Var != null) {
            return ls4Var;
        }
        zq3.z("metaProvider");
        return null;
    }

    public final String x() {
        String str = this.secureDeviceId;
        if (str != null) {
            return str;
        }
        zq3.z("secureDeviceId");
        return null;
    }

    public final jl7 y() {
        jl7 jl7Var = this.sessionProvider;
        if (jl7Var != null) {
            return jl7Var;
        }
        zq3.z("sessionProvider");
        return null;
    }

    public final Validator z() {
        Validator validator = this.validator;
        if (validator != null) {
            return validator;
        }
        zq3.z("validator");
        return null;
    }

    public /* synthetic */ DefaultEventCoordinator(f52 f52Var, Set set, d44 d44Var, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f52Var, set, (i & 4) != 0 ? l.i.a() : d44Var, (i & 8) != 0 ? null : set2);
    }
}

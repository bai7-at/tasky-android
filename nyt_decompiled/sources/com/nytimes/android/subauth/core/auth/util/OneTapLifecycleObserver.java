package com.nytimes.android.subauth.core.auth.util;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.cu;
import defpackage.du;
import defpackage.fc1;
import defpackage.it2;
import defpackage.jh5;
import defpackage.lh5;
import defpackage.o98;
import defpackage.oa4;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.xq5;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes4.dex */
public final class OneTapLifecycleObserver extends AssistedLoginLifecycleObserver {

    @fc1(c = "com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver$1", f = "OneTapLifecycleObserver.kt", l = {40, 63, 76}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements ss2 {
        final /* synthetic */ f $activity;
        final /* synthetic */ jh5 $oneTapEventTracker;
        final /* synthetic */ it2 $showEmailOptInLIREUI;
        final /* synthetic */ SubauthListenerManager $subauthListenerManager;
        final /* synthetic */ o98 $subauthUserClientAPI;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(o98 o98Var, f fVar, jh5 jh5Var, SubauthListenerManager subauthListenerManager, it2 it2Var, by0 by0Var) {
            super(1, by0Var);
            this.$subauthUserClientAPI = o98Var;
            this.$activity = fVar;
            this.$oneTapEventTracker = jh5Var;
            this.$subauthListenerManager = subauthListenerManager;
            this.$showEmailOptInLIREUI = it2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(by0 by0Var) {
            return new AnonymousClass1(this.$subauthUserClientAPI, this.$activity, this.$oneTapEventTracker, this.$subauthListenerManager, this.$showEmailOptInLIREUI, by0Var);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((AnonymousClass1) create(by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cu cuVar;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                ul8.a.z("SUBAUTH").a("Run One Tap Login", new Object[0]);
                o98 o98Var = this.$subauthUserClientAPI;
                f fVar = this.$activity;
                this.label = 1;
                obj = o98.a.f(o98Var, fVar, null, this, 2, null);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cuVar = (cu) this.L$0;
                    kotlin.f.b(obj);
                    return cuVar;
                }
                kotlin.f.b(obj);
            }
            cu a = du.a((oa4) obj);
            if (a instanceof cu.d) {
                this.$oneTapEventTracker.b();
                this.$subauthListenerManager.J();
                this.$oneTapEventTracker.c(false);
                this.$subauthListenerManager.y(((cu.d) a).a().a().c());
                return a;
            }
            if (a instanceof cu.f) {
                this.$oneTapEventTracker.b();
                this.$subauthListenerManager.J();
                String b = ((cu.f) a).a().d().b();
                this.$oneTapEventTracker.c(true);
                this.$subauthListenerManager.A(b);
                if (!zq3.c(b, "REGISTER") && !zq3.c(b, "LINKED_REGILITE")) {
                    return a;
                }
                ul8.a.z("SUBAUTH").a("One Tap Login (" + b + "). Show Account Ready Screen for Email Opt In", new Object[0]);
                it2 it2Var = this.$showEmailOptInLIREUI;
                f fVar2 = this.$activity;
                Boolean a2 = cc0.a(zq3.c(b, "REGISTER"));
                this.L$0 = a;
                this.label = 2;
                if (it2Var.invoke(fVar2, a2, this) == h) {
                    return h;
                }
            } else {
                if (!(a instanceof cu.g)) {
                    if (a instanceof cu.c) {
                        this.$oneTapEventTracker.a();
                        this.$subauthListenerManager.D();
                        return a;
                    }
                    if (!(a instanceof cu.h)) {
                        ul8.a.z("SUBAUTH").u("Unhandled tracking event in one tap.", new Object[0]);
                        return a;
                    }
                    this.$oneTapEventTracker.a();
                    this.$subauthListenerManager.D();
                    SubauthListenerManager subauthListenerManager = this.$subauthListenerManager;
                    lh5.a c = ((cu.h) a).a().c();
                    subauthListenerManager.y(c != null ? c.b() : null);
                    return a;
                }
                this.$oneTapEventTracker.b();
                this.$subauthListenerManager.J();
                String b2 = ((cu.g) a).a().d().b();
                this.$oneTapEventTracker.c(true);
                this.$subauthListenerManager.A(b2);
                if (!zq3.c(b2, "REGISTER") && !zq3.c(b2, "LINKED_REGILITE")) {
                    return a;
                }
                it2 it2Var2 = this.$showEmailOptInLIREUI;
                f fVar3 = this.$activity;
                Boolean a3 = cc0.a(zq3.c(b2, "REGISTER"));
                this.L$0 = a;
                this.label = 3;
                if (it2Var2.invoke(fVar3, a3, this) == h) {
                    return h;
                }
            }
            cuVar = a;
            return cuVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTapLifecycleObserver(f fVar, NYTUser nYTUser, o98 o98Var, xq5 xq5Var, jh5 jh5Var, SubauthListenerManager subauthListenerManager, it2 it2Var) {
        super(fVar, nYTUser, o98Var, xq5Var, "OneTap.Register.KEY_LAST_CHECK", new AnonymousClass1(o98Var, fVar, jh5Var, subauthListenerManager, it2Var, null), null, 64, null);
        zq3.h(fVar, "activity");
        zq3.h(nYTUser, "nytUser");
        zq3.h(o98Var, "subauthUserClientAPI");
        zq3.h(xq5Var, "perVersionManager");
        zq3.h(jh5Var, "oneTapEventTracker");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(it2Var, "showEmailOptInLIREUI");
    }
}

package com.nytimes.android.subauth.core.auth.util;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import defpackage.by0;
import defpackage.cu;
import defpackage.du;
import defpackage.fc1;
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
public final class SmartLockLifecycleObserver extends AssistedLoginLifecycleObserver {

    @fc1(c = "com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver$1", f = "SmartLockLifecycleObserver.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements ss2 {
        final /* synthetic */ f $activity;
        final /* synthetic */ SubauthListenerManager $subauthListenerManager;
        final /* synthetic */ o98 $subauthUserClientAPI;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(o98 o98Var, f fVar, SubauthListenerManager subauthListenerManager, by0 by0Var) {
            super(1, by0Var);
            this.$subauthUserClientAPI = o98Var;
            this.$activity = fVar;
            this.$subauthListenerManager = subauthListenerManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(by0 by0Var) {
            return new AnonymousClass1(this.$subauthUserClientAPI, this.$activity, this.$subauthListenerManager, by0Var);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((AnonymousClass1) create(by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                ul8.a.z("SUBAUTH").a("Run Smart Lock", new Object[0]);
                o98 o98Var = this.$subauthUserClientAPI;
                f fVar = this.$activity;
                this.label = 1;
                obj = o98Var.t(fVar, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            cu a = du.a((oa4) obj);
            if (a instanceof cu.d) {
                this.$subauthListenerManager.a(((cu.d) a).a().a().c());
            } else if (a instanceof cu.f) {
                this.$subauthListenerManager.O();
            } else if (a instanceof cu.g) {
                this.$subauthListenerManager.O();
            } else if (a instanceof cu.c) {
                this.$subauthListenerManager.N();
            } else if (a instanceof cu.i) {
                this.$subauthListenerManager.a(((cu.i) a).b().a());
            } else {
                ul8.a.z("SUBAUTH").u("Unhandled tracking event in smart lock.", new Object[0]);
            }
            return a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartLockLifecycleObserver(f fVar, NYTUser nYTUser, o98 o98Var, xq5 xq5Var, SubauthListenerManager subauthListenerManager) {
        super(fVar, nYTUser, o98Var, xq5Var, "SmartLockTask.KEY_LAST_CHECK", new AnonymousClass1(o98Var, fVar, subauthListenerManager, null), null, 64, null);
        zq3.h(fVar, "activity");
        zq3.h(nYTUser, "user");
        zq3.h(o98Var, "subauthUserClientAPI");
        zq3.h(xq5Var, "perVersionManager");
        zq3.h(subauthListenerManager, "subauthListenerManager");
    }
}

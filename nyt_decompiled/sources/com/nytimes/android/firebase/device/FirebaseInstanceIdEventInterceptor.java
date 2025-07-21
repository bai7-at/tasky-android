package com.nytimes.android.firebase.device;

import android.os.Bundle;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ic;
import defpackage.uc;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class FirebaseInstanceIdEventInterceptor implements ic {
    public static final a Companion = new a(null);
    private final Flow a;
    private final CoroutineScope b;
    private String c;

    @fc1(c = "com.nytimes.android.firebase.device.FirebaseInstanceIdEventInterceptor$1", f = "FirebaseInstanceIdEventInterceptor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.firebase.device.FirebaseInstanceIdEventInterceptor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, by0 by0Var) {
            return ((AnonymousClass1) create(str, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = FirebaseInstanceIdEventInterceptor.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            FirebaseInstanceIdEventInterceptor.this.c = (String) this.L$0;
            return ww8.a;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FirebaseInstanceIdEventInterceptor(Flow flow, CoroutineScope coroutineScope) {
        zq3.h(flow, "firebaseInstanceIdFlow");
        zq3.h(coroutineScope, "appScope");
        this.a = flow;
        this.b = coroutineScope;
        FlowKt.launchIn(FlowKt.onEach(flow, new AnonymousClass1(null)), coroutineScope);
    }

    @Override // defpackage.ic
    public void a(Bundle bundle) {
        zq3.h(bundle, "bundle");
        String str = this.c;
        if (str != null) {
            bundle.putString("firebase_instance_id", str);
        }
    }

    @Override // defpackage.ic
    public void b(Map map) {
        zq3.h(map, "builder");
        String str = this.c;
        if (str != null) {
            map.put("firebaseInstanceId", str);
        }
    }

    @Override // defpackage.ic
    public boolean c(uc ucVar) {
        zq3.h(ucVar, "event");
        return true;
    }
}

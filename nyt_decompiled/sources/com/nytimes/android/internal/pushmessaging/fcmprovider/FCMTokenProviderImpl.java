package com.nytimes.android.internal.pushmessaging.fcmprovider;

import com.google.firebase.messaging.FirebaseMessaging;
import com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl;
import defpackage.by0;
import defpackage.c04;
import defpackage.me5;
import defpackage.og8;
import defpackage.qs2;
import defpackage.r82;
import defpackage.u82;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class FCMTokenProviderImpl implements r82 {
    public static final a Companion = new a(null);
    private final FirebaseMessaging a;
    private final c04 b;
    private og8 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FCMTokenProviderImpl(FirebaseMessaging firebaseMessaging) {
        zq3.h(firebaseMessaging, "firebaseMessaging");
        this.a = firebaseMessaging;
        this.b = c.a(new qs2() { // from class: com.nytimes.android.internal.pushmessaging.fcmprovider.FCMTokenProviderImpl$tokenFlow$2
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MutableSharedFlow mo865invoke() {
                return SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableSharedFlow e() {
        return (MutableSharedFlow) this.b.getValue();
    }

    private final void f() {
        og8 og8Var = this.c;
        if (og8Var == null || og8Var.p()) {
            this.c = this.a.n().b(new me5() { // from class: t82
                @Override // defpackage.me5
                public final void onComplete(og8 og8Var2) {
                    FCMTokenProviderImpl.g(FCMTokenProviderImpl.this, og8Var2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(FCMTokenProviderImpl fCMTokenProviderImpl, og8 og8Var) {
        zq3.h(fCMTokenProviderImpl, "this$0");
        zq3.h(og8Var, "task");
        if (!og8Var.q() || og8Var.m() == null) {
            ul8.a.z("FCMTokenProvider").f(og8Var.l(), "Fetching FCM token token failed", new Object[0]);
            return;
        }
        String str = (String) og8Var.m();
        if (str == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(u82.a(), null, null, new FCMTokenProviderImpl$listenForFirebaseToken$1$1(fCMTokenProviderImpl, str, null), 3, null);
    }

    @Override // defpackage.r82
    public Flow a() {
        f();
        return FlowKt.distinctUntilChanged(e());
    }

    public final Object d(String str, by0 by0Var) {
        Object emit = e().emit(str, by0Var);
        return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
    }
}

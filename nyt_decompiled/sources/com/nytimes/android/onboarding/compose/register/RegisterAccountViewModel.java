package com.nytimes.android.onboarding.compose.register;

import android.app.Activity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.onboarding.compose.b;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class RegisterAccountViewModel extends q {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final ET2SimpleScope a;
    private final b b;
    private final com.nytimes.android.entitlements.a c;
    private final CoroutineDispatcher d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RegisterAccountViewModel(ET2SimpleScope eT2SimpleScope, b bVar, com.nytimes.android.entitlements.a aVar, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(bVar, "navStateConductor");
        zq3.h(aVar, "ecomm");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = eT2SimpleScope;
        this.b = bVar;
        this.c = aVar;
        this.d = coroutineDispatcher;
    }

    public final void i(Activity activity) {
        zq3.h(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new RegisterAccountViewModel$createAccount$1(this, activity, null), 3, null);
    }

    public final void j() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.d, null, new RegisterAccountViewModel$nextScreen$1(this, null), 2, null);
    }

    public final Job k() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), this.d, null, new RegisterAccountViewModel$trackPage$1(this, null), 2, null);
        return launch$default;
    }
}

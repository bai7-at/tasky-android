package com.nytimes.android.subauth.credentialmanager.providers;

import android.content.Intent;
import androidx.fragment.app.f;
import com.nytimes.android.subauth.credentialmanager.CredentialManagerFragmentKt;
import com.nytimes.android.subauth.credentialmanager.network.SSONetworkManager;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSignInHelper;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSmartLockHelper;
import defpackage.by0;
import defpackage.e77;
import defpackage.i13;
import defpackage.sl3;
import defpackage.ss2;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class GoogleSSOProviderImpl implements i13, e77, sl3 {
    public static final a Companion = new a(null);
    private static final AtomicInteger i = new AtomicInteger();
    private final GoogleOneTapHelper a;
    private final GoogleSignInHelper b;
    private final GoogleSmartLockHelper c;
    private final ss2 d;
    private final CoroutineDispatcher e;
    public SSONetworkManager f;
    private final CoroutineScope g;
    private final int h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public GoogleSSOProviderImpl(GoogleOneTapHelper googleOneTapHelper, GoogleSignInHelper googleSignInHelper, GoogleSmartLockHelper googleSmartLockHelper, ss2 ss2Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(googleOneTapHelper, "oneTapHelper");
        zq3.h(googleSignInHelper, "signInHelper");
        zq3.h(googleSmartLockHelper, "smartLockHelper");
        zq3.h(ss2Var, "ssoFragmentBuilder");
        zq3.h(coroutineDispatcher, "mainDispatcher");
        this.a = googleOneTapHelper;
        this.b = googleSignInHelper;
        this.c = googleSmartLockHelper;
        this.d = ss2Var;
        this.e = coroutineDispatcher;
        this.g = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.h = i.getAndIncrement() + 10003;
    }

    @Override // defpackage.i13
    public Object a(f fVar, String str, String str2, by0 by0Var) {
        return BuildersKt.withContext(this.e, new GoogleSSOProviderImpl$saveToSmartLock$2(this, fVar, str, str2, null), by0Var);
    }

    @Override // defpackage.sl3
    public void b(SSONetworkManager sSONetworkManager) {
        zq3.h(sSONetworkManager, "networkManager");
        p(sSONetworkManager);
    }

    @Override // defpackage.i13
    public Object c(f fVar, by0 by0Var) {
        return BuildersKt.withContext(this.e, new GoogleSSOProviderImpl$oneTapLogin$2(this, fVar, null), by0Var);
    }

    @Override // defpackage.i13
    public Object d(f fVar, boolean z, by0 by0Var) {
        return BuildersKt.withContext(this.e, new GoogleSSOProviderImpl$smartLock$2(this, fVar, z, null), by0Var);
    }

    @Override // defpackage.e77
    public void e(com.nytimes.android.subauth.credentialmanager.a aVar, int i2, int i3, Intent intent) {
        zq3.h(aVar, "fragment");
        BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new GoogleSSOProviderImpl$onActivityResult$1(i2, this, intent, i3, aVar, null), 3, null);
    }

    @Override // defpackage.g77
    public Object f(f fVar, String str, by0 by0Var) {
        return BuildersKt.withContext(this.e, new GoogleSSOProviderImpl$ssoLogin$2(this, fVar, str, null), by0Var);
    }

    public com.nytimes.android.subauth.credentialmanager.a k(f fVar, e77 e77Var, ss2 ss2Var) {
        return e77.a.a(this, fVar, e77Var, ss2Var);
    }

    public final Object l(by0 by0Var) {
        return m().getSSOCredentials("google", by0Var);
    }

    public final SSONetworkManager m() {
        SSONetworkManager sSONetworkManager = this.f;
        if (sSONetworkManager != null) {
            return sSONetworkManager;
        }
        zq3.z("networkManager");
        return null;
    }

    public final int n() {
        return this.h;
    }

    public void o(com.nytimes.android.subauth.credentialmanager.a aVar) {
        e77.a.b(this, aVar);
    }

    public final void p(SSONetworkManager sSONetworkManager) {
        zq3.h(sSONetworkManager, "<set-?>");
        this.f = sSONetworkManager;
    }

    public /* synthetic */ GoogleSSOProviderImpl(GoogleOneTapHelper googleOneTapHelper, GoogleSignInHelper googleSignInHelper, GoogleSmartLockHelper googleSmartLockHelper, ss2 ss2Var, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new GoogleOneTapHelper(null, 1, null) : googleOneTapHelper, (i2 & 2) != 0 ? new GoogleSignInHelper(null, 1, null) : googleSignInHelper, (i2 & 4) != 0 ? new GoogleSmartLockHelper(null, 1, null) : googleSmartLockHelper, (i2 & 8) != 0 ? CredentialManagerFragmentKt.a() : ss2Var, (i2 & 16) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }
}

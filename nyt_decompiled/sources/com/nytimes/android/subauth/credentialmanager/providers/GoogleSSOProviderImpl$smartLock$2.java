package com.nytimes.android.subauth.credentialmanager.providers;

import androidx.fragment.app.f;
import com.comscore.util.log.LogLevel;
import com.nytimes.android.subauth.credentialmanager.a;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleSmartLockHelper;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qv7;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.GoogleSSOProviderImpl$smartLock$2", f = "GoogleSSOProviderImpl.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleSSOProviderImpl$smartLock$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ f $activity;
    final /* synthetic */ boolean $isSSOEnabled;
    Object L$0;
    int label;
    final /* synthetic */ GoogleSSOProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSSOProviderImpl$smartLock$2(GoogleSSOProviderImpl googleSSOProviderImpl, f fVar, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleSSOProviderImpl;
        this.$activity = fVar;
        this.$isSSOEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleSSOProviderImpl$smartLock$2(this.this$0, this.$activity, this.$isSSOEnabled, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ss2 ss2Var;
        a aVar;
        Exception e;
        GoogleSmartLockHelper googleSmartLockHelper;
        a h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                GoogleSSOProviderImpl googleSSOProviderImpl = this.this$0;
                f fVar = this.$activity;
                ss2Var = googleSSOProviderImpl.d;
                a k = googleSSOProviderImpl.k(fVar, googleSSOProviderImpl, ss2Var);
                try {
                    ul8.a.z("SUBAUTH").a("Attempting Google SSO Smart Lock", new Object[0]);
                    googleSmartLockHelper = this.this$0.c;
                    f fVar2 = this.$activity;
                    boolean z = this.$isSSOEnabled;
                    this.L$0 = k;
                    this.label = 1;
                    Object f = googleSmartLockHelper.f(fVar2, k, LogLevel.NONE, z, this);
                    if (f == h) {
                        return h;
                    }
                    aVar = k;
                    obj = f;
                } catch (Exception e2) {
                    aVar = k;
                    e = e2;
                    ul8.a.z("SUBAUTH").t("Smart lock exception: " + e, new Object[0]);
                    qv7.a aVar2 = new qv7.a("Error trying to launch smart lock", e);
                    this.this$0.o(aVar);
                    return aVar2;
                } catch (Throwable th) {
                    h = k;
                    th = th;
                    this.this$0.o(h);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.L$0;
                try {
                    kotlin.f.b(obj);
                } catch (Exception e3) {
                    e = e3;
                    ul8.a.z("SUBAUTH").t("Smart lock exception: " + e, new Object[0]);
                    qv7.a aVar22 = new qv7.a("Error trying to launch smart lock", e);
                    this.this$0.o(aVar);
                    return aVar22;
                }
            }
            ul8.a.z("SUBAUTH").t("SmartLockHelper result: " + ((qv7) obj), new Object[0]);
            qv7 qv7Var = (qv7) obj;
            this.this$0.o(aVar);
            return qv7Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleSSOProviderImpl$smartLock$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

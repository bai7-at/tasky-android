package com.nytimes.android.subauth.credentialmanager.providers;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.credentialmanager.a;
import com.nytimes.android.subauth.credentialmanager.providers.helpers.GoogleOneTapHelper;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lh5;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.credentialmanager.providers.GoogleSSOProviderImpl$oneTapLogin$2", f = "GoogleSSOProviderImpl.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleSSOProviderImpl$oneTapLogin$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ f $activity;
    Object L$0;
    int label;
    final /* synthetic */ GoogleSSOProviderImpl this$0;

    /* renamed from: com.nytimes.android.subauth.credentialmanager.providers.GoogleSSOProviderImpl$oneTapLogin$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
        AnonymousClass1(Object obj) {
            super(1, obj, GoogleSSOProviderImpl.class, "getLireSSOResponse", "getLireSSOResponse(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((GoogleSSOProviderImpl) this.receiver).l(by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleSSOProviderImpl$oneTapLogin$2(GoogleSSOProviderImpl googleSSOProviderImpl, f fVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleSSOProviderImpl;
        this.$activity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleSSOProviderImpl$oneTapLogin$2(this.this$0, this.$activity, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ss2 ss2Var;
        a aVar;
        Exception e;
        GoogleOneTapHelper googleOneTapHelper;
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
                    googleOneTapHelper = this.this$0.a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.L$0 = k;
                    this.label = 1;
                    Object g = googleOneTapHelper.g(k, anonymousClass1, this);
                    if (g == h) {
                        return h;
                    }
                    aVar = k;
                    obj = g;
                } catch (Exception e2) {
                    aVar = k;
                    e = e2;
                    ul8.a.z("SUBAUTH").d("One Tap Login Exception: " + e, new Object[0]);
                    lh5.a aVar2 = new lh5.a("Error trying to launch one tap", e);
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
                    ul8.a.z("SUBAUTH").d("One Tap Login Exception: " + e, new Object[0]);
                    lh5.a aVar22 = new lh5.a("Error trying to launch one tap", e);
                    this.this$0.o(aVar);
                    return aVar22;
                }
            }
            lh5 lh5Var = (lh5) obj;
            this.this$0.o(aVar);
            return lh5Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleSSOProviderImpl$oneTapLogin$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

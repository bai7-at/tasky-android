package com.nytimes.android.subauth.core.auth;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.auth.network.response.LoginError;
import defpackage.by0;
import defpackage.fc1;
import defpackage.g77;
import defpackage.gt2;
import defpackage.h77;
import defpackage.i77;
import defpackage.oa4;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$loginWithSSO$2", f = "SubauthUserManager.kt", l = {369, 370}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$loginWithSSO$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ String $accountName;
    final /* synthetic */ f $activity;
    final /* synthetic */ LoginMethod $loginMethod;
    final /* synthetic */ String $marketingOptIn;
    final /* synthetic */ g77 $provider;
    final /* synthetic */ RegiInterface $regiInterface;
    final /* synthetic */ i77 $ssoType;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    @fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$loginWithSSO$2$1", f = "SubauthUserManager.kt", l = {373}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.SubauthUserManager$loginWithSSO$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ LoginMethod $loginMethod;
        final /* synthetic */ String $marketingOptIn;
        final /* synthetic */ RegiInterface $regiInterface;
        final /* synthetic */ h77 $ssoLoginStatus;
        final /* synthetic */ i77 $ssoType;
        int label;
        final /* synthetic */ SubauthUserManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(h77 h77Var, SubauthUserManager subauthUserManager, i77 i77Var, String str, RegiInterface regiInterface, LoginMethod loginMethod, by0 by0Var) {
            super(2, by0Var);
            this.$ssoLoginStatus = h77Var;
            this.this$0 = subauthUserManager;
            this.$ssoType = i77Var;
            this.$marketingOptIn = str;
            this.$regiInterface = regiInterface;
            this.$loginMethod = loginMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$ssoLoginStatus, this.this$0, this.$ssoType, this.$marketingOptIn, this.$regiInterface, this.$loginMethod, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object k0;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                h77 h77Var = this.$ssoLoginStatus;
                if (!(h77Var instanceof h77.c)) {
                    if (h77Var instanceof h77.a) {
                        String a = ((h77.a) h77Var).a();
                        ul8.a.z("SUBAUTH").d("Error on SSO Login: " + a, new Object[0]);
                        return new oa4.b(new LoginError(null, null, null, a, 7, null), this.$loginMethod, null, null, (h77.a) this.$ssoLoginStatus, null, false, 108, null);
                    }
                    if (!(h77Var instanceof h77.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable a2 = ((h77.b) h77Var).a();
                    String localizedMessage = a2 != null ? a2.getLocalizedMessage() : null;
                    ul8.a.z("SUBAUTH").d("User cancelled SSO Login: " + localizedMessage, new Object[0]);
                    return new oa4.a(this.$loginMethod);
                }
                SubauthUserManager subauthUserManager = this.this$0;
                i77 i77Var = this.$ssoType;
                String a3 = ((h77.c) h77Var).a();
                String str = this.$marketingOptIn;
                RegiInterface regiInterface = this.$regiInterface;
                h77.c cVar = (h77.c) this.$ssoLoginStatus;
                this.label = 1;
                k0 = subauthUserManager.k0(i77Var, a3, str, regiInterface, cVar, this);
                if (k0 == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                k0 = obj;
            }
            return (oa4) k0;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$loginWithSSO$2(g77 g77Var, f fVar, String str, SubauthUserManager subauthUserManager, i77 i77Var, String str2, RegiInterface regiInterface, LoginMethod loginMethod, by0 by0Var) {
        super(1, by0Var);
        this.$provider = g77Var;
        this.$activity = fVar;
        this.$accountName = str;
        this.this$0 = subauthUserManager;
        this.$ssoType = i77Var;
        this.$marketingOptIn = str2;
        this.$regiInterface = regiInterface;
        this.$loginMethod = loginMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$loginWithSSO$2(this.$provider, this.$activity, this.$accountName, this.this$0, this.$ssoType, this.$marketingOptIn, this.$regiInterface, this.$loginMethod, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$loginWithSSO$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            g77 g77Var = this.$provider;
            f fVar = this.$activity;
            String str = this.$accountName;
            this.label = 1;
            obj = g77Var.f(fVar, str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.f.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        h77 h77Var = (h77) obj;
        CoroutineDispatcher X = this.this$0.X();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(h77Var, this.this$0, this.$ssoType, this.$marketingOptIn, this.$regiInterface, this.$loginMethod, null);
        this.label = 2;
        obj = BuildersKt.withContext(X, anonymousClass1, this);
        return obj == h ? h : obj;
    }
}

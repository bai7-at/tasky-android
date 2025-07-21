package com.nytimes.android.subauth.core.auth;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import defpackage.by0;
import defpackage.fc1;
import defpackage.i13;
import defpackage.qv7;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.subauth.core.auth.SubauthUserManager$smartLock$2", f = "SubauthUserManager.kt", l = {555, 556}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserManager$smartLock$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ f $activity;
    final /* synthetic */ LoginMethod $loginMethod;
    final /* synthetic */ i13 $provider;
    int label;
    final /* synthetic */ SubauthUserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserManager$smartLock$2(i13 i13Var, f fVar, SubauthUserManager subauthUserManager, LoginMethod loginMethod, by0 by0Var) {
        super(1, by0Var);
        this.$provider = i13Var;
        this.$activity = fVar;
        this.this$0 = subauthUserManager;
        this.$loginMethod = loginMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthUserManager$smartLock$2(this.$provider, this.$activity, this.this$0, this.$loginMethod, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthUserManager$smartLock$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            i13 i13Var = this.$provider;
            f fVar = this.$activity;
            this.label = 1;
            obj = i13.a.a(i13Var, fVar, false, this, 2, null);
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
        SubauthUserManager subauthUserManager = this.this$0;
        LoginMethod loginMethod = this.$loginMethod;
        f fVar2 = this.$activity;
        this.label = 2;
        obj = subauthUserManager.h0((qv7) obj, loginMethod, fVar2, this);
        return obj == h ? h : obj;
    }
}

package com.nytimes.android.subauth.core.auth.userdetails;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$resetUserDetailsPollTime$2", f = "UserDetailsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class UserDetailsManager$resetUserDetailsPollTime$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    UserDetailsManager$resetUserDetailsPollTime$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        UserDetailsManager$resetUserDetailsPollTime$2 userDetailsManager$resetUserDetailsPollTime$2 = new UserDetailsManager$resetUserDetailsPollTime$2(by0Var);
        userDetailsManager$resetUserDetailsPollTime$2.L$0 = obj;
        return userDetailsManager$resetUserDetailsPollTime$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((UserDetailsManager$resetUserDetailsPollTime$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ((MutablePreferences) this.L$0).i(UserDetailsManager.Companion.a());
        return ww8.a;
    }
}

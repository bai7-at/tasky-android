package com.nytimes.android.subauth.core.auth.userdetails;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$backendQueryUserDetails$2", f = "UserDetailsManager.kt", l = {128, 130, 132, 142, 146, 150}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class UserDetailsManager$backendQueryUserDetails$2 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ UserDetailsManager this$0;

    @fc1(c = "com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$backendQueryUserDetails$2$1", f = "UserDetailsManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$backendQueryUserDetails$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ long $nextPollTime;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, by0 by0Var) {
            super(2, by0Var);
            this.$nextPollTime = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nextPollTime, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
            return ((AnonymousClass1) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ((MutablePreferences) this.L$0).j(UserDetailsManager.Companion.a(), cc0.d(this.$nextPollTime));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailsManager$backendQueryUserDetails$2(UserDetailsManager userDetailsManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = userDetailsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new UserDetailsManager$backendQueryUserDetails$2(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$backendQueryUserDetails$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((UserDetailsManager$backendQueryUserDetails$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}

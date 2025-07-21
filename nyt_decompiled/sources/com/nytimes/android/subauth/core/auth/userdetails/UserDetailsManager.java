package com.nytimes.android.subauth.core.auth.userdetails;

import androidx.datastore.preferences.core.PreferencesKt;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import defpackage.ba1;
import defpackage.by0;
import defpackage.c05;
import defpackage.qz8;
import defpackage.s16;
import defpackage.u16;
import defpackage.vz8;
import defpackage.ww8;
import defpackage.xz8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class UserDetailsManager implements xz8 {
    public static final a Companion = new a(null);
    private static final s16.a g = u16.e("nextUserDetailsPollTime");
    private final ba1 a;
    private final vz8 b;
    private final qz8 c;
    private final c05 d;
    private final SubauthListenerManager e;
    private final CoroutineDispatcher f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s16.a a() {
            return UserDetailsManager.g;
        }

        private a() {
        }
    }

    public UserDetailsManager(ba1 ba1Var, vz8 vz8Var, qz8 qz8Var, c05 c05Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(ba1Var, "dataStore");
        zq3.h(vz8Var, "userDetailsClientAPI");
        zq3.h(qz8Var, "userDataDatabaseProvider");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = ba1Var;
        this.b = vz8Var;
        this.c = qz8Var;
        this.d = c05Var;
        this.e = subauthListenerManager;
        this.f = coroutineDispatcher;
    }

    private final Object k(by0 by0Var) {
        return BuildersKt.withContext(this.f, new UserDetailsManager$backendQueryUserDetails$2(this, null), by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.nytimes.android.subauth.core.auth.network.UserDetailsException r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$logUserDetailsError$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$logUserDetailsError$1 r0 = (com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$logUserDetailsError$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$logUserDetailsError$1 r0 = new com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$logUserDetailsError$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$1
            com.nytimes.android.subauth.core.auth.network.UserDetailsException r6 = (com.nytimes.android.subauth.core.auth.network.UserDetailsException) r6
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager r0 = (com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager) r0
            kotlin.f.b(r7)
            r4 = r7
            r7 = r5
            r5 = r0
            r0 = r4
            goto L5d
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.f.b(r7)
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto L4c
            java.lang.String r7 = "Unknown error"
        L4c:
            c05 r2 = r5.d
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r2.q(r0)
            if (r0 != r1) goto L5d
            return r1
        L5d:
            java.lang.String r0 = (java.lang.String) r0
            com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager r5 = r5.e
            boolean r6 = r6.a()
            r5.G(r7, r0, r6)
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager.l(com.nytimes.android.subauth.core.auth.network.UserDetailsException, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$onLogout$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$onLogout$1 r0 = (com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$onLogout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$onLogout$1 r0 = new com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$onLogout$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager r5 = (com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager) r5
            kotlin.f.b(r6)
            goto L50
        L3c:
            kotlin.f.b(r6)
            qz8 r6 = r5.c
            com.nytimes.android.subauth.core.database.userdata.regi.RegiData r2 = defpackage.bu6.a()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.g(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager.a(by0):java.lang.Object");
    }

    @Override // defpackage.xz8
    public Object b(by0 by0Var) {
        Object a2 = PreferencesKt.a(this.a, new UserDetailsManager$resetUserDetailsPollTime$2(null), by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(boolean r12, defpackage.by0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$1
            if (r0 == 0) goto L13
            r0 = r13
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$1 r0 = (com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$1 r0 = new com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.f.b(r13)
            goto L91
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.f.b(r13)
            goto Laa
        L3f:
            java.lang.Object r11 = r0.L$0
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager r11 = (com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager) r11
            kotlin.f.b(r13)
            goto L72
        L47:
            kotlin.f.b(r13)
            goto L59
        L4b:
            kotlin.f.b(r13)
            if (r12 == 0) goto L5c
            r0.label = r6
            java.lang.Object r13 = r11.k(r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            com.nytimes.android.subauth.core.auth.userdetails.a r13 = (com.nytimes.android.subauth.core.auth.userdetails.a) r13
            goto Lac
        L5c:
            ba1 r12 = r11.a
            kotlinx.coroutines.flow.Flow r12 = r12.getData()
            com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$$inlined$map$1 r13 = new com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager$queryUserDetails$$inlined$map$1
            r13.<init>()
            r0.L$0 = r11
            r0.label = r5
            java.lang.Object r13 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r13, r0)
            if (r13 != r1) goto L72
            return r1
        L72:
            java.lang.Long r13 = (java.lang.Long) r13
            r12 = 0
            if (r13 == 0) goto L9a
            long r7 = r13.longValue()
            long r9 = java.lang.System.currentTimeMillis()
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 >= 0) goto L84
            goto L9a
        L84:
            qz8 r11 = r11.c
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r13 = r11.e(r0)
            if (r13 != r1) goto L91
            return r1
        L91:
            com.nytimes.android.subauth.core.database.userdata.UserData r13 = (com.nytimes.android.subauth.core.database.userdata.UserData) r13
            com.nytimes.android.subauth.core.auth.userdetails.a$b r11 = new com.nytimes.android.subauth.core.auth.userdetails.a$b
            r11.<init>(r13, r6)
            r13 = r11
            goto Lac
        L9a:
            com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager r13 = r11.e
            r13.u()
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = r11.k(r0)
            if (r13 != r1) goto Laa
            return r1
        Laa:
            com.nytimes.android.subauth.core.auth.userdetails.a r13 = (com.nytimes.android.subauth.core.auth.userdetails.a) r13
        Lac:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager.c(boolean, by0):java.lang.Object");
    }

    public /* synthetic */ UserDetailsManager(ba1 ba1Var, vz8 vz8Var, qz8 qz8Var, c05 c05Var, SubauthListenerManager subauthListenerManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba1Var, vz8Var, qz8Var, c05Var, subauthListenerManager, (i & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}

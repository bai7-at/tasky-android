package com.nytimes.android.subauth.core.auth.network;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.exception.ApolloException;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import defpackage.g78;
import defpackage.q22;
import defpackage.vz8;
import defpackage.w88;
import defpackage.wz8;
import defpackage.yj;
import defpackage.yz8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class UserDetailsClientAPIImpl implements vz8 {
    private final ApolloClient a;
    private final w88 b;
    private final wz8 c;
    private final SubauthListenerManager d;

    public UserDetailsClientAPIImpl(ApolloClient apolloClient, w88 w88Var, wz8 wz8Var, SubauthListenerManager subauthListenerManager) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(w88Var, "networkStatus");
        zq3.h(wz8Var, "userDetailsParser");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        this.a = apolloClient;
        this.b = w88Var;
        this.c = wz8Var;
        this.d = subauthListenerManager;
    }

    private final yz8.i b(yj yjVar) {
        try {
            yz8.i a = ((yz8.c) yjVar.a()).a();
            if (a != null) {
                return a;
            }
            throw new UserDetailsException("Response empty on Query UserDetails", null, false, 6, null);
        } catch (ApolloException e) {
            List list = yjVar.d;
            q22 q22Var = list != null ? (q22) i.m0(list) : null;
            if (q22Var != null) {
                g78.a.a(this.d, "UserDetails Query", q22Var, null, 4, null);
            } else {
                this.d.f("UserDetails Query Partial Response", e.getMessage());
            }
            throw new UserDetailsException(e.getMessage(), e, false, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl$queryUserDetails$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl$queryUserDetails$1 r2 = (com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl$queryUserDetails$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl$queryUserDetails$1 r2 = new com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl$queryUserDetails$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r0 = r2.L$0
            com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl r0 = (com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl) r0
            kotlin.f.b(r1)
            goto L5a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.f.b(r1)
            w88 r1 = r0.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L83
            com.apollographql.apollo.ApolloClient r1 = r0.a
            yz8 r4 = new yz8
            r4.<init>()
            com.apollographql.apollo.ApolloCall r1 = r1.L(r4)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.b(r2)
            if (r1 != r3) goto L5a
            return r3
        L5a:
            yj r1 = (defpackage.yj) r1
            ii5$a r2 = r1.c
            if (r2 == 0) goto L6b
            yz8$i r1 = r0.b(r1)
            wz8 r0 = r0.c
            com.nytimes.android.subauth.core.database.userdata.regi.RegiData r0 = r0.e(r1)
            return r0
        L6b:
            com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager r0 = r0.d
            r2 = 0
            com.apollographql.apollo.exception.ApolloException r3 = r1.e
            java.lang.String r4 = "UserDetails Query"
            r0.S(r4, r2, r3)
            com.nytimes.android.subauth.core.auth.network.UserDetailsException r0 = new com.nytimes.android.subauth.core.auth.network.UserDetailsException
            com.apollographql.apollo.exception.ApolloException r7 = r1.e
            r9 = 4
            r10 = 0
            java.lang.String r6 = "Response empty on Query UserDetails"
            r8 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            throw r0
        L83:
            com.nytimes.android.subauth.core.auth.network.UserDetailsException r0 = new com.nytimes.android.subauth.core.auth.network.UserDetailsException
            r15 = 2
            r16 = 0
            java.lang.String r12 = "Network Not Connected. Cannot Query User Details."
            r13 = 0
            r14 = 1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl.a(by0):java.lang.Object");
    }
}

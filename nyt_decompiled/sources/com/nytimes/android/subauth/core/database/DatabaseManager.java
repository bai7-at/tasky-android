package com.nytimes.android.subauth.core.database;

import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.nytuser.NYTUserImpl;
import defpackage.bu6;
import defpackage.by0;
import defpackage.gy0;
import defpackage.j86;
import defpackage.jy0;
import defpackage.mu7;
import defpackage.qz8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class DatabaseManager implements jy0, j86, qz8 {
    private final NYTUserImpl nytUser;
    private final SubauthDatabase subauthDatabase;

    public DatabaseManager(SubauthDatabase subauthDatabase, NYTUserImpl nYTUserImpl) {
        zq3.h(subauthDatabase, "subauthDatabase");
        zq3.h(nYTUserImpl, "nytUser");
        this.subauthDatabase = subauthDatabase;
        this.nytUser = nYTUserImpl;
    }

    private final UserData l(RegiData regiData, GooglePlayData googlePlayData) {
        if (regiData == null) {
            regiData = bu6.a();
        }
        RegiData regiData2 = regiData;
        if (googlePlayData == null) {
            googlePlayData = new GooglePlayData(null, null, 3, null);
        }
        return new UserData(0L, regiData2, googlePlayData, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.subauth.core.database.DatabaseManager$updateNYTUser$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.subauth.core.database.DatabaseManager$updateNYTUser$1 r0 = (com.nytimes.android.subauth.core.database.DatabaseManager$updateNYTUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.database.DatabaseManager$updateNYTUser$1 r0 = new com.nytimes.android.subauth.core.database.DatabaseManager$updateNYTUser$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource r5 = (com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.database.DatabaseManager r4 = (com.nytimes.android.subauth.core.database.DatabaseManager) r4
            kotlin.f.b(r6)
            goto L50
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            com.nytimes.android.subauth.core.database.SubauthDatabase r6 = r4.subauthDatabase
            oz8 r6 = r6.f()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            com.nytimes.android.subauth.core.database.userdata.UserData r6 = (com.nytimes.android.subauth.core.database.userdata.UserData) r6
            if (r6 == 0) goto L5a
            com.nytimes.android.subauth.core.nytuser.NYTUserImpl r4 = r4.nytUser
            r0 = 0
            r4.D(r6, r0, r5)
        L5a:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.database.DatabaseManager.o(com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource, by0):java.lang.Object");
    }

    @Override // defpackage.jy0
    public Object a(String str, by0 by0Var) {
        return this.subauthDatabase.d().a(str, by0Var);
    }

    @Override // defpackage.j86
    public Object b(String str, by0 by0Var) {
        return this.subauthDatabase.e().b(str, by0Var);
    }

    @Override // defpackage.j86
    public Object c(mu7 mu7Var, boolean z, by0 by0Var) {
        Object c = this.subauthDatabase.e().c(mu7Var, z, by0Var);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    @Override // defpackage.jy0
    public Object d(by0 by0Var) {
        return this.subauthDatabase.d().c(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.qz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.database.DatabaseManager$getUserData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.database.DatabaseManager$getUserData$1 r0 = (com.nytimes.android.subauth.core.database.DatabaseManager$getUserData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.database.DatabaseManager$getUserData$1 r0 = new com.nytimes.android.subauth.core.database.DatabaseManager$getUserData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            com.nytimes.android.subauth.core.database.SubauthDatabase r4 = r4.subauthDatabase
            oz8 r4 = r4.f()
            r0.label = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.nytimes.android.subauth.core.database.userdata.UserData r5 = (com.nytimes.android.subauth.core.database.userdata.UserData) r5
            ul8$b r4 = defpackage.ul8.a
            java.lang.String r0 = "SUBAUTH"
            ul8$c r4 = r4.z(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getUserData: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4.a(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.database.DatabaseManager.e(by0):java.lang.Object");
    }

    @Override // defpackage.jy0
    public Object f(String str, String str2, by0 by0Var) {
        if (str2 != null) {
            Object b = this.subauthDatabase.d().b(new gy0(str, str2), by0Var);
            return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
        }
        Object d = this.subauthDatabase.d().d(str, by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // defpackage.qz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(com.nytimes.android.subauth.core.database.userdata.regi.RegiData r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.database.DatabaseManager.g(com.nytimes.android.subauth.core.database.userdata.regi.RegiData, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.jy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.database.DatabaseManager$hasCookies$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.database.DatabaseManager$hasCookies$1 r0 = (com.nytimes.android.subauth.core.database.DatabaseManager$hasCookies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.database.DatabaseManager$hasCookies$1 r0 = new com.nytimes.android.subauth.core.database.DatabaseManager$hasCookies$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.d(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r4 = r5.isEmpty()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.database.DatabaseManager.h(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.j86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.util.Set r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.subauth.core.database.DatabaseManager$savePurchases$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.subauth.core.database.DatabaseManager$savePurchases$1 r0 = (com.nytimes.android.subauth.core.database.DatabaseManager$savePurchases$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.database.DatabaseManager$savePurchases$1 r0 = new com.nytimes.android.subauth.core.database.DatabaseManager$savePurchases$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            nu7 r5 = (defpackage.nu7) r5
            kotlin.f.b(r7)
            goto L73
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$2
            nu7 r5 = (defpackage.nu7) r5
            java.lang.Object r6 = r0.L$1
            nu7 r6 = (defpackage.nu7) r6
            java.lang.Object r2 = r0.L$0
            java.util.Set r2 = (java.util.Set) r2
            kotlin.f.b(r7)
            r7 = r6
            r6 = r2
            goto L63
        L4a:
            kotlin.f.b(r7)
            com.nytimes.android.subauth.core.database.SubauthDatabase r5 = r5.subauthDatabase
            nu7 r5 = r5.e()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r7 = r5.f(r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r7 = r5
        L63:
            r0.L$0 = r7
            r7 = 0
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r5 = r5.e(r6, r0)
            if (r5 != r1) goto L73
            return r1
        L73:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.database.DatabaseManager.i(java.util.Set, by0):java.lang.Object");
    }

    @Override // defpackage.qz8
    public Object j(Set set, boolean z, by0 by0Var) {
        Date date;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!zq3.c((String) obj, com.nytimes.android.subauth.core.database.userdata.subscription.a.TEMP_ENTITLEMENT)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.nytimes.android.subauth.core.database.userdata.subscription.a.b((String) it2.next()));
        }
        Set c1 = i.c1(arrayList2);
        if (z) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(12, 10);
            date = calendar.getTime();
        } else {
            date = null;
        }
        Object n = n(new GooglePlayData(c1, date), by0Var);
        return n == kotlin.coroutines.intrinsics.a.h() ? n : ww8.a;
    }

    public Object m(by0 by0Var) {
        return this.subauthDatabase.f().h(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData r9, defpackage.by0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.nytimes.android.subauth.core.database.DatabaseManager$updateGooglePlayData$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.subauth.core.database.DatabaseManager$updateGooglePlayData$1 r0 = (com.nytimes.android.subauth.core.database.DatabaseManager$updateGooglePlayData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.database.DatabaseManager$updateGooglePlayData$1 r0 = new com.nytimes.android.subauth.core.database.DatabaseManager$updateGooglePlayData$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L51
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.f.b(r10)
            goto La8
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.subauth.core.database.DatabaseManager r8 = (com.nytimes.android.subauth.core.database.DatabaseManager) r8
            kotlin.f.b(r10)
            goto L9b
        L44:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData r9 = (com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData) r9
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.subauth.core.database.DatabaseManager r8 = (com.nytimes.android.subauth.core.database.DatabaseManager) r8
            kotlin.f.b(r10)
            goto L61
        L51:
            kotlin.f.b(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r8.m(r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L80
            com.nytimes.android.subauth.core.database.userdata.UserData r9 = r8.l(r7, r9)
            com.nytimes.android.subauth.core.database.SubauthDatabase r10 = r8.subauthDatabase
            oz8 r10 = r10.f()
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r9 = r10.g(r9, r0)
            if (r9 != r1) goto L9b
            return r1
        L80:
            com.nytimes.android.subauth.core.database.SubauthDatabase r10 = r8.subauthDatabase
            oz8 r10 = r10.f()
            java.util.Set r2 = r9.getEntitlements()
            java.util.Date r9 = r9.getProvisionalExpirationDate()
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r9 = r10.f(r2, r9, r0)
            if (r9 != r1) goto L9b
            return r1
        L9b:
            com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource r9 = com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource.GOOGLE_PLAY
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.o(r9, r0)
            if (r8 != r1) goto La8
            return r1
        La8:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.database.DatabaseManager.n(com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData, by0):java.lang.Object");
    }
}

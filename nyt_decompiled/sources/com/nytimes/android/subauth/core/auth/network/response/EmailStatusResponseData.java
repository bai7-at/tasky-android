package com.nytimes.android.subauth.core.auth.network.response;

import com.nytimes.android.subauth.core.auth.network.response.a;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import defpackage.et3;
import defpackage.rz;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class EmailStatusResponseData {
    public static final a Companion = new a(null);
    private final List a;
    private final String b;
    private final EmailStatusResponseAccountStatus c;
    private final Long d;
    private final Boolean e;
    private final String f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final EmailStatusResponseData a(com.nytimes.android.subauth.core.auth.network.response.a aVar, String str) {
            String str2;
            ArrayList arrayList;
            String str3;
            Long l;
            Boolean bool;
            String str4;
            zq3.h(aVar, "emailAccountStatus");
            zq3.h(str, "email");
            Long valueOf = Long.valueOf(UserData.USER_ID);
            Boolean bool2 = null;
            if (aVar instanceof a.c) {
                a.c cVar = (a.c) aVar;
                str2 = cVar.b();
                Boolean c = cVar.c();
                l = valueOf;
                str4 = cVar.a();
                str3 = str;
                bool = c;
                arrayList = null;
                bool2 = Boolean.TRUE;
            } else {
                if (aVar instanceof a.d) {
                    Map a = ((a.d) aVar).a().a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : a.entrySet()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((AuthMethod) ((Map.Entry) it2.next()).getKey()).getValue());
                    }
                    str2 = "ENABLED";
                    l = valueOf;
                    arrayList = arrayList2;
                    str3 = str;
                    bool = null;
                } else {
                    if (zq3.c(aVar, a.C0413a.a)) {
                        str2 = "DISABLED";
                    } else if (zq3.c(aVar, a.b.a)) {
                        str2 = "NO_ACCOUNT";
                        arrayList = null;
                        str3 = null;
                        l = null;
                        bool = null;
                    } else {
                        if (!zq3.c(aVar, a.e.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "test";
                    }
                    l = valueOf;
                    str3 = str;
                    arrayList = null;
                    bool = null;
                }
                str4 = bool;
            }
            return new EmailStatusResponseData(arrayList, str3, new EmailStatusResponseAccountStatus(str2, bool2), l, bool, str4);
        }

        private a() {
        }
    }

    public EmailStatusResponseData(List list, String str, EmailStatusResponseAccountStatus emailStatusResponseAccountStatus, Long l, Boolean bool, String str2) {
        zq3.h(emailStatusResponseAccountStatus, "accountStatus");
        this.a = list;
        this.b = str;
        this.c = emailStatusResponseAccountStatus;
        this.d = l;
        this.e = bool;
        this.f = str2;
    }

    private final rz h() {
        List list = this.a;
        boolean contains = list != null ? list.contains(AuthMethod.PASSWORD.getValue()) : false;
        List list2 = this.a;
        boolean contains2 = list2 != null ? list2.contains(AuthMethod.FACEBOOK.getValue()) : false;
        List list3 = this.a;
        return new rz(contains, contains2, list3 != null ? list3.contains(AuthMethod.GOOGLE.getValue()) : false);
    }

    public final com.nytimes.android.subauth.core.auth.network.response.a a() {
        String b = this.c.b();
        int hashCode = b.hashCode();
        if (hashCode != -1599244913) {
            if (hashCode != -891611359) {
                if (hashCode == 1053567612 && b.equals("DISABLED")) {
                    return a.C0413a.a;
                }
            } else if (b.equals("ENABLED")) {
                return zq3.c(this.c.a(), Boolean.TRUE) ? new a.c(this.c.b(), this.e, this.f) : new a.d(h());
            }
        } else if (b.equals("NO_ACCOUNT")) {
            return a.b.a;
        }
        return a.e.a;
    }

    public final EmailStatusResponseAccountStatus b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailStatusResponseData)) {
            return false;
        }
        EmailStatusResponseData emailStatusResponseData = (EmailStatusResponseData) obj;
        return zq3.c(this.a, emailStatusResponseData.a) && zq3.c(this.b, emailStatusResponseData.b) && zq3.c(this.c, emailStatusResponseData.c) && zq3.c(this.d, emailStatusResponseData.d) && zq3.c(this.e, emailStatusResponseData.e) && zq3.c(this.f, emailStatusResponseData.f);
    }

    public final Long f() {
        return this.d;
    }

    public final Boolean g() {
        return this.e;
    }

    public int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        Long l = this.d;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EmailStatusResponseData(authMethods=" + this.a + ", email=" + this.b + ", accountStatus=" + this.c + ", userId=" + this.d + ", validToken=" + this.e + ", passwordSetToken=" + this.f + ")";
    }

    public /* synthetic */ EmailStatusResponseData(List list, String str, EmailStatusResponseAccountStatus emailStatusResponseAccountStatus, Long l, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, emailStatusResponseAccountStatus, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str2);
    }
}

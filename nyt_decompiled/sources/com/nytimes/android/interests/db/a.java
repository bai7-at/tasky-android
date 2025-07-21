package com.nytimes.android.interests.db;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.interests.db.Interest;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {
    public static final C0331a Companion = new C0331a(null);
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final String g;
    private final Interest h;
    private final boolean i;
    private final boolean j;
    private final Long k;

    /* renamed from: com.nytimes.android.interests.db.a$a, reason: collision with other inner class name */
    public static final class C0331a {
        public /* synthetic */ C0331a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return new a(0, "", "", "", 0L, "", "", new Interest.ShuffleInterest(i.l()), false, false, null);
        }

        private C0331a() {
        }
    }

    public a(int i, String str, String str2, String str3, long j, String str4, String str5, Interest interest, boolean z, boolean z2, Long l) {
        zq3.h(str, "interestType");
        zq3.h(str2, "interestSubType");
        zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str4, "description");
        zq3.h(str5, "promoImageURL");
        zq3.h(interest, "data");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = str5;
        this.h = interest;
        this.i = z;
        this.j = z2;
        this.k = l;
    }

    public final Long a() {
        return this.k;
    }

    public final Interest b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && this.e == aVar.e && zq3.c(this.f, aVar.f) && zq3.c(this.g, aVar.g) && zq3.c(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && zq3.c(this.k, aVar.k);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.j)) * 31;
        Long l = this.k;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final long i() {
        return this.e;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.i;
    }

    public String toString() {
        return "InterestData(id=" + this.a + ", interestType=" + this.b + ", interestSubType=" + this.c + ", name=" + this.d + ", updatedAt=" + this.e + ", description=" + this.f + ", promoImageURL=" + this.g + ", data=" + this.h + ", isOpinion=" + this.i + ", isEditorsPick=" + this.j + ", autoAddedTimeStamp=" + this.k + ")";
    }
}

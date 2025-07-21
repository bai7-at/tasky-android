package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class CookingHeroData {
    public static final Companion Companion = new Companion(null);
    private static final CookingHeroData j = new CookingHeroData(null, "", "", "", "", "", new Rating(0, 0), "", "");
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Rating g;
    private final String h;
    private final String i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CookingHeroData a() {
            return CookingHeroData.j;
        }

        public final KSerializer serializer() {
            return CookingHeroData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CookingHeroData(int i, String str, String str2, String str3, String str4, String str5, String str6, Rating rating, String str7, String str8, mk7 mk7Var) {
        if (511 != (i & 511)) {
            wv5.a(i, 511, CookingHeroData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = rating;
        this.h = str7;
        this.i = str8;
    }

    public static final /* synthetic */ void k(CookingHeroData cookingHeroData, d dVar, SerialDescriptor serialDescriptor) {
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, cookingHeroData.a);
        dVar.l(serialDescriptor, 1, l48Var, cookingHeroData.b);
        dVar.y(serialDescriptor, 2, cookingHeroData.c);
        dVar.y(serialDescriptor, 3, cookingHeroData.d);
        dVar.l(serialDescriptor, 4, l48Var, cookingHeroData.e);
        dVar.l(serialDescriptor, 5, l48Var, cookingHeroData.f);
        dVar.l(serialDescriptor, 6, Rating$$serializer.INSTANCE, cookingHeroData.g);
        dVar.l(serialDescriptor, 7, l48Var, cookingHeroData.h);
        dVar.y(serialDescriptor, 8, cookingHeroData.i);
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CookingHeroData)) {
            return false;
        }
        CookingHeroData cookingHeroData = (CookingHeroData) obj;
        return zq3.c(this.a, cookingHeroData.a) && zq3.c(this.b, cookingHeroData.b) && zq3.c(this.c, cookingHeroData.c) && zq3.c(this.d, cookingHeroData.d) && zq3.c(this.e, cookingHeroData.e) && zq3.c(this.f, cookingHeroData.f) && zq3.c(this.g, cookingHeroData.g) && zq3.c(this.h, cookingHeroData.h) && zq3.c(this.i, cookingHeroData.i);
    }

    public final String f() {
        return this.c;
    }

    public final Rating g() {
        return this.g;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Rating rating = this.g;
        int hashCode5 = (hashCode4 + (rating == null ? 0 : rating.hashCode())) * 31;
        String str5 = this.h;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.i;
    }

    public String toString() {
        return "CookingHeroData(imageUrl=" + this.a + ", credit=" + this.b + ", kicker=" + this.c + ", title=" + this.d + ", summary=" + this.e + ", byline=" + this.f + ", rating=" + this.g + ", cookingTime=" + this.h + ", url=" + this.i + ")";
    }

    public CookingHeroData(String str, String str2, String str3, String str4, String str5, String str6, Rating rating, String str7, String str8) {
        zq3.h(str3, "kicker");
        zq3.h(str4, "title");
        zq3.h(str8, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = rating;
        this.h = str7;
        this.i = str8;
    }
}

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
public final class ProgrammedArticleData {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ProgrammedArticleData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgrammedArticleData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, mk7 mk7Var) {
        if (255 != (i & 255)) {
            wv5.a(i, 255, ProgrammedArticleData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static final /* synthetic */ void h(ProgrammedArticleData programmedArticleData, d dVar, SerialDescriptor serialDescriptor) {
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, programmedArticleData.a);
        dVar.y(serialDescriptor, 1, programmedArticleData.b);
        dVar.y(serialDescriptor, 2, programmedArticleData.c);
        dVar.l(serialDescriptor, 3, l48Var, programmedArticleData.d);
        dVar.y(serialDescriptor, 4, programmedArticleData.e);
        dVar.l(serialDescriptor, 5, l48Var, programmedArticleData.f);
        dVar.y(serialDescriptor, 6, programmedArticleData.g);
        dVar.y(serialDescriptor, 7, programmedArticleData.h);
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgrammedArticleData)) {
            return false;
        }
        ProgrammedArticleData programmedArticleData = (ProgrammedArticleData) obj;
        return zq3.c(this.a, programmedArticleData.a) && zq3.c(this.b, programmedArticleData.b) && zq3.c(this.c, programmedArticleData.c) && zq3.c(this.d, programmedArticleData.d) && zq3.c(this.e, programmedArticleData.e) && zq3.c(this.f, programmedArticleData.f) && zq3.c(this.g, programmedArticleData.g) && zq3.c(this.h, programmedArticleData.h);
    }

    public final String f() {
        return this.h;
    }

    public final String g() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.e.hashCode()) * 31;
        String str3 = this.f;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "ProgrammedArticleData(kicker=" + this.a + ", title=" + this.b + ", summary=" + this.c + ", imageUrl=" + this.d + ", credit=" + this.e + ", type=" + this.f + ", url=" + this.g + ", uri=" + this.h + ")";
    }

    public ProgrammedArticleData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        zq3.h(str2, "title");
        zq3.h(str3, "summary");
        zq3.h(str5, "credit");
        zq3.h(str7, "url");
        zq3.h(str8, "uri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }
}

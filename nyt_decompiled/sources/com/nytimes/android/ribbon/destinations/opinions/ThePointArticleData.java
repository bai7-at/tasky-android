package com.nytimes.android.ribbon.destinations.opinions;

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
public final class ThePointArticleData {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ThePointArticleData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ThePointArticleData(int i, String str, String str2, String str3, String str4, String str5, String str6, mk7 mk7Var) {
        if (63 != (i & 63)) {
            wv5.a(i, 63, ThePointArticleData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static final /* synthetic */ void a(ThePointArticleData thePointArticleData, d dVar, SerialDescriptor serialDescriptor) {
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, thePointArticleData.a);
        dVar.y(serialDescriptor, 1, thePointArticleData.b);
        dVar.l(serialDescriptor, 2, l48Var, thePointArticleData.c);
        dVar.y(serialDescriptor, 3, thePointArticleData.d);
        dVar.l(serialDescriptor, 4, l48Var, thePointArticleData.e);
        dVar.l(serialDescriptor, 5, l48Var, thePointArticleData.f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThePointArticleData)) {
            return false;
        }
        ThePointArticleData thePointArticleData = (ThePointArticleData) obj;
        return zq3.c(this.a, thePointArticleData.a) && zq3.c(this.b, thePointArticleData.b) && zq3.c(this.c, thePointArticleData.c) && zq3.c(this.d, thePointArticleData.d) && zq3.c(this.e, thePointArticleData.e) && zq3.c(this.f, thePointArticleData.f);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ThePointArticleData(headline=" + this.a + ", articleUrl=" + this.b + ", summary=" + this.c + ", uri=" + this.d + ", sectionName=" + this.e + ", sectionId=" + this.f + ")";
    }

    public ThePointArticleData(String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(str2, "articleUrl");
        zq3.h(str4, "uri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}

package com.nytimes.android.api.retrofit;

import defpackage.en3;
import defpackage.ib4;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes3.dex */
public final class Post {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] m = {null, null, null, null, new qo(ImageCrop$$serializer.INSTANCE), null, null, null, null, null, null, new qo(ServiceResponseCard$$serializer.INSTANCE)};
    private final Long a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final String f;
    private final String g;
    private final String h;
    private final Integer i;
    private final Integer j;
    private final String k;
    private final List l;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Post$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Post(int i, Long l, String str, String str2, String str3, List list, String str4, String str5, String str6, Integer num, Integer num2, String str7, List list2, mk7 mk7Var) {
        if (3965 != (i & 3965)) {
            wv5.a(i, 3965, Post$$serializer.INSTANCE.getDescriptor());
        }
        this.a = l;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = str5;
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        this.i = num;
        this.j = num2;
        this.k = str7;
        this.l = list2;
    }

    public static final /* synthetic */ void l(Post post, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = m;
        dVar.l(serialDescriptor, 0, ib4.a, post.a);
        if (dVar.A(serialDescriptor, 1) || !zq3.c(post.b, "")) {
            dVar.y(serialDescriptor, 1, post.b);
        }
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 2, l48Var, post.c);
        dVar.l(serialDescriptor, 3, l48Var, post.d);
        dVar.l(serialDescriptor, 4, kSerializerArr[4], post.e);
        dVar.l(serialDescriptor, 5, l48Var, post.f);
        dVar.l(serialDescriptor, 6, l48Var, post.g);
        if (dVar.A(serialDescriptor, 7) || !zq3.c(post.h, "")) {
            dVar.y(serialDescriptor, 7, post.h);
        }
        en3 en3Var = en3.a;
        dVar.l(serialDescriptor, 8, en3Var, post.i);
        dVar.l(serialDescriptor, 9, en3Var, post.j);
        dVar.y(serialDescriptor, 10, post.k);
        dVar.l(serialDescriptor, 11, kSerializerArr[11], post.l);
    }

    public final Integer b() {
        return this.i;
    }

    public final String c() {
        return this.c;
    }

    public final List d() {
        return this.l;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Post)) {
            return false;
        }
        Post post = (Post) obj;
        return zq3.c(this.a, post.a) && zq3.c(this.b, post.b) && zq3.c(this.c, post.c) && zq3.c(this.d, post.d) && zq3.c(this.e, post.e) && zq3.c(this.f, post.f) && zq3.c(this.g, post.g) && zq3.c(this.h, post.h) && zq3.c(this.i, post.i) && zq3.c(this.j, post.j) && zq3.c(this.k, post.k) && zq3.c(this.l, post.l);
    }

    public final String f() {
        return this.f;
    }

    public final List g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        Long l = this.a;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.h.hashCode()) * 31;
        Integer num = this.i;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int hashCode8 = (((hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.k.hashCode()) * 31;
        List list2 = this.l;
        return hashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final Integer i() {
        return this.j;
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.h;
    }

    public String toString() {
        return "Post(id=" + this.a + ", name=" + this.b + ", byline=" + this.c + ", cookingTime=" + this.d + ", imageCrops=" + this.e + ", credit=" + this.f + ", summary=" + this.g + ", url=" + this.h + ", avgRating=" + this.i + ", numRatings=" + this.j + ", postType=" + this.k + ", cards=" + this.l + ")";
    }
}

package com.nytimes.android.features.discovery.discoverytab.data;

import com.nytimes.android.unfear.reader.model.ImageElement;
import com.nytimes.android.unfear.reader.model.ImageElement$$serializer;
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
public final class CarouselAsset {
    public static final Companion Companion = new Companion(null);
    public static final int j = ImageElement.f;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final ImageElement g;
    private final ImageElement h;
    private final long i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CarouselAsset$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CarouselAsset(int i, String str, String str2, String str3, String str4, String str5, String str6, ImageElement imageElement, ImageElement imageElement2, long j2, mk7 mk7Var) {
        if (511 != (i & 511)) {
            wv5.a(i, 511, CarouselAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = imageElement;
        this.h = imageElement2;
        this.i = j2;
    }

    public static final /* synthetic */ void j(CarouselAsset carouselAsset, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, carouselAsset.a);
        dVar.y(serialDescriptor, 1, carouselAsset.b);
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 2, l48Var, carouselAsset.c);
        dVar.y(serialDescriptor, 3, carouselAsset.d);
        dVar.y(serialDescriptor, 4, carouselAsset.e);
        dVar.l(serialDescriptor, 5, l48Var, carouselAsset.f);
        ImageElement$$serializer imageElement$$serializer = ImageElement$$serializer.INSTANCE;
        dVar.l(serialDescriptor, 6, imageElement$$serializer, carouselAsset.g);
        dVar.l(serialDescriptor, 7, imageElement$$serializer, carouselAsset.h);
        dVar.F(serialDescriptor, 8, carouselAsset.i);
    }

    public final String a() {
        return this.f;
    }

    public final ImageElement b() {
        return this.h;
    }

    public final long c() {
        return this.i;
    }

    public final String d() {
        return this.e;
    }

    public final ImageElement e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselAsset)) {
            return false;
        }
        CarouselAsset carouselAsset = (CarouselAsset) obj;
        return zq3.c(this.a, carouselAsset.a) && zq3.c(this.b, carouselAsset.b) && zq3.c(this.c, carouselAsset.c) && zq3.c(this.d, carouselAsset.d) && zq3.c(this.e, carouselAsset.e) && zq3.c(this.f, carouselAsset.f) && zq3.c(this.g, carouselAsset.g) && zq3.c(this.h, carouselAsset.h) && this.i == carouselAsset.i;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageElement imageElement = this.g;
        int hashCode4 = (hashCode3 + (imageElement == null ? 0 : imageElement.hashCode())) * 31;
        ImageElement imageElement2 = this.h;
        return ((hashCode4 + (imageElement2 != null ? imageElement2.hashCode() : 0)) * 31) + Long.hashCode(this.i);
    }

    public final String i() {
        return this.c;
    }

    public String toString() {
        return "CarouselAsset(uri=" + this.a + ", uriForLink=" + this.b + ", url=" + this.c + ", title=" + this.d + ", sectionDisplayName=" + this.e + ", byline=" + this.f + ", squareImage=" + this.g + ", largeImage=" + this.h + ", lastModified=" + this.i + ")";
    }

    public CarouselAsset(String str, String str2, String str3, String str4, String str5, String str6, ImageElement imageElement, ImageElement imageElement2, long j2) {
        zq3.h(str, "uri");
        zq3.h(str2, "uriForLink");
        zq3.h(str4, "title");
        zq3.h(str5, "sectionDisplayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = imageElement;
        this.h = imageElement2;
        this.i = j2;
    }
}

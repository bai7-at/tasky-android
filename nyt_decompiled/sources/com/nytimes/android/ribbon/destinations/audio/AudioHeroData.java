package com.nytimes.android.ribbon.destinations.audio;

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
public final class AudioHeroData {
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
            return AudioHeroData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AudioHeroData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, mk7 mk7Var) {
        if (255 != (i & 255)) {
            wv5.a(i, 255, AudioHeroData$$serializer.INSTANCE.getDescriptor());
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

    public static final /* synthetic */ void i(AudioHeroData audioHeroData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, audioHeroData.a);
        dVar.y(serialDescriptor, 1, audioHeroData.b);
        dVar.y(serialDescriptor, 2, audioHeroData.c);
        dVar.y(serialDescriptor, 3, audioHeroData.d);
        dVar.l(serialDescriptor, 4, l48.a, audioHeroData.e);
        dVar.y(serialDescriptor, 5, audioHeroData.f);
        dVar.y(serialDescriptor, 6, audioHeroData.g);
        dVar.y(serialDescriptor, 7, audioHeroData.h);
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioHeroData)) {
            return false;
        }
        AudioHeroData audioHeroData = (AudioHeroData) obj;
        return zq3.c(this.a, audioHeroData.a) && zq3.c(this.b, audioHeroData.b) && zq3.c(this.c, audioHeroData.c) && zq3.c(this.d, audioHeroData.d) && zq3.c(this.e, audioHeroData.e) && zq3.c(this.f, audioHeroData.f) && zq3.c(this.g, audioHeroData.g) && zq3.c(this.h, audioHeroData.h);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "AudioHeroData(credit=" + this.a + ", headline=" + this.b + ", summary=" + this.c + ", kicker=" + this.d + ", byline=" + this.e + ", imageUrl=" + this.f + ", contentUrl=" + this.g + ", contentUri=" + this.h + ")";
    }
}

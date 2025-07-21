package com.nytimes.android.features.games.gameshub.configuration.models;

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
/* loaded from: classes4.dex */
public final class PlayTabSection {
    public static final Companion Companion = new Companion(null);
    public static final int e = 8;
    private static final KSerializer[] f = {null, null, null, new qo(SectionCardDescription$$serializer.INSTANCE)};
    private final String a;
    private final String b;
    private final String c;
    private final List d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PlayTabSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlayTabSection(int i, String str, String str2, String str3, List list, mk7 mk7Var) {
        if (9 != (i & 9)) {
            wv5.a(i, 9, PlayTabSection$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = list;
    }

    public static final /* synthetic */ void f(PlayTabSection playTabSection, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f;
        dVar.y(serialDescriptor, 0, playTabSection.a);
        if (dVar.A(serialDescriptor, 1) || playTabSection.b != null) {
            dVar.l(serialDescriptor, 1, l48.a, playTabSection.b);
        }
        if (dVar.A(serialDescriptor, 2) || playTabSection.c != null) {
            dVar.l(serialDescriptor, 2, l48.a, playTabSection.c);
        }
        dVar.z(serialDescriptor, 3, kSerializerArr[3], playTabSection.d);
    }

    public final String b() {
        return this.a;
    }

    public final List c() {
        return this.d;
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
        if (!(obj instanceof PlayTabSection)) {
            return false;
        }
        PlayTabSection playTabSection = (PlayTabSection) obj;
        return zq3.c(this.a, playTabSection.a) && zq3.c(this.b, playTabSection.b) && zq3.c(this.c, playTabSection.c) && zq3.c(this.d, playTabSection.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PlayTabSection(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", sectionCards=" + this.d + ")";
    }
}

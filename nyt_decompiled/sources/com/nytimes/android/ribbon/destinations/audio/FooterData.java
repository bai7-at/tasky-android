package com.nytimes.android.ribbon.destinations.audio;

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
public final class FooterData {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return FooterData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FooterData(int i, String str, String str2, String str3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, FooterData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final /* synthetic */ void c(FooterData footerData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, footerData.a);
        dVar.y(serialDescriptor, 1, footerData.b);
        dVar.y(serialDescriptor, 2, footerData.c);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterData)) {
            return false;
        }
        FooterData footerData = (FooterData) obj;
        return zq3.c(this.a, footerData.a) && zq3.c(this.b, footerData.b) && zq3.c(this.c, footerData.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "FooterData(headline=" + this.a + ", contentUrl=" + this.b + ", contentUri=" + this.c + ")";
    }
}

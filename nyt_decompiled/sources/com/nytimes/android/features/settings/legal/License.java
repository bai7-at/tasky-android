package com.nytimes.android.features.settings.legal;

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
public final class License {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return License$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ License(int i, String str, String str2, String str3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, License$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final /* synthetic */ void d(License license, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, license.a);
        dVar.y(serialDescriptor, 1, license.b);
        dVar.y(serialDescriptor, 2, license.c);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof License)) {
            return false;
        }
        License license = (License) obj;
        return zq3.c(this.a, license.a) && zq3.c(this.b, license.b) && zq3.c(this.c, license.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "License(identifier=" + this.a + ", name=" + this.b + ", url=" + this.c + ")";
    }
}

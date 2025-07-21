package com.nytimes.android.features.settings.legal;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class UnknownLicense {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return UnknownLicense$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UnknownLicense(int i, String str, String str2, mk7 mk7Var) {
        if (2 != (i & 2)) {
            wv5.a(i, 2, UnknownLicense$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.a = EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
        } else {
            this.a = str;
        }
        this.b = str2;
    }

    public static final /* synthetic */ void c(UnknownLicense unknownLicense, d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.A(serialDescriptor, 0) || !zq3.c(unknownLicense.a, EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION)) {
            dVar.y(serialDescriptor, 0, unknownLicense.a);
        }
        dVar.y(serialDescriptor, 1, unknownLicense.b);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownLicense)) {
            return false;
        }
        UnknownLicense unknownLicense = (UnknownLicense) obj;
        return zq3.c(this.a, unknownLicense.a) && zq3.c(this.b, unknownLicense.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "UnknownLicense(name=" + this.a + ", url=" + this.b + ")";
    }
}

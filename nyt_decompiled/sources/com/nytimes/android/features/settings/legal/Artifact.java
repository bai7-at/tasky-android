package com.nytimes.android.features.settings.legal;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.vt6;
import defpackage.wv5;
import defpackage.zq3;
import defpackage.zt6;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class Artifact {
    public static final Companion Companion = new Companion(null);
    public static final int f = 8;
    private static final KSerializer[] g = {null, null, null, new vt6(zt6.b(License.class), License$$serializer.INSTANCE), new vt6(zt6.b(UnknownLicense.class), UnknownLicense$$serializer.INSTANCE)};
    private final String a;
    private final String b;
    private final String c;
    private final License[] d;
    private final UnknownLicense[] e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Artifact$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Artifact(int i, String str, String str2, String str3, License[] licenseArr, UnknownLicense[] unknownLicenseArr, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, Artifact$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = licenseArr;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = unknownLicenseArr;
        }
    }

    public static final /* synthetic */ void g(Artifact artifact, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = g;
        dVar.y(serialDescriptor, 0, artifact.a);
        dVar.y(serialDescriptor, 1, artifact.b);
        dVar.y(serialDescriptor, 2, artifact.c);
        if (dVar.A(serialDescriptor, 3) || artifact.d != null) {
            dVar.l(serialDescriptor, 3, kSerializerArr[3], artifact.d);
        }
        if (!dVar.A(serialDescriptor, 4) && artifact.e == null) {
            return;
        }
        dVar.l(serialDescriptor, 4, kSerializerArr[4], artifact.e);
    }

    public final String b() {
        return this.a;
    }

    public final License[] c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final UnknownLicense[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Artifact)) {
            return false;
        }
        Artifact artifact = (Artifact) obj;
        return zq3.c(this.a, artifact.a) && zq3.c(this.b, artifact.b) && zq3.c(this.c, artifact.c) && zq3.c(this.d, artifact.d) && zq3.c(this.e, artifact.e);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        License[] licenseArr = this.d;
        int hashCode2 = (hashCode + (licenseArr == null ? 0 : Arrays.hashCode(licenseArr))) * 31;
        UnknownLicense[] unknownLicenseArr = this.e;
        return hashCode2 + (unknownLicenseArr != null ? Arrays.hashCode(unknownLicenseArr) : 0);
    }

    public String toString() {
        return "Artifact(key=" + this.a + ", name=" + this.b + ", version=" + this.c + ", licenses=" + Arrays.toString(this.d) + ", unknownLicense=" + Arrays.toString(this.e) + ")";
    }
}

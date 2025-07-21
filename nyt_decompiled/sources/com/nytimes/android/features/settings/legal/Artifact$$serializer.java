package com.nytimes.android.features.settings.legal;

import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class Artifact$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final Artifact$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Artifact$$serializer artifact$$serializer = new Artifact$$serializer();
        INSTANCE = artifact$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.settings.legal.Artifact", artifact$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("groupId", false);
        pluginGeneratedSerialDescriptor.l("artifactId", false);
        pluginGeneratedSerialDescriptor.l("version", false);
        pluginGeneratedSerialDescriptor.l("spdxLicenses", true);
        pluginGeneratedSerialDescriptor.l("unknownLicenses", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Artifact$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Artifact.g;
        KSerializer u = he0.u(kSerializerArr[3]);
        KSerializer u2 = he0.u(kSerializerArr[4]);
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, u, u2};
    }

    @Override // defpackage.ym1
    public Artifact deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        String str2;
        String str3;
        License[] licenseArr;
        UnknownLicense[] unknownLicenseArr;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Artifact.g;
        String str4 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            License[] licenseArr2 = (License[]) b.g(descriptor2, 3, kSerializerArr[3], null);
            unknownLicenseArr = (UnknownLicense[]) b.g(descriptor2, 4, kSerializerArr[4], null);
            str = n;
            str3 = n3;
            licenseArr = licenseArr2;
            i = 31;
            str2 = n2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            License[] licenseArr3 = null;
            UnknownLicense[] unknownLicenseArr2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str4 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str5 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    str6 = b.n(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    licenseArr3 = (License[]) b.g(descriptor2, 3, kSerializerArr[3], licenseArr3);
                    i2 |= 8;
                } else {
                    if (o != 4) {
                        throw new UnknownFieldException(o);
                    }
                    unknownLicenseArr2 = (UnknownLicense[]) b.g(descriptor2, 4, kSerializerArr[4], unknownLicenseArr2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
            licenseArr = licenseArr3;
            unknownLicenseArr = unknownLicenseArr2;
        }
        b.c(descriptor2);
        return new Artifact(i, str, str2, str3, licenseArr, unknownLicenseArr, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Artifact artifact) {
        zq3.h(encoder, "encoder");
        zq3.h(artifact, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Artifact.g(artifact, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

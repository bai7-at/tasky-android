package com.nytimes.android.features.settings.legal;

import com.facebook.AuthenticationTokenClaims;
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
public final class UnknownLicense$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final UnknownLicense$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UnknownLicense$$serializer unknownLicense$$serializer = new UnknownLicense$$serializer();
        INSTANCE = unknownLicense$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.settings.legal.UnknownLicense", unknownLicense$$serializer, 2);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, true);
        pluginGeneratedSerialDescriptor.l("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UnknownLicense$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public UnknownLicense deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            str = b.n(descriptor2, 0);
            str2 = b.n(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            String str3 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    str3 = b.n(descriptor2, 1);
                    i2 |= 2;
                }
            }
            str2 = str3;
            i = i2;
        }
        b.c(descriptor2);
        return new UnknownLicense(i, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, UnknownLicense unknownLicense) {
        zq3.h(encoder, "encoder");
        zq3.h(unknownLicense, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        UnknownLicense.c(unknownLicense, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

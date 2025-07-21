package com.nytimes.android.ribbon.destinations.opinions;

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
public final class ThePointAuthorData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final ThePointAuthorData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ThePointAuthorData$$serializer thePointAuthorData$$serializer = new ThePointAuthorData$$serializer();
        INSTANCE = thePointAuthorData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.opinions.ThePointAuthorData", thePointAuthorData$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("authorImageUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ThePointAuthorData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), he0.u(l48Var)};
    }

    @Override // defpackage.ym1
    public ThePointAuthorData deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            l48 l48Var = l48.a;
            str2 = (String) b.g(descriptor2, 0, l48Var, null);
            str = (String) b.g(descriptor2, 1, l48Var, null);
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
                    str3 = (String) b.g(descriptor2, 0, l48.a, str3);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    str = (String) b.g(descriptor2, 1, l48.a, str);
                    i2 |= 2;
                }
            }
            i = i2;
            str2 = str3;
        }
        b.c(descriptor2);
        return new ThePointAuthorData(i, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, ThePointAuthorData thePointAuthorData) {
        zq3.h(encoder, "encoder");
        zq3.h(thePointAuthorData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        ThePointAuthorData.a(thePointAuthorData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

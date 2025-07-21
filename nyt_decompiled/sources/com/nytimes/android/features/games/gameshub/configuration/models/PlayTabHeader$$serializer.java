package com.nytimes.android.features.games.gameshub.configuration.models;

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
public final class PlayTabHeader$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final PlayTabHeader$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PlayTabHeader$$serializer playTabHeader$$serializer = new PlayTabHeader$$serializer();
        INSTANCE = playTabHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.configuration.models.PlayTabHeader", playTabHeader$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("subtitle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlayTabHeader$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public PlayTabHeader deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            str = n;
            str2 = b.n(descriptor2, 2);
            str3 = n2;
            i = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str4 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str6 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    str5 = b.n(descriptor2, 2);
                    i2 |= 4;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
            i = i2;
        }
        b.c(descriptor2);
        return new PlayTabHeader(i, str, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PlayTabHeader playTabHeader) {
        zq3.h(encoder, "encoder");
        zq3.h(playTabHeader, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PlayTabHeader.c(playTabHeader, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

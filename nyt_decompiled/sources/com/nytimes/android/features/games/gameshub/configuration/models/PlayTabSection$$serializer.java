package com.nytimes.android.features.games.gameshub.configuration.models;

import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.zq3;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class PlayTabSection$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final PlayTabSection$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PlayTabSection$$serializer playTabSection$$serializer = new PlayTabSection$$serializer();
        INSTANCE = playTabSection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.configuration.models.PlayTabSection", playTabSection$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("title", true);
        pluginGeneratedSerialDescriptor.l("subtitle", true);
        pluginGeneratedSerialDescriptor.l("cards", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlayTabSection$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = PlayTabSection.f;
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, he0.u(l48Var), he0.u(l48Var), kSerializerArr[3]};
    }

    @Override // defpackage.ym1
    public PlayTabSection deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        String str2;
        String str3;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = PlayTabSection.f;
        String str4 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            l48 l48Var = l48.a;
            String str5 = (String) b.g(descriptor2, 1, l48Var, null);
            String str6 = (String) b.g(descriptor2, 2, l48Var, null);
            list = (List) b.y(descriptor2, 3, kSerializerArr[3], null);
            str = n;
            str3 = str6;
            i = 15;
            str2 = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str4 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str7 = (String) b.g(descriptor2, 1, l48.a, str7);
                    i2 |= 2;
                } else if (o == 2) {
                    str8 = (String) b.g(descriptor2, 2, l48.a, str8);
                    i2 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str7;
            str3 = str8;
            list = list2;
        }
        b.c(descriptor2);
        return new PlayTabSection(i, str, str2, str3, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PlayTabSection playTabSection) {
        zq3.h(encoder, "encoder");
        zq3.h(playTabSection, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PlayTabSection.f(playTabSection, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

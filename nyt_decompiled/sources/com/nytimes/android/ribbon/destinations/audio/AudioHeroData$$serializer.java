package com.nytimes.android.ribbon.destinations.audio;

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
public final class AudioHeroData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final AudioHeroData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AudioHeroData$$serializer audioHeroData$$serializer = new AudioHeroData$$serializer();
        INSTANCE = audioHeroData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.audio.AudioHeroData", audioHeroData$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("credit", false);
        pluginGeneratedSerialDescriptor.l("headline", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("byline", false);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("contentUrl", false);
        pluginGeneratedSerialDescriptor.l("contentUri", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AudioHeroData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, l48Var, he0.u(l48Var), l48Var, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public AudioHeroData deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        String str9 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            String n4 = b.n(descriptor2, 3);
            String str10 = (String) b.g(descriptor2, 4, l48.a, null);
            String n5 = b.n(descriptor2, 5);
            String n6 = b.n(descriptor2, 6);
            str = n;
            str8 = b.n(descriptor2, 7);
            str7 = n6;
            str6 = n5;
            str4 = n4;
            str5 = str10;
            str3 = n3;
            str2 = n2;
            i = 255;
        } else {
            boolean z = true;
            int i2 = 0;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str9 = b.n(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str11 = b.n(descriptor2, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str12 = b.n(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str13 = b.n(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str14 = (String) b.g(descriptor2, 4, l48.a, str14);
                        i2 |= 16;
                        break;
                    case 5:
                        str15 = b.n(descriptor2, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        str16 = b.n(descriptor2, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        str17 = b.n(descriptor2, 7);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i2;
            str = str9;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
            str6 = str15;
            str7 = str16;
            str8 = str17;
        }
        b.c(descriptor2);
        return new AudioHeroData(i, str, str2, str3, str4, str5, str6, str7, str8, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, AudioHeroData audioHeroData) {
        zq3.h(encoder, "encoder");
        zq3.h(audioHeroData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        AudioHeroData.i(audioHeroData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

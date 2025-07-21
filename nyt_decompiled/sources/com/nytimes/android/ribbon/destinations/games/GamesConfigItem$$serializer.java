package com.nytimes.android.ribbon.destinations.games;

import defpackage.en3;
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
public final class GamesConfigItem$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final GamesConfigItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GamesConfigItem$$serializer gamesConfigItem$$serializer = new GamesConfigItem$$serializer();
        INSTANCE = gamesConfigItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.games.GamesConfigItem", gamesConfigItem$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("rank", false);
        pluginGeneratedSerialDescriptor.l("headline", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GamesConfigItem$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, en3.a, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public GamesConfigItem deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            int j = b.j(descriptor2, 1);
            String n2 = b.n(descriptor2, 2);
            str = n;
            str2 = b.n(descriptor2, 3);
            str3 = n2;
            i = j;
            i2 = 15;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str4 = b.n(descriptor2, 0);
                    i4 |= 1;
                } else if (o == 1) {
                    i3 = b.j(descriptor2, 1);
                    i4 |= 2;
                } else if (o == 2) {
                    str6 = b.n(descriptor2, 2);
                    i4 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    str5 = b.n(descriptor2, 3);
                    i4 |= 8;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
            i = i3;
            i2 = i4;
        }
        b.c(descriptor2);
        return new GamesConfigItem(i2, str, i, str3, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, GamesConfigItem gamesConfigItem) {
        zq3.h(encoder, "encoder");
        zq3.h(gamesConfigItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        GamesConfigItem.e(gamesConfigItem, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

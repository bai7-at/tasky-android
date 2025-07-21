package com.nytimes.android.features.games.gameshub.configuration.models;

import defpackage.jx2;
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
public final class NytGamesConfiguration$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final NytGamesConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NytGamesConfiguration$$serializer nytGamesConfiguration$$serializer = new NytGamesConfiguration$$serializer();
        INSTANCE = nytGamesConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration", nytGamesConfiguration$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("layout", false);
        pluginGeneratedSerialDescriptor.l("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NytGamesConfiguration$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = NytGamesConfiguration.d;
        return new KSerializer[]{NytGameLayout$$serializer.INSTANCE, kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public NytGamesConfiguration deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        NytGameLayout nytGameLayout;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = NytGamesConfiguration.d;
        if (b.p()) {
            nytGameLayout = (NytGameLayout) b.y(descriptor2, 0, NytGameLayout$$serializer.INSTANCE, null);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            NytGameLayout nytGameLayout2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    nytGameLayout2 = (NytGameLayout) b.y(descriptor2, 0, NytGameLayout$$serializer.INSTANCE, nytGameLayout2);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            nytGameLayout = nytGameLayout2;
            i = i2;
        }
        b.c(descriptor2);
        return new NytGamesConfiguration(i, nytGameLayout, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, NytGamesConfiguration nytGamesConfiguration) {
        zq3.h(encoder, "encoder");
        zq3.h(nytGamesConfiguration, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        NytGamesConfiguration.d(nytGamesConfiguration, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

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
public final class NytGameLayout$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final NytGameLayout$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NytGameLayout$$serializer nytGameLayout$$serializer = new NytGameLayout$$serializer();
        INSTANCE = nytGameLayout$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.configuration.models.NytGameLayout", nytGameLayout$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("header", false);
        pluginGeneratedSerialDescriptor.l("footer", false);
        pluginGeneratedSerialDescriptor.l("sections", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NytGameLayout$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = NytGameLayout.e;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // defpackage.ym1
    public NytGameLayout deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        List list;
        List list2;
        List list3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = NytGameLayout.e;
        List list4 = null;
        if (b.p()) {
            List list5 = (List) b.y(descriptor2, 0, kSerializerArr[0], null);
            List list6 = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            list3 = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            list = list5;
            i = 7;
            list2 = list6;
        } else {
            boolean z = true;
            int i2 = 0;
            List list7 = null;
            List list8 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    list4 = (List) b.y(descriptor2, 0, kSerializerArr[0], list4);
                    i2 |= 1;
                } else if (o == 1) {
                    list7 = (List) b.y(descriptor2, 1, kSerializerArr[1], list7);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    list8 = (List) b.y(descriptor2, 2, kSerializerArr[2], list8);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list4;
            list2 = list7;
            list3 = list8;
        }
        b.c(descriptor2);
        return new NytGameLayout(i, list, list2, list3, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, NytGameLayout nytGameLayout) {
        zq3.h(encoder, "encoder");
        zq3.h(nytGameLayout, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        NytGameLayout.e(nytGameLayout, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

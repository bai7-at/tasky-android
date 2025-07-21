package com.nytimes.android.features.discovery.discoverytab.data;

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
public final class CarouselBlock$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CarouselBlock$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CarouselBlock$$serializer carouselBlock$$serializer = new CarouselBlock$$serializer();
        INSTANCE = carouselBlock$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.discovery.discoverytab.data.CarouselBlock", carouselBlock$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("dataId", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("assets", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CarouselBlock$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = CarouselBlock.e;
        KSerializer kSerializer = kSerializerArr[2];
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, kSerializer};
    }

    @Override // defpackage.ym1
    public CarouselBlock deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        String str2;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = CarouselBlock.e;
        String str3 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            list = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            str = n;
            i = 7;
            str2 = n2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str3 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str4 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 2, kSerializerArr[2], list2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            list = list2;
        }
        b.c(descriptor2);
        return new CarouselBlock(i, str, str2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CarouselBlock carouselBlock) {
        zq3.h(encoder, "encoder");
        zq3.h(carouselBlock, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CarouselBlock.e(carouselBlock, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

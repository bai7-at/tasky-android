package com.nytimes.android.ribbon.destinations.opinions;

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
public final class OpinionsViewState$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final OpinionsViewState$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OpinionsViewState$$serializer opinionsViewState$$serializer = new OpinionsViewState$$serializer();
        INSTANCE = opinionsViewState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.opinions.OpinionsViewState", opinionsViewState$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("opinionTopFive", false);
        pluginGeneratedSerialDescriptor.l("opinionLatestArticles", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OpinionsViewState$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = OpinionsViewState.d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // defpackage.ym1
    public OpinionsViewState deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        List list2;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = OpinionsViewState.d;
        if (b.p()) {
            list2 = (List) b.y(descriptor2, 0, kSerializerArr[0], null);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            List list4 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    list4 = (List) b.y(descriptor2, 0, kSerializerArr[0], list4);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    list3 = (List) b.y(descriptor2, 1, kSerializerArr[1], list3);
                    i2 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i = i2;
        }
        b.c(descriptor2);
        return new OpinionsViewState(i, list2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, OpinionsViewState opinionsViewState) {
        zq3.h(encoder, "encoder");
        zq3.h(opinionsViewState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        OpinionsViewState.d(opinionsViewState, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

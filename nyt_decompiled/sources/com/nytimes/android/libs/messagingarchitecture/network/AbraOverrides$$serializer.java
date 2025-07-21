package com.nytimes.android.libs.messagingarchitecture.network;

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
public final class AbraOverrides$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final AbraOverrides$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AbraOverrides$$serializer abraOverrides$$serializer = new AbraOverrides$$serializer();
        INSTANCE = abraOverrides$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.network.AbraOverrides", abraOverrides$$serializer, 1);
        pluginGeneratedSerialDescriptor.l("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AbraOverrides$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = AbraOverrides.b;
        return new KSerializer[]{kSerializerArr[0]};
    }

    @Override // defpackage.ym1
    public AbraOverrides deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = AbraOverrides.b;
        int i = 1;
        if (b.p()) {
            list = (List) b.y(descriptor2, 0, kSerializerArr[0], null);
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    list2 = (List) b.y(descriptor2, 0, kSerializerArr[0], list2);
                    i2 = 1;
                }
            }
            list = list2;
            i = i2;
        }
        b.c(descriptor2);
        return new AbraOverrides(i, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, AbraOverrides abraOverrides) {
        zq3.h(encoder, "encoder");
        zq3.h(abraOverrides, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        b.z(descriptor2, 0, AbraOverrides.b[0], abraOverrides.a);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

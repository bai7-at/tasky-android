package com.nytimes.android.libs.messagingarchitecture.network;

import defpackage.jx2;
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
public final class SubInfoOverrides$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final SubInfoOverrides$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SubInfoOverrides$$serializer subInfoOverrides$$serializer = new SubInfoOverrides$$serializer();
        INSTANCE = subInfoOverrides$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.libs.messagingarchitecture.network.SubInfoOverrides", subInfoOverrides$$serializer, 1);
        pluginGeneratedSerialDescriptor.l("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubInfoOverrides$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{SubInfoData$$serializer.INSTANCE};
    }

    @Override // defpackage.ym1
    public SubInfoOverrides deserialize(Decoder decoder) {
        SubInfoData subInfoData;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i = 1;
        if (b.p()) {
            subInfoData = (SubInfoData) b.y(descriptor2, 0, SubInfoData$$serializer.INSTANCE, null);
        } else {
            boolean z = true;
            int i2 = 0;
            subInfoData = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else {
                    if (o != 0) {
                        throw new UnknownFieldException(o);
                    }
                    subInfoData = (SubInfoData) b.y(descriptor2, 0, SubInfoData$$serializer.INSTANCE, subInfoData);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new SubInfoOverrides(i, subInfoData, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, SubInfoOverrides subInfoOverrides) {
        zq3.h(encoder, "encoder");
        zq3.h(subInfoOverrides, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        b.z(descriptor2, 0, SubInfoData$$serializer.INSTANCE, subInfoOverrides.a);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

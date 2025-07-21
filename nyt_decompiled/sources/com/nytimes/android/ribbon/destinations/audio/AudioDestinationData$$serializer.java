package com.nytimes.android.ribbon.destinations.audio;

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
public final class AudioDestinationData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final AudioDestinationData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AudioDestinationData$$serializer audioDestinationData$$serializer = new AudioDestinationData$$serializer();
        INSTANCE = audioDestinationData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.audio.AudioDestinationData", audioDestinationData$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("hero", false);
        pluginGeneratedSerialDescriptor.l("podcasts", false);
        pluginGeneratedSerialDescriptor.l("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AudioDestinationData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = AudioDestinationData.e;
        return new KSerializer[]{AudioHeroData$$serializer.INSTANCE, kSerializerArr[1], FooterData$$serializer.INSTANCE};
    }

    @Override // defpackage.ym1
    public AudioDestinationData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        AudioHeroData audioHeroData;
        List list;
        FooterData footerData;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = AudioDestinationData.e;
        AudioHeroData audioHeroData2 = null;
        if (b.p()) {
            AudioHeroData audioHeroData3 = (AudioHeroData) b.y(descriptor2, 0, AudioHeroData$$serializer.INSTANCE, null);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            audioHeroData = audioHeroData3;
            footerData = (FooterData) b.y(descriptor2, 2, FooterData$$serializer.INSTANCE, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            FooterData footerData2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    audioHeroData2 = (AudioHeroData) b.y(descriptor2, 0, AudioHeroData$$serializer.INSTANCE, audioHeroData2);
                    i2 |= 1;
                } else if (o == 1) {
                    list2 = (List) b.y(descriptor2, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    footerData2 = (FooterData) b.y(descriptor2, 2, FooterData$$serializer.INSTANCE, footerData2);
                    i2 |= 4;
                }
            }
            i = i2;
            audioHeroData = audioHeroData2;
            list = list2;
            footerData = footerData2;
        }
        b.c(descriptor2);
        return new AudioDestinationData(i, audioHeroData, list, footerData, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, AudioDestinationData audioDestinationData) {
        zq3.h(encoder, "encoder");
        zq3.h(audioDestinationData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        AudioDestinationData.e(audioDestinationData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

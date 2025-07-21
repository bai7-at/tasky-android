package com.nytimes.android.ribbon.destinations.audio;

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
public final class PodcastData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final PodcastData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PodcastData$$serializer podcastData$$serializer = new PodcastData$$serializer();
        INSTANCE = podcastData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.audio.PodcastData", podcastData$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("headline", false);
        pluginGeneratedSerialDescriptor.l("contentUrl", false);
        pluginGeneratedSerialDescriptor.l("contentUri", false);
        pluginGeneratedSerialDescriptor.l("summary", true);
        pluginGeneratedSerialDescriptor.l("imageUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PodcastData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public PodcastData deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            str = n;
            str2 = b.n(descriptor2, 3);
            str3 = b.n(descriptor2, 4);
            str4 = n3;
            str5 = n2;
            i = 31;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str6 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    str10 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else if (o == 2) {
                    str9 = b.n(descriptor2, 2);
                    i2 |= 4;
                } else if (o == 3) {
                    str7 = b.n(descriptor2, 3);
                    i2 |= 8;
                } else {
                    if (o != 4) {
                        throw new UnknownFieldException(o);
                    }
                    str8 = b.n(descriptor2, 4);
                    i2 |= 16;
                }
            }
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
            i = i2;
        }
        b.c(descriptor2);
        return new PodcastData(i, str, str5, str4, str2, str3, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PodcastData podcastData) {
        zq3.h(encoder, "encoder");
        zq3.h(podcastData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PodcastData.f(podcastData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

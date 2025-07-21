package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.en3;
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
public final class PromotionalMedia$ImageDimension$$serializer implements jx2 {
    public static final PromotionalMedia$ImageDimension$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PromotionalMedia$ImageDimension$$serializer promotionalMedia$ImageDimension$$serializer = new PromotionalMedia$ImageDimension$$serializer();
        INSTANCE = promotionalMedia$ImageDimension$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.PromotionalMedia.ImageDimension", promotionalMedia$ImageDimension$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("width", false);
        pluginGeneratedSerialDescriptor.l("height", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotionalMedia$ImageDimension$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer u = he0.u(l48.a);
        en3 en3Var = en3.a;
        return new KSerializer[]{en3Var, en3Var, u};
    }

    @Override // defpackage.ym1
    public PromotionalMedia.ImageDimension deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        String str;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            int j2 = b.j(descriptor2, 1);
            i = j;
            str = (String) b.g(descriptor2, 2, l48.a, null);
            i2 = j2;
            i3 = 7;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            String str2 = null;
            int i6 = 0;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i4 = b.j(descriptor2, 0);
                    i5 |= 1;
                } else if (o == 1) {
                    i6 = b.j(descriptor2, 1);
                    i5 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    str2 = (String) b.g(descriptor2, 2, l48.a, str2);
                    i5 |= 4;
                }
            }
            i = i4;
            i2 = i6;
            i3 = i5;
            str = str2;
        }
        b.c(descriptor2);
        return new PromotionalMedia.ImageDimension(i3, i, i2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PromotionalMedia.ImageDimension imageDimension) {
        zq3.h(encoder, "encoder");
        zq3.h(imageDimension, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PromotionalMedia.ImageDimension.b(imageDimension, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

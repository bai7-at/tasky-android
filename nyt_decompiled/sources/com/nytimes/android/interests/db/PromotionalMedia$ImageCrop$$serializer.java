package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.he0;
import defpackage.jx2;
import defpackage.mk7;
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
public final class PromotionalMedia$ImageCrop$$serializer implements jx2 {
    public static final PromotionalMedia$ImageCrop$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PromotionalMedia$ImageCrop$$serializer promotionalMedia$ImageCrop$$serializer = new PromotionalMedia$ImageCrop$$serializer();
        INSTANCE = promotionalMedia$ImageCrop$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.PromotionalMedia.ImageCrop", promotionalMedia$ImageCrop$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("thumbLarge", true);
        pluginGeneratedSerialDescriptor.l("mediumThreeByTwo440", true);
        pluginGeneratedSerialDescriptor.l("square320", true);
        pluginGeneratedSerialDescriptor.l("square640", true);
        pluginGeneratedSerialDescriptor.l("verticalTwoByThree735", true);
        pluginGeneratedSerialDescriptor.l("threeByTwo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotionalMedia$ImageCrop$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        PromotionalMedia$ImageDimension$$serializer promotionalMedia$ImageDimension$$serializer = PromotionalMedia$ImageDimension$$serializer.INSTANCE;
        return new KSerializer[]{he0.u(promotionalMedia$ImageDimension$$serializer), he0.u(promotionalMedia$ImageDimension$$serializer), he0.u(promotionalMedia$ImageDimension$$serializer), he0.u(promotionalMedia$ImageDimension$$serializer), he0.u(promotionalMedia$ImageDimension$$serializer), he0.u(promotionalMedia$ImageDimension$$serializer)};
    }

    @Override // defpackage.ym1
    public PromotionalMedia.ImageCrop deserialize(Decoder decoder) {
        int i;
        PromotionalMedia.ImageDimension imageDimension;
        PromotionalMedia.ImageDimension imageDimension2;
        PromotionalMedia.ImageDimension imageDimension3;
        PromotionalMedia.ImageDimension imageDimension4;
        PromotionalMedia.ImageDimension imageDimension5;
        PromotionalMedia.ImageDimension imageDimension6;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 5;
        PromotionalMedia.ImageDimension imageDimension7 = null;
        if (b.p()) {
            PromotionalMedia$ImageDimension$$serializer promotionalMedia$ImageDimension$$serializer = PromotionalMedia$ImageDimension$$serializer.INSTANCE;
            PromotionalMedia.ImageDimension imageDimension8 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 0, promotionalMedia$ImageDimension$$serializer, null);
            PromotionalMedia.ImageDimension imageDimension9 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 1, promotionalMedia$ImageDimension$$serializer, null);
            PromotionalMedia.ImageDimension imageDimension10 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 2, promotionalMedia$ImageDimension$$serializer, null);
            PromotionalMedia.ImageDimension imageDimension11 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 3, promotionalMedia$ImageDimension$$serializer, null);
            PromotionalMedia.ImageDimension imageDimension12 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 4, promotionalMedia$ImageDimension$$serializer, null);
            imageDimension6 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 5, promotionalMedia$ImageDimension$$serializer, null);
            i = 63;
            imageDimension4 = imageDimension11;
            imageDimension5 = imageDimension12;
            imageDimension3 = imageDimension10;
            imageDimension2 = imageDimension9;
            imageDimension = imageDimension8;
        } else {
            boolean z = true;
            int i3 = 0;
            PromotionalMedia.ImageDimension imageDimension13 = null;
            PromotionalMedia.ImageDimension imageDimension14 = null;
            PromotionalMedia.ImageDimension imageDimension15 = null;
            PromotionalMedia.ImageDimension imageDimension16 = null;
            PromotionalMedia.ImageDimension imageDimension17 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        imageDimension7 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 0, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageDimension7);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        imageDimension13 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 1, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageDimension13);
                        i3 |= 2;
                    case 2:
                        imageDimension14 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 2, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageDimension14);
                        i3 |= 4;
                    case 3:
                        imageDimension15 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 3, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageDimension15);
                        i3 |= 8;
                    case 4:
                        imageDimension16 = (PromotionalMedia.ImageDimension) b.g(descriptor2, 4, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageDimension16);
                        i3 |= 16;
                    case 5:
                        imageDimension17 = (PromotionalMedia.ImageDimension) b.g(descriptor2, i2, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageDimension17);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            imageDimension = imageDimension7;
            imageDimension2 = imageDimension13;
            imageDimension3 = imageDimension14;
            imageDimension4 = imageDimension15;
            imageDimension5 = imageDimension16;
            imageDimension6 = imageDimension17;
        }
        b.c(descriptor2);
        return new PromotionalMedia.ImageCrop(i, imageDimension, imageDimension2, imageDimension3, imageDimension4, imageDimension5, imageDimension6, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PromotionalMedia.ImageCrop imageCrop) {
        zq3.h(encoder, "encoder");
        zq3.h(imageCrop, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PromotionalMedia.ImageCrop.f(imageCrop, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.PromotionalMedia;
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
public final class PromotionalMedia$$serializer implements jx2 {
    public static final PromotionalMedia$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PromotionalMedia$$serializer promotionalMedia$$serializer = new PromotionalMedia$$serializer();
        INSTANCE = promotionalMedia$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.PromotionalMedia", promotionalMedia$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("caption", false);
        pluginGeneratedSerialDescriptor.l("crops", false);
        pluginGeneratedSerialDescriptor.l("uri", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotionalMedia$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{PromotionalMedia$Caption$$serializer.INSTANCE, PromotionalMedia$ImageCrop$$serializer.INSTANCE, l48.a};
    }

    @Override // defpackage.ym1
    public PromotionalMedia deserialize(Decoder decoder) {
        int i;
        PromotionalMedia.Caption caption;
        PromotionalMedia.ImageCrop imageCrop;
        String str;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        PromotionalMedia.Caption caption2 = null;
        if (b.p()) {
            PromotionalMedia.Caption caption3 = (PromotionalMedia.Caption) b.y(descriptor2, 0, PromotionalMedia$Caption$$serializer.INSTANCE, null);
            PromotionalMedia.ImageCrop imageCrop2 = (PromotionalMedia.ImageCrop) b.y(descriptor2, 1, PromotionalMedia$ImageCrop$$serializer.INSTANCE, null);
            caption = caption3;
            str = b.n(descriptor2, 2);
            imageCrop = imageCrop2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PromotionalMedia.ImageCrop imageCrop3 = null;
            String str2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    caption2 = (PromotionalMedia.Caption) b.y(descriptor2, 0, PromotionalMedia$Caption$$serializer.INSTANCE, caption2);
                    i2 |= 1;
                } else if (o == 1) {
                    imageCrop3 = (PromotionalMedia.ImageCrop) b.y(descriptor2, 1, PromotionalMedia$ImageCrop$$serializer.INSTANCE, imageCrop3);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    str2 = b.n(descriptor2, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            caption = caption2;
            imageCrop = imageCrop3;
            str = str2;
        }
        b.c(descriptor2);
        return new PromotionalMedia(i, caption, imageCrop, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PromotionalMedia promotionalMedia) {
        zq3.h(encoder, "encoder");
        zq3.h(promotionalMedia, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PromotionalMedia.b(promotionalMedia, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

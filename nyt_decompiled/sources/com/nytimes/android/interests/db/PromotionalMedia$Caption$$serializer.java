package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.jx2;
import defpackage.l48;
import defpackage.za0;
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
public final class PromotionalMedia$Caption$$serializer implements jx2 {
    public static final PromotionalMedia$Caption$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PromotionalMedia$Caption$$serializer promotionalMedia$Caption$$serializer = new PromotionalMedia$Caption$$serializer();
        INSTANCE = promotionalMedia$Caption$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.PromotionalMedia.Caption", promotionalMedia$Caption$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("full", false);
        pluginGeneratedSerialDescriptor.l("shouldHideCaption", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotionalMedia$Caption$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{l48.a, za0.a};
    }

    @Override // defpackage.ym1
    public PromotionalMedia.Caption deserialize(Decoder decoder) {
        String str;
        boolean z;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            str = b.n(descriptor2, 0);
            z = b.D(descriptor2, 1);
            i = 3;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            str = null;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    str = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    z3 = b.D(descriptor2, 1);
                    i2 |= 2;
                }
            }
            z = z3;
            i = i2;
        }
        b.c(descriptor2);
        return new PromotionalMedia.Caption(i, str, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PromotionalMedia.Caption caption) {
        zq3.h(encoder, "encoder");
        zq3.h(caption, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PromotionalMedia.Caption.a(caption, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

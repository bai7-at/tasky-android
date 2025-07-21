package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.en3;
import defpackage.he0;
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
public final class Rating$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final Rating$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Rating$$serializer rating$$serializer = new Rating$$serializer();
        INSTANCE = rating$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.cooking.Rating", rating$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("numberOfRatings", false);
        pluginGeneratedSerialDescriptor.l("avgRating", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Rating$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        en3 en3Var = en3.a;
        return new KSerializer[]{he0.u(en3Var), he0.u(en3Var)};
    }

    @Override // defpackage.ym1
    public Rating deserialize(Decoder decoder) {
        Integer num;
        int i;
        Integer num2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            en3 en3Var = en3.a;
            num2 = (Integer) b.g(descriptor2, 0, en3Var, null);
            num = (Integer) b.g(descriptor2, 1, en3Var, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            num = null;
            Integer num3 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    num3 = (Integer) b.g(descriptor2, 0, en3.a, num3);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    num = (Integer) b.g(descriptor2, 1, en3.a, num);
                    i2 |= 2;
                }
            }
            i = i2;
            num2 = num3;
        }
        b.c(descriptor2);
        return new Rating(i, num2, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Rating rating) {
        zq3.h(encoder, "encoder");
        zq3.h(rating, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Rating.c(rating, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

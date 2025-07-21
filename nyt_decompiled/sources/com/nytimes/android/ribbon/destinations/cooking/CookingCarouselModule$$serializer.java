package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.jx2;
import defpackage.l48;
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
public final class CookingCarouselModule$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CookingCarouselModule$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CookingCarouselModule$$serializer cookingCarouselModule$$serializer = new CookingCarouselModule$$serializer();
        INSTANCE = cookingCarouselModule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.cooking.CookingCarouselModule", cookingCarouselModule$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("moduleName", false);
        pluginGeneratedSerialDescriptor.l("recipes", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CookingCarouselModule$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = CookingCarouselModule.e;
        KSerializer kSerializer = kSerializerArr[1];
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, kSerializer, l48Var};
    }

    @Override // defpackage.ym1
    public CookingCarouselModule deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        String str;
        List list;
        String str2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = CookingCarouselModule.e;
        String str3 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            list = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            str = n;
            str2 = b.n(descriptor2, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            String str4 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str3 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (o == 1) {
                    list2 = (List) b.y(descriptor2, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    str4 = b.n(descriptor2, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            list = list2;
            str2 = str4;
        }
        b.c(descriptor2);
        return new CookingCarouselModule(i, str, list, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CookingCarouselModule cookingCarouselModule) {
        zq3.h(encoder, "encoder");
        zq3.h(cookingCarouselModule, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CookingCarouselModule.e(cookingCarouselModule, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

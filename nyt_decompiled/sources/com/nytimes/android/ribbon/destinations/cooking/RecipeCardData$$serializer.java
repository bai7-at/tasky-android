package com.nytimes.android.ribbon.destinations.cooking;

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
public final class RecipeCardData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final RecipeCardData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RecipeCardData$$serializer recipeCardData$$serializer = new RecipeCardData$$serializer();
        INSTANCE = recipeCardData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.cooking.RecipeCardData", recipeCardData$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("byline", false);
        pluginGeneratedSerialDescriptor.l("rating", false);
        pluginGeneratedSerialDescriptor.l("contentUrl", false);
        pluginGeneratedSerialDescriptor.l("cookingTime", false);
        pluginGeneratedSerialDescriptor.l("uri", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RecipeCardData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), he0.u(l48Var), he0.u(l48Var), he0.u(Rating$$serializer.INSTANCE), he0.u(l48Var), he0.u(l48Var), he0.u(l48Var)};
    }

    @Override // defpackage.ym1
    public RecipeCardData deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Rating rating;
        String str5;
        String str6;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 6;
        String str7 = null;
        if (b.p()) {
            l48 l48Var = l48.a;
            String str8 = (String) b.g(descriptor2, 0, l48Var, null);
            String str9 = (String) b.g(descriptor2, 1, l48Var, null);
            String str10 = (String) b.g(descriptor2, 2, l48Var, null);
            Rating rating2 = (Rating) b.g(descriptor2, 3, Rating$$serializer.INSTANCE, null);
            String str11 = (String) b.g(descriptor2, 4, l48Var, null);
            String str12 = (String) b.g(descriptor2, 5, l48Var, null);
            str = (String) b.g(descriptor2, 6, l48Var, null);
            i = 127;
            str6 = str12;
            rating = rating2;
            str5 = str11;
            str4 = str10;
            str3 = str9;
            str2 = str8;
        } else {
            boolean z = true;
            int i3 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Rating rating3 = null;
            String str16 = null;
            String str17 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        str7 = (String) b.g(descriptor2, 0, l48.a, str7);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        str14 = (String) b.g(descriptor2, 1, l48.a, str14);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        str15 = (String) b.g(descriptor2, 2, l48.a, str15);
                        i3 |= 4;
                    case 3:
                        rating3 = (Rating) b.g(descriptor2, 3, Rating$$serializer.INSTANCE, rating3);
                        i3 |= 8;
                    case 4:
                        str16 = (String) b.g(descriptor2, 4, l48.a, str16);
                        i3 |= 16;
                    case 5:
                        str17 = (String) b.g(descriptor2, 5, l48.a, str17);
                        i3 |= 32;
                    case 6:
                        str13 = (String) b.g(descriptor2, i2, l48.a, str13);
                        i3 |= 64;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            str = str13;
            str2 = str7;
            str3 = str14;
            str4 = str15;
            rating = rating3;
            str5 = str16;
            str6 = str17;
        }
        b.c(descriptor2);
        return new RecipeCardData(i, str2, str3, str4, rating, str5, str6, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, RecipeCardData recipeCardData) {
        zq3.h(encoder, "encoder");
        zq3.h(recipeCardData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        RecipeCardData.h(recipeCardData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

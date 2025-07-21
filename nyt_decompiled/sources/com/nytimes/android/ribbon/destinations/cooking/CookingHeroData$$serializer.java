package com.nytimes.android.ribbon.destinations.cooking;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
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
public final class CookingHeroData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CookingHeroData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CookingHeroData$$serializer cookingHeroData$$serializer = new CookingHeroData$$serializer();
        INSTANCE = cookingHeroData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.cooking.CookingHeroData", cookingHeroData$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("credit", false);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("byline", false);
        pluginGeneratedSerialDescriptor.l("rating", false);
        pluginGeneratedSerialDescriptor.l("cookingTime", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CookingHeroData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), he0.u(l48Var), l48Var, l48Var, he0.u(l48Var), he0.u(l48Var), he0.u(Rating$$serializer.INSTANCE), he0.u(l48Var), l48Var};
    }

    @Override // defpackage.ym1
    public CookingHeroData deserialize(Decoder decoder) {
        int i;
        String str;
        Rating rating;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        char c;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        String str9 = null;
        if (b.p()) {
            l48 l48Var = l48.a;
            String str10 = (String) b.g(descriptor2, 0, l48Var, null);
            String str11 = (String) b.g(descriptor2, 1, l48Var, null);
            String n = b.n(descriptor2, 2);
            String n2 = b.n(descriptor2, 3);
            String str12 = (String) b.g(descriptor2, 4, l48Var, null);
            String str13 = (String) b.g(descriptor2, 5, l48Var, null);
            Rating rating2 = (Rating) b.g(descriptor2, 6, Rating$$serializer.INSTANCE, null);
            str = (String) b.g(descriptor2, 7, l48Var, null);
            str8 = b.n(descriptor2, 8);
            rating = rating2;
            str2 = str13;
            str7 = n2;
            i = 511;
            str3 = str12;
            str6 = n;
            str5 = str11;
            str4 = str10;
        } else {
            boolean z = true;
            int i4 = 0;
            String str14 = null;
            Rating rating3 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        str9 = (String) b.g(descriptor2, 0, l48.a, str9);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        str17 = (String) b.g(descriptor2, 1, l48.a, str17);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        i4 |= 4;
                        str18 = b.n(descriptor2, 2);
                        i2 = 7;
                    case 3:
                        c = 4;
                        str19 = b.n(descriptor2, 3);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        c = 4;
                        str16 = (String) b.g(descriptor2, 4, l48.a, str16);
                        i4 |= 16;
                        i2 = 7;
                    case 5:
                        str15 = (String) b.g(descriptor2, 5, l48.a, str15);
                        i4 |= 32;
                    case 6:
                        rating3 = (Rating) b.g(descriptor2, i3, Rating$$serializer.INSTANCE, rating3);
                        i4 |= 64;
                    case 7:
                        str14 = (String) b.g(descriptor2, i2, l48.a, str14);
                        i4 |= 128;
                    case 8:
                        str20 = b.n(descriptor2, 8);
                        i4 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i4;
            str = str14;
            rating = rating3;
            str2 = str15;
            str3 = str16;
            str4 = str9;
            str5 = str17;
            str6 = str18;
            str7 = str19;
            str8 = str20;
        }
        b.c(descriptor2);
        return new CookingHeroData(i, str4, str5, str6, str7, str3, str2, rating, str, str8, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CookingHeroData cookingHeroData) {
        zq3.h(encoder, "encoder");
        zq3.h(cookingHeroData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CookingHeroData.k(cookingHeroData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

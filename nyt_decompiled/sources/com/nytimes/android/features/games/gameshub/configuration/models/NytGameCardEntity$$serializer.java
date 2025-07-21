package com.nytimes.android.features.games.gameshub.configuration.models;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.he0;
import defpackage.ho0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.nn0;
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
public final class NytGameCardEntity$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final NytGameCardEntity$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NytGameCardEntity$$serializer nytGameCardEntity$$serializer = new NytGameCardEntity$$serializer();
        INSTANCE = nytGameCardEntity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.configuration.models.NytGameCardEntity", nytGameCardEntity$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("description", true);
        pluginGeneratedSerialDescriptor.l("byline", true);
        pluginGeneratedSerialDescriptor.l("button_title", false);
        pluginGeneratedSerialDescriptor.l("game_url", false);
        pluginGeneratedSerialDescriptor.l("image_url", false);
        pluginGeneratedSerialDescriptor.l("background_color", false);
        pluginGeneratedSerialDescriptor.l("is_subscription_required", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NytGameCardEntity$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, he0.u(l48Var), he0.u(l48Var), l48Var, l48Var, l48Var, ho0.a, za0.a};
    }

    @Override // defpackage.ym1
    public NytGameCardEntity deserialize(Decoder decoder) {
        boolean z;
        nn0 nn0Var;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        char c;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 7;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            l48 l48Var = l48.a;
            String str8 = (String) b.g(descriptor2, 2, l48Var, null);
            String str9 = (String) b.g(descriptor2, 3, l48Var, null);
            String n3 = b.n(descriptor2, 4);
            String n4 = b.n(descriptor2, 5);
            String n5 = b.n(descriptor2, 6);
            str2 = n;
            nn0Var = (nn0) b.y(descriptor2, 7, ho0.a, null);
            str7 = n5;
            str6 = n4;
            str = str9;
            z = b.D(descriptor2, 8);
            str5 = n3;
            str4 = str8;
            str3 = n2;
            i = 511;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            nn0 nn0Var2 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            int i3 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                    case 0:
                        i3 |= 1;
                        str10 = b.n(descriptor2, 0);
                        i2 = 7;
                    case 1:
                        c = 2;
                        str11 = b.n(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        c = 2;
                        str12 = (String) b.g(descriptor2, 2, l48.a, str12);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        str16 = (String) b.g(descriptor2, 3, l48.a, str16);
                        i3 |= 8;
                    case 4:
                        str13 = b.n(descriptor2, 4);
                        i3 |= 16;
                    case 5:
                        str14 = b.n(descriptor2, 5);
                        i3 |= 32;
                    case 6:
                        str15 = b.n(descriptor2, 6);
                        i3 |= 64;
                    case 7:
                        nn0Var2 = (nn0) b.y(descriptor2, i2, ho0.a, nn0Var2);
                        i3 |= 128;
                    case 8:
                        z3 = b.D(descriptor2, 8);
                        i3 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            z = z3;
            nn0Var = nn0Var2;
            str = str16;
            i = i3;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
        }
        b.c(descriptor2);
        return new NytGameCardEntity(i, str2, str3, str4, str, str5, str6, str7, nn0Var, z, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, NytGameCardEntity nytGameCardEntity) {
        zq3.h(encoder, "encoder");
        zq3.h(nytGameCardEntity, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        NytGameCardEntity.i(nytGameCardEntity, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

package com.nytimes.android.ribbon.destinations.games;

import com.nytimes.android.api.cms.Asset;
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
public final class GamesLockupData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final GamesLockupData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GamesLockupData$$serializer gamesLockupData$$serializer = new GamesLockupData$$serializer();
        INSTANCE = gamesLockupData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.games.GamesLockupData", gamesLockupData$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("asset", false);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("timestamp", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("credit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GamesLockupData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = GamesLockupData.h;
        KSerializer kSerializer = kSerializerArr[0];
        l48 l48Var = l48.a;
        return new KSerializer[]{kSerializer, he0.u(l48Var), l48Var, l48Var, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public GamesLockupData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        Asset asset;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = GamesLockupData.h;
        int i2 = 5;
        Asset asset2 = null;
        if (b.p()) {
            Asset asset3 = (Asset) b.y(descriptor2, 0, kSerializerArr[0], null);
            String str6 = (String) b.g(descriptor2, 1, l48.a, null);
            String n = b.n(descriptor2, 2);
            String n2 = b.n(descriptor2, 3);
            String n3 = b.n(descriptor2, 4);
            asset = asset3;
            str = str6;
            str5 = b.n(descriptor2, 5);
            str3 = n2;
            str4 = n3;
            str2 = n;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        asset2 = (Asset) b.y(descriptor2, 0, kSerializerArr[0], asset2);
                        i3 |= 1;
                        i2 = 5;
                        continue;
                    case 1:
                        str7 = (String) b.g(descriptor2, 1, l48.a, str7);
                        i3 |= 2;
                        break;
                    case 2:
                        str8 = b.n(descriptor2, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        str9 = b.n(descriptor2, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str10 = b.n(descriptor2, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        str11 = b.n(descriptor2, i2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            asset = asset2;
            str = str7;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str11;
        }
        b.c(descriptor2);
        return new GamesLockupData(i, asset, str, str2, str3, str4, str5, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, GamesLockupData gamesLockupData) {
        zq3.h(encoder, "encoder");
        zq3.h(gamesLockupData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        GamesLockupData.g(gamesLockupData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

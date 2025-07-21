package com.nytimes.android.ribbon.destinations.games;

import com.nytimes.android.api.cms.AssetConstants;
import defpackage.en3;
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
public final class GamesDestinationItem$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final GamesDestinationItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GamesDestinationItem$$serializer gamesDestinationItem$$serializer = new GamesDestinationItem$$serializer();
        INSTANCE = gamesDestinationItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.games.GamesDestinationItem", gamesDestinationItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("rank", false);
        pluginGeneratedSerialDescriptor.l("headline", false);
        pluginGeneratedSerialDescriptor.l("label", false);
        pluginGeneratedSerialDescriptor.l(AssetConstants.IMAGE_TYPE, false);
        pluginGeneratedSerialDescriptor.l("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GamesDestinationItem$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        en3 en3Var = en3.a;
        return new KSerializer[]{l48Var, en3Var, l48Var, l48Var, en3Var, l48Var};
    }

    @Override // defpackage.ym1
    public GamesDestinationItem deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        int i3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            int j = b.j(descriptor2, 1);
            String n2 = b.n(descriptor2, 2);
            String n3 = b.n(descriptor2, 3);
            int j2 = b.j(descriptor2, 4);
            str = n;
            str2 = b.n(descriptor2, 5);
            str3 = n3;
            i = j2;
            str4 = n2;
            i2 = j;
            i3 = 63;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str5 = b.n(descriptor2, 0);
                        i6 |= 1;
                        continue;
                    case 1:
                        i5 = b.j(descriptor2, 1);
                        i6 |= 2;
                        break;
                    case 2:
                        str8 = b.n(descriptor2, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        str7 = b.n(descriptor2, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        i4 = b.j(descriptor2, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        str6 = b.n(descriptor2, 5);
                        i6 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            str = str5;
            str2 = str6;
            str3 = str7;
            i = i4;
            str4 = str8;
            i2 = i5;
            i3 = i6;
        }
        b.c(descriptor2);
        return new GamesDestinationItem(i3, str, i2, str4, str3, i, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, GamesDestinationItem gamesDestinationItem) {
        zq3.h(encoder, "encoder");
        zq3.h(gamesDestinationItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        GamesDestinationItem.g(gamesDestinationItem, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

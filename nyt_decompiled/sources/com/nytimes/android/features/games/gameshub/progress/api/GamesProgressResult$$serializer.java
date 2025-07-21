package com.nytimes.android.features.games.gameshub.progress.api;

import defpackage.jx2;
import defpackage.mk7;
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
public final class GamesProgressResult$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final GamesProgressResult$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GamesProgressResult$$serializer gamesProgressResult$$serializer = new GamesProgressResult$$serializer();
        INSTANCE = gamesProgressResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.progress.api.GamesProgressResult", gamesProgressResult$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("crossword_daily", true);
        pluginGeneratedSerialDescriptor.l("crossword_mini", true);
        pluginGeneratedSerialDescriptor.l("spelling_bee", true);
        pluginGeneratedSerialDescriptor.l("wordle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GamesProgressResult$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = GamesProgressResult.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3]};
    }

    @Override // defpackage.ym1
    public GamesProgressResult deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        List list;
        List list2;
        List list3;
        List list4;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = GamesProgressResult.$childSerializers;
        List list5 = null;
        if (b.p()) {
            List list6 = (List) b.y(descriptor2, 0, kSerializerArr[0], null);
            List list7 = (List) b.y(descriptor2, 1, kSerializerArr[1], null);
            List list8 = (List) b.y(descriptor2, 2, kSerializerArr[2], null);
            list4 = (List) b.y(descriptor2, 3, kSerializerArr[3], null);
            list = list6;
            i = 15;
            list3 = list8;
            list2 = list7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    list5 = (List) b.y(descriptor2, 0, kSerializerArr[0], list5);
                    i2 |= 1;
                } else if (o == 1) {
                    list9 = (List) b.y(descriptor2, 1, kSerializerArr[1], list9);
                    i2 |= 2;
                } else if (o == 2) {
                    list10 = (List) b.y(descriptor2, 2, kSerializerArr[2], list10);
                    i2 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    list11 = (List) b.y(descriptor2, 3, kSerializerArr[3], list11);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list5;
            list2 = list9;
            list3 = list10;
            list4 = list11;
        }
        b.c(descriptor2);
        return new GamesProgressResult(i, list, list2, list3, list4, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, GamesProgressResult gamesProgressResult) {
        zq3.h(encoder, "encoder");
        zq3.h(gamesProgressResult, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        GamesProgressResult.write$Self$games_hub_release(gamesProgressResult, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

package com.nytimes.android.features.games.gameshub.progress.api;

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
public final class GamesProgressResponse$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final GamesProgressResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GamesProgressResponse$$serializer gamesProgressResponse$$serializer = new GamesProgressResponse$$serializer();
        INSTANCE = gamesProgressResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.progress.api.GamesProgressResponse", gamesProgressResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("status", false);
        pluginGeneratedSerialDescriptor.l("results", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GamesProgressResponse$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{l48.a, GamesProgressResult$$serializer.INSTANCE};
    }

    @Override // defpackage.ym1
    public GamesProgressResponse deserialize(Decoder decoder) {
        String str;
        GamesProgressResult gamesProgressResult;
        int i;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            str = b.n(descriptor2, 0);
            gamesProgressResult = (GamesProgressResult) b.y(descriptor2, 1, GamesProgressResult$$serializer.INSTANCE, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            GamesProgressResult gamesProgressResult2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    gamesProgressResult2 = (GamesProgressResult) b.y(descriptor2, 1, GamesProgressResult$$serializer.INSTANCE, gamesProgressResult2);
                    i2 |= 2;
                }
            }
            gamesProgressResult = gamesProgressResult2;
            i = i2;
        }
        b.c(descriptor2);
        return new GamesProgressResponse(i, str, gamesProgressResult, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, GamesProgressResponse gamesProgressResponse) {
        zq3.h(encoder, "encoder");
        zq3.h(gamesProgressResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        GamesProgressResponse.write$Self$games_hub_release(gamesProgressResponse, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

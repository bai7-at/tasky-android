package com.nytimes.android.features.games.gameshub.progress.api;

import defpackage.en3;
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
public final class WordlePuzzleProgressData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final WordlePuzzleProgressData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WordlePuzzleProgressData$$serializer wordlePuzzleProgressData$$serializer = new WordlePuzzleProgressData$$serializer();
        INSTANCE = wordlePuzzleProgressData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.progress.api.WordlePuzzleProgressData", wordlePuzzleProgressData$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("puzzle_id", false);
        pluginGeneratedSerialDescriptor.l("last_modified", false);
        pluginGeneratedSerialDescriptor.l("guesses", false);
        pluginGeneratedSerialDescriptor.l("win", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WordlePuzzleProgressData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        en3 en3Var = en3.a;
        return new KSerializer[]{en3Var, l48.a, en3Var, za0.a};
    }

    @Override // defpackage.ym1
    public WordlePuzzleProgressData deserialize(Decoder decoder) {
        int i;
        boolean z;
        int i2;
        String str;
        int i3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            String n = b.n(descriptor2, 1);
            int j2 = b.j(descriptor2, 2);
            i = j;
            z = b.D(descriptor2, 3);
            i2 = j2;
            str = n;
            i3 = 15;
        } else {
            String str2 = null;
            boolean z2 = true;
            int i4 = 0;
            boolean z3 = false;
            int i5 = 0;
            int i6 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    i4 = b.j(descriptor2, 0);
                    i6 |= 1;
                } else if (o == 1) {
                    str2 = b.n(descriptor2, 1);
                    i6 |= 2;
                } else if (o == 2) {
                    i5 = b.j(descriptor2, 2);
                    i6 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    z3 = b.D(descriptor2, 3);
                    i6 |= 8;
                }
            }
            i = i4;
            z = z3;
            i2 = i5;
            str = str2;
            i3 = i6;
        }
        b.c(descriptor2);
        return new WordlePuzzleProgressData(i3, i, str, i2, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, WordlePuzzleProgressData wordlePuzzleProgressData) {
        zq3.h(encoder, "encoder");
        zq3.h(wordlePuzzleProgressData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        WordlePuzzleProgressData.write$Self$games_hub_release(wordlePuzzleProgressData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

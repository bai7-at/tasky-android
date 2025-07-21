package com.nytimes.android.features.games.gameshub.playtab;

import defpackage.en3;
import defpackage.jx2;
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
public final class WordlePuzzleState$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final WordlePuzzleState$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WordlePuzzleState$$serializer wordlePuzzleState$$serializer = new WordlePuzzleState$$serializer();
        INSTANCE = wordlePuzzleState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.playtab.WordlePuzzleState", wordlePuzzleState$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("puzzleId", false);
        pluginGeneratedSerialDescriptor.l("win", false);
        pluginGeneratedSerialDescriptor.l("guesses", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WordlePuzzleState$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        en3 en3Var = en3.a;
        return new KSerializer[]{en3Var, za0.a, en3Var};
    }

    @Override // defpackage.ym1
    public WordlePuzzleState deserialize(Decoder decoder) {
        int i;
        int i2;
        boolean z;
        int i3;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            boolean D = b.D(descriptor2, 1);
            i = j;
            i2 = b.j(descriptor2, 2);
            z = D;
            i3 = 7;
        } else {
            boolean z2 = true;
            int i4 = 0;
            int i5 = 0;
            boolean z3 = false;
            int i6 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    i4 = b.j(descriptor2, 0);
                    i6 |= 1;
                } else if (o == 1) {
                    z3 = b.D(descriptor2, 1);
                    i6 |= 2;
                } else {
                    if (o != 2) {
                        throw new UnknownFieldException(o);
                    }
                    i5 = b.j(descriptor2, 2);
                    i6 |= 4;
                }
            }
            i = i4;
            i2 = i5;
            z = z3;
            i3 = i6;
        }
        b.c(descriptor2);
        return new WordlePuzzleState(i3, i, z, i2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, WordlePuzzleState wordlePuzzleState) {
        zq3.h(encoder, "encoder");
        zq3.h(wordlePuzzleState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        WordlePuzzleState.e(wordlePuzzleState, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

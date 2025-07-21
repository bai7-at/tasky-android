package com.nytimes.android.features.games.gameshub.playtab;

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
public final class SpellingBeePuzzleState$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final SpellingBeePuzzleState$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SpellingBeePuzzleState$$serializer spellingBeePuzzleState$$serializer = new SpellingBeePuzzleState$$serializer();
        INSTANCE = spellingBeePuzzleState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.playtab.SpellingBeePuzzleState", spellingBeePuzzleState$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("puzzleId", false);
        pluginGeneratedSerialDescriptor.l("rank", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SpellingBeePuzzleState$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{en3.a, l48.a};
    }

    @Override // defpackage.ym1
    public SpellingBeePuzzleState deserialize(Decoder decoder) {
        int i;
        String str;
        int i2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            i = b.j(descriptor2, 0);
            str = b.n(descriptor2, 1);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            int i3 = 0;
            String str2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    i = b.j(descriptor2, 0);
                    i3 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    str2 = b.n(descriptor2, 1);
                    i3 |= 2;
                }
            }
            str = str2;
            i2 = i3;
        }
        b.c(descriptor2);
        return new SpellingBeePuzzleState(i2, i, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, SpellingBeePuzzleState spellingBeePuzzleState) {
        zq3.h(encoder, "encoder");
        zq3.h(spellingBeePuzzleState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        SpellingBeePuzzleState.d(spellingBeePuzzleState, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

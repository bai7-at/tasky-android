package com.nytimes.android.features.games.gameshub.playtab;

import defpackage.jx2;
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
public final class NytGamesProgressState$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final NytGamesProgressState$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NytGamesProgressState$$serializer nytGamesProgressState$$serializer = new NytGamesProgressState$$serializer();
        INSTANCE = nytGamesProgressState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState", nytGamesProgressState$$serializer, 5);
        pluginGeneratedSerialDescriptor.l("spellingBeeTodayState", false);
        pluginGeneratedSerialDescriptor.l("spellingBeeYesterdayState", false);
        pluginGeneratedSerialDescriptor.l("crosswordDailyState", false);
        pluginGeneratedSerialDescriptor.l("crosswordMiniState", false);
        pluginGeneratedSerialDescriptor.l("wordleState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NytGamesProgressState$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        SpellingBeePuzzleState$$serializer spellingBeePuzzleState$$serializer = SpellingBeePuzzleState$$serializer.INSTANCE;
        CrosswordPuzzleState$$serializer crosswordPuzzleState$$serializer = CrosswordPuzzleState$$serializer.INSTANCE;
        return new KSerializer[]{spellingBeePuzzleState$$serializer, spellingBeePuzzleState$$serializer, crosswordPuzzleState$$serializer, crosswordPuzzleState$$serializer, WordlePuzzleState$$serializer.INSTANCE};
    }

    @Override // defpackage.ym1
    public NytGamesProgressState deserialize(Decoder decoder) {
        int i;
        SpellingBeePuzzleState spellingBeePuzzleState;
        SpellingBeePuzzleState spellingBeePuzzleState2;
        CrosswordPuzzleState crosswordPuzzleState;
        CrosswordPuzzleState crosswordPuzzleState2;
        WordlePuzzleState wordlePuzzleState;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        SpellingBeePuzzleState spellingBeePuzzleState3 = null;
        if (b.p()) {
            SpellingBeePuzzleState$$serializer spellingBeePuzzleState$$serializer = SpellingBeePuzzleState$$serializer.INSTANCE;
            SpellingBeePuzzleState spellingBeePuzzleState4 = (SpellingBeePuzzleState) b.y(descriptor2, 0, spellingBeePuzzleState$$serializer, null);
            SpellingBeePuzzleState spellingBeePuzzleState5 = (SpellingBeePuzzleState) b.y(descriptor2, 1, spellingBeePuzzleState$$serializer, null);
            CrosswordPuzzleState$$serializer crosswordPuzzleState$$serializer = CrosswordPuzzleState$$serializer.INSTANCE;
            CrosswordPuzzleState crosswordPuzzleState3 = (CrosswordPuzzleState) b.y(descriptor2, 2, crosswordPuzzleState$$serializer, null);
            spellingBeePuzzleState2 = spellingBeePuzzleState5;
            crosswordPuzzleState2 = (CrosswordPuzzleState) b.y(descriptor2, 3, crosswordPuzzleState$$serializer, null);
            wordlePuzzleState = (WordlePuzzleState) b.y(descriptor2, 4, WordlePuzzleState$$serializer.INSTANCE, null);
            crosswordPuzzleState = crosswordPuzzleState3;
            i = 31;
            spellingBeePuzzleState = spellingBeePuzzleState4;
        } else {
            boolean z = true;
            int i2 = 0;
            SpellingBeePuzzleState spellingBeePuzzleState6 = null;
            CrosswordPuzzleState crosswordPuzzleState4 = null;
            CrosswordPuzzleState crosswordPuzzleState5 = null;
            WordlePuzzleState wordlePuzzleState2 = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    spellingBeePuzzleState3 = (SpellingBeePuzzleState) b.y(descriptor2, 0, SpellingBeePuzzleState$$serializer.INSTANCE, spellingBeePuzzleState3);
                    i2 |= 1;
                } else if (o == 1) {
                    spellingBeePuzzleState6 = (SpellingBeePuzzleState) b.y(descriptor2, 1, SpellingBeePuzzleState$$serializer.INSTANCE, spellingBeePuzzleState6);
                    i2 |= 2;
                } else if (o == 2) {
                    crosswordPuzzleState4 = (CrosswordPuzzleState) b.y(descriptor2, 2, CrosswordPuzzleState$$serializer.INSTANCE, crosswordPuzzleState4);
                    i2 |= 4;
                } else if (o == 3) {
                    crosswordPuzzleState5 = (CrosswordPuzzleState) b.y(descriptor2, 3, CrosswordPuzzleState$$serializer.INSTANCE, crosswordPuzzleState5);
                    i2 |= 8;
                } else {
                    if (o != 4) {
                        throw new UnknownFieldException(o);
                    }
                    wordlePuzzleState2 = (WordlePuzzleState) b.y(descriptor2, 4, WordlePuzzleState$$serializer.INSTANCE, wordlePuzzleState2);
                    i2 |= 16;
                }
            }
            i = i2;
            spellingBeePuzzleState = spellingBeePuzzleState3;
            spellingBeePuzzleState2 = spellingBeePuzzleState6;
            crosswordPuzzleState = crosswordPuzzleState4;
            crosswordPuzzleState2 = crosswordPuzzleState5;
            wordlePuzzleState = wordlePuzzleState2;
        }
        b.c(descriptor2);
        return new NytGamesProgressState(i, spellingBeePuzzleState, spellingBeePuzzleState2, crosswordPuzzleState, crosswordPuzzleState2, wordlePuzzleState, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, NytGamesProgressState nytGamesProgressState) {
        zq3.h(encoder, "encoder");
        zq3.h(nytGamesProgressState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        NytGamesProgressState.f(nytGamesProgressState, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

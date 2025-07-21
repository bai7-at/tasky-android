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
public final class SpellingBeePuzzleProgressData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final SpellingBeePuzzleProgressData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SpellingBeePuzzleProgressData$$serializer spellingBeePuzzleProgressData$$serializer = new SpellingBeePuzzleProgressData$$serializer();
        INSTANCE = spellingBeePuzzleProgressData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.progress.api.SpellingBeePuzzleProgressData", spellingBeePuzzleProgressData$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("puzzle_id", false);
        pluginGeneratedSerialDescriptor.l("last_modified", false);
        pluginGeneratedSerialDescriptor.l("is_revealed", false);
        pluginGeneratedSerialDescriptor.l("rank", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SpellingBeePuzzleProgressData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{en3.a, l48Var, za0.a, l48Var};
    }

    @Override // defpackage.ym1
    public SpellingBeePuzzleProgressData deserialize(Decoder decoder) {
        int i;
        String str;
        boolean z;
        String str2;
        int i2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            String n = b.n(descriptor2, 1);
            boolean D = b.D(descriptor2, 2);
            i = j;
            str = b.n(descriptor2, 3);
            z = D;
            str2 = n;
            i2 = 15;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z2 = true;
            int i3 = 0;
            boolean z3 = false;
            int i4 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    i3 = b.j(descriptor2, 0);
                    i4 |= 1;
                } else if (o == 1) {
                    str4 = b.n(descriptor2, 1);
                    i4 |= 2;
                } else if (o == 2) {
                    z3 = b.D(descriptor2, 2);
                    i4 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    str3 = b.n(descriptor2, 3);
                    i4 |= 8;
                }
            }
            i = i3;
            str = str3;
            z = z3;
            str2 = str4;
            i2 = i4;
        }
        b.c(descriptor2);
        return new SpellingBeePuzzleProgressData(i2, i, str2, z, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, SpellingBeePuzzleProgressData spellingBeePuzzleProgressData) {
        zq3.h(encoder, "encoder");
        zq3.h(spellingBeePuzzleProgressData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        SpellingBeePuzzleProgressData.write$Self$games_hub_release(spellingBeePuzzleProgressData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

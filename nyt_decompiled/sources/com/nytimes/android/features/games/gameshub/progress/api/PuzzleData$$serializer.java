package com.nytimes.android.features.games.gameshub.progress.api;

import defpackage.en3;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
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
public final class PuzzleData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final PuzzleData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PuzzleData$$serializer puzzleData$$serializer = new PuzzleData$$serializer();
        INSTANCE = puzzleData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.progress.api.PuzzleData", puzzleData$$serializer, 2);
        pluginGeneratedSerialDescriptor.l("print_date", true);
        pluginGeneratedSerialDescriptor.l("puzzle_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PuzzleData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        return new KSerializer[]{l48.a, en3.a};
    }

    @Override // defpackage.ym1
    public PuzzleData deserialize(Decoder decoder) {
        String str;
        int i;
        int i2;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            str = b.n(descriptor2, 0);
            i = b.j(descriptor2, 1);
            i2 = 3;
        } else {
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            str = null;
            while (z) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z = false;
                } else if (o == 0) {
                    str = b.n(descriptor2, 0);
                    i4 |= 1;
                } else {
                    if (o != 1) {
                        throw new UnknownFieldException(o);
                    }
                    i3 = b.j(descriptor2, 1);
                    i4 |= 2;
                }
            }
            i = i3;
            i2 = i4;
        }
        b.c(descriptor2);
        return new PuzzleData(i2, str, i, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, PuzzleData puzzleData) {
        zq3.h(encoder, "encoder");
        zq3.h(puzzleData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        PuzzleData.write$Self$games_hub_release(puzzleData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

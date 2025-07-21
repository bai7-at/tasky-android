package com.nytimes.android.features.games.gameshub.playtab;

import defpackage.en3;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.mk7;
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
public final class CrosswordPuzzleState$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CrosswordPuzzleState$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CrosswordPuzzleState$$serializer crosswordPuzzleState$$serializer = new CrosswordPuzzleState$$serializer();
        INSTANCE = crosswordPuzzleState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.playtab.CrosswordPuzzleState", crosswordPuzzleState$$serializer, 4);
        pluginGeneratedSerialDescriptor.l("puzzleId", false);
        pluginGeneratedSerialDescriptor.l("solved", false);
        pluginGeneratedSerialDescriptor.l("percent_filled", false);
        pluginGeneratedSerialDescriptor.l("print_date", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrosswordPuzzleState$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer u = he0.u(l48.a);
        en3 en3Var = en3.a;
        return new KSerializer[]{en3Var, za0.a, en3Var, u};
    }

    @Override // defpackage.ym1
    public CrosswordPuzzleState deserialize(Decoder decoder) {
        int i;
        int i2;
        boolean z;
        int i3;
        String str;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            boolean D = b.D(descriptor2, 1);
            int j2 = b.j(descriptor2, 2);
            i = j;
            str = (String) b.g(descriptor2, 3, l48.a, null);
            i2 = j2;
            z = D;
            i3 = 15;
        } else {
            boolean z2 = true;
            int i4 = 0;
            boolean z3 = false;
            int i5 = 0;
            String str2 = null;
            int i6 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                if (o == -1) {
                    z2 = false;
                } else if (o == 0) {
                    i4 = b.j(descriptor2, 0);
                    i5 |= 1;
                } else if (o == 1) {
                    z3 = b.D(descriptor2, 1);
                    i5 |= 2;
                } else if (o == 2) {
                    i6 = b.j(descriptor2, 2);
                    i5 |= 4;
                } else {
                    if (o != 3) {
                        throw new UnknownFieldException(o);
                    }
                    str2 = (String) b.g(descriptor2, 3, l48.a, str2);
                    i5 |= 8;
                }
            }
            i = i4;
            i2 = i6;
            z = z3;
            i3 = i5;
            str = str2;
        }
        b.c(descriptor2);
        return new CrosswordPuzzleState(i3, i, z, i2, str, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CrosswordPuzzleState crosswordPuzzleState) {
        zq3.h(encoder, "encoder");
        zq3.h(crosswordPuzzleState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CrosswordPuzzleState.d(crosswordPuzzleState, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

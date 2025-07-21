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
public final class CrosswordPuzzleProgressData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final CrosswordPuzzleProgressData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CrosswordPuzzleProgressData$$serializer crosswordPuzzleProgressData$$serializer = new CrosswordPuzzleProgressData$$serializer();
        INSTANCE = crosswordPuzzleProgressData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.features.games.gameshub.progress.api.CrosswordPuzzleProgressData", crosswordPuzzleProgressData$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("puzzle_id", false);
        pluginGeneratedSerialDescriptor.l("last_modified", false);
        pluginGeneratedSerialDescriptor.l("percent_filled", false);
        pluginGeneratedSerialDescriptor.l("print_date", false);
        pluginGeneratedSerialDescriptor.l("solved", false);
        pluginGeneratedSerialDescriptor.l("star", false);
        pluginGeneratedSerialDescriptor.l("completion_time", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrosswordPuzzleProgressData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        en3 en3Var = en3.a;
        l48 l48Var = l48.a;
        return new KSerializer[]{en3Var, l48Var, en3Var, l48Var, za0.a, l48Var, en3Var};
    }

    @Override // defpackage.ym1
    public CrosswordPuzzleProgressData deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        boolean z;
        int i3;
        String str3;
        int i4;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            String n = b.n(descriptor2, 1);
            int j2 = b.j(descriptor2, 2);
            String n2 = b.n(descriptor2, 3);
            boolean D = b.D(descriptor2, 4);
            String n3 = b.n(descriptor2, 5);
            i = j;
            i2 = b.j(descriptor2, 6);
            str = n3;
            str2 = n2;
            z = D;
            i3 = j2;
            str3 = n;
            i4 = 127;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z2 = true;
            int i5 = 0;
            int i6 = 0;
            boolean z3 = false;
            int i7 = 0;
            int i8 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        i5 = b.j(descriptor2, 0);
                        i8 |= 1;
                        continue;
                    case 1:
                        str6 = b.n(descriptor2, 1);
                        i8 |= 2;
                        break;
                    case 2:
                        i7 = b.j(descriptor2, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        str5 = b.n(descriptor2, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        z3 = b.D(descriptor2, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        str4 = b.n(descriptor2, 5);
                        i8 |= 32;
                        break;
                    case 6:
                        i6 = b.j(descriptor2, 6);
                        i8 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i5;
            i2 = i6;
            str = str4;
            str2 = str5;
            z = z3;
            i3 = i7;
            str3 = str6;
            i4 = i8;
        }
        b.c(descriptor2);
        return new CrosswordPuzzleProgressData(i4, i, str3, i3, str2, z, str, i2, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, CrosswordPuzzleProgressData crosswordPuzzleProgressData) {
        zq3.h(encoder, "encoder");
        zq3.h(crosswordPuzzleProgressData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        CrosswordPuzzleProgressData.write$Self$games_hub_release(crosswordPuzzleProgressData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

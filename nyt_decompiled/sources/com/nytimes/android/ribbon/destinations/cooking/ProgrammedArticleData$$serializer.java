package com.nytimes.android.ribbon.destinations.cooking;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.he0;
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
public final class ProgrammedArticleData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final ProgrammedArticleData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProgrammedArticleData$$serializer programmedArticleData$$serializer = new ProgrammedArticleData$$serializer();
        INSTANCE = programmedArticleData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData", programmedArticleData$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("kicker", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("imageUrl", false);
        pluginGeneratedSerialDescriptor.l("credit", false);
        pluginGeneratedSerialDescriptor.l(TransferTable.COLUMN_TYPE, false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("uri", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProgrammedArticleData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), l48Var, l48Var, he0.u(l48Var), l48Var, he0.u(l48Var), l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public ProgrammedArticleData deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        String str9 = null;
        if (b.p()) {
            l48 l48Var = l48.a;
            String str10 = (String) b.g(descriptor2, 0, l48Var, null);
            String n = b.n(descriptor2, 1);
            String n2 = b.n(descriptor2, 2);
            String str11 = (String) b.g(descriptor2, 3, l48Var, null);
            String n3 = b.n(descriptor2, 4);
            String str12 = (String) b.g(descriptor2, 5, l48Var, null);
            String n4 = b.n(descriptor2, 6);
            str = str12;
            str8 = b.n(descriptor2, 7);
            str7 = n4;
            i = 255;
            str5 = str11;
            str6 = n3;
            str4 = n2;
            str3 = n;
            str2 = str10;
        } else {
            boolean z = true;
            int i4 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        str9 = (String) b.g(descriptor2, 0, l48.a, str9);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        str14 = b.n(descriptor2, 1);
                        i4 |= 2;
                    case 2:
                        str15 = b.n(descriptor2, 2);
                        i4 |= 4;
                    case 3:
                        str16 = (String) b.g(descriptor2, 3, l48.a, str16);
                        i4 |= 8;
                    case 4:
                        str17 = b.n(descriptor2, 4);
                        i4 |= 16;
                    case 5:
                        str13 = (String) b.g(descriptor2, 5, l48.a, str13);
                        i4 |= 32;
                    case 6:
                        str18 = b.n(descriptor2, i3);
                        i4 |= 64;
                    case 7:
                        str19 = b.n(descriptor2, i2);
                        i4 |= 128;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i4;
            str = str13;
            str2 = str9;
            str3 = str14;
            str4 = str15;
            str5 = str16;
            str6 = str17;
            str7 = str18;
            str8 = str19;
        }
        b.c(descriptor2);
        return new ProgrammedArticleData(i, str2, str3, str4, str5, str6, str, str7, str8, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, ProgrammedArticleData programmedArticleData) {
        zq3.h(encoder, "encoder");
        zq3.h(programmedArticleData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        ProgrammedArticleData.h(programmedArticleData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

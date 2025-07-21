package com.nytimes.android.ribbon.destinations.opinions;

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
public final class ThePointArticleData$$serializer implements jx2 {
    public static final int $stable = 0;
    public static final ThePointArticleData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ThePointArticleData$$serializer thePointArticleData$$serializer = new ThePointArticleData$$serializer();
        INSTANCE = thePointArticleData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.ribbon.destinations.opinions.ThePointArticleData", thePointArticleData$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("headline", false);
        pluginGeneratedSerialDescriptor.l("articleUrl", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("uri", false);
        pluginGeneratedSerialDescriptor.l("sectionName", false);
        pluginGeneratedSerialDescriptor.l("sectionId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ThePointArticleData$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        return new KSerializer[]{he0.u(l48Var), l48Var, he0.u(l48Var), l48Var, he0.u(l48Var), he0.u(l48Var)};
    }

    @Override // defpackage.ym1
    public ThePointArticleData deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 5;
        String str7 = null;
        if (b.p()) {
            l48 l48Var = l48.a;
            String str8 = (String) b.g(descriptor2, 0, l48Var, null);
            String n = b.n(descriptor2, 1);
            String str9 = (String) b.g(descriptor2, 2, l48Var, null);
            String n2 = b.n(descriptor2, 3);
            String str10 = (String) b.g(descriptor2, 4, l48Var, null);
            str6 = (String) b.g(descriptor2, 5, l48Var, null);
            i = 63;
            str4 = n2;
            str5 = str10;
            str3 = str9;
            str2 = n;
            str = str8;
        } else {
            boolean z = true;
            int i3 = 0;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str7 = (String) b.g(descriptor2, 0, l48.a, str7);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        str11 = b.n(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        str12 = (String) b.g(descriptor2, 2, l48.a, str12);
                        i3 |= 4;
                    case 3:
                        str13 = b.n(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        str14 = (String) b.g(descriptor2, 4, l48.a, str14);
                        i3 |= 16;
                    case 5:
                        str15 = (String) b.g(descriptor2, i2, l48.a, str15);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            str = str7;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            str5 = str14;
            str6 = str15;
        }
        b.c(descriptor2);
        return new ThePointArticleData(i, str, str2, str3, str4, str5, str6, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, ThePointArticleData thePointArticleData) {
        zq3.h(encoder, "encoder");
        zq3.h(thePointArticleData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        ThePointArticleData.a(thePointArticleData, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

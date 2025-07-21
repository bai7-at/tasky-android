package com.nytimes.android.api.config.model;

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

/* loaded from: classes3.dex */
public final class Channel$$serializer implements jx2 {
    public static final Channel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Channel$$serializer channel$$serializer = new Channel$$serializer();
        INSTANCE = channel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.api.config.model.Channel", channel$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("isDefault", true);
        pluginGeneratedSerialDescriptor.l("isHidden", true);
        pluginGeneratedSerialDescriptor.l("tag", false);
        pluginGeneratedSerialDescriptor.l("tagDescription", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("iconImageURLString", true);
        pluginGeneratedSerialDescriptor.l("iconImageNightURLString", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Channel$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        KSerializer u = he0.u(l48Var);
        KSerializer u2 = he0.u(l48Var);
        za0 za0Var = za0.a;
        return new KSerializer[]{za0Var, za0Var, l48Var, l48Var, l48Var, u, u2};
    }

    @Override // defpackage.ym1
    public Channel deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            boolean D = b.D(descriptor2, 0);
            boolean D2 = b.D(descriptor2, 1);
            String n = b.n(descriptor2, 2);
            String n2 = b.n(descriptor2, 3);
            String n3 = b.n(descriptor2, 4);
            l48 l48Var = l48.a;
            String str6 = (String) b.g(descriptor2, 5, l48Var, null);
            z = D;
            str = (String) b.g(descriptor2, 6, l48Var, null);
            str5 = str6;
            str3 = n2;
            str4 = n3;
            str2 = n;
            z2 = D2;
            i = 127;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            boolean z5 = false;
            while (z3) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        i2 |= 1;
                        z4 = b.D(descriptor2, 0);
                        continue;
                    case 1:
                        z5 = b.D(descriptor2, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        str7 = b.n(descriptor2, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str8 = b.n(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str9 = b.n(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str10 = (String) b.g(descriptor2, 5, l48.a, str10);
                        i2 |= 32;
                        break;
                    case 6:
                        str11 = (String) b.g(descriptor2, 6, l48.a, str11);
                        i2 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            z = z4;
            str = str11;
            z2 = z5;
            i = i2;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        b.c(descriptor2);
        return new Channel(i, z, z2, str2, str3, str4, str5, str, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Channel channel) {
        zq3.h(encoder, "encoder");
        zq3.h(channel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Channel.write$Self$api_lib_release(channel, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

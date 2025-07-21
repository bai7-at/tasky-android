package com.nytimes.android.api.config.model;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
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

/* loaded from: classes3.dex */
public final class RibbonConfigDTO$$serializer implements jx2 {
    public static final RibbonConfigDTO$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RibbonConfigDTO$$serializer ribbonConfigDTO$$serializer = new RibbonConfigDTO$$serializer();
        INSTANCE = ribbonConfigDTO$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.api.config.model.RibbonConfigDTO", ribbonConfigDTO$$serializer, 7);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("displayName", true);
        pluginGeneratedSerialDescriptor.l("position", false);
        pluginGeneratedSerialDescriptor.l(TransferTable.COLUMN_TYPE, false);
        pluginGeneratedSerialDescriptor.l("enabled", false);
        pluginGeneratedSerialDescriptor.l("endpoint", true);
        pluginGeneratedSerialDescriptor.l("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RibbonConfigDTO$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = RibbonConfigDTO.$childSerializers;
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, he0.u(l48Var), en3.a, kSerializerArr[3], za0.a, he0.u(kSerializerArr[5]), he0.u(l48Var)};
    }

    @Override // defpackage.ym1
    public RibbonConfigDTO deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        boolean z;
        String str;
        RibbonTabEndpoint ribbonTabEndpoint;
        int i;
        int i2;
        String str2;
        String str3;
        RibbonTabType ribbonTabType;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = RibbonConfigDTO.$childSerializers;
        int i3 = 6;
        int i4 = 4;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            l48 l48Var = l48.a;
            String str4 = (String) b.g(descriptor2, 1, l48Var, null);
            int j = b.j(descriptor2, 2);
            RibbonTabType ribbonTabType2 = (RibbonTabType) b.y(descriptor2, 3, kSerializerArr[3], null);
            boolean D = b.D(descriptor2, 4);
            ribbonTabEndpoint = (RibbonTabEndpoint) b.g(descriptor2, 5, kSerializerArr[5], null);
            str2 = n;
            str = (String) b.g(descriptor2, 6, l48Var, null);
            z = D;
            i = j;
            i2 = 127;
            ribbonTabType = ribbonTabType2;
            str3 = str4;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i5 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            RibbonTabType ribbonTabType3 = null;
            RibbonTabEndpoint ribbonTabEndpoint2 = null;
            int i6 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                    case 0:
                        str6 = b.n(descriptor2, 0);
                        i5 |= 1;
                        i3 = 6;
                        i4 = 4;
                    case 1:
                        str7 = (String) b.g(descriptor2, 1, l48.a, str7);
                        i5 |= 2;
                        i3 = 6;
                        i4 = 4;
                    case 2:
                        i6 = b.j(descriptor2, 2);
                        i5 |= 4;
                    case 3:
                        ribbonTabType3 = (RibbonTabType) b.y(descriptor2, 3, kSerializerArr[3], ribbonTabType3);
                        i5 |= 8;
                    case 4:
                        z3 = b.D(descriptor2, i4);
                        i5 |= 16;
                    case 5:
                        ribbonTabEndpoint2 = (RibbonTabEndpoint) b.g(descriptor2, 5, kSerializerArr[5], ribbonTabEndpoint2);
                        i5 |= 32;
                    case 6:
                        str5 = (String) b.g(descriptor2, i3, l48.a, str5);
                        i5 |= 64;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            z = z3;
            str = str5;
            ribbonTabEndpoint = ribbonTabEndpoint2;
            i = i6;
            i2 = i5;
            str2 = str6;
            str3 = str7;
            ribbonTabType = ribbonTabType3;
        }
        b.c(descriptor2);
        return new RibbonConfigDTO(i2, str2, str3, i, ribbonTabType, z, ribbonTabEndpoint, str, (mk7) null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, RibbonConfigDTO ribbonConfigDTO) {
        zq3.h(encoder, "encoder");
        zq3.h(ribbonConfigDTO, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        RibbonConfigDTO.write$Self$api_lib_release(ribbonConfigDTO, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

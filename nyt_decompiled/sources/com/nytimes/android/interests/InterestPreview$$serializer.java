package com.nytimes.android.interests;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.en3;
import defpackage.he0;
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
public final class InterestPreview$$serializer implements jx2 {
    public static final InterestPreview$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InterestPreview$$serializer interestPreview$$serializer = new InterestPreview$$serializer();
        INSTANCE = interestPreview$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.InterestPreview", interestPreview$$serializer, 8);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l(TransferTable.COLUMN_TYPE, false);
        pluginGeneratedSerialDescriptor.l("subtype", false);
        pluginGeneratedSerialDescriptor.l("description", false);
        pluginGeneratedSerialDescriptor.l("promoImageUrl", false);
        pluginGeneratedSerialDescriptor.l("isOpinion", true);
        pluginGeneratedSerialDescriptor.l("isEditorsPick", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InterestPreview$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        KSerializer u = he0.u(l48Var);
        za0 za0Var = za0.a;
        return new KSerializer[]{en3.a, l48Var, l48Var, u, l48Var, l48Var, za0Var, za0Var};
    }

    @Override // defpackage.ym1
    public InterestPreview deserialize(Decoder decoder) {
        int i;
        String str;
        boolean z;
        boolean z2;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        if (b.p()) {
            int j = b.j(descriptor2, 0);
            String n = b.n(descriptor2, 1);
            String n2 = b.n(descriptor2, 2);
            String str6 = (String) b.g(descriptor2, 3, l48.a, null);
            String n3 = b.n(descriptor2, 4);
            String n4 = b.n(descriptor2, 5);
            boolean D = b.D(descriptor2, 6);
            i = j;
            z = b.D(descriptor2, 7);
            z2 = D;
            str5 = n4;
            str = str6;
            str4 = n3;
            str3 = n2;
            str2 = n;
            i2 = 255;
        } else {
            boolean z3 = true;
            int i3 = 0;
            boolean z4 = false;
            int i4 = 0;
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
                        i4 |= 1;
                        i3 = b.j(descriptor2, 0);
                        continue;
                    case 1:
                        str7 = b.n(descriptor2, 1);
                        i4 |= 2;
                        continue;
                    case 2:
                        str8 = b.n(descriptor2, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        str11 = (String) b.g(descriptor2, 3, l48.a, str11);
                        i4 |= 8;
                        break;
                    case 4:
                        str9 = b.n(descriptor2, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str10 = b.n(descriptor2, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        z4 = b.D(descriptor2, 6);
                        i4 |= 64;
                        break;
                    case 7:
                        z5 = b.D(descriptor2, 7);
                        i4 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i3;
            str = str11;
            z = z5;
            z2 = z4;
            i2 = i4;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        b.c(descriptor2);
        return new InterestPreview(i2, i, str2, str3, str, str4, str5, z2, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, InterestPreview interestPreview) {
        zq3.h(encoder, "encoder");
        zq3.h(interestPreview, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        InterestPreview.h(interestPreview, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

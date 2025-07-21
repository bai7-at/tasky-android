package com.nytimes.android.interests.db;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.interests.db.Interest;
import defpackage.he0;
import defpackage.jx2;
import defpackage.l48;
import defpackage.za0;
import defpackage.zq3;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final class Interest$ColumnInterest$$serializer implements jx2 {
    public static final Interest$ColumnInterest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Interest$ColumnInterest$$serializer interest$ColumnInterest$$serializer = new Interest$ColumnInterest$$serializer();
        INSTANCE = interest$ColumnInterest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.Interest.ColumnInterest", interest$ColumnInterest$$serializer, 11);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l("toneName", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("uri", false);
        pluginGeneratedSerialDescriptor.l("legacy_collection_type", false);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.l("showPicture", false);
        pluginGeneratedSerialDescriptor.l("promotionalMedia", false);
        pluginGeneratedSerialDescriptor.l("promotionalHeadline", false);
        pluginGeneratedSerialDescriptor.l("promotionalExcerpt", false);
        pluginGeneratedSerialDescriptor.l("assets", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Interest$ColumnInterest$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Interest.ColumnInterest.m;
        KSerializer u = he0.u(PromotionalMedia$$serializer.INSTANCE);
        KSerializer kSerializer = kSerializerArr[10];
        l48 l48Var = l48.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, l48Var, l48Var, l48Var, za0.a, u, l48Var, l48Var, kSerializer};
    }

    @Override // defpackage.ym1
    public Interest.ColumnInterest deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        boolean z;
        List list;
        PromotionalMedia promotionalMedia;
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
        kSerializerArr = Interest.ColumnInterest.m;
        int i2 = 9;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            String n4 = b.n(descriptor2, 3);
            String n5 = b.n(descriptor2, 4);
            String n6 = b.n(descriptor2, 5);
            boolean D = b.D(descriptor2, 6);
            PromotionalMedia promotionalMedia2 = (PromotionalMedia) b.g(descriptor2, 7, PromotionalMedia$$serializer.INSTANCE, null);
            String n7 = b.n(descriptor2, 8);
            String n8 = b.n(descriptor2, 9);
            list = (List) b.y(descriptor2, 10, kSerializerArr[10], null);
            str = n;
            str8 = n8;
            promotionalMedia = promotionalMedia2;
            z = D;
            str6 = n6;
            str4 = n4;
            str7 = n7;
            str5 = n5;
            str3 = n3;
            i = 2047;
            str2 = n2;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            List list2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            PromotionalMedia promotionalMedia3 = null;
            int i3 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i2 = 9;
                    case 0:
                        str9 = b.n(descriptor2, 0);
                        i3 |= 1;
                        i2 = 9;
                    case 1:
                        str10 = b.n(descriptor2, 1);
                        i3 |= 2;
                        i2 = 9;
                    case 2:
                        str11 = b.n(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        str12 = b.n(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        str13 = b.n(descriptor2, 4);
                        i3 |= 16;
                    case 5:
                        str14 = b.n(descriptor2, 5);
                        i3 |= 32;
                    case 6:
                        z3 = b.D(descriptor2, 6);
                        i3 |= 64;
                    case 7:
                        promotionalMedia3 = (PromotionalMedia) b.g(descriptor2, 7, PromotionalMedia$$serializer.INSTANCE, promotionalMedia3);
                        i3 |= 128;
                    case 8:
                        str15 = b.n(descriptor2, 8);
                        i3 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    case 9:
                        str16 = b.n(descriptor2, i2);
                        i3 |= 512;
                    case 10:
                        list2 = (List) b.y(descriptor2, 10, kSerializerArr[10], list2);
                        i3 |= 1024;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            z = z3;
            list = list2;
            promotionalMedia = promotionalMedia3;
            i = i3;
            str = str9;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            str8 = str16;
        }
        b.c(descriptor2);
        return new Interest.ColumnInterest(i, str, str2, str3, str4, str5, str6, z, promotionalMedia, str7, str8, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Interest.ColumnInterest columnInterest) {
        zq3.h(encoder, "encoder");
        zq3.h(columnInterest, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Interest.ColumnInterest.f(columnInterest, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

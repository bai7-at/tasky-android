package com.nytimes.android.interests.db;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.he0;
import defpackage.ib4;
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
public final class InterestArticleAsset$$serializer implements jx2 {
    public static final InterestArticleAsset$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InterestArticleAsset$$serializer interestArticleAsset$$serializer = new InterestArticleAsset$$serializer();
        INSTANCE = interestArticleAsset$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.interests.db.InterestArticleAsset", interestArticleAsset$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("uri", false);
        pluginGeneratedSerialDescriptor.l("url", false);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("asset_type", false);
        pluginGeneratedSerialDescriptor.l("promoMedia", false);
        pluginGeneratedSerialDescriptor.l("lastModified", false);
        pluginGeneratedSerialDescriptor.l("lastMajorModified", false);
        pluginGeneratedSerialDescriptor.l("isOpinion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InterestArticleAsset$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer u = he0.u(PromotionalMedia$$serializer.INSTANCE);
        l48 l48Var = l48.a;
        ib4 ib4Var = ib4.a;
        return new KSerializer[]{l48Var, l48Var, l48Var, l48Var, l48Var, u, ib4Var, ib4Var, za0.a};
    }

    @Override // defpackage.ym1
    public InterestArticleAsset deserialize(Decoder decoder) {
        boolean z;
        int i;
        PromotionalMedia promotionalMedia;
        String str;
        long j;
        long j2;
        String str2;
        String str3;
        String str4;
        String str5;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i2 = 7;
        String str6 = null;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            String n3 = b.n(descriptor2, 2);
            String n4 = b.n(descriptor2, 3);
            String n5 = b.n(descriptor2, 4);
            PromotionalMedia promotionalMedia2 = (PromotionalMedia) b.g(descriptor2, 5, PromotionalMedia$$serializer.INSTANCE, null);
            long f = b.f(descriptor2, 6);
            str = n;
            j = b.f(descriptor2, 7);
            promotionalMedia = promotionalMedia2;
            str4 = n4;
            z = b.D(descriptor2, 8);
            str5 = n5;
            str3 = n3;
            str2 = n2;
            j2 = f;
            i = 511;
        } else {
            long j3 = 0;
            boolean z2 = true;
            boolean z3 = false;
            int i3 = 0;
            PromotionalMedia promotionalMedia3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            long j4 = 0;
            while (z2) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                    case 0:
                        i3 |= 1;
                        str6 = b.n(descriptor2, 0);
                        i2 = 7;
                    case 1:
                        str7 = b.n(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str8 = b.n(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        str9 = b.n(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        str10 = b.n(descriptor2, 4);
                        i3 |= 16;
                    case 5:
                        promotionalMedia3 = (PromotionalMedia) b.g(descriptor2, 5, PromotionalMedia$$serializer.INSTANCE, promotionalMedia3);
                        i3 |= 32;
                    case 6:
                        j4 = b.f(descriptor2, 6);
                        i3 |= 64;
                    case 7:
                        j3 = b.f(descriptor2, i2);
                        i3 |= 128;
                    case 8:
                        z3 = b.D(descriptor2, 8);
                        i3 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            z = z3;
            i = i3;
            promotionalMedia = promotionalMedia3;
            str = str6;
            j = j3;
            j2 = j4;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        b.c(descriptor2);
        return new InterestArticleAsset(i, str, str2, str3, str4, str5, promotionalMedia, j2, j, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, InterestArticleAsset interestArticleAsset) {
        zq3.h(encoder, "encoder");
        zq3.h(interestArticleAsset, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        InterestArticleAsset.s(interestArticleAsset, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

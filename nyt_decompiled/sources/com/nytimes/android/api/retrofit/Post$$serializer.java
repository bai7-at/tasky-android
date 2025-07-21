package com.nytimes.android.api.retrofit;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.en3;
import defpackage.he0;
import defpackage.ib4;
import defpackage.jx2;
import defpackage.l48;
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

/* loaded from: classes3.dex */
public final class Post$$serializer implements jx2 {
    public static final Post$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Post$$serializer post$$serializer = new Post$$serializer();
        INSTANCE = post$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("posts", post$$serializer, 12);
        pluginGeneratedSerialDescriptor.l("id", false);
        pluginGeneratedSerialDescriptor.l(AuthenticationTokenClaims.JSON_KEY_NAME, true);
        pluginGeneratedSerialDescriptor.l("byline", false);
        pluginGeneratedSerialDescriptor.l("cooking_time", false);
        pluginGeneratedSerialDescriptor.l("image_crops", false);
        pluginGeneratedSerialDescriptor.l("image_credit", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("url", true);
        pluginGeneratedSerialDescriptor.l("avg_rating", false);
        pluginGeneratedSerialDescriptor.l("num_ratings", false);
        pluginGeneratedSerialDescriptor.l("post_type", false);
        pluginGeneratedSerialDescriptor.l("cards", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Post$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Post.m;
        KSerializer u = he0.u(ib4.a);
        l48 l48Var = l48.a;
        KSerializer u2 = he0.u(l48Var);
        KSerializer u3 = he0.u(l48Var);
        KSerializer u4 = he0.u(kSerializerArr[4]);
        KSerializer u5 = he0.u(l48Var);
        KSerializer u6 = he0.u(l48Var);
        en3 en3Var = en3.a;
        return new KSerializer[]{u, l48Var, u2, u3, u4, u5, u6, l48Var, he0.u(en3Var), he0.u(en3Var), l48Var, he0.u(kSerializerArr[11])};
    }

    @Override // defpackage.ym1
    public Post deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Long l;
        List list;
        Integer num;
        Integer num2;
        String str;
        List list2;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        char c;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        kSerializerArr = Post.m;
        int i2 = 9;
        if (b.p()) {
            Long l2 = (Long) b.g(descriptor2, 0, ib4.a, null);
            String n = b.n(descriptor2, 1);
            l48 l48Var = l48.a;
            String str8 = (String) b.g(descriptor2, 2, l48Var, null);
            String str9 = (String) b.g(descriptor2, 3, l48Var, null);
            List list3 = (List) b.g(descriptor2, 4, kSerializerArr[4], null);
            String str10 = (String) b.g(descriptor2, 5, l48Var, null);
            String str11 = (String) b.g(descriptor2, 6, l48Var, null);
            String n2 = b.n(descriptor2, 7);
            en3 en3Var = en3.a;
            Integer num3 = (Integer) b.g(descriptor2, 8, en3Var, null);
            Integer num4 = (Integer) b.g(descriptor2, 9, en3Var, null);
            String n3 = b.n(descriptor2, 10);
            list = (List) b.g(descriptor2, 11, kSerializerArr[11], null);
            l = l2;
            list2 = list3;
            num = num4;
            str6 = n2;
            str2 = str11;
            str = str10;
            str3 = str9;
            num2 = num3;
            str4 = str8;
            i = 4095;
            str7 = n3;
            str5 = n;
        } else {
            int i3 = 11;
            Long l3 = null;
            List list4 = null;
            Integer num5 = null;
            Integer num6 = null;
            String str12 = null;
            List list5 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            boolean z = true;
            String str17 = null;
            int i4 = 0;
            String str18 = null;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i2 = 9;
                    case 0:
                        l3 = (Long) b.g(descriptor2, 0, ib4.a, l3);
                        i4 |= 1;
                        i3 = 11;
                        i2 = 9;
                    case 1:
                        str14 = b.n(descriptor2, 1);
                        i4 |= 2;
                        i3 = 11;
                        i2 = 9;
                    case 2:
                        str18 = (String) b.g(descriptor2, 2, l48.a, str18);
                        i4 |= 4;
                        i3 = 11;
                        i2 = 9;
                    case 3:
                        str17 = (String) b.g(descriptor2, 3, l48.a, str17);
                        i4 |= 8;
                        i3 = 11;
                        i2 = 9;
                    case 4:
                        list5 = (List) b.g(descriptor2, 4, kSerializerArr[4], list5);
                        i4 |= 16;
                        i3 = 11;
                        i2 = 9;
                    case 5:
                        str12 = (String) b.g(descriptor2, 5, l48.a, str12);
                        i4 |= 32;
                        i3 = 11;
                        i2 = 9;
                    case 6:
                        str13 = (String) b.g(descriptor2, 6, l48.a, str13);
                        i4 |= 64;
                        i3 = 11;
                        i2 = 9;
                    case 7:
                        c = '\b';
                        str15 = b.n(descriptor2, 7);
                        i4 |= 128;
                        i3 = 11;
                        i2 = 9;
                    case 8:
                        c = '\b';
                        num6 = (Integer) b.g(descriptor2, 8, en3.a, num6);
                        i4 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                        i3 = 11;
                        i2 = 9;
                    case 9:
                        num5 = (Integer) b.g(descriptor2, i2, en3.a, num5);
                        i4 |= 512;
                        i3 = 11;
                    case 10:
                        str16 = b.n(descriptor2, 10);
                        i4 |= 1024;
                    case 11:
                        list4 = (List) b.g(descriptor2, i3, kSerializerArr[i3], list4);
                        i4 |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            l = l3;
            list = list4;
            num = num5;
            num2 = num6;
            str = str12;
            list2 = list5;
            i = i4;
            str2 = str13;
            str3 = str17;
            str4 = str18;
            str5 = str14;
            str6 = str15;
            str7 = str16;
        }
        b.c(descriptor2);
        return new Post(i, l, str5, str4, str3, list2, str, str2, str6, num2, num, str7, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Post post) {
        zq3.h(encoder, "encoder");
        zq3.h(post, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Post.l(post, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

package com.nytimes.android.bestsellers.vo;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.en3;
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

/* loaded from: classes.dex */
public final class Book$$serializer implements jx2 {
    public static final Book$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Book$$serializer book$$serializer = new Book$$serializer();
        INSTANCE = book$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.nytimes.android.bestsellers.vo.Book", book$$serializer, 12);
        pluginGeneratedSerialDescriptor.l("title", false);
        pluginGeneratedSerialDescriptor.l("author", false);
        pluginGeneratedSerialDescriptor.l("currentRank", false);
        pluginGeneratedSerialDescriptor.l("numWeeks", false);
        pluginGeneratedSerialDescriptor.l("summary", false);
        pluginGeneratedSerialDescriptor.l("imageURL", false);
        pluginGeneratedSerialDescriptor.l("rankLastWeek", false);
        pluginGeneratedSerialDescriptor.l("firstChapterLink", false);
        pluginGeneratedSerialDescriptor.l("articleChapterLink", false);
        pluginGeneratedSerialDescriptor.l("bookReviewLink", false);
        pluginGeneratedSerialDescriptor.l("sundayReviewLink", false);
        pluginGeneratedSerialDescriptor.l("listName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Book$$serializer() {
    }

    @Override // defpackage.jx2
    public KSerializer[] childSerializers() {
        l48 l48Var = l48.a;
        KSerializer u = he0.u(l48Var);
        KSerializer u2 = he0.u(l48Var);
        en3 en3Var = en3.a;
        return new KSerializer[]{l48Var, l48Var, en3Var, en3Var, u, u2, en3Var, l48Var, l48Var, l48Var, l48Var, l48Var};
    }

    @Override // defpackage.ym1
    public Book deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        zq3.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        int i5 = 11;
        int i6 = 0;
        if (b.p()) {
            String n = b.n(descriptor2, 0);
            String n2 = b.n(descriptor2, 1);
            int j = b.j(descriptor2, 2);
            int j2 = b.j(descriptor2, 3);
            l48 l48Var = l48.a;
            String str10 = (String) b.g(descriptor2, 4, l48Var, null);
            String str11 = (String) b.g(descriptor2, 5, l48Var, null);
            int j3 = b.j(descriptor2, 6);
            String n3 = b.n(descriptor2, 7);
            String n4 = b.n(descriptor2, 8);
            String n5 = b.n(descriptor2, 9);
            String n6 = b.n(descriptor2, 10);
            str3 = n;
            str9 = b.n(descriptor2, 11);
            str8 = n6;
            str7 = n5;
            str5 = n3;
            i = j3;
            str = str11;
            i3 = j2;
            str6 = n4;
            str2 = str10;
            i4 = j;
            str4 = n2;
            i2 = 4095;
        } else {
            boolean z = true;
            int i7 = 0;
            int i8 = 0;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            int i9 = 0;
            while (z) {
                int o = b.o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i5 = 11;
                    case 0:
                        str14 = b.n(descriptor2, 0);
                        i6 |= 1;
                        i5 = 11;
                    case 1:
                        str15 = b.n(descriptor2, 1);
                        i6 |= 2;
                        i5 = 11;
                    case 2:
                        i8 = b.j(descriptor2, 2);
                        i6 |= 4;
                        i5 = 11;
                    case 3:
                        i9 = b.j(descriptor2, 3);
                        i6 |= 8;
                    case 4:
                        str13 = (String) b.g(descriptor2, 4, l48.a, str13);
                        i6 |= 16;
                    case 5:
                        str12 = (String) b.g(descriptor2, 5, l48.a, str12);
                        i6 |= 32;
                    case 6:
                        i7 = b.j(descriptor2, 6);
                        i6 |= 64;
                    case 7:
                        str16 = b.n(descriptor2, 7);
                        i6 |= 128;
                    case 8:
                        str17 = b.n(descriptor2, 8);
                        i6 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    case 9:
                        str18 = b.n(descriptor2, 9);
                        i6 |= 512;
                    case 10:
                        str19 = b.n(descriptor2, 10);
                        i6 |= 1024;
                    case 11:
                        str20 = b.n(descriptor2, i5);
                        i6 |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
                    default:
                        throw new UnknownFieldException(o);
                }
            }
            i = i7;
            str = str12;
            str2 = str13;
            i2 = i6;
            i3 = i9;
            i4 = i8;
            str3 = str14;
            str4 = str15;
            str5 = str16;
            str6 = str17;
            str7 = str18;
            str8 = str19;
            str9 = str20;
        }
        b.c(descriptor2);
        return new Book(i2, str3, str4, i4, i3, str2, str, i, str5, str6, str7, str8, str9, null);
    }

    @Override // kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.nk7
    public void serialize(Encoder encoder, Book book) {
        zq3.h(encoder, "encoder");
        zq3.h(book, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        Book.write$Self$bestsellers_release(book, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.jx2
    public KSerializer[] typeParametersSerializers() {
        return jx2.a.a(this);
    }
}

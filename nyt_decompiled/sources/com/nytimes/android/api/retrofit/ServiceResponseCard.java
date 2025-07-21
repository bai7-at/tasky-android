package com.nytimes.android.api.retrofit;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.en3;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.za0;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes3.dex */
public final class ServiceResponseCard {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] k = {null, null, null, null, new qo(ImageCrop$$serializer.INSTANCE), null, null, null, null, null};
    private final long a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final String f;
    private final Boolean g;
    private final Integer h;
    private final Integer i;
    private final String j;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ServiceResponseCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ServiceResponseCard(int i, long j, String str, String str2, String str3, List list, String str4, Boolean bool, Integer num, Integer num2, String str5, mk7 mk7Var) {
        if (95 != (i & 95)) {
            wv5.a(i, 95, ServiceResponseCard$$serializer.INSTANCE.getDescriptor());
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = str2;
        } else {
            this.f = str4;
        }
        this.g = bool;
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = num;
        }
        if ((i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0) {
            this.i = 0;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str5;
        }
    }

    public static final /* synthetic */ void j(ServiceResponseCard serviceResponseCard, d dVar, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer[] kSerializerArr = k;
        dVar.F(serialDescriptor, 0, serviceResponseCard.a);
        dVar.y(serialDescriptor, 1, serviceResponseCard.b);
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 2, l48Var, serviceResponseCard.c);
        dVar.l(serialDescriptor, 3, l48Var, serviceResponseCard.d);
        dVar.l(serialDescriptor, 4, kSerializerArr[4], serviceResponseCard.e);
        if (dVar.A(serialDescriptor, 5) || !zq3.c(serviceResponseCard.f, serviceResponseCard.c)) {
            dVar.l(serialDescriptor, 5, l48Var, serviceResponseCard.f);
        }
        dVar.l(serialDescriptor, 6, za0.a, serviceResponseCard.g);
        if (dVar.A(serialDescriptor, 7) || (num2 = serviceResponseCard.h) == null || num2.intValue() != 0) {
            dVar.l(serialDescriptor, 7, en3.a, serviceResponseCard.h);
        }
        if (dVar.A(serialDescriptor, 8) || (num = serviceResponseCard.i) == null || num.intValue() != 0) {
            dVar.l(serialDescriptor, 8, en3.a, serviceResponseCard.i);
        }
        if (!dVar.A(serialDescriptor, 9) && zq3.c(serviceResponseCard.j, "")) {
            return;
        }
        dVar.l(serialDescriptor, 9, l48Var, serviceResponseCard.j);
    }

    public final Integer b() {
        return this.h;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.j;
    }

    public final List e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceResponseCard)) {
            return false;
        }
        ServiceResponseCard serviceResponseCard = (ServiceResponseCard) obj;
        return this.a == serviceResponseCard.a && zq3.c(this.b, serviceResponseCard.b) && zq3.c(this.c, serviceResponseCard.c) && zq3.c(this.d, serviceResponseCard.d) && zq3.c(this.e, serviceResponseCard.e) && zq3.c(this.f, serviceResponseCard.f) && zq3.c(this.g, serviceResponseCard.g) && zq3.c(this.h, serviceResponseCard.h) && zq3.c(this.i, serviceResponseCard.i) && zq3.c(this.j, serviceResponseCard.j);
    }

    public final String f() {
        return this.b;
    }

    public final Integer g() {
        return this.i;
    }

    public final String h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.h;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.j;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.c;
    }

    public String toString() {
        return "ServiceResponseCard(id=" + this.a + ", name=" + this.b + ", url=" + this.c + ", byline=" + this.d + ", crops=" + this.e + ", uri=" + this.f + ", hasVideo=" + this.g + ", avgRating=" + this.h + ", numRatings=" + this.i + ", cookingTime=" + this.j + ")";
    }
}

package com.nytimes.android.ribbon.destinations.greatreads;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.en3;
import defpackage.i54;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class GreatReadsLockupData {
    public static final Companion Companion = new Companion(null);
    public static final int j = 8;
    private static final KSerializer[] k;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;
    private final String g;
    private final String h;
    private final Map i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return GreatReadsLockupData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        l48 l48Var = l48.a;
        k = new KSerializer[]{null, null, null, null, null, null, null, null, new i54(l48Var, l48Var)};
    }

    public /* synthetic */ GreatReadsLockupData(int i, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Map map, mk7 mk7Var) {
        if (19 != (i & 19)) {
            wv5.a(i, 19, GreatReadsLockupData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = map;
        }
    }

    public static final /* synthetic */ void j(GreatReadsLockupData greatReadsLockupData, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = k;
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, greatReadsLockupData.a);
        dVar.y(serialDescriptor, 1, greatReadsLockupData.b);
        if (dVar.A(serialDescriptor, 2) || greatReadsLockupData.c != null) {
            dVar.l(serialDescriptor, 2, l48Var, greatReadsLockupData.c);
        }
        if (dVar.A(serialDescriptor, 3) || greatReadsLockupData.d != null) {
            dVar.l(serialDescriptor, 3, l48Var, greatReadsLockupData.d);
        }
        dVar.l(serialDescriptor, 4, l48Var, greatReadsLockupData.e);
        if (dVar.A(serialDescriptor, 5) || greatReadsLockupData.f != null) {
            dVar.l(serialDescriptor, 5, en3.a, greatReadsLockupData.f);
        }
        if (dVar.A(serialDescriptor, 6) || greatReadsLockupData.g != null) {
            dVar.l(serialDescriptor, 6, l48Var, greatReadsLockupData.g);
        }
        if (dVar.A(serialDescriptor, 7) || greatReadsLockupData.h != null) {
            dVar.l(serialDescriptor, 7, l48Var, greatReadsLockupData.h);
        }
        if (!dVar.A(serialDescriptor, 8) && greatReadsLockupData.i == null) {
            return;
        }
        dVar.l(serialDescriptor, 8, kSerializerArr[8], greatReadsLockupData.i);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreatReadsLockupData)) {
            return false;
        }
        GreatReadsLockupData greatReadsLockupData = (GreatReadsLockupData) obj;
        return zq3.c(this.a, greatReadsLockupData.a) && zq3.c(this.b, greatReadsLockupData.b) && zq3.c(this.c, greatReadsLockupData.c) && zq3.c(this.d, greatReadsLockupData.d) && zq3.c(this.e, greatReadsLockupData.e) && zq3.c(this.f, greatReadsLockupData.f) && zq3.c(this.g, greatReadsLockupData.g) && zq3.c(this.h, greatReadsLockupData.h) && zq3.c(this.i, greatReadsLockupData.i);
    }

    public final Integer f() {
        return this.f;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map map = this.i;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final Map i() {
        return this.i;
    }

    public String toString() {
        return "GreatReadsLockupData(kicker=" + this.a + ", articleTitle=" + this.b + ", articleUrl=" + this.c + ", articleUri=" + this.d + ", imageUrl=" + this.e + ", minRead=" + this.f + ", summary=" + this.g + ", photoCredit=" + this.h + ", trackingParams=" + this.i + ")";
    }

    public GreatReadsLockupData(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Map map) {
        zq3.h(str2, "articleTitle");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = str6;
        this.h = str7;
        this.i = map;
    }
}

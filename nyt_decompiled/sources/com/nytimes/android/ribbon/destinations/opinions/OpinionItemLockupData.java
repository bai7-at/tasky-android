package com.nytimes.android.ribbon.destinations.opinions;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
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
public final class OpinionItemLockupData {
    public static final Companion Companion = new Companion(null);
    public static final int j = 8;
    private static final KSerializer[] k;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Map i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return OpinionItemLockupData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        l48 l48Var = l48.a;
        k = new KSerializer[]{null, null, null, null, null, null, null, null, new i54(l48Var, l48Var)};
    }

    public /* synthetic */ OpinionItemLockupData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, mk7 mk7Var) {
        if (31 != (i & 31)) {
            wv5.a(i, 31, OpinionItemLockupData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = map;
        }
    }

    public static final /* synthetic */ void k(OpinionItemLockupData opinionItemLockupData, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = k;
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 0, l48Var, opinionItemLockupData.a);
        dVar.y(serialDescriptor, 1, opinionItemLockupData.b);
        dVar.y(serialDescriptor, 2, opinionItemLockupData.c);
        dVar.y(serialDescriptor, 3, opinionItemLockupData.d);
        dVar.l(serialDescriptor, 4, l48Var, opinionItemLockupData.e);
        if (dVar.A(serialDescriptor, 5) || opinionItemLockupData.f != null) {
            dVar.l(serialDescriptor, 5, l48Var, opinionItemLockupData.f);
        }
        if (dVar.A(serialDescriptor, 6) || opinionItemLockupData.g != null) {
            dVar.l(serialDescriptor, 6, l48Var, opinionItemLockupData.g);
        }
        if (dVar.A(serialDescriptor, 7) || opinionItemLockupData.h != null) {
            dVar.l(serialDescriptor, 7, l48Var, opinionItemLockupData.h);
        }
        if (!dVar.A(serialDescriptor, 8) && opinionItemLockupData.i == null) {
            return;
        }
        dVar.l(serialDescriptor, 8, kSerializerArr[8], opinionItemLockupData.i);
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
        if (!(obj instanceof OpinionItemLockupData)) {
            return false;
        }
        OpinionItemLockupData opinionItemLockupData = (OpinionItemLockupData) obj;
        return zq3.c(this.a, opinionItemLockupData.a) && zq3.c(this.b, opinionItemLockupData.b) && zq3.c(this.c, opinionItemLockupData.c) && zq3.c(this.d, opinionItemLockupData.d) && zq3.c(this.e, opinionItemLockupData.e) && zq3.c(this.f, opinionItemLockupData.f) && zq3.c(this.g, opinionItemLockupData.g) && zq3.c(this.h, opinionItemLockupData.h) && zq3.c(this.i, opinionItemLockupData.i);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.i;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String i() {
        return this.f;
    }

    public final Map j() {
        return this.i;
    }

    public String toString() {
        return "OpinionItemLockupData(kicker=" + this.a + ", articleTitle=" + this.b + ", articleUrl=" + this.c + ", articleUri=" + this.d + ", imageUrl=" + this.e + ", timestamp=" + this.f + ", summary=" + this.g + ", photoCredit=" + this.h + ", trackingParams=" + this.i + ")";
    }

    public OpinionItemLockupData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map) {
        zq3.h(str2, "articleTitle");
        zq3.h(str3, "articleUrl");
        zq3.h(str4, "articleUri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = map;
    }

    public /* synthetic */ OpinionItemLockupData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : map);
    }
}

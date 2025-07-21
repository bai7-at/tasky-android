package com.nytimes.android.libs.messagingarchitecture.model;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText$$serializer;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class LegacyMessage {
    public static final Companion Companion = new Companion(null);
    public static final int t = 8;
    private static final KSerializer[] u = {null, null, null, null, null, null, null, null, null, null, new qo(StyledText$$serializer.INSTANCE), null, null, null, null, null, null, null, null};
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final MessageProperties f;
    private final int g;
    private final MessageProperties h;
    private final MessageProperties i;
    private final boolean j;
    private final List k;
    private final String l;
    private final MessageProperties m;
    private final boolean n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final MessageTarget s;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return LegacyMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LegacyMessage(int i, String str, String str2, String str3, int i2, String str4, MessageProperties messageProperties, int i3, MessageProperties messageProperties2, MessageProperties messageProperties3, boolean z, List list, String str5, MessageProperties messageProperties4, boolean z2, String str6, String str7, String str8, String str9, MessageTarget messageTarget, mk7 mk7Var) {
        if (524287 != (i & 524287)) {
            wv5.a(i, 524287, LegacyMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        this.f = messageProperties;
        this.g = i3;
        this.h = messageProperties2;
        this.i = messageProperties3;
        this.j = z;
        this.k = list;
        this.l = str5;
        this.m = messageProperties4;
        this.n = z2;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = str9;
        this.s = messageTarget;
    }

    private final String v(String str) {
        return zq3.c(str, AssetConstants.ARTICLE_TYPE) ? "MobileNewsArticle" : "MobileNewsHome";
    }

    public static final /* synthetic */ void w(LegacyMessage legacyMessage, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = u;
        dVar.y(serialDescriptor, 0, legacyMessage.a);
        dVar.y(serialDescriptor, 1, legacyMessage.b);
        dVar.y(serialDescriptor, 2, legacyMessage.c);
        dVar.w(serialDescriptor, 3, legacyMessage.d);
        dVar.y(serialDescriptor, 4, legacyMessage.e);
        MessageProperties$$serializer messageProperties$$serializer = MessageProperties$$serializer.INSTANCE;
        dVar.l(serialDescriptor, 5, messageProperties$$serializer, legacyMessage.f);
        dVar.w(serialDescriptor, 6, legacyMessage.g);
        dVar.l(serialDescriptor, 7, messageProperties$$serializer, legacyMessage.h);
        dVar.l(serialDescriptor, 8, messageProperties$$serializer, legacyMessage.i);
        dVar.x(serialDescriptor, 9, legacyMessage.j);
        dVar.z(serialDescriptor, 10, kSerializerArr[10], legacyMessage.k);
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 11, l48Var, legacyMessage.l);
        dVar.l(serialDescriptor, 12, messageProperties$$serializer, legacyMessage.m);
        dVar.x(serialDescriptor, 13, legacyMessage.n);
        dVar.l(serialDescriptor, 14, l48Var, legacyMessage.o);
        dVar.l(serialDescriptor, 15, l48Var, legacyMessage.p);
        dVar.y(serialDescriptor, 16, legacyMessage.q);
        dVar.y(serialDescriptor, 17, legacyMessage.r);
        dVar.l(serialDescriptor, 18, MessageTarget$$serializer.INSTANCE, legacyMessage.s);
    }

    public final String b() {
        return this.o;
    }

    public final String c() {
        return this.p;
    }

    public final MessageProperties d() {
        return this.i;
    }

    public final String e() {
        return this.r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyMessage)) {
            return false;
        }
        LegacyMessage legacyMessage = (LegacyMessage) obj;
        return zq3.c(this.a, legacyMessage.a) && zq3.c(this.b, legacyMessage.b) && zq3.c(this.c, legacyMessage.c) && this.d == legacyMessage.d && zq3.c(this.e, legacyMessage.e) && zq3.c(this.f, legacyMessage.f) && this.g == legacyMessage.g && zq3.c(this.h, legacyMessage.h) && zq3.c(this.i, legacyMessage.i) && this.j == legacyMessage.j && zq3.c(this.k, legacyMessage.k) && zq3.c(this.l, legacyMessage.l) && zq3.c(this.m, legacyMessage.m) && this.n == legacyMessage.n && zq3.c(this.o, legacyMessage.o) && zq3.c(this.p, legacyMessage.p) && zq3.c(this.q, legacyMessage.q) && zq3.c(this.r, legacyMessage.r) && zq3.c(this.s, legacyMessage.s);
    }

    public final String f() {
        return this.q;
    }

    public final List g() {
        return this.k;
    }

    public final int h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        MessageProperties messageProperties = this.f;
        int hashCode2 = (((hashCode + (messageProperties == null ? 0 : messageProperties.hashCode())) * 31) + Integer.hashCode(this.g)) * 31;
        MessageProperties messageProperties2 = this.h;
        int hashCode3 = (hashCode2 + (messageProperties2 == null ? 0 : messageProperties2.hashCode())) * 31;
        MessageProperties messageProperties3 = this.i;
        int hashCode4 = (((((hashCode3 + (messageProperties3 == null ? 0 : messageProperties3.hashCode())) * 31) + Boolean.hashCode(this.j)) * 31) + this.k.hashCode()) * 31;
        String str = this.l;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        MessageProperties messageProperties4 = this.m;
        int hashCode6 = (((hashCode5 + (messageProperties4 == null ? 0 : messageProperties4.hashCode())) * 31) + Boolean.hashCode(this.n)) * 31;
        String str2 = this.o;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int hashCode8 = (((((hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31;
        MessageTarget messageTarget = this.s;
        return hashCode8 + (messageTarget != null ? messageTarget.hashCode() : 0);
    }

    public final boolean i() {
        return this.j;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.a;
    }

    public final String m() {
        return this.l;
    }

    public final MessageProperties n() {
        return this.m;
    }

    public final String o() {
        return this.b;
    }

    public final int p() {
        return this.d;
    }

    public final MessageProperties q() {
        return this.h;
    }

    public final MessageProperties r() {
        return this.f;
    }

    public final boolean s() {
        return this.n;
    }

    public final MessageTarget t() {
        return this.s;
    }

    public String toString() {
        return "LegacyMessage(id=" + this.a + ", messageId=" + this.b + ", historyId=" + this.c + ", orderId=" + this.d + ", context=" + this.e + ", presentationRule=" + this.f + ", cadence=" + this.g + ", placement=" + this.h + ", action=" + this.i + ", cancelable=" + this.j + ", body=" + this.k + ", kicker=" + this.l + ", mediaResource=" + this.m + ", subscriptionRequired=" + this.n + ", abTestName=" + this.o + ", abTestVariant=" + this.p + ", analyticsModuleName=" + this.q + ", analyticsLabel=" + this.r + ", targets=" + this.s + ")";
    }

    public final Message u() {
        return new Message((String) null, this.b, this.c, 100 - this.d, v(this.e), this.h, this.f, this.g, this.i, this.j, this.k, this.l, this.m, this.q, this.r, 1, (DefaultConstructorMarker) null);
    }

    public LegacyMessage(String str, String str2, String str3, int i, String str4, MessageProperties messageProperties, int i2, MessageProperties messageProperties2, MessageProperties messageProperties3, boolean z, List list, String str5, MessageProperties messageProperties4, boolean z2, String str6, String str7, String str8, String str9, MessageTarget messageTarget) {
        zq3.h(str, "id");
        zq3.h(str2, "messageId");
        zq3.h(str3, "historyId");
        zq3.h(str4, "context");
        zq3.h(list, "body");
        zq3.h(str8, "analyticsModuleName");
        zq3.h(str9, "analyticsLabel");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = messageProperties;
        this.g = i2;
        this.h = messageProperties2;
        this.i = messageProperties3;
        this.j = z;
        this.k = list;
        this.l = str5;
        this.m = messageProperties4;
        this.n = z2;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = str9;
        this.s = messageTarget;
    }
}

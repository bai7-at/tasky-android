package com.nytimes.android.libs.messagingarchitecture.model;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.a;
import com.comscore.streaming.ContentType;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText$$serializer;
import defpackage.kb5;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.z48;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@lk7
/* loaded from: classes4.dex */
public final class Message {
    public static final Companion Companion = new Companion(null);
    public static final int p = 8;
    private static final KSerializer[] q = {null, null, null, null, null, null, null, null, null, null, new qo(StyledText$$serializer.INSTANCE), null, null, null, null};
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final MessageProperties f;
    private final MessageProperties g;
    private final int h;
    private final MessageProperties i;
    private final boolean j;
    private final List k;
    private final String l;
    private final MessageProperties m;
    private final String n;
    private final String o;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Message$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Message(int i, String str, String str2, String str3, int i2, String str4, MessageProperties messageProperties, MessageProperties messageProperties2, int i3, MessageProperties messageProperties3, boolean z, List list, String str5, MessageProperties messageProperties4, String str6, String str7, mk7 mk7Var) {
        String str8;
        if (32766 != (i & 32766)) {
            wv5.a(i, 32766, Message$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            str8 = UUID.randomUUID().toString();
            zq3.g(str8, "toString(...)");
        } else {
            str8 = str;
        }
        this.a = str8;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        this.f = messageProperties;
        this.g = messageProperties2;
        this.h = i3;
        this.i = messageProperties3;
        this.j = z;
        this.k = list;
        this.l = str5;
        this.m = messageProperties4;
        this.n = str6;
        this.o = str7;
    }

    private final androidx.compose.ui.text.a d(List list, boolean z, Composer composer, int i) {
        androidx.compose.ui.text.a a;
        composer.z(116119402);
        if (b.G()) {
            b.S(116119402, i, -1, "com.nytimes.android.libs.messagingarchitecture.model.Message.convertToAnnotatedString (Models.kt:129)");
        }
        if (z) {
            composer.z(-300767211);
            a = x(list, composer, 72);
            composer.R();
        } else {
            composer.z(-300767043);
            a = z48.a(list, composer, 8);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }

    private final androidx.compose.ui.text.a x(List list, Composer composer, int i) {
        composer.z(-1745527275);
        if (b.G()) {
            b.S(-1745527275, i, -1, "com.nytimes.android.libs.messagingarchitecture.model.Message.toSingleParagraphAnnotatedString (Models.kt:137)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        composer.z(-1423383077);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StyledText styledText = (StyledText) it2.next();
            c0064a.n(kb5.b(styledText.b(), null, false, composer, 384, 1).R());
            c0064a.i(styledText.c());
            c0064a.j();
        }
        composer.R();
        androidx.compose.ui.text.a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (defpackage.zq3.c(r2, r3) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void y(com.nytimes.android.libs.messagingarchitecture.model.Message r5, kotlinx.serialization.encoding.d r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            kotlinx.serialization.KSerializer[] r0 = com.nytimes.android.libs.messagingarchitecture.model.Message.q
            r1 = 0
            boolean r2 = r6.A(r7, r1)
            if (r2 == 0) goto La
            goto L1f
        La:
            java.lang.String r2 = r5.a
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "toString(...)"
            defpackage.zq3.g(r3, r4)
            boolean r2 = defpackage.zq3.c(r2, r3)
            if (r2 != 0) goto L24
        L1f:
            java.lang.String r2 = r5.a
            r6.y(r7, r1, r2)
        L24:
            java.lang.String r1 = r5.b
            r2 = 1
            r6.y(r7, r2, r1)
            r1 = 2
            java.lang.String r2 = r5.c
            r6.y(r7, r1, r2)
            r1 = 3
            int r2 = r5.d
            r6.w(r7, r1, r2)
            r1 = 4
            java.lang.String r2 = r5.e
            r6.y(r7, r1, r2)
            com.nytimes.android.libs.messagingarchitecture.model.MessageProperties$$serializer r1 = com.nytimes.android.libs.messagingarchitecture.model.MessageProperties$$serializer.INSTANCE
            com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r2 = r5.f
            r3 = 5
            r6.l(r7, r3, r1, r2)
            r2 = 6
            com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r3 = r5.g
            r6.l(r7, r2, r1, r3)
            r2 = 7
            int r3 = r5.h
            r6.w(r7, r2, r3)
            r2 = 8
            com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r3 = r5.i
            r6.l(r7, r2, r1, r3)
            r2 = 9
            boolean r3 = r5.j
            r6.x(r7, r2, r3)
            r2 = 10
            r0 = r0[r2]
            java.util.List r3 = r5.k
            r6.z(r7, r2, r0, r3)
            l48 r0 = defpackage.l48.a
            java.lang.String r2 = r5.l
            r3 = 11
            r6.l(r7, r3, r0, r2)
            r0 = 12
            com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r2 = r5.m
            r6.l(r7, r0, r1, r2)
            r0 = 13
            java.lang.String r1 = r5.n
            r6.y(r7, r0, r1)
            r0 = 14
            java.lang.String r5 = r5.o
            r6.y(r7, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.model.Message.y(com.nytimes.android.libs.messagingarchitecture.model.Message, kotlinx.serialization.encoding.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final StyledText b() {
        Map c;
        String str;
        MessageProperties messageProperties = this.i;
        if (messageProperties == null || (c = messageProperties.c()) == null || (str = (String) c.get("title")) == null) {
            return null;
        }
        return new StyledText(str, NytTextStyle.MESSAGE_BUTTON, false, 4, (DefaultConstructorMarker) null);
    }

    public final Pair c(boolean z, Composer composer, int i) {
        Pair pair;
        composer.z(-892465343);
        if (b.G()) {
            b.S(-892465343, i, -1, "com.nytimes.android.libs.messagingarchitecture.model.Message.centerModalContent (Models.kt:110)");
        }
        List<StyledText> a1 = i.a1(this.k);
        StyledText b = b();
        StyledText styledText = null;
        for (StyledText styledText2 : a1) {
            if (styledText2.b() == NytTextStyle.MESSAGE_BUTTON) {
                a1.remove(styledText2);
                styledText = styledText2;
            }
        }
        if (b == null) {
            b = styledText;
        }
        composer.z(2103764802);
        if (b == null) {
            pair = null;
        } else {
            int i2 = (i << 3) & ContentType.LONG_FORM_ON_DEMAND;
            pair = new Pair(d(a1, z, composer, i2 | 520), d(i.e(b), z, composer, i2 | StyledText.d | 512));
        }
        composer.R();
        if (pair == null) {
            pair = new Pair(d(a1, z, composer, ((i << 3) & ContentType.LONG_FORM_ON_DEMAND) | 520), null);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return pair;
    }

    public final Message e(String str, String str2, String str3, int i, String str4, MessageProperties messageProperties, MessageProperties messageProperties2, int i2, MessageProperties messageProperties3, boolean z, List list, String str5, MessageProperties messageProperties4, String str6, String str7) {
        zq3.h(str, "id");
        zq3.h(str2, "audience");
        zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str4, "unit");
        zq3.h(list, "body");
        zq3.h(str6, "analyticsModuleName");
        zq3.h(str7, "analyticsLabel");
        return new Message(str, str2, str3, i, str4, messageProperties, messageProperties2, i2, messageProperties3, z, list, str5, messageProperties4, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return zq3.c(this.a, message.a) && zq3.c(this.b, message.b) && zq3.c(this.c, message.c) && this.d == message.d && zq3.c(this.e, message.e) && zq3.c(this.f, message.f) && zq3.c(this.g, message.g) && this.h == message.h && zq3.c(this.i, message.i) && this.j == message.j && zq3.c(this.k, message.k) && zq3.c(this.l, message.l) && zq3.c(this.m, message.m) && zq3.c(this.n, message.n) && zq3.c(this.o, message.o);
    }

    public final MessageProperties g() {
        return this.i;
    }

    public final String h() {
        return this.o;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode()) * 31;
        MessageProperties messageProperties = this.f;
        int hashCode2 = (hashCode + (messageProperties == null ? 0 : messageProperties.hashCode())) * 31;
        MessageProperties messageProperties2 = this.g;
        int hashCode3 = (((hashCode2 + (messageProperties2 == null ? 0 : messageProperties2.hashCode())) * 31) + Integer.hashCode(this.h)) * 31;
        MessageProperties messageProperties3 = this.i;
        int hashCode4 = (((((hashCode3 + (messageProperties3 == null ? 0 : messageProperties3.hashCode())) * 31) + Boolean.hashCode(this.j)) * 31) + this.k.hashCode()) * 31;
        String str = this.l;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        MessageProperties messageProperties4 = this.m;
        return ((((hashCode5 + (messageProperties4 != null ? messageProperties4.hashCode() : 0)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final String i() {
        return this.n;
    }

    public final String j() {
        return this.b;
    }

    public final List k() {
        return this.k;
    }

    public final int l() {
        return this.h;
    }

    public final boolean m() {
        return this.j;
    }

    public final String n() {
        return this.a;
    }

    public final String o() {
        return this.l;
    }

    public final MessageProperties p() {
        return this.m;
    }

    public final String q() {
        return this.c;
    }

    public final MessageProperties r() {
        return this.f;
    }

    public final MessageProperties s() {
        return this.g;
    }

    public final String t() {
        return this.e;
    }

    public String toString() {
        return "Message(id=" + this.a + ", audience=" + this.b + ", name=" + this.c + ", weight=" + this.d + ", unit=" + this.e + ", placement=" + this.f + ", presentationRule=" + this.g + ", cadence=" + this.h + ", action=" + this.i + ", cancelable=" + this.j + ", body=" + this.k + ", kicker=" + this.l + ", mediaResource=" + this.m + ", analyticsModuleName=" + this.n + ", analyticsLabel=" + this.o + ")";
    }

    public final int u() {
        return this.d;
    }

    public final String v() {
        Map c;
        Map c2;
        String str;
        MessageProperties messageProperties = this.m;
        if (messageProperties != null && (c2 = messageProperties.c()) != null && (str = (String) c2.get("resource.bundled.name")) != null) {
            return str;
        }
        MessageProperties messageProperties2 = this.m;
        if (messageProperties2 == null || (c = messageProperties2.c()) == null) {
            return null;
        }
        return (String) c.get("bundled");
    }

    public final androidx.compose.ui.text.a w(boolean z, Composer composer, int i) {
        composer.z(80628304);
        if (b.G()) {
            b.S(80628304, i, -1, "com.nytimes.android.libs.messagingarchitecture.model.Message.styledBody (Models.kt:103)");
        }
        androidx.compose.ui.text.a d = d(this.k, z, composer, ((i << 3) & ContentType.LONG_FORM_ON_DEMAND) | 520);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d;
    }

    public Message(String str, String str2, String str3, int i, String str4, MessageProperties messageProperties, MessageProperties messageProperties2, int i2, MessageProperties messageProperties3, boolean z, List list, String str5, MessageProperties messageProperties4, String str6, String str7) {
        zq3.h(str, "id");
        zq3.h(str2, "audience");
        zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str4, "unit");
        zq3.h(list, "body");
        zq3.h(str6, "analyticsModuleName");
        zq3.h(str7, "analyticsLabel");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = messageProperties;
        this.g = messageProperties2;
        this.h = i2;
        this.i = messageProperties3;
        this.j = z;
        this.k = list;
        this.l = str5;
        this.m = messageProperties4;
        this.n = str6;
        this.o = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Message(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r24, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r25, int r26, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r27, boolean r28, java.util.List r29, java.lang.String r30, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r31, java.lang.String r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34 & 1
            if (r0 == 0) goto L13
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            defpackage.zq3.g(r0, r1)
            r3 = r0
            goto L15
        L13:
            r3 = r19
        L15:
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.model.Message.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties, int, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties, boolean, java.util.List, java.lang.String, com.nytimes.android.libs.messagingarchitecture.model.MessageProperties, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

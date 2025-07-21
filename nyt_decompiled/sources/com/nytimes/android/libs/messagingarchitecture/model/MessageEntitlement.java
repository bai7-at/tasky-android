package com.nytimes.android.libs.messagingarchitecture.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class MessageEntitlement {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final boolean b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return MessageEntitlement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageEntitlement(int i, String str, boolean z, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, MessageEntitlement$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = z;
    }

    public static final /* synthetic */ void c(MessageEntitlement messageEntitlement, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, messageEntitlement.a);
        dVar.x(serialDescriptor, 1, messageEntitlement.b);
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageEntitlement)) {
            return false;
        }
        MessageEntitlement messageEntitlement = (MessageEntitlement) obj;
        return zq3.c(this.a, messageEntitlement.a) && this.b == messageEntitlement.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "MessageEntitlement(name=" + this.a + ", subscribed=" + this.b + ")";
    }

    public MessageEntitlement(String str, boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = z;
    }
}

package com.nytimes.android.libs.messagingarchitecture.model;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition;
import com.nytimes.android.logging.NYTLogger;
import defpackage.i54;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qb0;
import defpackage.si0;
import defpackage.tn8;
import defpackage.wn8;
import defpackage.wv5;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class MessageProperties {
    public static final Companion Companion = new Companion(null);
    public static final int c = 8;
    private static final KSerializer[] d;
    private final String a;
    private final Map b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return MessageProperties$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        l48 l48Var = l48.a;
        d = new KSerializer[]{null, new i54(l48Var, l48Var)};
    }

    public /* synthetic */ MessageProperties(int i, String str, Map map, mk7 mk7Var) {
        if (1 != (i & 1)) {
            wv5.a(i, 1, MessageProperties$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = t.i();
        } else {
            this.b = map;
        }
    }

    private final a e() {
        try {
            String str = (String) this.b.get("identifier");
            if (str == null) {
                str = (String) t.j(this.b, "item");
            }
            String str2 = (String) t.j(a.Companion.a(), str);
            if (zq3.c(this.a, "tabBarModal")) {
                return new tn8(TooltipArrowPosition.BOTTOM, str2);
            }
            String str3 = this.a;
            return new wn8(zq3.c(str3, "topBar") ? TooltipArrowPosition.TOP : zq3.c(str3, "inline") ? TooltipArrowPosition.NONE : TooltipArrowPosition.BOTTOM, str2);
        } catch (Exception e) {
            NYTLogger.i(e, "Failed decode placement from: " + this, new Object[0]);
            return null;
        }
    }

    public static final /* synthetic */ void f(MessageProperties messageProperties, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = d;
        dVar.y(serialDescriptor, 0, messageProperties.a);
        if (!dVar.A(serialDescriptor, 1) && zq3.c(messageProperties.b, t.i())) {
            return;
        }
        dVar.z(serialDescriptor, 1, kSerializerArr[1], messageProperties.b);
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.b;
    }

    public final a d() {
        String str = this.a;
        return zq3.c(str, "centerModal") ? si0.a : zq3.c(str, "bottomSheet") ? qb0.a : e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageProperties)) {
            return false;
        }
        MessageProperties messageProperties = (MessageProperties) obj;
        return zq3.c(this.a, messageProperties.a) && zq3.c(this.b, messageProperties.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MessageProperties(name=" + this.a + ", properties=" + this.b + ")";
    }

    public MessageProperties(String str, Map map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "properties");
        this.a = str;
        this.b = map;
    }

    public /* synthetic */ MessageProperties(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? t.i() : map);
    }
}

package com.nytimes.android.push;

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
public final class NotificationsGroupItems {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] c = {null, new qo(NotificationsChannel$$serializer.INSTANCE)};
    private final String a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return NotificationsGroupItems$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotificationsGroupItems(int i, String str, List list, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, NotificationsGroupItems$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = list;
    }

    public static /* synthetic */ NotificationsGroupItems c(NotificationsGroupItems notificationsGroupItems, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationsGroupItems.a;
        }
        if ((i & 2) != 0) {
            list = notificationsGroupItems.b;
        }
        return notificationsGroupItems.b(str, list);
    }

    public static final /* synthetic */ void f(NotificationsGroupItems notificationsGroupItems, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = c;
        dVar.y(serialDescriptor, 0, notificationsGroupItems.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], notificationsGroupItems.b);
    }

    public final NotificationsGroupItems b(String str, List list) {
        zq3.h(str, "groupTitle");
        zq3.h(list, "channels");
        return new NotificationsGroupItems(str, list);
    }

    public final List d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGroupItems)) {
            return false;
        }
        NotificationsGroupItems notificationsGroupItems = (NotificationsGroupItems) obj;
        return zq3.c(this.a, notificationsGroupItems.a) && zq3.c(this.b, notificationsGroupItems.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "NotificationsGroupItems(groupTitle=" + this.a + ", channels=" + this.b + ")";
    }

    public NotificationsGroupItems(String str, List list) {
        zq3.h(str, "groupTitle");
        zq3.h(list, "channels");
        this.a = str;
        this.b = list;
    }
}

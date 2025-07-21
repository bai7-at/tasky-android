package com.nytimes.android.features.games.gameshub.configuration.models;

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
public final class NytGameLayout {
    public static final Companion Companion = new Companion(null);
    public static final int d = 8;
    private static final KSerializer[] e = {new qo(PlayTabHeader$$serializer.INSTANCE), new qo(PlayTabFooter$$serializer.INSTANCE), new qo(PlayTabSection$$serializer.INSTANCE)};
    private final List a;
    private final List b;
    private final List c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return NytGameLayout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NytGameLayout(int i, List list, List list2, List list3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, NytGameLayout$$serializer.INSTANCE.getDescriptor());
        }
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static final /* synthetic */ void e(NytGameLayout nytGameLayout, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.z(serialDescriptor, 0, kSerializerArr[0], nytGameLayout.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], nytGameLayout.b);
        dVar.z(serialDescriptor, 2, kSerializerArr[2], nytGameLayout.c);
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    public final List d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NytGameLayout)) {
            return false;
        }
        NytGameLayout nytGameLayout = (NytGameLayout) obj;
        return zq3.c(this.a, nytGameLayout.a) && zq3.c(this.b, nytGameLayout.b) && zq3.c(this.c, nytGameLayout.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "NytGameLayout(header=" + this.a + ", footer=" + this.b + ", sections=" + this.c + ")";
    }
}

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
public final class NytGamesConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final int c = 8;
    private static final KSerializer[] d = {null, new qo(NytGameCardEntity$$serializer.INSTANCE)};
    private final NytGameLayout a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return NytGamesConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NytGamesConfiguration(int i, NytGameLayout nytGameLayout, List list, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, NytGamesConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.a = nytGameLayout;
        this.b = list;
    }

    public static final /* synthetic */ void d(NytGamesConfiguration nytGamesConfiguration, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = d;
        dVar.z(serialDescriptor, 0, NytGameLayout$$serializer.INSTANCE, nytGamesConfiguration.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], nytGamesConfiguration.b);
    }

    public final List b() {
        return this.b;
    }

    public final NytGameLayout c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NytGamesConfiguration)) {
            return false;
        }
        NytGamesConfiguration nytGamesConfiguration = (NytGamesConfiguration) obj;
        return zq3.c(this.a, nytGamesConfiguration.a) && zq3.c(this.b, nytGamesConfiguration.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "NytGamesConfiguration(layout=" + this.a + ", data=" + this.b + ")";
    }
}

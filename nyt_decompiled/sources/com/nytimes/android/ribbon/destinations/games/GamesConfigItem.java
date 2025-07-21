package com.nytimes.android.ribbon.destinations.games;

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
public final class GamesConfigItem {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final int b;
    private final String c;
    private final String d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return GamesConfigItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GamesConfigItem(int i, String str, int i2, String str2, String str3, mk7 mk7Var) {
        if (15 != (i & 15)) {
            wv5.a(i, 15, GamesConfigItem$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
    }

    public static final /* synthetic */ void e(GamesConfigItem gamesConfigItem, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, gamesConfigItem.a);
        dVar.w(serialDescriptor, 1, gamesConfigItem.b);
        dVar.y(serialDescriptor, 2, gamesConfigItem.c);
        dVar.y(serialDescriptor, 3, gamesConfigItem.d);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesConfigItem)) {
            return false;
        }
        GamesConfigItem gamesConfigItem = (GamesConfigItem) obj;
        return zq3.c(this.a, gamesConfigItem.a) && this.b == gamesConfigItem.b && zq3.c(this.c, gamesConfigItem.c) && zq3.c(this.d, gamesConfigItem.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "GamesConfigItem(id=" + this.a + ", rank=" + this.b + ", headline=" + this.c + ", url=" + this.d + ")";
    }
}

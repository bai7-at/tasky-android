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
public final class GamesDestinationItem {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final int e;
    private final String f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return GamesDestinationItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GamesDestinationItem(int i, String str, int i2, String str2, String str3, int i3, String str4, mk7 mk7Var) {
        if (63 != (i & 63)) {
            wv5.a(i, 63, GamesDestinationItem$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = i3;
        this.f = str4;
    }

    public static final /* synthetic */ void g(GamesDestinationItem gamesDestinationItem, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, gamesDestinationItem.a);
        dVar.w(serialDescriptor, 1, gamesDestinationItem.b);
        dVar.y(serialDescriptor, 2, gamesDestinationItem.c);
        dVar.y(serialDescriptor, 3, gamesDestinationItem.d);
        dVar.w(serialDescriptor, 4, gamesDestinationItem.e);
        dVar.y(serialDescriptor, 5, gamesDestinationItem.f);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesDestinationItem)) {
            return false;
        }
        GamesDestinationItem gamesDestinationItem = (GamesDestinationItem) obj;
        return zq3.c(this.a, gamesDestinationItem.a) && this.b == gamesDestinationItem.b && zq3.c(this.c, gamesDestinationItem.c) && zq3.c(this.d, gamesDestinationItem.d) && this.e == gamesDestinationItem.e && zq3.c(this.f, gamesDestinationItem.f);
    }

    public final String f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "GamesDestinationItem(id=" + this.a + ", rank=" + this.b + ", headline=" + this.c + ", label=" + this.d + ", image=" + this.e + ", url=" + this.f + ")";
    }

    public GamesDestinationItem(String str, int i, String str2, String str3, int i2, String str4) {
        zq3.h(str, "id");
        zq3.h(str2, "headline");
        zq3.h(str3, "label");
        zq3.h(str4, "url");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = str4;
    }
}

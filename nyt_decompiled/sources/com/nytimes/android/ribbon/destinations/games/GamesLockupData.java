package com.nytimes.android.ribbon.destinations.games;

import com.nytimes.android.api.cms.Asset;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import defpackage.zt6;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class GamesLockupData {
    public static final Companion Companion = new Companion(null);
    public static final int g = 8;
    private static final KSerializer[] h = {new PolymorphicSerializer(zt6.b(Asset.class), new Annotation[0]), null, null, null, null, null};
    private final Asset a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return GamesLockupData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GamesLockupData(int i, Asset asset, String str, String str2, String str3, String str4, String str5, mk7 mk7Var) {
        if (63 != (i & 63)) {
            wv5.a(i, 63, GamesLockupData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = asset;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public static final /* synthetic */ void g(GamesLockupData gamesLockupData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.z(serialDescriptor, 0, h[0], gamesLockupData.a);
        dVar.l(serialDescriptor, 1, l48.a, gamesLockupData.b);
        dVar.y(serialDescriptor, 2, gamesLockupData.c);
        dVar.y(serialDescriptor, 3, gamesLockupData.d);
        dVar.y(serialDescriptor, 4, gamesLockupData.e);
        dVar.y(serialDescriptor, 5, gamesLockupData.f);
    }

    public final Asset b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesLockupData)) {
            return false;
        }
        GamesLockupData gamesLockupData = (GamesLockupData) obj;
        return zq3.c(this.a, gamesLockupData.a) && zq3.c(this.b, gamesLockupData.b) && zq3.c(this.c, gamesLockupData.c) && zq3.c(this.d, gamesLockupData.d) && zq3.c(this.e, gamesLockupData.e) && zq3.c(this.f, gamesLockupData.f);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "GamesLockupData(asset=" + this.a + ", imageUrl=" + this.b + ", title=" + this.c + ", timestamp=" + this.d + ", summary=" + this.e + ", credit=" + this.f + ")";
    }

    public GamesLockupData(Asset asset, String str, String str2, String str3, String str4, String str5) {
        zq3.h(asset, "asset");
        zq3.h(str2, "title");
        zq3.h(str3, "timestamp");
        zq3.h(str4, "summary");
        zq3.h(str5, "credit");
        this.a = asset;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }
}

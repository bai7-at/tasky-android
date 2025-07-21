package com.nytimes.android.features.games.gameshub.configuration.models;

import defpackage.ho0;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.nn0;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class NytGameCardEntity {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final long h;
    private final boolean i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return NytGameCardEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NytGameCardEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, nn0 nn0Var, boolean z, mk7 mk7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, nn0Var, z, mk7Var);
    }

    public static final /* synthetic */ void i(NytGameCardEntity nytGameCardEntity, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, nytGameCardEntity.a);
        dVar.y(serialDescriptor, 1, nytGameCardEntity.b);
        if (dVar.A(serialDescriptor, 2) || nytGameCardEntity.c != null) {
            dVar.l(serialDescriptor, 2, l48.a, nytGameCardEntity.c);
        }
        if (dVar.A(serialDescriptor, 3) || nytGameCardEntity.d != null) {
            dVar.l(serialDescriptor, 3, l48.a, nytGameCardEntity.d);
        }
        dVar.y(serialDescriptor, 4, nytGameCardEntity.e);
        dVar.y(serialDescriptor, 5, nytGameCardEntity.f);
        dVar.y(serialDescriptor, 6, nytGameCardEntity.g);
        dVar.z(serialDescriptor, 7, ho0.a, nn0.j(nytGameCardEntity.h));
        dVar.x(serialDescriptor, 8, nytGameCardEntity.i);
    }

    public final long a() {
        return this.h;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NytGameCardEntity)) {
            return false;
        }
        NytGameCardEntity nytGameCardEntity = (NytGameCardEntity) obj;
        return zq3.c(this.a, nytGameCardEntity.a) && zq3.c(this.b, nytGameCardEntity.b) && zq3.c(this.c, nytGameCardEntity.c) && zq3.c(this.d, nytGameCardEntity.d) && zq3.c(this.e, nytGameCardEntity.e) && zq3.c(this.f, nytGameCardEntity.f) && zq3.c(this.g, nytGameCardEntity.g) && nn0.t(this.h, nytGameCardEntity.h) && this.i == nytGameCardEntity.i;
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.b;
    }

    public final boolean h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + nn0.z(this.h)) * 31) + Boolean.hashCode(this.i);
    }

    public String toString() {
        return "NytGameCardEntity(id=" + this.a + ", name=" + this.b + ", description=" + this.c + ", byline=" + this.d + ", buttonTitle=" + this.e + ", gameUrl=" + this.f + ", imageUrl=" + this.g + ", backgroundColor=" + nn0.A(this.h) + ", isSubscriptionRequired=" + this.i + ")";
    }

    private NytGameCardEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, nn0 nn0Var, boolean z, mk7 mk7Var) {
        if (499 != (i & 499)) {
            wv5.a(i, 499, NytGameCardEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = nn0Var.B();
        this.i = z;
    }
}

package com.nytimes.android.features.games.gameshub.configuration.models;

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
public final class PlayTabFooter {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PlayTabFooter$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlayTabFooter(int i, String str, String str2, String str3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, PlayTabFooter$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final /* synthetic */ void c(PlayTabFooter playTabFooter, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, playTabFooter.a);
        dVar.y(serialDescriptor, 1, playTabFooter.b);
        dVar.y(serialDescriptor, 2, playTabFooter.c);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayTabFooter)) {
            return false;
        }
        PlayTabFooter playTabFooter = (PlayTabFooter) obj;
        return zq3.c(this.a, playTabFooter.a) && zq3.c(this.b, playTabFooter.b) && zq3.c(this.c, playTabFooter.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "PlayTabFooter(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}

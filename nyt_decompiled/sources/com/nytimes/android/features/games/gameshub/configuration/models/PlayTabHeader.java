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
public final class PlayTabHeader {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PlayTabHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlayTabHeader(int i, String str, String str2, String str3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, PlayTabHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final /* synthetic */ void c(PlayTabHeader playTabHeader, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, playTabHeader.a);
        dVar.y(serialDescriptor, 1, playTabHeader.b);
        dVar.y(serialDescriptor, 2, playTabHeader.c);
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
        if (!(obj instanceof PlayTabHeader)) {
            return false;
        }
        PlayTabHeader playTabHeader = (PlayTabHeader) obj;
        return zq3.c(this.a, playTabHeader.a) && zq3.c(this.b, playTabHeader.b) && zq3.c(this.c, playTabHeader.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "PlayTabHeader(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}

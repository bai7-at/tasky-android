package com.nytimes.android.ribbon.destinations.audio;

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
public final class PodcastData {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PodcastData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PodcastData(int i, String str, String str2, String str3, String str4, String str5, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, PodcastData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
    }

    public static final /* synthetic */ void f(PodcastData podcastData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, podcastData.a);
        dVar.y(serialDescriptor, 1, podcastData.b);
        dVar.y(serialDescriptor, 2, podcastData.c);
        if (dVar.A(serialDescriptor, 3) || !zq3.c(podcastData.d, "")) {
            dVar.y(serialDescriptor, 3, podcastData.d);
        }
        if (!dVar.A(serialDescriptor, 4) && zq3.c(podcastData.e, "")) {
            return;
        }
        dVar.y(serialDescriptor, 4, podcastData.e);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
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
        if (!(obj instanceof PodcastData)) {
            return false;
        }
        PodcastData podcastData = (PodcastData) obj;
        return zq3.c(this.a, podcastData.a) && zq3.c(this.b, podcastData.b) && zq3.c(this.c, podcastData.c) && zq3.c(this.d, podcastData.d) && zq3.c(this.e, podcastData.e);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "PodcastData(headline=" + this.a + ", contentUrl=" + this.b + ", contentUri=" + this.c + ", summary=" + this.d + ", imageUrl=" + this.e + ")";
    }
}

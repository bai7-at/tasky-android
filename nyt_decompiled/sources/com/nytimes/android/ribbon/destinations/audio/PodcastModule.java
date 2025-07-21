package com.nytimes.android.ribbon.destinations.audio;

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
public final class PodcastModule {
    public static final Companion Companion = new Companion(null);
    public static final int c = 8;
    private static final KSerializer[] d = {null, new qo(PodcastData$$serializer.INSTANCE)};
    private final String a;
    private final List b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PodcastModule$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PodcastModule(int i, String str, List list, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, PodcastModule$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = list;
    }

    public static final /* synthetic */ void d(PodcastModule podcastModule, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = d;
        dVar.y(serialDescriptor, 0, podcastModule.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], podcastModule.b);
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastModule)) {
            return false;
        }
        PodcastModule podcastModule = (PodcastModule) obj;
        return zq3.c(this.a, podcastModule.a) && zq3.c(this.b, podcastModule.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "PodcastModule(title=" + this.a + ", assets=" + this.b + ")";
    }
}

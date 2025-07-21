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
public final class AudioDestinationData {
    public static final Companion Companion = new Companion(null);
    public static final int d = 8;
    private static final KSerializer[] e = {null, new qo(PodcastModule$$serializer.INSTANCE), null};
    private final AudioHeroData a;
    private final List b;
    private final FooterData c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return AudioDestinationData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AudioDestinationData(int i, AudioHeroData audioHeroData, List list, FooterData footerData, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, AudioDestinationData$$serializer.INSTANCE.getDescriptor());
        }
        this.a = audioHeroData;
        this.b = list;
        this.c = footerData;
    }

    public static final /* synthetic */ void e(AudioDestinationData audioDestinationData, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = e;
        dVar.z(serialDescriptor, 0, AudioHeroData$$serializer.INSTANCE, audioDestinationData.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], audioDestinationData.b);
        dVar.z(serialDescriptor, 2, FooterData$$serializer.INSTANCE, audioDestinationData.c);
    }

    public final FooterData b() {
        return this.c;
    }

    public final AudioHeroData c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioDestinationData)) {
            return false;
        }
        AudioDestinationData audioDestinationData = (AudioDestinationData) obj;
        return zq3.c(this.a, audioDestinationData.a) && zq3.c(this.b, audioDestinationData.b) && zq3.c(this.c, audioDestinationData.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AudioDestinationData(hero=" + this.a + ", podcasts=" + this.b + ", footer=" + this.c + ")";
    }
}

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
public final class SectionCardDescription {
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] c = {null, CardType.Companion.serializer()};
    private final String a;
    private final CardType b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return SectionCardDescription$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SectionCardDescription(int i, String str, CardType cardType, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, SectionCardDescription$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = cardType;
    }

    public static final /* synthetic */ void d(SectionCardDescription sectionCardDescription, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = c;
        dVar.y(serialDescriptor, 0, sectionCardDescription.a);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], sectionCardDescription.b);
    }

    public final CardType b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionCardDescription)) {
            return false;
        }
        SectionCardDescription sectionCardDescription = (SectionCardDescription) obj;
        return zq3.c(this.a, sectionCardDescription.a) && this.b == sectionCardDescription.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SectionCardDescription(id=" + this.a + ", cardType=" + this.b + ")";
    }
}

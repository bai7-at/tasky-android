package com.nytimes.android.ribbon.destinations.cooking;

import defpackage.en3;
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
public final class Rating {
    public static final Companion Companion = new Companion(null);
    private final Integer a;
    private final Integer b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Rating$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Rating(int i, Integer num, Integer num2, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, Rating$$serializer.INSTANCE.getDescriptor());
        }
        this.a = num;
        this.b = num2;
    }

    public static final /* synthetic */ void c(Rating rating, d dVar, SerialDescriptor serialDescriptor) {
        en3 en3Var = en3.a;
        dVar.l(serialDescriptor, 0, en3Var, rating.a);
        dVar.l(serialDescriptor, 1, en3Var, rating.b);
    }

    public final Integer a() {
        return this.b;
    }

    public final Integer b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) obj;
        return zq3.c(this.a, rating.a) && zq3.c(this.b, rating.b);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Rating(numberOfRatings=" + this.a + ", avgRating=" + this.b + ")";
    }

    public Rating(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}

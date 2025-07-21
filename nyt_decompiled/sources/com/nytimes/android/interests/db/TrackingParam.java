package com.nytimes.android.interests.db;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
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
public final class TrackingParam {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return TrackingParam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrackingParam(int i, String str, String str2, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, TrackingParam$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void c(TrackingParam trackingParam, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, trackingParam.a);
        dVar.y(serialDescriptor, 1, trackingParam.b);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingParam)) {
            return false;
        }
        TrackingParam trackingParam = (TrackingParam) obj;
        return zq3.c(this.a, trackingParam.a) && zq3.c(this.b, trackingParam.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TrackingParam(key=" + this.a + ", value=" + this.b + ")";
    }

    public TrackingParam(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        this.a = str;
        this.b = str2;
    }
}

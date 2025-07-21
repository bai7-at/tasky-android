package com.nytimes.android.api.retrofit;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes3.dex */
public final class ImageCrop {
    public static final Companion Companion = new Companion(null);
    private final String a;
    private final String b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ImageCrop$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageCrop(int i, String str, String str2, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, ImageCrop$$serializer.INSTANCE.getDescriptor());
        }
        this.a = str;
        this.b = str2;
    }

    public static final /* synthetic */ void b(ImageCrop imageCrop, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, imageCrop.a);
        dVar.y(serialDescriptor, 1, imageCrop.b);
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCrop)) {
            return false;
        }
        ImageCrop imageCrop = (ImageCrop) obj;
        return zq3.c(this.a, imageCrop.a) && zq3.c(this.b, imageCrop.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ImageCrop(name=" + this.a + ", url=" + this.b + ")";
    }
}

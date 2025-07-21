package com.nytimes.android.interests.db;

import defpackage.l48;
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
public final class PromotionalMedia {
    public static final Companion Companion = new Companion(null);
    private final Caption a;
    private final ImageCrop b;
    private final String c;

    @lk7
    public static final class Caption {
        public static final Companion Companion = new Companion(null);
        private final String a;
        private final boolean b;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PromotionalMedia$Caption$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Caption(int i, String str, boolean z, mk7 mk7Var) {
            if (1 != (i & 1)) {
                wv5.a(i, 1, PromotionalMedia$Caption$$serializer.INSTANCE.getDescriptor());
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public static final /* synthetic */ void a(Caption caption, d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, caption.a);
            if (dVar.A(serialDescriptor, 1) || caption.b) {
                dVar.x(serialDescriptor, 1, caption.b);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Caption)) {
                return false;
            }
            Caption caption = (Caption) obj;
            return zq3.c(this.a, caption.a) && this.b == caption.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "Caption(full=" + this.a + ", shouldHideCaption=" + this.b + ")";
        }

        public Caption(String str, boolean z) {
            zq3.h(str, "full");
            this.a = str;
            this.b = z;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PromotionalMedia$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @lk7
    public static final class ImageCrop {
        public static final Companion Companion = new Companion(null);
        private final ImageDimension a;
        private final ImageDimension b;
        private final ImageDimension c;
        private final ImageDimension d;
        private final ImageDimension e;
        private final ImageDimension f;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PromotionalMedia$ImageCrop$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ImageCrop(int i, ImageDimension imageDimension, ImageDimension imageDimension2, ImageDimension imageDimension3, ImageDimension imageDimension4, ImageDimension imageDimension5, ImageDimension imageDimension6, mk7 mk7Var) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = imageDimension;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = imageDimension2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = imageDimension3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = imageDimension4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = imageDimension5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = imageDimension6;
            }
        }

        public static final /* synthetic */ void f(ImageCrop imageCrop, d dVar, SerialDescriptor serialDescriptor) {
            if (dVar.A(serialDescriptor, 0) || imageCrop.a != null) {
                dVar.l(serialDescriptor, 0, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageCrop.a);
            }
            if (dVar.A(serialDescriptor, 1) || imageCrop.b != null) {
                dVar.l(serialDescriptor, 1, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageCrop.b);
            }
            if (dVar.A(serialDescriptor, 2) || imageCrop.c != null) {
                dVar.l(serialDescriptor, 2, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageCrop.c);
            }
            if (dVar.A(serialDescriptor, 3) || imageCrop.d != null) {
                dVar.l(serialDescriptor, 3, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageCrop.d);
            }
            if (dVar.A(serialDescriptor, 4) || imageCrop.e != null) {
                dVar.l(serialDescriptor, 4, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageCrop.e);
            }
            if (!dVar.A(serialDescriptor, 5) && imageCrop.f == null) {
                return;
            }
            dVar.l(serialDescriptor, 5, PromotionalMedia$ImageDimension$$serializer.INSTANCE, imageCrop.f);
        }

        public final ImageDimension a() {
            return this.b;
        }

        public final ImageDimension b() {
            return this.c;
        }

        public final ImageDimension c() {
            return this.d;
        }

        public final ImageDimension d() {
            return this.a;
        }

        public final ImageDimension e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageCrop)) {
                return false;
            }
            ImageCrop imageCrop = (ImageCrop) obj;
            return zq3.c(this.a, imageCrop.a) && zq3.c(this.b, imageCrop.b) && zq3.c(this.c, imageCrop.c) && zq3.c(this.d, imageCrop.d) && zq3.c(this.e, imageCrop.e) && zq3.c(this.f, imageCrop.f);
        }

        public int hashCode() {
            ImageDimension imageDimension = this.a;
            int hashCode = (imageDimension == null ? 0 : imageDimension.hashCode()) * 31;
            ImageDimension imageDimension2 = this.b;
            int hashCode2 = (hashCode + (imageDimension2 == null ? 0 : imageDimension2.hashCode())) * 31;
            ImageDimension imageDimension3 = this.c;
            int hashCode3 = (hashCode2 + (imageDimension3 == null ? 0 : imageDimension3.hashCode())) * 31;
            ImageDimension imageDimension4 = this.d;
            int hashCode4 = (hashCode3 + (imageDimension4 == null ? 0 : imageDimension4.hashCode())) * 31;
            ImageDimension imageDimension5 = this.e;
            int hashCode5 = (hashCode4 + (imageDimension5 == null ? 0 : imageDimension5.hashCode())) * 31;
            ImageDimension imageDimension6 = this.f;
            return hashCode5 + (imageDimension6 != null ? imageDimension6.hashCode() : 0);
        }

        public String toString() {
            return "ImageCrop(thumbLarge=" + this.a + ", mediumThreeByTwo440=" + this.b + ", square320=" + this.c + ", square640=" + this.d + ", verticalTwoByThree735=" + this.e + ", threeByTwo=" + this.f + ")";
        }

        public ImageCrop(ImageDimension imageDimension, ImageDimension imageDimension2, ImageDimension imageDimension3, ImageDimension imageDimension4, ImageDimension imageDimension5, ImageDimension imageDimension6) {
            this.a = imageDimension;
            this.b = imageDimension2;
            this.c = imageDimension3;
            this.d = imageDimension4;
            this.e = imageDimension5;
            this.f = imageDimension6;
        }

        public /* synthetic */ ImageCrop(ImageDimension imageDimension, ImageDimension imageDimension2, ImageDimension imageDimension3, ImageDimension imageDimension4, ImageDimension imageDimension5, ImageDimension imageDimension6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : imageDimension, (i & 2) != 0 ? null : imageDimension2, (i & 4) != 0 ? null : imageDimension3, (i & 8) != 0 ? null : imageDimension4, (i & 16) != 0 ? null : imageDimension5, (i & 32) != 0 ? null : imageDimension6);
        }
    }

    @lk7
    public static final class ImageDimension {
        public static final Companion Companion = new Companion(null);
        private final int a;
        private final int b;
        private final String c;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PromotionalMedia$ImageDimension$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ImageDimension(int i, int i2, int i3, String str, mk7 mk7Var) {
            if (7 != (i & 7)) {
                wv5.a(i, 7, PromotionalMedia$ImageDimension$$serializer.INSTANCE.getDescriptor());
            }
            this.a = i2;
            this.b = i3;
            this.c = str;
        }

        public static final /* synthetic */ void b(ImageDimension imageDimension, d dVar, SerialDescriptor serialDescriptor) {
            dVar.w(serialDescriptor, 0, imageDimension.a);
            dVar.w(serialDescriptor, 1, imageDimension.b);
            dVar.l(serialDescriptor, 2, l48.a, imageDimension.c);
        }

        public final String a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageDimension)) {
                return false;
            }
            ImageDimension imageDimension = (ImageDimension) obj;
            return this.a == imageDimension.a && this.b == imageDimension.b && zq3.c(this.c, imageDimension.c);
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ImageDimension(width=" + this.a + ", height=" + this.b + ", url=" + this.c + ")";
        }

        public ImageDimension(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public /* synthetic */ PromotionalMedia(int i, Caption caption, ImageCrop imageCrop, String str, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, PromotionalMedia$$serializer.INSTANCE.getDescriptor());
        }
        this.a = caption;
        this.b = imageCrop;
        this.c = str;
    }

    public static final /* synthetic */ void b(PromotionalMedia promotionalMedia, d dVar, SerialDescriptor serialDescriptor) {
        dVar.z(serialDescriptor, 0, PromotionalMedia$Caption$$serializer.INSTANCE, promotionalMedia.a);
        dVar.z(serialDescriptor, 1, PromotionalMedia$ImageCrop$$serializer.INSTANCE, promotionalMedia.b);
        dVar.y(serialDescriptor, 2, promotionalMedia.c);
    }

    public final ImageCrop a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionalMedia)) {
            return false;
        }
        PromotionalMedia promotionalMedia = (PromotionalMedia) obj;
        return zq3.c(this.a, promotionalMedia.a) && zq3.c(this.b, promotionalMedia.b) && zq3.c(this.c, promotionalMedia.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "PromotionalMedia(caption=" + this.a + ", crops=" + this.b + ", uri=" + this.c + ")";
    }

    public PromotionalMedia(Caption caption, ImageCrop imageCrop, String str) {
        zq3.h(caption, "caption");
        zq3.h(imageCrop, "crops");
        zq3.h(str, "uri");
        this.a = caption;
        this.b = imageCrop;
        this.c = str;
    }
}

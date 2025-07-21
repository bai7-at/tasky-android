package com.nytimes.android.unfear.reader.model;

import defpackage.b22;
import defpackage.ih4;
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
public final class ImageElement implements ih4 {
    public static final Companion Companion = new Companion(null);
    public static final int f = 0;
    private final int a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return ImageElement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Dimension {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Dimension[] $VALUES;
        public static final Dimension LARGE = new Dimension("LARGE", 0);
        public static final Dimension SQUARE_THUMBNAIL = new Dimension("SQUARE_THUMBNAIL", 1);
        public static final Dimension WIDE_THUMBNAIL = new Dimension("WIDE_THUMBNAIL", 2);

        private static final /* synthetic */ Dimension[] $values() {
            return new Dimension[]{LARGE, SQUARE_THUMBNAIL, WIDE_THUMBNAIL};
        }

        static {
            Dimension[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Dimension(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Dimension valueOf(String str) {
            return (Dimension) Enum.valueOf(Dimension.class, str);
        }

        public static Dimension[] values() {
            return (Dimension[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ImageElement(int i, int i2, int i3, String str, String str2, String str3, mk7 mk7Var) {
        if (15 != (i & 15)) {
            wv5.a(i, 15, ImageElement$$serializer.INSTANCE.getDescriptor());
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = str2;
        } else {
            this.e = str3;
        }
    }

    public static /* synthetic */ ImageElement b(ImageElement imageElement, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = imageElement.a;
        }
        if ((i3 & 2) != 0) {
            i2 = imageElement.b;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = imageElement.c;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = imageElement.d;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = imageElement.e;
        }
        return imageElement.a(i, i4, str4, str5, str3);
    }

    public static final /* synthetic */ void h(ImageElement imageElement, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, imageElement.a);
        dVar.w(serialDescriptor, 1, imageElement.b);
        dVar.y(serialDescriptor, 2, imageElement.c);
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 3, l48Var, imageElement.d);
        if (!dVar.A(serialDescriptor, 4) && zq3.c(imageElement.e, imageElement.d)) {
            return;
        }
        dVar.l(serialDescriptor, 4, l48Var, imageElement.e);
    }

    public final ImageElement a(int i, int i2, String str, String str2, String str3) {
        zq3.h(str, "url");
        return new ImageElement(i, i2, str, str2, str3);
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageElement)) {
            return false;
        }
        ImageElement imageElement = (ImageElement) obj;
        return this.a == imageElement.a && this.b == imageElement.b && zq3.c(this.c, imageElement.c) && zq3.c(this.d, imageElement.d) && zq3.c(this.e, imageElement.e);
    }

    public final String f() {
        return this.c;
    }

    public final int g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ImageElement(height=" + this.a + ", width=" + this.b + ", url=" + this.c + ", credit=" + this.d + ", contentDescription=" + this.e + ")";
    }

    public ImageElement(int i, int i2, String str, String str2, String str3) {
        zq3.h(str, "url");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public /* synthetic */ ImageElement(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, (i3 & 16) != 0 ? str2 : str3);
    }
}

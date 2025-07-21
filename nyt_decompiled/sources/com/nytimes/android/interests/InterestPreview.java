package com.nytimes.android.interests;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
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
public final class InterestPreview {
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final boolean h;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return InterestPreview$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InterestPreview(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, mk7 mk7Var) {
        if (63 != (i & 63)) {
            wv5.a(i, 63, InterestPreview$$serializer.INSTANCE.getDescriptor());
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
    }

    public static final /* synthetic */ void h(InterestPreview interestPreview, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, interestPreview.a);
        dVar.y(serialDescriptor, 1, interestPreview.b);
        dVar.y(serialDescriptor, 2, interestPreview.c);
        dVar.l(serialDescriptor, 3, l48.a, interestPreview.d);
        dVar.y(serialDescriptor, 4, interestPreview.e);
        dVar.y(serialDescriptor, 5, interestPreview.f);
        if (dVar.A(serialDescriptor, 6) || interestPreview.g) {
            dVar.x(serialDescriptor, 6, interestPreview.g);
        }
        if (dVar.A(serialDescriptor, 7) || interestPreview.h) {
            dVar.x(serialDescriptor, 7, interestPreview.h);
        }
    }

    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestPreview)) {
            return false;
        }
        InterestPreview interestPreview = (InterestPreview) obj;
        return this.a == interestPreview.a && zq3.c(this.b, interestPreview.b) && zq3.c(this.c, interestPreview.c) && zq3.c(this.d, interestPreview.d) && zq3.c(this.e, interestPreview.e) && zq3.c(this.f, interestPreview.f) && this.g == interestPreview.g && this.h == interestPreview.h;
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.h);
    }

    public String toString() {
        return "InterestPreview(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", subtype=" + this.d + ", description=" + this.e + ", promoImageUrl=" + this.f + ", isOpinion=" + this.g + ", isEditorsPick=" + this.h + ")";
    }

    public InterestPreview(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, TransferTable.COLUMN_TYPE);
        zq3.h(str4, "description");
        zq3.h(str5, "promoImageUrl");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
    }
}

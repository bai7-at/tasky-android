package com.nytimes.android.interests.db;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
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
public final class InterestInteractiveAsset extends InterestAsset {
    public static final Companion Companion = new Companion(null);
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final PromotionalMedia g;
    private final long h;
    private final long i;
    private final boolean j;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return InterestInteractiveAsset$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterestInteractiveAsset(int i, String str, String str2, String str3, String str4, String str5, PromotionalMedia promotionalMedia, long j, long j2, boolean z, mk7 mk7Var) {
        super(i, mk7Var);
        if (255 != (i & 255)) {
            wv5.a(i, 255, InterestInteractiveAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = promotionalMedia;
        this.h = j;
        this.i = j2;
        if ((i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
    }

    public static final /* synthetic */ void s(InterestInteractiveAsset interestInteractiveAsset, d dVar, SerialDescriptor serialDescriptor) {
        InterestAsset.p(interestInteractiveAsset, dVar, serialDescriptor);
        dVar.y(serialDescriptor, 0, interestInteractiveAsset.j());
        dVar.y(serialDescriptor, 1, interestInteractiveAsset.k());
        dVar.y(serialDescriptor, 2, interestInteractiveAsset.h());
        dVar.y(serialDescriptor, 3, interestInteractiveAsset.q());
        dVar.y(serialDescriptor, 4, interestInteractiveAsset.i());
        dVar.l(serialDescriptor, 5, PromotionalMedia$$serializer.INSTANCE, interestInteractiveAsset.g());
        dVar.F(serialDescriptor, 6, interestInteractiveAsset.f());
        dVar.F(serialDescriptor, 7, interestInteractiveAsset.e());
        if (dVar.A(serialDescriptor, 8) || interestInteractiveAsset.r()) {
            dVar.x(serialDescriptor, 8, interestInteractiveAsset.r());
        }
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public long e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestInteractiveAsset)) {
            return false;
        }
        InterestInteractiveAsset interestInteractiveAsset = (InterestInteractiveAsset) obj;
        return zq3.c(this.b, interestInteractiveAsset.b) && zq3.c(this.c, interestInteractiveAsset.c) && zq3.c(this.d, interestInteractiveAsset.d) && zq3.c(this.e, interestInteractiveAsset.e) && zq3.c(this.f, interestInteractiveAsset.f) && zq3.c(this.g, interestInteractiveAsset.g) && this.h == interestInteractiveAsset.h && this.i == interestInteractiveAsset.i && this.j == interestInteractiveAsset.j;
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public long f() {
        return this.h;
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public PromotionalMedia g() {
        return this.g;
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        PromotionalMedia promotionalMedia = this.g;
        return ((((((hashCode + (promotionalMedia == null ? 0 : promotionalMedia.hashCode())) * 31) + Long.hashCode(this.h)) * 31) + Long.hashCode(this.i)) * 31) + Boolean.hashCode(this.j);
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public String i() {
        return this.f;
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public String j() {
        return this.b;
    }

    @Override // com.nytimes.android.interests.db.InterestAsset
    public String k() {
        return this.c;
    }

    public String q() {
        return this.e;
    }

    public boolean r() {
        return this.j;
    }

    public String toString() {
        return "InterestInteractiveAsset(uri=" + this.b + ", url=" + this.c + ", title=" + this.d + ", summary=" + this.e + ", type=" + this.f + ", promoMedia=" + this.g + ", lastModified=" + this.h + ", lastMajorModified=" + this.i + ", isOpinion=" + this.j + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestInteractiveAsset(String str, String str2, String str3, String str4, String str5, PromotionalMedia promotionalMedia, long j, long j2, boolean z) {
        super(null);
        zq3.h(str, "uri");
        zq3.h(str2, "url");
        zq3.h(str3, "title");
        zq3.h(str4, "summary");
        zq3.h(str5, TransferTable.COLUMN_TYPE);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = promotionalMedia;
        this.h = j;
        this.i = j2;
        this.j = z;
    }
}

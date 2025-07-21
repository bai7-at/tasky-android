package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.hff;

@SafeParcelable.Class(creator = "SignInCredentialCreator")
/* loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new hff();

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zzbf;

    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String zzbg;

    @SafeParcelable.Field(getter = "getGivenName", id = 3)
    private final String zzbh;

    @SafeParcelable.Field(getter = "getFamilyName", id = 4)
    private final String zzbi;

    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    private final Uri zzbj;

    @SafeParcelable.Field(getter = "getPassword", id = 6)
    private final String zzbk;

    @SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    private final String zzbl;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        this.zzbf = Preconditions.checkNotEmpty(str);
        this.zzbg = str2;
        this.zzbh = str3;
        this.zzbi = str4;
        this.zzbj = uri;
        this.zzbk = str5;
        this.zzbl = str6;
    }

    public final String G0() {
        return this.zzbi;
    }

    public final String H0() {
        return this.zzbh;
    }

    public final String K0() {
        return this.zzbl;
    }

    public final String X0() {
        return this.zzbf;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return Objects.equal(this.zzbf, signInCredential.zzbf) && Objects.equal(this.zzbg, signInCredential.zzbg) && Objects.equal(this.zzbh, signInCredential.zzbh) && Objects.equal(this.zzbi, signInCredential.zzbi) && Objects.equal(this.zzbj, signInCredential.zzbj) && Objects.equal(this.zzbk, signInCredential.zzbk) && Objects.equal(this.zzbl, signInCredential.zzbl);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbf, this.zzbg, this.zzbh, this.zzbi, this.zzbj, this.zzbk, this.zzbl);
    }

    public final String t0() {
        return this.zzbg;
    }

    public final String u1() {
        return this.zzbk;
    }

    public final Uri v1() {
        return this.zzbj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, X0(), false);
        SafeParcelWriter.writeString(parcel, 2, t0(), false);
        SafeParcelWriter.writeString(parcel, 3, H0(), false);
        SafeParcelWriter.writeString(parcel, 4, G0(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, v1(), i, false);
        SafeParcelWriter.writeString(parcel, 6, u1(), false);
        SafeParcelWriter.writeString(parcel, 7, K0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

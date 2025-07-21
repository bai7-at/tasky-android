package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.i73;
import defpackage.l3g;

@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new l3g();

    @SafeParcelable.Field(getter = "getConsumerPkgName", id = 2)
    private final String zzcu;

    @SafeParcelable.Field(getter = "getGoogleConfig", id = 5)
    private GoogleSignInOptions zzcv;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.zzcu = Preconditions.checkNotEmpty(str);
        this.zzcv = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.zzcu.equals(signInConfiguration.zzcu)) {
            GoogleSignInOptions googleSignInOptions = this.zzcv;
            if (googleSignInOptions == null) {
                if (signInConfiguration.zzcv == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.zzcv)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new i73().a(this.zzcu).a(this.zzcv).b();
    }

    public final GoogleSignInOptions t0() {
        return this.zzcv;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzcu, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzcv, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

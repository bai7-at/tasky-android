package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT})
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new com.google.android.gms.auth.api.credentials.a();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String mId;

    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String mName;

    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 3)
    private final Uri zzo;

    @SafeParcelable.Field(getter = "getIdTokens", id = 4)
    private final List<IdToken> zzp;

    @SafeParcelable.Field(getter = "getPassword", id = 5)
    private final String zzq;

    @SafeParcelable.Field(getter = "getAccountType", id = 6)
    private final String zzr;

    @SafeParcelable.Field(getter = "getGivenName", id = 9)
    private final String zzs;

    @SafeParcelable.Field(getter = "getFamilyName", id = 10)
    private final String zzt;

    public static class a {
        private final String a;
        private String b;
        private Uri c;
        private List d;
        private String e;
        private String f;
        private String g;
        private String h;

        public a(String str) {
            this.a = str;
        }

        public Credential a() {
            return new Credential(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public a b(String str) {
            this.e = str;
            return this;
        }
    }

    Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        String trim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z = true;
                }
            }
            if (!z) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.mName = str2;
        this.zzo = uri;
        this.zzp = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.mId = trim;
        this.zzq = str3;
        this.zzr = str4;
        this.zzs = str5;
        this.zzt = str6;
    }

    public String G0() {
        return this.zzt;
    }

    public String H0() {
        return this.zzs;
    }

    public String K0() {
        return this.mId;
    }

    public List X0() {
        return this.zzp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.mId, credential.mId) && TextUtils.equals(this.mName, credential.mName) && Objects.equal(this.zzo, credential.zzo) && TextUtils.equals(this.zzq, credential.zzq) && TextUtils.equals(this.zzr, credential.zzr);
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return Objects.hashCode(this.mId, this.mName, this.zzo, this.zzq, this.zzr);
    }

    public String t0() {
        return this.zzr;
    }

    public String u1() {
        return this.zzq;
    }

    public Uri v1() {
        return this.zzo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, K0(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, v1(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, X0(), false);
        SafeParcelWriter.writeString(parcel, 5, u1(), false);
        SafeParcelWriter.writeString(parcel, 6, t0(), false);
        SafeParcelWriter.writeString(parcel, 9, H0(), false);
        SafeParcelWriter.writeString(parcel, 10, G0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

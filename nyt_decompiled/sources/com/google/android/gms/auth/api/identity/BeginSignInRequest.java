package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions zzas;

    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions zzat;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zzau;

    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean zzav;

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zzaw;

        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final String zzax;

        @SafeParcelable.Field(getter = "getNonce", id = 3)
        private final String zzay;

        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean zzaz;

        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final String zzba;

        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final List<String> zzbb;

        public static final class a {
            private boolean a = false;
            private String b = null;
            private String c = null;
            private boolean d = true;
            private String e = null;
            private List f = null;

            public final GoogleIdTokenRequestOptions a() {
                return new GoogleIdTokenRequestOptions(this.a, this.b, this.c, this.d, null, null);
            }

            public final a b(boolean z) {
                this.d = z;
                return this;
            }

            public final a c(String str) {
                this.b = Preconditions.checkNotEmpty(str);
                return this;
            }

            public final a d(boolean z) {
                this.a = z;
                return this;
            }
        }

        GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List list) {
            this.zzaw = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zzax = str;
            this.zzay = str2;
            this.zzaz = z2;
            this.zzbb = BeginSignInRequest.u1(list);
            this.zzba = str3;
        }

        public static a t0() {
            return new a();
        }

        public final boolean G0() {
            return this.zzaz;
        }

        public final String H0() {
            return this.zzay;
        }

        public final String K0() {
            return this.zzax;
        }

        public final boolean X0() {
            return this.zzaw;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.zzaw == googleIdTokenRequestOptions.zzaw && Objects.equal(this.zzax, googleIdTokenRequestOptions.zzax) && Objects.equal(this.zzay, googleIdTokenRequestOptions.zzay) && this.zzaz == googleIdTokenRequestOptions.zzaz && Objects.equal(this.zzba, googleIdTokenRequestOptions.zzba) && Objects.equal(this.zzbb, googleIdTokenRequestOptions.zzbb);
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zzaw), this.zzax, this.zzay, Boolean.valueOf(this.zzaz), this.zzba, this.zzbb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, X0());
            SafeParcelWriter.writeString(parcel, 2, K0(), false);
            SafeParcelWriter.writeString(parcel, 3, H0(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, G0());
            SafeParcelWriter.writeString(parcel, 5, this.zzba, false);
            SafeParcelWriter.writeStringList(parcel, 6, this.zzbb, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new c();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean zzaw;

        public static final class a {
            private boolean a = false;

            public final PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.a);
            }

            public final a b(boolean z) {
                this.a = z;
                return this;
            }
        }

        PasswordRequestOptions(boolean z) {
            this.zzaw = z;
        }

        public static a t0() {
            return new a();
        }

        public final boolean G0() {
            return this.zzaw;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.zzaw == ((PasswordRequestOptions) obj).zzaw;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zzaw));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, G0());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    public static final class a {
        private PasswordRequestOptions a = PasswordRequestOptions.t0().b(false).a();
        private GoogleIdTokenRequestOptions b = GoogleIdTokenRequestOptions.t0().d(false).a();
        private String c;
        private boolean d;

        public final BeginSignInRequest a() {
            return new BeginSignInRequest(this.a, this.b, this.c, this.d);
        }

        public final a b(boolean z) {
            this.d = z;
            return this;
        }

        public final a c(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.b = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public final a d(PasswordRequestOptions passwordRequestOptions) {
            this.a = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final a e(String str) {
            this.c = str;
            return this;
        }
    }

    BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z) {
        this.zzas = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zzat = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zzau = str;
        this.zzav = z;
    }

    public static a X0(BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        a b = t0().c(beginSignInRequest.G0()).d(beginSignInRequest.H0()).b(beginSignInRequest.zzav);
        String str = beginSignInRequest.zzau;
        if (str != null) {
            b.e(str);
        }
        return b;
    }

    public static a t0() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List u1(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        return arrayList;
    }

    public final GoogleIdTokenRequestOptions G0() {
        return this.zzat;
    }

    public final PasswordRequestOptions H0() {
        return this.zzas;
    }

    public final boolean K0() {
        return this.zzav;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.equal(this.zzas, beginSignInRequest.zzas) && Objects.equal(this.zzat, beginSignInRequest.zzat) && Objects.equal(this.zzau, beginSignInRequest.zzau) && this.zzav == beginSignInRequest.zzav;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzas, this.zzat, this.zzau, Boolean.valueOf(this.zzav));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, H0(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, G0(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzau, false);
        SafeParcelWriter.writeBoolean(parcel, 4, K0());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.nytimes.subauth.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class LoginType implements Parcelable {
    public static final int $stable = 0;

    public static final class EmailLogin extends LoginType {
        public static final int $stable = 0;
        public static final EmailLogin INSTANCE = new EmailLogin();
        public static final Parcelable.Creator<EmailLogin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EmailLogin createFromParcel(Parcel parcel) {
                zq3.h(parcel, "parcel");
                parcel.readInt();
                return EmailLogin.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EmailLogin[] newArray(int i) {
                return new EmailLogin[i];
            }
        }

        private EmailLogin() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public static final class FacebookSSOLogin extends LoginType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FacebookSSOLogin> CREATOR = new a();
        private final boolean isWebSSO;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FacebookSSOLogin createFromParcel(Parcel parcel) {
                zq3.h(parcel, "parcel");
                return new FacebookSSOLogin(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FacebookSSOLogin[] newArray(int i) {
                return new FacebookSSOLogin[i];
            }
        }

        public FacebookSSOLogin(boolean z) {
            super(null);
            this.isWebSSO = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FacebookSSOLogin) && this.isWebSSO == ((FacebookSSOLogin) obj).isWebSSO;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isWebSSO);
        }

        public String toString() {
            return "FacebookSSOLogin(isWebSSO=" + this.isWebSSO + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "out");
            parcel.writeInt(this.isWebSSO ? 1 : 0);
        }
    }

    public static final class GoogleSSOLogin extends LoginType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GoogleSSOLogin> CREATOR = new a();
        private final boolean isWebSSO;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GoogleSSOLogin createFromParcel(Parcel parcel) {
                zq3.h(parcel, "parcel");
                return new GoogleSSOLogin(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GoogleSSOLogin[] newArray(int i) {
                return new GoogleSSOLogin[i];
            }
        }

        public GoogleSSOLogin(boolean z) {
            super(null);
            this.isWebSSO = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GoogleSSOLogin) && this.isWebSSO == ((GoogleSSOLogin) obj).isWebSSO;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isWebSSO);
        }

        public String toString() {
            return "GoogleSSOLogin(isWebSSO=" + this.isWebSSO + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "out");
            parcel.writeInt(this.isWebSSO ? 1 : 0);
        }
    }

    public static final class RegiLiteLogin extends LoginType {
        public static final int $stable = 0;
        public static final RegiLiteLogin INSTANCE = new RegiLiteLogin();
        public static final Parcelable.Creator<RegiLiteLogin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RegiLiteLogin createFromParcel(Parcel parcel) {
                zq3.h(parcel, "parcel");
                parcel.readInt();
                return RegiLiteLogin.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RegiLiteLogin[] newArray(int i) {
                return new RegiLiteLogin[i];
            }
        }

        private RegiLiteLogin() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public static final class Registration extends LoginType {
        public static final int $stable = 0;
        public static final Registration INSTANCE = new Registration();
        public static final Parcelable.Creator<Registration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Registration createFromParcel(Parcel parcel) {
                zq3.h(parcel, "parcel");
                parcel.readInt();
                return Registration.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Registration[] newArray(int i) {
                return new Registration[i];
            }
        }

        private Registration() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            zq3.h(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ LoginType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoginType() {
    }
}

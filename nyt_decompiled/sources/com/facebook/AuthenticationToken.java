package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.rd5;
import defpackage.v29;
import defpackage.zq3;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class AuthenticationToken implements Parcelable {
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";
    private static final String CLAIMS_KEY = "claims";
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";
    private static final String HEADER_KEY = "header";
    private static final String SIGNATURE_KEY = "signature";
    private static final String TOKEN_STRING_KEY = "token_string";
    private final AuthenticationTokenClaims claims;
    private final String expectedNonce;
    private final AuthenticationTokenHeader header;
    private final String signature;
    private final String token;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new AuthenticationToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int i) {
            return new AuthenticationToken[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public AuthenticationToken(String str, String str2) {
        zq3.h(str, "token");
        zq3.h(str2, "expectedNonce");
        v29.j(str, "token");
        v29.j(str2, "expectedNonce");
        List F0 = h.F0(str, new String[]{InstructionFileId.DOT}, false, 0, 6, null);
        if (!(F0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str3 = (String) F0.get(0);
        String str4 = (String) F0.get(1);
        String str5 = (String) F0.get(2);
        this.token = str;
        this.expectedNonce = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.header = authenticationTokenHeader;
        this.claims = new AuthenticationTokenClaims(str4, str2);
        if (!a(str3, str4, str5, authenticationTokenHeader.a())) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.signature = str5;
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            String c = rd5.c(str4);
            if (c == null) {
                return false;
            }
            return rd5.e(rd5.b(c), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return zq3.c(this.token, authenticationToken.token) && zq3.c(this.expectedNonce, authenticationToken.expectedNonce) && zq3.c(this.header, authenticationToken.header) && zq3.c(this.claims, authenticationToken.claims) && zq3.c(this.signature, authenticationToken.signature);
    }

    public int hashCode() {
        return ((((((((527 + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeString(this.token);
        parcel.writeString(this.expectedNonce);
        parcel.writeParcelable(this.header, i);
        parcel.writeParcelable(this.claims, i);
        parcel.writeString(this.signature);
    }

    public AuthenticationToken(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.token = v29.n(parcel.readString(), "token");
        this.expectedNonce = v29.n(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) readParcelable2;
                this.signature = v29.n(parcel.readString(), SIGNATURE_KEY);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}

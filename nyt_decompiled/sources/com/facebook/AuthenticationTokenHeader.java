package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.v29;
import defpackage.yj0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    private final String alg;
    private final String kid;
    private final String typ;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int i) {
            return new AuthenticationTokenHeader[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public AuthenticationTokenHeader(String str) {
        zq3.h(str, "encodedHeaderString");
        if (!b(str)) {
            throw new IllegalArgumentException("Invalid Header");
        }
        byte[] decode = Base64.decode(str, 0);
        zq3.g(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, yj0.b));
        String string = jSONObject.getString("alg");
        zq3.g(string, "jsonObj.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        zq3.g(string2, "jsonObj.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        zq3.g(string3, "jsonObj.getString(\"kid\")");
        this.kid = string3;
    }

    private final boolean b(String str) {
        v29.j(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        zq3.g(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, yj0.b));
            String optString = jSONObject.optString("alg");
            zq3.g(optString, "alg");
            boolean z = optString.length() > 0 && zq3.c(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            zq3.g(optString2, "jsonObj.optString(\"kid\")");
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            zq3.g(optString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.kid;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return zq3.c(this.alg, authenticationTokenHeader.alg) && zq3.c(this.typ, authenticationTokenHeader.typ) && zq3.c(this.kid, authenticationTokenHeader.kid);
    }

    public int hashCode() {
        return ((((527 + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        zq3.g(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.alg = v29.n(parcel.readString(), "alg");
        this.typ = v29.n(parcel.readString(), "typ");
        this.kid = v29.n(parcel.readString(), "kid");
    }
}

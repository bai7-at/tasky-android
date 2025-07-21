package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.g29;
import defpackage.om3;
import defpackage.v29;
import defpackage.yj0;
import defpackage.z38;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AuthenticationTokenClaims implements Parcelable {
    public static final String JSON_KEY_AUD = "aud";
    public static final String JSON_KEY_EMAIL = "email";
    public static final String JSON_KEY_EXP = "exp";
    public static final String JSON_KEY_FAMILY_NAME = "family_name";
    public static final String JSON_KEY_GIVEN_NAME = "given_name";
    public static final String JSON_KEY_IAT = "iat";
    public static final String JSON_KEY_ISS = "iss";
    public static final String JSON_KEY_JIT = "jti";
    public static final String JSON_KEY_MIDDLE_NAME = "middle_name";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_NONCE = "nonce";
    public static final String JSON_KEY_PICTURE = "picture";
    public static final String JSON_KEY_SUB = "sub";
    public static final String JSON_KEY_USER_AGE_RANGE = "user_age_range";
    public static final String JSON_KEY_USER_BIRTHDAY = "user_birthday";
    public static final String JSON_KEY_USER_FRIENDS = "user_friends";
    public static final String JSON_KEY_USER_GENDER = "user_gender";
    public static final String JSON_KEY_USER_HOMETOWN = "user_hometown";
    public static final String JSON_KEY_USER_LINK = "user_link";
    public static final String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;
    private final String aud;
    private final String email;
    private final long exp;
    private final String familyName;
    private final String givenName;
    private final long iat;
    private final String iss;
    private final String jti;
    private final String middleName;
    private final String name;
    private final String nonce;
    private final String picture;
    private final String sub;
    private final Map<String, Integer> userAgeRange;
    private final String userBirthday;
    private final Set<String> userFriends;
    private final String userGender;
    private final Map<String, String> userHometown;
    private final String userLink;
    private final Map<String, String> userLocation;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(Parcel parcel) {
            zq3.h(parcel, "source");
            return new AuthenticationTokenClaims(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int i) {
            return new AuthenticationTokenClaims[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(JSONObject jSONObject, String str) {
            zq3.h(jSONObject, "<this>");
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        private b() {
        }
    }

    public AuthenticationTokenClaims(String str, String str2) {
        zq3.h(str, "encodedClaims");
        zq3.h(str2, "expectedNonce");
        v29.j(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        zq3.g(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, yj0.b));
        if (!a(jSONObject, str2)) {
            throw new IllegalArgumentException("Invalid claims");
        }
        String string = jSONObject.getString(JSON_KEY_JIT);
        zq3.g(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.jti = string;
        String string2 = jSONObject.getString(JSON_KEY_ISS);
        zq3.g(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.iss = string2;
        String string3 = jSONObject.getString(JSON_KEY_AUD);
        zq3.g(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.aud = string3;
        String string4 = jSONObject.getString(JSON_KEY_NONCE);
        zq3.g(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.nonce = string4;
        this.exp = jSONObject.getLong(JSON_KEY_EXP);
        this.iat = jSONObject.getLong(JSON_KEY_IAT);
        String string5 = jSONObject.getString("sub");
        zq3.g(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.sub = string5;
        b bVar = Companion;
        this.name = bVar.a(jSONObject, JSON_KEY_NAME);
        this.givenName = bVar.a(jSONObject, JSON_KEY_GIVEN_NAME);
        this.middleName = bVar.a(jSONObject, JSON_KEY_MIDDLE_NAME);
        this.familyName = bVar.a(jSONObject, JSON_KEY_FAMILY_NAME);
        this.email = bVar.a(jSONObject, "email");
        this.picture = bVar.a(jSONObject, JSON_KEY_PICTURE);
        JSONArray optJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
        this.userFriends = optJSONArray == null ? null : Collections.unmodifiableSet(g29.b0(optJSONArray));
        this.userBirthday = bVar.a(jSONObject, JSON_KEY_USER_BIRTHDAY);
        JSONObject optJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
        this.userAgeRange = optJSONObject == null ? null : Collections.unmodifiableMap(g29.n(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
        this.userHometown = optJSONObject2 == null ? null : Collections.unmodifiableMap(g29.o(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
        this.userLocation = optJSONObject3 != null ? Collections.unmodifiableMap(g29.o(optJSONObject3)) : null;
        this.userGender = bVar.a(jSONObject, JSON_KEY_USER_GENDER);
        this.userLink = bVar.a(jSONObject, JSON_KEY_USER_LINK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (defpackage.zq3.c(new java.net.URL(r1).getHost(), "www.facebook.com") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r5 = "iss"
            r0 = 0
            if (r6 != 0) goto L6
            return r0
        L6:
            java.lang.String r1 = "jti"
            java.lang.String r2 = r6.optString(r1)
            defpackage.zq3.g(r2, r1)
            int r1 = r2.length()
            if (r1 != 0) goto L16
            return r0
        L16:
            java.lang.String r1 = r6.optString(r5)     // Catch: java.net.MalformedURLException -> Lc2
            defpackage.zq3.g(r1, r5)     // Catch: java.net.MalformedURLException -> Lc2
            int r5 = r1.length()     // Catch: java.net.MalformedURLException -> Lc2
            if (r5 != 0) goto L24
            goto L46
        L24:
            java.net.URL r5 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lc2
            r5.<init>(r1)     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r5 = r5.getHost()     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r2 = "facebook.com"
            boolean r5 = defpackage.zq3.c(r5, r2)     // Catch: java.net.MalformedURLException -> Lc2
            if (r5 != 0) goto L47
            java.net.URL r5 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lc2
            r5.<init>(r1)     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r5 = r5.getHost()     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r1 = "www.facebook.com"
            boolean r5 = defpackage.zq3.c(r5, r1)     // Catch: java.net.MalformedURLException -> Lc2
            if (r5 != 0) goto L47
        L46:
            return r0
        L47:
            java.lang.String r5 = "aud"
            java.lang.String r1 = r6.optString(r5)
            defpackage.zq3.g(r1, r5)
            int r5 = r1.length()
            if (r5 != 0) goto L57
            goto L61
        L57:
            java.lang.String r5 = defpackage.w92.m()
            boolean r5 = defpackage.zq3.c(r1, r5)
            if (r5 != 0) goto L62
        L61:
            return r0
        L62:
            java.util.Date r5 = new java.util.Date
            java.lang.String r1 = "exp"
            long r1 = r6.optLong(r1)
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 * r3
            r5.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            boolean r5 = r1.after(r5)
            if (r5 == 0) goto L7d
            return r0
        L7d:
            java.lang.String r5 = "iat"
            long r1 = r6.optLong(r5)
            java.util.Date r5 = new java.util.Date
            long r1 = r1 * r3
            r3 = 600000(0x927c0, double:2.964394E-318)
            long r1 = r1 + r3
            r5.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            boolean r5 = r1.after(r5)
            if (r5 == 0) goto L99
            return r0
        L99:
            java.lang.String r5 = "sub"
            java.lang.String r1 = r6.optString(r5)
            defpackage.zq3.g(r1, r5)
            int r5 = r1.length()
            if (r5 != 0) goto La9
            return r0
        La9:
            java.lang.String r5 = "nonce"
            java.lang.String r6 = r6.optString(r5)
            defpackage.zq3.g(r6, r5)
            int r5 = r6.length()
            if (r5 != 0) goto Lb9
            goto Lbf
        Lb9:
            boolean r5 = defpackage.zq3.c(r6, r7)
            if (r5 != 0) goto Lc0
        Lbf:
            return r0
        Lc0:
            r5 = 1
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.a(org.json.JSONObject, java.lang.String):boolean");
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put(JSON_KEY_NONCE, this.nonce);
        jSONObject.put(JSON_KEY_EXP, this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put(JSON_KEY_NAME, str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put(JSON_KEY_PICTURE, str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
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
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return zq3.c(this.jti, authenticationTokenClaims.jti) && zq3.c(this.iss, authenticationTokenClaims.iss) && zq3.c(this.aud, authenticationTokenClaims.aud) && zq3.c(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && zq3.c(this.sub, authenticationTokenClaims.sub) && zq3.c(this.name, authenticationTokenClaims.name) && zq3.c(this.givenName, authenticationTokenClaims.givenName) && zq3.c(this.middleName, authenticationTokenClaims.middleName) && zq3.c(this.familyName, authenticationTokenClaims.familyName) && zq3.c(this.email, authenticationTokenClaims.email) && zq3.c(this.picture, authenticationTokenClaims.picture) && zq3.c(this.userFriends, authenticationTokenClaims.userFriends) && zq3.c(this.userBirthday, authenticationTokenClaims.userBirthday) && zq3.c(this.userAgeRange, authenticationTokenClaims.userAgeRange) && zq3.c(this.userHometown, authenticationTokenClaims.userHometown) && zq3.c(this.userLocation, authenticationTokenClaims.userLocation) && zq3.c(this.userGender, authenticationTokenClaims.userGender) && zq3.c(this.userLink, authenticationTokenClaims.userLink);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.familyName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.userFriends;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.userBirthday;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.userHometown;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.userLocation;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.userGender;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLink;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = b().toString();
        zq3.g(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeString(this.jti);
        parcel.writeString(this.iss);
        parcel.writeString(this.aud);
        parcel.writeString(this.nonce);
        parcel.writeLong(this.exp);
        parcel.writeLong(this.iat);
        parcel.writeString(this.sub);
        parcel.writeString(this.name);
        parcel.writeString(this.givenName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.familyName);
        parcel.writeString(this.email);
        parcel.writeString(this.picture);
        if (this.userFriends == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.userFriends));
        }
        parcel.writeString(this.userBirthday);
        parcel.writeMap(this.userAgeRange);
        parcel.writeMap(this.userHometown);
        parcel.writeMap(this.userLocation);
        parcel.writeString(this.userGender);
        parcel.writeString(this.userLink);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        zq3.h(parcel, "parcel");
        this.jti = v29.n(parcel.readString(), JSON_KEY_JIT);
        this.iss = v29.n(parcel.readString(), JSON_KEY_ISS);
        this.aud = v29.n(parcel.readString(), JSON_KEY_AUD);
        this.nonce = v29.n(parcel.readString(), JSON_KEY_NONCE);
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = v29.n(parcel.readString(), "sub");
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.userFriends = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(om3.a.getClass().getClassLoader());
        readHashMap = readHashMap == null ? null : readHashMap;
        this.userAgeRange = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        z38 z38Var = z38.a;
        HashMap readHashMap2 = parcel.readHashMap(z38Var.getClass().getClassLoader());
        readHashMap2 = readHashMap2 == null ? null : readHashMap2;
        this.userHometown = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(z38Var.getClass().getClassLoader());
        readHashMap3 = readHashMap3 == null ? null : readHashMap3;
        this.userLocation = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}

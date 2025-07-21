package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    @VisibleForTesting
    public static final Clock zaa = DefaultClock.getInstance();

    @SafeParcelable.VersionField(id = 1)
    final int zab;

    @SafeParcelable.Field(id = 10)
    final List zac;

    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zad;

    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final String zae;

    @SafeParcelable.Field(getter = "getEmail", id = 4)
    private final String zaf;

    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String zag;

    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private final Uri zah;

    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    private String zai;

    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    private final long zaj;

    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    private final String zak;

    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    private final String zal;

    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    private final String zam;
    private final Set zan = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    public static GoogleSignInAccount y1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    public static GoogleSignInAccount z1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount y1 = y1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        y1.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return y1;
    }

    public final String A1() {
        return this.zak;
    }

    public final String B1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (X0() != null) {
                jSONObject.put("id", X0());
            }
            if (u1() != null) {
                jSONObject.put("tokenId", u1());
            }
            if (G0() != null) {
                jSONObject.put("email", G0());
            }
            if (t0() != null) {
                jSONObject.put("displayName", t0());
            }
            if (K0() != null) {
                jSONObject.put("givenName", K0());
            }
            if (H0() != null) {
                jSONObject.put("familyName", H0());
            }
            Uri v1 = v1();
            if (v1 != null) {
                jSONObject.put("photoUrl", v1.toString());
            }
            if (x1() != null) {
                jSONObject.put("serverAuthCode", x1());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: eo9
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String G0() {
        return this.zaf;
    }

    public String H0() {
        return this.zam;
    }

    public String K0() {
        return this.zal;
    }

    public String X0() {
        return this.zad;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zak.equals(this.zak) && googleSignInAccount.w1().equals(w1());
    }

    public Account getAccount() {
        String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + w1().hashCode();
    }

    public String t0() {
        return this.zag;
    }

    public String u1() {
        return this.zae;
    }

    public Uri v1() {
        return this.zah;
    }

    public Set w1() {
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, X0(), false);
        SafeParcelWriter.writeString(parcel, 3, u1(), false);
        SafeParcelWriter.writeString(parcel, 4, G0(), false);
        SafeParcelWriter.writeString(parcel, 5, t0(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, v1(), i, false);
        SafeParcelWriter.writeString(parcel, 7, x1(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, K0(), false);
        SafeParcelWriter.writeString(parcel, 12, H0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public String x1() {
        return this.zai;
    }
}

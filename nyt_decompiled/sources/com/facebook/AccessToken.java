package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.f34;
import defpackage.g29;
import defpackage.t2;
import defpackage.v29;
import defpackage.w92;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AccessToken implements Parcelable {
    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;
    public static final c Companion = new c(null);
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    private static final Date DEFAULT_EXPIRATION_TIME;
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";
    private static final Date DEFAULT_LAST_REFRESH_TIME;
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    public static final String GRAPH_DOMAIN = "graph_domain";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE;
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Date dataAccessExpirationTime;
    private final Set<String> declinedPermissions;
    private final Set<String> expiredPermissions;
    private final Date expires;
    private final String graphDomain;
    private final Date lastRefresh;
    private final Set<String> permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    public interface a {
        void a(FacebookException facebookException);

        void b(AccessToken accessToken);
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel parcel) {
            zq3.h(parcel, AccessToken.SOURCE_KEY);
            return new AccessToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessToken a(AccessToken accessToken) {
            zq3.h(accessToken, "current");
            return new AccessToken(accessToken.m(), accessToken.c(), accessToken.n(), accessToken.k(), accessToken.e(), accessToken.f(), accessToken.l(), new Date(), new Date(), accessToken.d(), null, 1024, null);
        }

        public final AccessToken b(JSONObject jSONObject) {
            zq3.h(jSONObject, "jsonObject");
            if (jSONObject.getInt(AccessToken.VERSION_KEY) > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String string = jSONObject.getString(AccessToken.TOKEN_KEY);
            Date date = new Date(jSONObject.getLong(AccessToken.EXPIRES_AT_KEY));
            JSONArray jSONArray = jSONObject.getJSONArray(AccessToken.PERMISSIONS_KEY);
            JSONArray jSONArray2 = jSONObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
            JSONArray optJSONArray = jSONObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
            Date date2 = new Date(jSONObject.getLong(AccessToken.LAST_REFRESH_KEY));
            String string2 = jSONObject.getString(AccessToken.SOURCE_KEY);
            zq3.g(string2, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource valueOf = AccessTokenSource.valueOf(string2);
            String string3 = jSONObject.getString(AccessToken.APPLICATION_ID_KEY);
            String string4 = jSONObject.getString(AccessToken.USER_ID_KEY);
            Date date3 = new Date(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            String optString = jSONObject.optString(AccessToken.GRAPH_DOMAIN, null);
            zq3.g(string, AccessToken.TOKEN_KEY);
            zq3.g(string3, "applicationId");
            zq3.g(string4, "userId");
            g29 g29Var = g29.a;
            zq3.g(jSONArray, "permissionsArray");
            List c0 = g29.c0(jSONArray);
            zq3.g(jSONArray2, "declinedPermissionsArray");
            return new AccessToken(string, string3, string4, c0, g29.c0(jSONArray2), optJSONArray == null ? new ArrayList() : g29.c0(optJSONArray), valueOf, date, date2, date3, optString);
        }

        public final AccessToken c(Bundle bundle) {
            String string;
            zq3.h(bundle, "bundle");
            List f = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List f2 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List f3 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            f34.a aVar = f34.c;
            String a = aVar.a(bundle);
            if (g29.Y(a)) {
                a = w92.m();
            }
            String str = a;
            String f4 = aVar.f(bundle);
            if (f4 == null) {
                return null;
            }
            JSONObject f5 = g29.f(f4);
            if (f5 == null) {
                string = null;
            } else {
                try {
                    string = f5.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(f4, str, string, f, f2, f3, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, 1024, null);
        }

        public final void d() {
            AccessToken i = t2.f.e().i();
            if (i != null) {
                h(a(i));
            }
        }

        public final AccessToken e() {
            return t2.f.e().i();
        }

        public final List f(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return i.l();
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            zq3.g(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            AccessToken i = t2.f.e().i();
            return (i == null || i.o()) ? false : true;
        }

        public final void h(AccessToken accessToken) {
            t2.f.e().r(accessToken);
        }

        private c() {
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AccessTokenSource.valuesCustom().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    private final void a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.permissions));
        sb.append("]");
    }

    private final AccessTokenSource b(AccessTokenSource accessTokenSource, String str) {
        if (str == null || !str.equals("instagram")) {
            return accessTokenSource;
        }
        int i = d.a[accessTokenSource.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? accessTokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW : AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB : AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    private final String q() {
        w92 w92Var = w92.a;
        return w92.G(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.applicationId;
    }

    public final Date d() {
        return this.dataAccessExpirationTime;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set e() {
        return this.declinedPermissions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (zq3.c(this.expires, accessToken.expires) && zq3.c(this.permissions, accessToken.permissions) && zq3.c(this.declinedPermissions, accessToken.declinedPermissions) && zq3.c(this.expiredPermissions, accessToken.expiredPermissions) && zq3.c(this.token, accessToken.token) && this.source == accessToken.source && zq3.c(this.lastRefresh, accessToken.lastRefresh) && zq3.c(this.applicationId, accessToken.applicationId) && zq3.c(this.userId, accessToken.userId) && zq3.c(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            if (str == null ? accessToken.graphDomain == null : zq3.c(str, accessToken.graphDomain)) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.expiredPermissions;
    }

    public final Date g() {
        return this.expires;
    }

    public final String h() {
        return this.graphDomain;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Date i() {
        return this.lastRefresh;
    }

    public final Set k() {
        return this.permissions;
    }

    public final AccessTokenSource l() {
        return this.source;
    }

    public final String m() {
        return this.token;
    }

    public final String n() {
        return this.userId;
    }

    public final boolean o() {
        return new Date().after(this.expires);
    }

    public final JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VERSION_KEY, 1);
        jSONObject.put(TOKEN_KEY, this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put(PERMISSIONS_KEY, new JSONArray((Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put(SOURCE_KEY, this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put(USER_ID_KEY, this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put(GRAPH_DOMAIN, str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(q());
        a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        zq3.g(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "dest");
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeStringList(new ArrayList(this.expiredPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.dataAccessExpirationTime.getTime());
        parcel.writeString(this.graphDomain);
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        zq3.h(str, "accessToken");
        zq3.h(str2, "applicationId");
        zq3.h(str3, "userId");
        v29.j(str, "accessToken");
        v29.j(str2, "applicationId");
        v29.j(str3, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        zq3.g(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        zq3.g(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        zq3.g(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = str;
        this.source = b(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str4);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str4 == null ? DEFAULT_GRAPH_DOMAIN : str4;
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSource;
        zq3.h(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        zq3.g(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        zq3.g(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        zq3.g(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        this.token = v29.n(parcel.readString(), TOKEN_KEY);
        String readString = parcel.readString();
        if (readString != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString);
        } else {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = v29.n(parcel.readString(), "applicationId");
        this.userId = v29.n(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}

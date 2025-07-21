package com.nytimes.android.internal.pushmessaging.subscription;

import android.os.Build;
import com.nytimes.android.abra.utilities.ParamProviderKt;
import com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.bt3;
import defpackage.by0;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* loaded from: classes4.dex */
public interface PushSubscriptionAPI {
    public static final a Companion = a.a;

    @et3(generateAdapter = true)
    public static final class HelixResponseResult {
        private final int a;
        private final String b;
        private final List c;

        public HelixResponseResult(@bt3(name = "regi_id") int i, String str, List<String> list) {
            zq3.h(str, "guid");
            zq3.h(list, "tags");
            this.a = i;
            this.b = str;
            this.c = list;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final List c() {
            return this.c;
        }

        public final HelixResponseResult copy(@bt3(name = "regi_id") int i, String str, List<String> list) {
            zq3.h(str, "guid");
            zq3.h(list, "tags");
            return new HelixResponseResult(i, str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelixResponseResult)) {
                return false;
            }
            HelixResponseResult helixResponseResult = (HelixResponseResult) obj;
            return this.a == helixResponseResult.a && zq3.c(this.b, helixResponseResult.b) && zq3.c(this.c, helixResponseResult.c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "HelixResponseResult(regiId=" + this.a + ", guid=" + this.b + ", tags=" + this.c + ")";
        }
    }

    @et3(generateAdapter = true)
    public static final class HelixTagsRequest {
        private final Set a;

        public HelixTagsRequest(Set set) {
            zq3.h(set, "tags");
            this.a = set;
        }

        public final Set a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelixTagsRequest) && zq3.c(this.a, ((HelixTagsRequest) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "HelixTagsRequest(tags=" + this.a + ")";
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final JsonAdapter b = new i.b().d().c(HelixResponse.class);

        private a() {
        }
    }

    @POST("{endpoint}/svc/pushmobile/v1/device/tags/{deviceType}/{deviceId}.json")
    Object addTags(@Path(encoded = true, value = "endpoint") String str, @Path("deviceType") String str2, @Path("deviceId") String str3, @Header("Cookie") String str4, @Body HelixTagsRequest helixTagsRequest, by0<? super HelixResponse> by0Var);

    @HTTP(hasBody = true, method = "DELETE", path = "{endpoint}/svc/pushmobile/v1/device/tags/{deviceType}/{deviceId}.json")
    Object deleteTags(@Path(encoded = true, value = "endpoint") String str, @Path("deviceType") String str2, @Path("deviceId") String str3, @Header("Cookie") String str4, @Body HelixTagsRequest helixTagsRequest, by0<? super HelixResponse> by0Var);

    @POST("{endpoint}/svc/pushmobile/v2/device/{deviceType}/{deviceId}.json")
    Object registerWithHelix(@Path(encoded = true, value = "endpoint") String str, @Path("deviceType") String str2, @Path("deviceId") String str3, @Header("Cookie") String str4, @Body HelixRequest helixRequest, by0<? super HelixResponse> by0Var);

    @DELETE("{endpoint}/svc/pushmobile/v2/device/{deviceType}/{deviceId}.json")
    Object unregisterWithHelix(@Path(encoded = true, value = "endpoint") String str, @Path("deviceType") String str2, @Path("deviceId") String str3, @Header("Cookie") String str4, by0<? super HelixUnregisterResponse> by0Var);

    @et3(generateAdapter = true)
    public static final class HelixResponse {
        private final String a;
        private final List b;

        public HelixResponse(String str, List list) {
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            List list;
            return (!zq3.c(this.a, "OK") || (list = this.b) == null || list.isEmpty()) ? false : true;
        }

        public final String d() {
            if (zq3.c(this.a, "OK")) {
                List list = this.b;
                return (list == null || list.isEmpty()) ? "Response from Helix was missing results" : "OK";
            }
            return "Return status from Helix was " + this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelixResponse)) {
                return false;
            }
            HelixResponse helixResponse = (HelixResponse) obj;
            return zq3.c(this.a, helixResponse.a) && zq3.c(this.b, helixResponse.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "HelixResponse(status=" + this.a + ", results=" + this.b + ")";
        }

        public /* synthetic */ HelixResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    @et3(generateAdapter = true)
    public static final class HelixUnregisterResponse {
        private final String a;
        private final List b;

        public HelixUnregisterResponse(String str, List list) {
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelixUnregisterResponse)) {
                return false;
            }
            HelixUnregisterResponse helixUnregisterResponse = (HelixUnregisterResponse) obj;
            return zq3.c(this.a, helixUnregisterResponse.a) && zq3.c(this.b, helixUnregisterResponse.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "HelixUnregisterResponse(status=" + this.a + ", result=" + this.b + ")";
        }

        public /* synthetic */ HelixUnregisterResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    @et3(generateAdapter = true)
    public static final class HelixRequest {
        public static final a Companion = new a(null);
        private final Set a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ HelixRequest b(a aVar, Subscription subscription, NYTPushMessagingUser nYTPushMessagingUser, String str, String str2, String str3, int i, Object obj) {
                if ((i & 16) != 0) {
                    str3 = Build.VERSION.RELEASE;
                    zq3.g(str3, "RELEASE");
                }
                return aVar.a(subscription, nYTPushMessagingUser, str, str2, str3);
            }

            public final HelixRequest a(Subscription subscription, NYTPushMessagingUser nYTPushMessagingUser, String str, String str2, String str3) {
                zq3.h(subscription, "sub");
                zq3.h(str, ParamProviderKt.PARAM_TIMEZONE);
                zq3.h(str2, "namedTimezone");
                zq3.h(str3, "osVersion");
                return new HelixRequest(subscription.g(), nYTPushMessagingUser != null ? nYTPushMessagingUser.a() : null, str, str2, null, null, str3, 48, null);
            }

            private a() {
            }
        }

        public HelixRequest(Set<String> set, String str, String str2, String str3, String str4, @bt3(name = "send_method") String str5, @bt3(name = "OSVersion") String str6) {
            zq3.h(set, "tags");
            zq3.h(str5, "sendMethod");
            zq3.h(str6, "osVersion");
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final HelixRequest copy(Set<String> set, String str, String str2, String str3, String str4, @bt3(name = "send_method") String str5, @bt3(name = "OSVersion") String str6) {
            zq3.h(set, "tags");
            zq3.h(str5, "sendMethod");
            zq3.h(str6, "osVersion");
            return new HelixRequest(set, str, str2, str3, str4, str5, str6);
        }

        public final String d() {
            return this.g;
        }

        public final String e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelixRequest)) {
                return false;
            }
            HelixRequest helixRequest = (HelixRequest) obj;
            return zq3.c(this.a, helixRequest.a) && zq3.c(this.b, helixRequest.b) && zq3.c(this.c, helixRequest.c) && zq3.c(this.d, helixRequest.d) && zq3.c(this.e, helixRequest.e) && zq3.c(this.f, helixRequest.f) && zq3.c(this.g, helixRequest.g);
        }

        public final Set f() {
            return this.a;
        }

        public final String g() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return ((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        }

        public String toString() {
            return "HelixRequest(tags=" + this.a + ", agentId=" + this.b + ", timezone=" + this.c + ", namedTimezone=" + this.d + ", json=" + this.e + ", sendMethod=" + this.f + ", osVersion=" + this.g + ")";
        }

        public /* synthetic */ HelixRequest(Set set, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "FCM" : str5, str6);
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.amazonaws.services.s3.internal.Constants;
import com.nytimes.android.subauth.core.devsettings.MockQueryUserDetailsGraphQLResults;
import com.nytimes.android.subauth.core.devsettings.MockSubauthGraphQLFactoryException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.SocketException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class ru4 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final Resources b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MockQueryUserDetailsGraphQLResults.values().length];
            try {
                iArr[MockQueryUserDetailsGraphQLResults.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.SUCCESS_ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.SUCCESS_NON_SUBSCRIBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.SOFT_CANCELLED_OWNER_UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.INVALID_DATES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.FAILURE_SOCKET_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.FAILURE_INVALID_APOLLO_RESPONSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.FAIL_OPEN_USER_EMPTY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MockQueryUserDetailsGraphQLResults.FAIL_OPEN_SUBSCRIPTIONS_EMPTY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr;
        }
    }

    public ru4(SharedPreferences sharedPreferences, Resources resources) {
        zq3.h(sharedPreferences, "sharedPrefs");
        zq3.h(resources, "resources");
        this.a = sharedPreferences;
        this.b = resources;
    }

    private final MockQueryUserDetailsGraphQLResults a() {
        String string = this.a.getString("com.nytimes.android.subauth.common_override_user_details", null);
        return zq3.c(string, this.b.getString(hm6.subauth_override_user_details_success_entitled)) ? MockQueryUserDetailsGraphQLResults.SUCCESS_ENTITLED : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_success_non_subscriber)) ? MockQueryUserDetailsGraphQLResults.SUCCESS_NON_SUBSCRIBER : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_failure)) ? MockQueryUserDetailsGraphQLResults.FAILURE : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_soft_cancel)) ? MockQueryUserDetailsGraphQLResults.SOFT_CANCELLED_OWNER_UNKNOWN : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_invalid_dates)) ? MockQueryUserDetailsGraphQLResults.INVALID_DATES : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_failure_socket_exception)) ? MockQueryUserDetailsGraphQLResults.FAILURE_SOCKET_EXCEPTION : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_failure_invalid_response)) ? MockQueryUserDetailsGraphQLResults.FAILURE_INVALID_APOLLO_RESPONSE : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_fail_open_empty_user)) ? MockQueryUserDetailsGraphQLResults.FAIL_OPEN_USER_EMPTY : zq3.c(string, this.b.getString(hm6.subauth_override_user_details_fail_open_empty_sub)) ? MockQueryUserDetailsGraphQLResults.FAIL_OPEN_SUBSCRIPTIONS_EMPTY : MockQueryUserDetailsGraphQLResults.NO_OVERRIDE;
    }

    private final int b(MockQueryUserDetailsGraphQLResults mockQueryUserDetailsGraphQLResults) {
        switch (b.a[mockQueryUserDetailsGraphQLResults.ordinal()]) {
            case 1:
                throw new MockSubauthGraphQLFactoryException("Attempting to get JSON from invalid mock graphQL type: " + mockQueryUserDetailsGraphQLResults);
            case 2:
                return hj6.mock_user_details_success_entitled;
            case 3:
                return hj6.mock_user_details_success_nonentitled;
            case 4:
                return hj6.mock_user_details_success_entitled_soft_cancelled;
            case 5:
                return hj6.mock_user_details_bad_dates;
            case 6:
                return hj6.mock_user_details_failure;
            case 7:
                throw new SocketException("Fake Socket Exception - Dev Setting");
            case 8:
                return hj6.mock_user_details_invalid_parse_response;
            case 9:
                return hj6.mock_user_details_fail_open_user_empty;
            case 10:
                return hj6.mock_user_details_fail_open_subscriptions_empty;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String d(int i) {
        InputStream openRawResource = this.b.openRawResource(i);
        zq3.g(openRawResource, "openRawResource(...)");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Constants.DEFAULT_ENCODING));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    ww8 ww8Var = ww8.a;
                    gm0.a(openRawResource, null);
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, read);
            }
        } finally {
        }
    }

    public final boolean c() {
        return a() != MockQueryUserDetailsGraphQLResults.NO_OVERRIDE;
    }

    public final String e() {
        String string = this.a.getString("com.nytimes.android.subauth.common_override_user_details", null);
        return string == null ? "N/A" : string;
    }

    public final ResponseBody f() {
        MockQueryUserDetailsGraphQLResults a2 = a();
        if (b.a[a2.ordinal()] == 1) {
            return null;
        }
        int b2 = b(a2);
        ResponseBody.Companion companion = ResponseBody.Companion;
        byte[] bytes = d(b2).getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        return companion.create(bytes, MediaType.Companion.parse(zendesk.core.Constants.APPLICATION_JSON));
    }
}

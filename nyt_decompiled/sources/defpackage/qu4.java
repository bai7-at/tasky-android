package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.amazonaws.services.s3.internal.Constants;
import com.nytimes.android.subauth.core.devsettings.purr.MockMutatePurrTCFGraphQLResults;
import com.nytimes.android.subauth.core.devsettings.purr.MockPurrGraphQLFactoryException;
import com.nytimes.android.subauth.core.devsettings.purr.MockQueryPurrDirectivesGraphQLResults;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class qu4 {
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
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MockQueryPurrDirectivesGraphQLResults.values().length];
            try {
                iArr[MockQueryPurrDirectivesGraphQLResults.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MockQueryPurrDirectivesGraphQLResults.NO_TCF_HIDE_TCF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MockQueryPurrDirectivesGraphQLResults.NO_TCF_SHOW_TCF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MockQueryPurrDirectivesGraphQLResults.TCF_HASHES_SAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MockQueryPurrDirectivesGraphQLResults.TCF_HASHES_DIFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MockQueryPurrDirectivesGraphQLResults.FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
            int[] iArr2 = new int[MockMutatePurrTCFGraphQLResults.values().length];
            try {
                iArr2[MockMutatePurrTCFGraphQLResults.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MockMutatePurrTCFGraphQLResults.TCF_HASHES_SAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MockMutatePurrTCFGraphQLResults.TCF_HASHES_DIFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    public qu4(SharedPreferences sharedPreferences, Resources resources) {
        zq3.h(sharedPreferences, "sharedPrefs");
        zq3.h(resources, "resources");
        this.a = sharedPreferences;
        this.b = resources;
    }

    private final MockMutatePurrTCFGraphQLResults a() {
        MockMutatePurrTCFGraphQLResults valueOf;
        String string = this.a.getString("mock_mutate_purr_prefs_graphql", null);
        return (string == null || (valueOf = MockMutatePurrTCFGraphQLResults.valueOf(string)) == null) ? MockMutatePurrTCFGraphQLResults.NO_OVERRIDE : valueOf;
    }

    private final MockQueryPurrDirectivesGraphQLResults b() {
        MockQueryPurrDirectivesGraphQLResults valueOf;
        String string = this.a.getString("mock_query_purr_directives_graphql", null);
        return (string == null || (valueOf = MockQueryPurrDirectivesGraphQLResults.valueOf(string)) == null) ? MockQueryPurrDirectivesGraphQLResults.NO_OVERRIDE : valueOf;
    }

    private final int c(MockMutatePurrTCFGraphQLResults mockMutatePurrTCFGraphQLResults) {
        int i = b.b[mockMutatePurrTCFGraphQLResults.ordinal()];
        if (i == 1) {
            throw new MockPurrGraphQLFactoryException("Attempting to get JSON from invalid mock graphQL type: " + mockMutatePurrTCFGraphQLResults);
        }
        if (i == 2) {
            return hj6.mock_purr_prefs_tcf_hashes_same;
        }
        if (i == 3) {
            return hj6.mock_purr_prefs_tcf_hashes_diff;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int d(MockQueryPurrDirectivesGraphQLResults mockQueryPurrDirectivesGraphQLResults) {
        switch (b.a[mockQueryPurrDirectivesGraphQLResults.ordinal()]) {
            case 1:
                throw new MockPurrGraphQLFactoryException("Attempting to get JSON from invalid mock graphQL type: " + mockQueryPurrDirectivesGraphQLResults);
            case 2:
                return hj6.mock_purr_directives_no_tcf_hide_tcf;
            case 3:
                return hj6.mock_purr_directives_no_tcf_show_tcf;
            case 4:
                return hj6.mock_purr_directives_tcf_hashes_same;
            case 5:
                return hj6.mock_purr_directives_tcf_hashes_diff;
            case 6:
                return hj6.mock_purr_directives_failure;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String g(int i) {
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

    public final boolean e() {
        return a() != MockMutatePurrTCFGraphQLResults.NO_OVERRIDE;
    }

    public final boolean f() {
        return b() != MockQueryPurrDirectivesGraphQLResults.NO_OVERRIDE;
    }

    public final ResponseBody h() {
        MockMutatePurrTCFGraphQLResults a2 = a();
        if (b.b[a2.ordinal()] == 1) {
            return null;
        }
        int c = c(a2);
        ResponseBody.Companion companion = ResponseBody.Companion;
        byte[] bytes = g(c).getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        return companion.create(bytes, MediaType.Companion.parse(zendesk.core.Constants.APPLICATION_JSON));
    }

    public final String i() {
        String string = this.a.getString("mock_mutate_purr_prefs_graphql", null);
        return string == null ? "N/A" : string;
    }

    public final ResponseBody j() {
        MockQueryPurrDirectivesGraphQLResults b2 = b();
        if (b.a[b2.ordinal()] == 1) {
            return null;
        }
        int d = d(b2);
        ResponseBody.Companion companion = ResponseBody.Companion;
        byte[] bytes = g(d).getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        return companion.create(bytes, MediaType.Companion.parse(zendesk.core.Constants.APPLICATION_JSON));
    }

    public final String k() {
        String string = this.a.getString("mock_query_purr_directives_graphql", null);
        return string == null ? "N/A" : string;
    }
}

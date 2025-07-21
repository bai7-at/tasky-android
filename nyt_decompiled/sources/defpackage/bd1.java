package defpackage;

import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class bd1 {
    public static final bd1 a = new bd1();

    private bd1() {
    }

    private final boolean a(Uri uri) {
        return uri.getQueryParameterNames().containsAll(i.o("code", TransferTable.COLUMN_STATE));
    }

    private final boolean b(Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            return host.contentEquals("reader");
        }
        return false;
    }

    private final boolean c(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return scheme.contentEquals("nytimes");
        }
        return false;
    }

    private final boolean d(Uri uri) {
        return uri.getQueryParameterNames().contains("unlocked_article_code");
    }

    private final boolean e(Uri uri) {
        return i(uri) | (c(uri) & b(uri));
    }

    public static final boolean f(String str) {
        if (str == null || h.d0(str)) {
            return false;
        }
        bd1 bd1Var = a;
        Uri parse = Uri.parse(str);
        zq3.g(parse, "parse(...)");
        return bd1Var.e(parse);
    }

    public static final boolean h(String str) {
        bd1 bd1Var = a;
        Uri parse = Uri.parse(str);
        zq3.g(parse, "parse(...)");
        return bd1Var.a(parse);
    }

    private final boolean i(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return scheme.contentEquals("nyt");
        }
        return false;
    }

    public static final boolean j(String str) {
        if (str == null || h.d0(str)) {
            return false;
        }
        bd1 bd1Var = a;
        Uri parse = Uri.parse(str);
        zq3.g(parse, "parse(...)");
        return bd1Var.d(parse);
    }

    public final boolean g(String str) {
        zq3.h(str, "url");
        Uri parse = Uri.parse(str);
        zq3.g(parse, "parse(...)");
        return c(parse);
    }
}

package defpackage;

import com.nytimes.android.link.share.ErrorCodes;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class gz8 extends iz8 {
    private final String a;
    private final String b;

    public gz8(String str, String str2) {
        super(null);
        this.a = str;
        this.b = str2;
    }

    public final boolean a() {
        String str;
        if (!zq3.c(this.a, ErrorCodes.OUT_OF_ARTICLES.getValue()) || (str = this.b) == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return lowerCase != null && h.P(lowerCase, "share limit reached", false, 2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz8)) {
            return false;
        }
        gz8 gz8Var = (gz8) obj;
        return zq3.c(this.a, gz8Var.a) && zq3.c(this.b, gz8Var.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UrlShareCodeError(code=" + this.a + ", message=" + this.b + ")";
    }
}

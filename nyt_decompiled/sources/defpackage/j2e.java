package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public final class j2e {
    private final Pattern a;

    public j2e() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) pla.c().a(mpa.T6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}

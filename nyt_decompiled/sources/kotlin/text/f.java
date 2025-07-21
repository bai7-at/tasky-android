package kotlin.text;

import defpackage.an3;
import defpackage.uo6;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes5.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e c(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final an3 d(MatchResult matchResult, int i) {
        return uo6.u(matchResult.start(i), matchResult.end(i));
    }
}

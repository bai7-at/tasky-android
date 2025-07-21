package defpackage;

import com.apollographql.apollo.exception.ApolloHttpException;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes3.dex */
public abstract class p94 {
    public static final void a(NYTLogger nYTLogger, String str, Throwable th) {
        zq3.h(nYTLogger, "<this>");
        zq3.h(str, "feedId");
        if (th != null) {
            NYTLogger.e(th);
        }
        if (th != null) {
            if (th instanceof ApolloHttpException) {
                th = null;
            }
            if (th != null) {
                NYTLogger.s(new Exception("Failed to load feedId=" + str, th));
            }
        }
    }
}

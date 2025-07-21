package defpackage;

import defpackage.ul8;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class xz0 extends ul8.a {
    public static final a Companion = new a(null);
    private static final Pattern e = Pattern.compile("(\\$\\d+)+$");
    private final Set d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public xz0(Set set) {
        zq3.h(set, "denyList");
        this.d = set;
    }

    private final StackTraceElement x() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length <= 9) {
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
        StackTraceElement stackTraceElement = stackTrace[9];
        zq3.g(stackTraceElement, "get(...)");
        return stackTraceElement;
    }

    private final String y(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Matcher matcher = e.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        zq3.e(className);
        zq3.e(className);
        String substring = className.substring(h.g0(className, '.', 0, false, 6, null) + 1);
        zq3.g(substring, "substring(...)");
        int length = substring.length();
        zq3.e(substring);
        if (length <= 23) {
            return substring;
        }
        String substring2 = substring.substring(0, 23);
        zq3.g(substring2, "substring(...)");
        return substring2;
    }

    @Override // ul8.c
    protected boolean o(String str, int i) {
        if (super.o(str, i)) {
            if (str != null ? !this.d.contains(str) : true) {
                return true;
            }
        }
        return false;
    }

    @Override // ul8.a
    protected String w(StackTraceElement stackTraceElement) {
        zq3.h(stackTraceElement, "element");
        return y(x());
    }
}

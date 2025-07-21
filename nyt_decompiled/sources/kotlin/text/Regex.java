package kotlin.text;

import defpackage.uo6;
import defpackage.zq3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Regex implements Serializable {
    public static final a a = new a(null);
    private Set<Object> _options;
    private final Pattern nativePattern;

    private static final class Serialized implements Serializable {
        public static final a a = new a(null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public Serialized(String str, int i) {
            zq3.h(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            zq3.g(compile, "compile(...)");
            return new Regex(compile);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Regex(Pattern pattern) {
        zq3.h(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ e c(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.b(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        zq3.g(pattern, "pattern(...)");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        zq3.h(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final e b(CharSequence charSequence, int i) {
        e c;
        zq3.h(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        zq3.g(matcher, "matcher(...)");
        c = f.c(matcher, i, charSequence);
        return c;
    }

    public final boolean d(CharSequence charSequence) {
        zq3.h(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String e(CharSequence charSequence, String str) {
        zq3.h(charSequence, "input");
        zq3.h(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        zq3.g(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String f(CharSequence charSequence, String str) {
        zq3.h(charSequence, "input");
        zq3.h(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        zq3.g(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List g(CharSequence charSequence, int i) {
        zq3.h(charSequence, "input");
        StringsKt__StringsKt.A0(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return kotlin.collections.i.e(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? uo6.i(i, 10) : 10);
        int i2 = i - 1;
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        zq3.g(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            defpackage.zq3.h(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            defpackage.zq3.g(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }
}

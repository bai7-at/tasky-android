package defpackage;

import android.os.LocaleList;
import io.embrace.android.embracesdk.payload.Session;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m74 {
    private static final m74 b = a(new Locale[0]);
    private final o74 a;

    static class a {
        private static final Locale[] a = {new Locale(Session.MESSAGE_TYPE_END, "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a2 = zd3.a(locale);
            if (!a2.isEmpty()) {
                return a2.equals(zd3.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private m74(o74 o74Var) {
        this.a = o74Var;
    }

    public static m74 a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static m74 b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(split[i]);
        }
        return a(localeArr);
    }

    public static m74 d() {
        return b;
    }

    public static m74 i(LocaleList localeList) {
        return new m74(new p74(localeList));
    }

    public Locale c(int i) {
        return this.a.get(i);
    }

    public boolean e() {
        return this.a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof m74) && this.a.equals(((m74) obj).a);
    }

    public int f() {
        return this.a.size();
    }

    public String g() {
        return this.a.a();
    }

    public Object h() {
        return this.a.b();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

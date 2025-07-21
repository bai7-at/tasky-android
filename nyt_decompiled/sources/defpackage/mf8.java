package defpackage;

import androidx.room.Index$Order;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class mf8 {
    public static final b e = new b(null);
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public static final class a {
        public static final C0507a h = new C0507a(null);
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        /* renamed from: mf8$a$a, reason: collision with other inner class name */
        public static final class C0507a {
            public /* synthetic */ C0507a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                return i2 == 0;
            }

            public final boolean b(String str, String str2) {
                zq3.h(str, "current");
                if (zq3.c(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return zq3.c(h.c1(substring).toString(), str2);
            }

            private C0507a() {
            }
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, TransferTable.COLUMN_TYPE);
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            this.g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String upperCase = str.toUpperCase(locale);
            zq3.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (h.P(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (h.P(upperCase, "CHAR", false, 2, null) || h.P(upperCase, "CLOB", false, 2, null) || h.P(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (h.P(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (h.P(upperCase, "REAL", false, 2, null) || h.P(upperCase, "FLOA", false, 2, null) || h.P(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.d != ((a) obj).d) {
                return false;
            }
            a aVar = (a) obj;
            if (!zq3.c(this.a, aVar.a) || this.c != aVar.c) {
                return false;
            }
            if (this.f == 1 && aVar.f == 2 && (str3 = this.e) != null && !h.b(str3, aVar.e)) {
                return false;
            }
            if (this.f == 2 && aVar.f == 1 && (str2 = aVar.e) != null && !h.b(str2, this.e)) {
                return false;
            }
            int i = this.f;
            return (i == 0 || i != aVar.f || ((str = this.e) == null ? aVar.e == null : h.b(str, aVar.e))) && this.g == aVar.g;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mf8 a(sc8 sc8Var, String str) {
            zq3.h(sc8Var, "database");
            zq3.h(str, "tableName");
            return nf8.f(sc8Var, str);
        }

        private b() {
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List d;
        public final List e;

        public c(String str, String str2, String str3, List list, List list2) {
            zq3.h(str, "referenceTable");
            zq3.h(str2, "onDelete");
            zq3.h(str3, "onUpdate");
            zq3.h(list, "columnNames");
            zq3.h(list2, "referenceColumnNames");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d)) {
                return zq3.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    public static final class d implements Comparable {
        private final int a;
        private final int b;
        private final String c;
        private final String d;

        public d(int i, int i2, String str, String str2) {
            zq3.h(str, "from");
            zq3.h(str2, "to");
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            zq3.h(dVar, "other");
            int i = this.a - dVar.a;
            return i == 0 ? this.b - dVar.b : i;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }
    }

    public static final class e {
        public static final a e = new a(null);
        public final String a;
        public final boolean b;
        public final List c;
        public List d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String str, boolean z, List list, List list2) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(list, "columns");
            zq3.h(list2, "orders");
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = list2;
            List list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list3.add(Index$Order.ASC.name());
                }
            }
            this.d = (List) list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.b == eVar.b && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d)) {
                return h.K(this.a, "index_", false, 2, null) ? h.K(eVar.a, "index_", false, 2, null) : zq3.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((h.K(this.a, "index_", false, 2, null) ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
        }
    }

    public mf8(String str, Map map, Set set, Set set2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "columns");
        zq3.h(set, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public static final mf8 a(sc8 sc8Var, String str) {
        return e.a(sc8Var, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf8)) {
            return false;
        }
        mf8 mf8Var = (mf8) obj;
        if (!zq3.c(this.a, mf8Var.a) || !zq3.c(this.b, mf8Var.b) || !zq3.c(this.c, mf8Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = mf8Var.d) == null) {
            return true;
        }
        return zq3.c(set2, set);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

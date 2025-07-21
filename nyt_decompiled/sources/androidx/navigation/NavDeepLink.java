package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c04;
import defpackage.du8;
import defpackage.j25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class NavDeepLink {
    private static final b q = new b(null);
    private static final Pattern r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final Pattern s = Pattern.compile("\\{(.+?)\\}");
    private final String a;
    private final String b;
    private final String c;
    private String e;
    private final c04 h;
    private boolean i;
    private final c04 j;
    private final c04 k;
    private final c04 l;
    private final c04 m;
    private String n;
    private final c04 o;
    private boolean p;
    private final List d = new ArrayList();
    private final c04 f = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pattern mo865invoke() {
            String str;
            str = NavDeepLink.this.e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    });
    private final c04 g = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf((NavDeepLink.this.y() == null || Uri.parse(NavDeepLink.this.y()).getQuery() == null) ? false : true);
        }
    });

    public static final class a {
        public static final C0094a d = new C0094a(null);
        private String a;
        private String b;
        private String c;

        /* renamed from: androidx.navigation.NavDeepLink$a$a, reason: collision with other inner class name */
        public static final class C0094a {
            public /* synthetic */ C0094a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0094a() {
            }
        }

        public final NavDeepLink a() {
            return new NavDeepLink(this.a, this.b, this.c);
        }

        public final a b(String str) {
            zq3.h(str, "uriPattern");
            this.a = str;
            return this;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c implements Comparable {
        private String a;
        private String b;

        public c(String str) {
            List l;
            zq3.h(str, "mimeType");
            List g = new Regex("/").g(str, 0);
            if (!g.isEmpty()) {
                ListIterator listIterator = g.listIterator(g.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        l = kotlin.collections.i.P0(g, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            l = kotlin.collections.i.l();
            this.a = (String) l.get(0);
            this.b = (String) l.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            zq3.h(cVar, "other");
            int i = zq3.c(this.a, cVar.a) ? 2 : 0;
            return zq3.c(this.b, cVar.b) ? i + 1 : i;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }
    }

    private static final class d {
        private String a;
        private final List b = new ArrayList();

        public final void a(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.b.add(str);
        }

        public final List b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final void d(String str) {
            this.a = str;
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map mo865invoke() {
                Map H;
                H = NavDeepLink.this.H();
                return H;
            }
        });
        this.j = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pair mo865invoke() {
                Pair D;
                D = NavDeepLink.this.D();
                return D;
            }
        });
        this.k = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List mo865invoke() {
                Pair l;
                List list;
                l = NavDeepLink.this.l();
                return (l == null || (list = (List) l.c()) == null) ? new ArrayList() : list;
            }
        });
        this.l = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                Pair l;
                l = NavDeepLink.this.l();
                if (l != null) {
                    return (String) l.d();
                }
                return null;
            }
        });
        this.m = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pattern mo865invoke() {
                String n;
                n = NavDeepLink.this.n();
                if (n != null) {
                    return Pattern.compile(n, 2);
                }
                return null;
            }
        });
        this.o = kotlin.c.a(new qs2() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pattern mo865invoke() {
                String str4;
                str4 = NavDeepLink.this.n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        G();
        F();
    }

    private final boolean A() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean B(Bundle bundle, String str, String str2, androidx.navigation.a aVar) {
        if (aVar != null) {
            aVar.a().d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    private final boolean C(Bundle bundle, String str, String str2, androidx.navigation.a aVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (aVar == null) {
            return false;
        }
        j a2 = aVar.a();
        a2.e(bundle, str, str2, a2.a(bundle, str));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair D() {
        String str = this.a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.a).getFragment();
        StringBuilder sb = new StringBuilder();
        zq3.e(fragment);
        g(fragment, arrayList, sb);
        String sb2 = sb.toString();
        zq3.g(sb2, "fragRegex.toString()");
        return du8.a(arrayList, sb2);
    }

    private final boolean E(List list, d dVar, Bundle bundle, Map map) {
        if (list == null) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            String c2 = dVar.c();
            Matcher matcher = c2 != null ? Pattern.compile(c2, 32).matcher(str) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            try {
                List b2 = dVar.b();
                ArrayList arrayList = new ArrayList(kotlin.collections.i.w(b2, 10));
                int i = 0;
                for (Object obj : b2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.i.v();
                    }
                    String str2 = (String) obj;
                    String group = matcher.group(i2);
                    if (group == null) {
                        group = "";
                    } else {
                        zq3.g(group, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    androidx.navigation.a aVar = (androidx.navigation.a) map.get(str2);
                    if (C(bundle, str2, group, aVar)) {
                        if (!zq3.c(group, '{' + str2 + '}') && B(bundle2, str2, group, aVar)) {
                            return false;
                        }
                    }
                    arrayList.add(ww8.a);
                    i = i2;
                }
                bundle.putAll(bundle2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }

    private final void F() {
        if (this.c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.c).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.c);
        this.n = kotlin.text.h.F("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void G() {
        if (this.a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!r.matcher(this.a).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.a);
        matcher.find();
        boolean z = false;
        String substring = this.a.substring(0, matcher.start());
        zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        g(substring, this.d, sb);
        if (!kotlin.text.h.P(sb, ".*", false, 2, null) && !kotlin.text.h.P(sb, "([^/]+?)", false, 2, null)) {
            z = true;
        }
        this.p = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        zq3.g(sb2, "uriRegex.toString()");
        this.e = kotlin.text.h.F(sb2, ".*", "\\E.*\\Q", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.a);
        for (String str : parse.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParameters = parse.getQueryParameters(str);
            if (queryParameters.size() > 1) {
                throw new IllegalArgumentException(("Query parameter " + str + " must only be present once in " + this.a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            zq3.g(queryParameters, "queryParams");
            String str2 = (String) kotlin.collections.i.m0(queryParameters);
            if (str2 == null) {
                this.i = true;
                str2 = str;
            }
            Matcher matcher = s.matcher(str2);
            d dVar = new d();
            int i = 0;
            while (matcher.find()) {
                String group = matcher.group(1);
                zq3.f(group, "null cannot be cast to non-null type kotlin.String");
                dVar.a(group);
                zq3.g(str2, "queryParam");
                String substring = str2.substring(i, matcher.start());
                zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("(.+?)?");
                i = matcher.end();
            }
            if (i < str2.length()) {
                zq3.g(str2, "queryParam");
                String substring2 = str2.substring(i);
                zq3.g(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(Pattern.quote(substring2));
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "argRegex.toString()");
            dVar.d(kotlin.text.h.F(sb2, ".*", "\\E.*\\Q", false, 4, null));
            zq3.g(str, "paramName");
            linkedHashMap.put(str, dVar);
        }
        return linkedHashMap;
    }

    private final void g(String str, List list, StringBuilder sb) {
        Matcher matcher = s.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            zq3.f(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i) {
                String substring = str.substring(i, matcher.start());
                zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]+?)");
            i = matcher.end();
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            zq3.g(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
    }

    private final List k() {
        return (List) this.k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair l() {
        return (Pair) this.j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map map) {
        List list = this.d;
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.i.v();
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i2));
            androidx.navigation.a aVar = (androidx.navigation.a) map.get(str);
            try {
                zq3.g(decode, "value");
                if (B(bundle, str, decode, aVar)) {
                    return false;
                }
                arrayList.add(ww8.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : x().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !zq3.c(query, uri.toString())) {
                queryParameters = kotlin.collections.i.e(query);
            }
            if (!E(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map map) {
        Pattern m = m();
        Matcher matcher = m != null ? m.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List k = k();
            ArrayList arrayList = new ArrayList(kotlin.collections.i.w(k, 10));
            int i = 0;
            for (Object obj : k) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.i.v();
                }
                String str2 = (String) obj;
                String decode = Uri.decode(matcher.group(i2));
                androidx.navigation.a aVar = (androidx.navigation.a) map.get(str2);
                try {
                    zq3.g(decode, "value");
                    if (B(bundle, str2, decode, aVar)) {
                        return;
                    }
                    arrayList.add(ww8.a);
                    i = i2;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f.getValue();
    }

    private final Map x() {
        return (Map) this.h.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        return zq3.c(this.a, navDeepLink.a) && zq3.c(this.b, navDeepLink.b) && zq3.c(this.c, navDeepLink.c);
    }

    public final int h(Uri uri) {
        if (uri == null || this.a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.a).getPathSegments();
        zq3.g(pathSegments, "requestedPathSegments");
        zq3.g(pathSegments2, "uriPathSegments");
        return kotlin.collections.i.q0(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.b;
    }

    public final List j() {
        List list = this.d;
        Collection values = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            kotlin.collections.i.B(arrayList, ((d) it2.next()).b());
        }
        return kotlin.collections.i.F0(kotlin.collections.i.F0(list, arrayList), k());
    }

    public final Bundle o(Uri uri, Map map) {
        zq3.h(uri, "deepLink");
        zq3.h(map, "arguments");
        Pattern w = w();
        Matcher matcher = w != null ? w.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        if (!q(matcher, bundle, map)) {
            return null;
        }
        if (A() && !r(uri, bundle, map)) {
            return null;
        }
        s(uri.getFragment(), bundle, map);
        if (j25.a(map, new ss2() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                zq3.h(str, "argName");
                return Boolean.valueOf(!bundle.containsKey(str));
            }
        }).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final Bundle p(Uri uri, Map map) {
        zq3.h(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w = w();
        Matcher matcher = w != null ? w.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, map);
        if (A()) {
            r(uri, bundle, map);
        }
        return bundle;
    }

    public final String t() {
        return this.c;
    }

    public final int u(String str) {
        zq3.h(str, "mimeType");
        if (this.c != null) {
            Pattern v = v();
            zq3.e(v);
            if (v.matcher(str).matches()) {
                return new c(this.c).compareTo(new c(str));
            }
        }
        return -1;
    }

    public final String y() {
        return this.a;
    }

    public final boolean z() {
        return this.p;
    }
}

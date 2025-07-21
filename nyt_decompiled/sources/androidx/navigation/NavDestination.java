package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavDeepLink;
import androidx.navigation.e;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ak7;
import defpackage.i25;
import defpackage.j25;
import defpackage.ku8;
import defpackage.lh4;
import defpackage.py7;
import defpackage.ry7;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class NavDestination {
    public static final Companion j = new Companion(null);
    private static final Map k = new LinkedHashMap();
    private final String a;
    private NavGraph b;
    private String c;
    private CharSequence d;
    private final List e;
    private final py7 f;
    private Map g;
    private int h;
    private String i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i) {
            String valueOf;
            zq3.h(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                valueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
            zq3.g(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        public final ak7 c(NavDestination navDestination) {
            zq3.h(navDestination, "<this>");
            return kotlin.sequences.d.f(navDestination, new ss2() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(NavDestination navDestination2) {
                    zq3.h(navDestination2, "it");
                    return navDestination2.u();
                }
            });
        }

        private Companion() {
        }
    }

    public static final class a implements Comparable {
        private final NavDestination a;
        private final Bundle b;
        private final boolean c;
        private final int d;
        private final boolean e;
        private final int f;

        public a(NavDestination navDestination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            zq3.h(navDestination, "destination");
            this.a = navDestination;
            this.b = bundle;
            this.c = z;
            this.d = i;
            this.e = z2;
            this.f = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            zq3.h(aVar, "other");
            boolean z = this.c;
            if (z && !aVar.c) {
                return 1;
            }
            if (!z && aVar.c) {
                return -1;
            }
            int i = this.d - aVar.d;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.b;
            if (bundle != null && aVar.b == null) {
                return 1;
            }
            if (bundle == null && aVar.b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = aVar.b;
                zq3.e(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.e;
            if (z2 && !aVar.e) {
                return 1;
            }
            if (z2 || !aVar.e) {
                return this.f - aVar.f;
            }
            return -1;
        }

        public final NavDestination b() {
            return this.a;
        }

        public final Bundle c() {
            return this.b;
        }

        public final boolean d(Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.b) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            zq3.g(keySet, "matchingArgs.keySet()");
            for (String str : keySet) {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                androidx.navigation.a aVar = (androidx.navigation.a) this.a.g.get(str);
                Object obj2 = null;
                j a = aVar != null ? aVar.a() : null;
                if (a != null) {
                    Bundle bundle3 = this.b;
                    zq3.g(str, TransferTable.COLUMN_KEY);
                    obj = a.a(bundle3, str);
                } else {
                    obj = null;
                }
                if (a != null) {
                    zq3.g(str, TransferTable.COLUMN_KEY);
                    obj2 = a.a(bundle, str);
                }
                if (!zq3.c(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public NavDestination(String str) {
        zq3.h(str, "navigatorName");
        this.a = str;
        this.e = new ArrayList();
        this.f = new py7();
        this.g = new LinkedHashMap();
    }

    public static /* synthetic */ int[] o(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.n(navDestination2);
    }

    private final boolean w(NavDeepLink navDeepLink, Uri uri, Map map) {
        final Bundle p = navDeepLink.p(uri, map);
        return j25.a(map, new ss2() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                zq3.h(str, TransferTable.COLUMN_KEY);
                return Boolean.valueOf(!p.containsKey(str));
            }
        }).isEmpty();
    }

    public final void A(int i, i25 i25Var) {
        zq3.h(i25Var, "action");
        if (F()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f.i(i, i25Var);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void B(int i) {
        this.h = i;
        this.c = null;
    }

    public final void C(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void D(NavGraph navGraph) {
        this.b = navGraph;
    }

    public final void E(String str) {
        Object obj;
        if (str == null) {
            B(0);
        } else {
            if (kotlin.text.h.d0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String a2 = j.a(str);
            B(a2.hashCode());
            g(a2);
        }
        List list = this.e;
        List list2 = list;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (zq3.c(((NavDeepLink) obj).y(), j.a(this.i))) {
                    break;
                }
            }
        }
        ku8.a(list2).remove(obj);
        this.i = str;
    }

    public boolean F() {
        return true;
    }

    public final void c(String str, androidx.navigation.a aVar) {
        zq3.h(str, "argumentName");
        zq3.h(aVar, "argument");
        this.g.put(str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lba
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lba
        Ld:
            java.util.List r2 = r8.e
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List r3 = r9.e
            boolean r2 = defpackage.zq3.c(r2, r3)
            py7 r3 = r8.f
            int r3 = r3.m()
            py7 r4 = r9.f
            int r4 = r4.m()
            if (r3 != r4) goto L58
            py7 r3 = r8.f
            qm3 r3 = defpackage.ry7.a(r3)
            ak7 r3 = kotlin.sequences.d.c(r3)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            py7 r5 = r8.f
            java.lang.Object r5 = r5.e(r4)
            py7 r6 = r9.f
            java.lang.Object r4 = r6.e(r4)
            boolean r4 = defpackage.zq3.c(r5, r4)
            if (r4 != 0) goto L33
            goto L58
        L56:
            r3 = r0
            goto L59
        L58:
            r3 = r1
        L59:
            java.util.Map r4 = r8.g
            int r4 = r4.size()
            java.util.Map r5 = r9.g
            int r5 = r5.size()
            if (r4 != r5) goto La0
            java.util.Map r4 = r8.g
            ak7 r4 = kotlin.collections.t.y(r4)
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.g
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La0
            java.util.Map r6 = r9.g
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.zq3.c(r6, r5)
            if (r5 == 0) goto La0
            goto L71
        L9e:
            r4 = r0
            goto La1
        La0:
            r4 = r1
        La1:
            int r5 = r8.h
            int r6 = r9.h
            if (r5 != r6) goto Lb8
            java.lang.String r8 = r8.i
            java.lang.String r9 = r9.i
            boolean r8 = defpackage.zq3.c(r8, r9)
            if (r8 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = r1
        Lb9:
            return r0
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public final void f(final NavDeepLink navDeepLink) {
        zq3.h(navDeepLink, "navDeepLink");
        List a2 = j25.a(this.g, new ss2() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                zq3.h(str, TransferTable.COLUMN_KEY);
                return Boolean.valueOf(!NavDeepLink.this.j().contains(str));
            }
        });
        if (a2.isEmpty()) {
            this.e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a2).toString());
    }

    public final void g(String str) {
        zq3.h(str, "uriPattern");
        f(new NavDeepLink.a().b(str).a());
    }

    public int hashCode() {
        int i = this.h * 31;
        String str = this.i;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.e) {
            int i2 = hashCode * 31;
            String y = navDeepLink.y();
            int hashCode2 = (i2 + (y != null ? y.hashCode() : 0)) * 31;
            String i3 = navDeepLink.i();
            int hashCode3 = (hashCode2 + (i3 != null ? i3.hashCode() : 0)) * 31;
            String t = navDeepLink.t();
            hashCode = hashCode3 + (t != null ? t.hashCode() : 0);
        }
        Iterator b = ry7.b(this.f);
        if (b.hasNext()) {
            lh4.a(b.next());
            throw null;
        }
        for (String str2 : this.g.keySet()) {
            int hashCode4 = ((hashCode * 31) + str2.hashCode()) * 31;
            Object obj = this.g.get(str2);
            hashCode = hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public final Bundle j(Bundle bundle) {
        Map map;
        if (bundle == null && ((map = this.g) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.g.entrySet()) {
            ((androidx.navigation.a) entry.getValue()).d((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.g.entrySet()) {
                String str = (String) entry2.getKey();
                androidx.navigation.a aVar = (androidx.navigation.a) entry2.getValue();
                if (!aVar.e(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + aVar.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final int[] n(NavDestination navDestination) {
        kotlin.collections.c cVar = new kotlin.collections.c();
        while (true) {
            zq3.e(this);
            NavGraph navGraph = this.b;
            if ((navDestination != null ? navDestination.b : null) != null) {
                NavGraph navGraph2 = navDestination.b;
                zq3.e(navGraph2);
                if (navGraph2.J(this.h) == this) {
                    cVar.addFirst(this);
                    break;
                }
            }
            if (navGraph == null || navGraph.Q() != this.h) {
                cVar.addFirst(this);
            }
            if (zq3.c(navGraph, navDestination) || navGraph == null) {
                break;
            }
            this = navGraph;
        }
        List X0 = kotlin.collections.i.X0(cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.i.w(X0, 10));
        Iterator it2 = X0.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it2.next()).h));
        }
        return kotlin.collections.i.W0(arrayList);
    }

    public String p() {
        String str = this.c;
        return str == null ? String.valueOf(this.h) : str;
    }

    public final int q() {
        return this.h;
    }

    public final String t() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.i;
        if (str2 != null && !kotlin.text.h.d0(str2)) {
            sb.append(" route=");
            sb.append(this.i);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }

    public final NavGraph u() {
        return this.b;
    }

    public final String v() {
        return this.i;
    }

    public final boolean x(String str, Bundle bundle) {
        zq3.h(str, "route");
        if (zq3.c(this.i, str)) {
            return true;
        }
        a z = z(str);
        if (zq3.c(this, z != null ? z.b() : null)) {
            return z.d(bundle);
        }
        return false;
    }

    public a y(e eVar) {
        zq3.h(eVar, "navDeepLinkRequest");
        if (this.e.isEmpty()) {
            return null;
        }
        a aVar = null;
        for (NavDeepLink navDeepLink : this.e) {
            Uri c = eVar.c();
            Bundle o = c != null ? navDeepLink.o(c, this.g) : null;
            int h = navDeepLink.h(c);
            String a2 = eVar.a();
            boolean z = a2 != null && zq3.c(a2, navDeepLink.i());
            String b = eVar.b();
            int u = b != null ? navDeepLink.u(b) : -1;
            if (o == null) {
                if (z || u > -1) {
                    if (w(navDeepLink, c, this.g)) {
                    }
                }
            }
            a aVar2 = new a(this, o, navDeepLink.z(), h, z, u);
            if (aVar == null || aVar2.compareTo(aVar) > 0) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public final a z(String str) {
        zq3.h(str, "route");
        e.a.C0098a c0098a = e.a.d;
        Uri parse = Uri.parse(j.a(str));
        zq3.d(parse, "Uri.parse(this)");
        e a2 = c0098a.a(parse).a();
        return this instanceof NavGraph ? ((NavGraph) this).S(a2) : y(a2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator navigator) {
        this(k.b.a(navigator.getClass()));
        zq3.h(navigator, "navigator");
    }
}

package com.caverock.androidsvg;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
class CSSParser {
    private MediaType a;
    private Source b;
    private boolean c;

    private enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    private enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    private enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, PseudoClassIdents> cache = new HashMap();

        static {
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    cache.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = cache.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    enum Source {
        Document,
        RenderOptions
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            b = iArr;
            try {
                iArr[PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[AttribOp.values().length];
            a = iArr2;
            try {
                iArr2[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    private static class b {
        public final String a;
        final AttribOp b;
        public final String c;

        b(String str, AttribOp attribOp, String str2) {
            this.a = str;
            this.b = attribOp;
            this.c = str2;
        }
    }

    private static class c extends SVGParser.g {

        private static class a {
            public int a;
            public int b;

            a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        private a D() {
            com.caverock.androidsvg.a aVar;
            a aVar2;
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            int i2 = 1;
            if (g("odd")) {
                aVar2 = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar2 = new a(2, 0);
                } else {
                    int i3 = (!f('+') && f('-')) ? -1 : 1;
                    com.caverock.androidsvg.a c = com.caverock.androidsvg.a.c(this.a, this.b, this.c, false);
                    if (c != null) {
                        this.b = c.a();
                    }
                    if (f('n') || f('N')) {
                        if (c == null) {
                            c = new com.caverock.androidsvg.a(1L, this.b);
                        }
                        A();
                        boolean f = f('+');
                        if (!f && (f = f('-'))) {
                            i2 = -1;
                        }
                        if (f) {
                            A();
                            aVar = com.caverock.androidsvg.a.c(this.a, this.b, this.c, false);
                            if (aVar == null) {
                                this.b = i;
                                return null;
                            }
                            this.b = aVar.a();
                        } else {
                            aVar = null;
                        }
                        int i4 = i2;
                        i2 = i3;
                        i3 = i4;
                    } else {
                        aVar = c;
                        c = null;
                    }
                    aVar2 = new a(c == null ? 0 : i2 * c.d(), aVar != null ? i3 * aVar.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar2;
            }
            this.b = i;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String q = q();
            return q != null ? q : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String H = H();
                if (H == null) {
                    this.b = i;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.b = i;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            List L = L();
            if (L == null) {
                this.b = i;
                return null;
            }
            if (!f(')')) {
                this.b = i;
                return null;
            }
            Iterator it2 = L.iterator();
            while (it2.hasNext() && (list = ((o) it2.next()).a) != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext() && (list2 = ((p) it3.next()).d) != null) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (((d) it4.next()) instanceof g) {
                            return null;
                        }
                    }
                }
            }
            return L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            o oVar = new o(aVar);
            while (!h() && M(oVar)) {
                if (z()) {
                    arrayList.add(oVar);
                    oVar = new o(aVar);
                }
            }
            if (!oVar.f()) {
                arrayList.add(oVar);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void O(o oVar, p pVar) {
            d eVar;
            e eVar2;
            String H = H();
            if (H == null) {
                throw new CSSParseException("Invalid pseudo class");
            }
            PseudoClassIdents fromString = PseudoClassIdents.fromString(H);
            a aVar = null;
            switch (a.b[fromString.ordinal()]) {
                case 1:
                    eVar = new e(0, 1, true, false, null);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 2:
                    eVar = new e(0, 1, false, false, null);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 3:
                    eVar = new i(false, null);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 4:
                    eVar = new e(0, 1, true, true, pVar.b);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 5:
                    eVar = new e(0, 1, false, true, pVar.b);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 6:
                    eVar = new i(true, pVar.b);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 7:
                    eVar = new j(aVar);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 8:
                    eVar = new f(aVar);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = fromString == PseudoClassIdents.nth_child || fromString == PseudoClassIdents.nth_of_type;
                    boolean z2 = fromString == PseudoClassIdents.nth_of_type || fromString == PseudoClassIdents.nth_last_of_type;
                    a D = D();
                    if (D == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + H);
                    }
                    e eVar3 = new e(D.a, D.b, z, z2, pVar.b);
                    oVar.b();
                    eVar2 = eVar3;
                    eVar = eVar2;
                    pVar.b(eVar);
                    return;
                case 13:
                    List K = K();
                    if (K == null) {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + H);
                    }
                    g gVar = new g(K);
                    oVar.b = gVar.b();
                    eVar2 = gVar;
                    eVar = eVar2;
                    pVar.b(eVar);
                    return;
                case 14:
                    eVar = new k(aVar);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 15:
                    G();
                    eVar = new h(H);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    eVar = new h(H);
                    oVar.b();
                    pVar.b(eVar);
                    return;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + H);
            }
        }

        private int P() {
            int i;
            if (h()) {
                return this.b;
            }
            int i2 = this.b;
            int charAt = this.a.charAt(i2);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int a2 = a();
                while (true) {
                    if ((a2 < 65 || a2 > 90) && ((a2 < 97 || a2 > 122) && !((a2 >= 48 && a2 <= 57) || a2 == 45 || a2 == 95))) {
                        break;
                    }
                    a2 = a();
                }
                i = this.b;
            }
            this.b = i2;
            return i;
        }

        String F() {
            int C;
            if (h()) {
                return null;
            }
            char charAt = this.a.charAt(this.b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int intValue = l().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = l().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = l().intValue();
                        } else {
                            int C2 = C(intValue);
                            if (C2 != -1) {
                                for (int i = 1; i <= 5 && (C = C((intValue = l().intValue()))) != -1; i++) {
                                    C2 = (C2 * 16) + C;
                                }
                                sb.append((char) C2);
                            }
                        }
                    }
                }
                sb.append((char) intValue);
                intValue = l().intValue();
            }
            return sb.toString();
        }

        String H() {
            int P = P();
            int i = this.b;
            if (P == i) {
                return null;
            }
            String substring = this.a.substring(i, P);
            this.b = P;
            return substring;
        }

        String I() {
            char charAt;
            int C;
            StringBuilder sb = new StringBuilder();
            while (!h() && (charAt = this.a.charAt(this.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !k(charAt) && !Character.isISOControl((int) charAt)) {
                this.b++;
                if (charAt == '\\') {
                    if (!h()) {
                        String str = this.a;
                        int i = this.b;
                        this.b = i + 1;
                        charAt = str.charAt(i);
                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                            int C2 = C(charAt);
                            if (C2 != -1) {
                                for (int i2 = 1; i2 <= 5 && !h() && (C = C(this.a.charAt(this.b))) != -1; i2++) {
                                    this.b++;
                                    C2 = (C2 * 16) + C;
                                }
                                sb.append((char) C2);
                            }
                        }
                    }
                }
                sb.append(charAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int charAt = this.a.charAt(i);
            int i2 = i;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !j(charAt)) {
                if (!k(charAt)) {
                    i2 = this.b + 1;
                }
                charAt = a();
            }
            if (this.b > i) {
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean M(com.caverock.androidsvg.CSSParser.o r11) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.c.M(com.caverock.androidsvg.CSSParser$o):boolean");
        }

        String N() {
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!g("url(")) {
                return null;
            }
            A();
            String F = F();
            if (F == null) {
                F = I();
            }
            if (F == null) {
                this.b = i;
                return null;
            }
            A();
            if (h() || g(")")) {
                return F;
            }
            this.b = i;
            return null;
        }
    }

    private interface d {
        boolean a(m mVar, SVG.j0 j0Var);
    }

    private static class e implements d {
        private int a;
        private int b;
        private boolean c;
        private boolean d;
        private String e;

        e(int i, int i2, boolean z, boolean z2, String str) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            int i;
            int i2;
            String m = (this.d && this.e == null) ? j0Var.m() : this.e;
            SVG.h0 h0Var = j0Var.b;
            if (h0Var != null) {
                Iterator it2 = h0Var.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it2.hasNext()) {
                    SVG.j0 j0Var2 = (SVG.j0) ((SVG.l0) it2.next());
                    if (j0Var2 == j0Var) {
                        i = i2;
                    }
                    if (m == null || j0Var2.m().equals(m)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.c ? i + 1 : i2 - i;
            int i4 = this.a;
            if (i4 == 0) {
                return i3 == this.b;
            }
            int i5 = this.b;
            if ((i3 - i5) % i4 == 0) {
                return Integer.signum(i3 - i5) == 0 || Integer.signum(i3 - this.b) == Integer.signum(this.a);
            }
            return false;
        }

        public String toString() {
            String str = this.c ? "" : "last-";
            return this.d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.a), Integer.valueOf(this.b), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    private static class f implements d {
        private f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return !(j0Var instanceof SVG.h0) || ((SVG.h0) j0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static class g implements d {
        private List a;

        g(List list) {
            this.a = list;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                if (CSSParser.l(mVar, (o) it2.next(), j0Var)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it2 = this.a.iterator();
            int i = RecyclerView.UNDEFINED_DURATION;
            while (it2.hasNext()) {
                int i2 = ((o) it2.next()).b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        public String toString() {
            return "not(" + this.a + ")";
        }
    }

    private static class h implements d {
        private String a;

        h(String str) {
            this.a = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return false;
        }

        public String toString() {
            return this.a;
        }
    }

    private static class i implements d {
        private boolean a;
        private String b;

        public i(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            int i;
            String m = (this.a && this.b == null) ? j0Var.m() : this.b;
            SVG.h0 h0Var = j0Var.b;
            if (h0Var != null) {
                Iterator it2 = h0Var.getChildren().iterator();
                i = 0;
                while (it2.hasNext()) {
                    SVG.j0 j0Var2 = (SVG.j0) ((SVG.l0) it2.next());
                    if (m == null || j0Var2.m().equals(m)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            return this.a ? String.format("only-of-type <%s>", this.b) : String.format("only-child", new Object[0]);
        }
    }

    private static class j implements d {
        private j() {
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return j0Var.b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    private static class k implements d {
        private k() {
        }

        @Override // com.caverock.androidsvg.CSSParser.d
        public boolean a(m mVar, SVG.j0 j0Var) {
            return mVar != null && j0Var == mVar.a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static class l {
        o a;
        SVG.Style b;
        Source c;

        l(o oVar, SVG.Style style, Source source) {
            this.a = oVar;
            this.b = style;
            this.c = source;
        }

        public String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.c + ")";
        }
    }

    static class m {
        SVG.j0 a;

        m() {
        }

        public String toString() {
            SVG.j0 j0Var = this.a;
            return j0Var != null ? String.format("<%s id=\"%s\">", j0Var.m(), this.a.c) : "";
        }
    }

    static class n {
        private List a = null;

        n() {
        }

        void a(l lVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); i++) {
                if (((l) this.a.get(i)).a.b > lVar.a.b) {
                    this.a.add(i, lVar);
                    return;
                }
            }
            this.a.add(lVar);
        }

        void b(n nVar) {
            if (nVar.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(nVar.a.size());
            }
            Iterator it2 = nVar.a.iterator();
            while (it2.hasNext()) {
                a((l) it2.next());
            }
        }

        List c() {
            return this.a;
        }

        boolean d() {
            List list = this.a;
            return list == null || list.isEmpty();
        }

        void e(Source source) {
            List list = this.a;
            if (list == null) {
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((l) it2.next()).c == source) {
                    it2.remove();
                }
            }
        }

        int f() {
            List list = this.a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                sb.append(((l) it2.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    private static class p {
        Combinator a;
        String b;
        List c = null;
        List d = null;

        p(Combinator combinator, String str) {
            this.a = null;
            this.b = null;
            this.a = combinator == null ? Combinator.DESCENDANT : combinator;
            this.b = str;
        }

        void a(String str, AttribOp attribOp, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new b(str, attribOp, str2));
        }

        void b(d dVar) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(dVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = this.a;
            if (combinator == Combinator.CHILD) {
                sb.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<b> list = this.c;
            if (list != null) {
                for (b bVar : list) {
                    sb.append('[');
                    sb.append(bVar.a);
                    int i = a.a[bVar.b.ordinal()];
                    if (i == 1) {
                        sb.append('=');
                        sb.append(bVar.c);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(bVar.c);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(bVar.c);
                    }
                    sb.append(']');
                }
            }
            List<d> list2 = this.d;
            if (list2 != null) {
                for (d dVar : list2) {
                    sb.append(':');
                    sb.append(dVar);
                }
            }
            return sb.toString();
        }
    }

    CSSParser(Source source) {
        this(MediaType.screen, source);
    }

    private static int a(List list, int i2, SVG.j0 j0Var) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        Object obj = list.get(i2);
        SVG.h0 h0Var = j0Var.b;
        if (obj != h0Var) {
            return -1;
        }
        Iterator it2 = h0Var.getChildren().iterator();
        while (it2.hasNext()) {
            if (((SVG.l0) it2.next()) == j0Var) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    static boolean b(String str, MediaType mediaType) {
        c cVar = new c(str);
        cVar.A();
        return c(h(cVar), mediaType);
    }

    private static boolean c(List list, MediaType mediaType) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaType mediaType2 = (MediaType) it2.next();
            if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    private void e(n nVar, c cVar) {
        String H = cVar.H();
        cVar.A();
        if (H == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        if (!this.c && H.equals("media")) {
            List h2 = h(cVar);
            if (!cVar.f('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            cVar.A();
            if (c(h2, this.a)) {
                this.c = true;
                nVar.b(j(cVar));
                this.c = false;
            } else {
                j(cVar);
            }
            if (!cVar.h() && !cVar.f('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !H.equals("import")) {
            p("Ignoring @%s rule", H);
            o(cVar);
        } else {
            String N = cVar.N();
            if (N == null) {
                N = cVar.F();
            }
            if (N == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            cVar.A();
            h(cVar);
            if (!cVar.h() && !cVar.f(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
            SVG.k();
        }
        cVar.A();
    }

    public static List f(String str) {
        c cVar = new c(str);
        ArrayList arrayList = null;
        while (!cVar.h()) {
            String r = cVar.r();
            if (r != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r);
                cVar.A();
            }
        }
        return arrayList;
    }

    private SVG.Style g(c cVar) {
        SVG.Style style = new SVG.Style();
        do {
            String H = cVar.H();
            cVar.A();
            if (!cVar.f(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cVar.A();
            String J = cVar.J();
            if (J == null) {
                throw new CSSParseException("Expected property value");
            }
            cVar.A();
            if (cVar.f('!')) {
                cVar.A();
                if (!cVar.g("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                cVar.A();
            }
            cVar.f(';');
            SVGParser.S0(style, H, J);
            cVar.A();
            if (cVar.h()) {
                break;
            }
        } while (!cVar.f('}'));
        return style;
    }

    private static List h(c cVar) {
        String w;
        ArrayList arrayList = new ArrayList();
        while (!cVar.h() && (w = cVar.w()) != null) {
            try {
                arrayList.add(MediaType.valueOf(w));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(n nVar, c cVar) {
        List L = cVar.L();
        if (L == null || L.isEmpty()) {
            return false;
        }
        if (!cVar.f('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        cVar.A();
        SVG.Style g2 = g(cVar);
        cVar.A();
        Iterator it2 = L.iterator();
        while (it2.hasNext()) {
            nVar.a(new l((o) it2.next(), g2, this.b));
        }
        return true;
    }

    private n j(c cVar) {
        n nVar = new n();
        while (!cVar.h()) {
            try {
                if (!cVar.g("<!--") && !cVar.g("-->")) {
                    if (!cVar.f('@')) {
                        if (!i(nVar, cVar)) {
                            break;
                        }
                    } else {
                        e(nVar, cVar);
                    }
                }
            } catch (CSSParseException e2) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
            }
        }
        return nVar;
    }

    private static boolean k(m mVar, o oVar, int i2, List list, int i3, SVG.j0 j0Var) {
        p e2 = oVar.e(i2);
        if (!n(mVar, e2, list, i3, j0Var)) {
            return false;
        }
        Combinator combinator = e2.a;
        if (combinator == Combinator.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 >= 0) {
                if (m(mVar, oVar, i2 - 1, list, i3)) {
                    return true;
                }
                i3--;
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m(mVar, oVar, i2 - 1, list, i3);
        }
        int a2 = a(list, i3, j0Var);
        if (a2 <= 0) {
            return false;
        }
        return k(mVar, oVar, i2 - 1, list, i3, (SVG.j0) j0Var.b.getChildren().get(a2 - 1));
    }

    static boolean l(m mVar, o oVar, SVG.j0 j0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = j0Var.b; obj != null; obj = ((SVG.l0) obj).b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return oVar.g() == 1 ? n(mVar, oVar.e(0), arrayList, size, j0Var) : k(mVar, oVar, oVar.g() - 1, arrayList, size, j0Var);
    }

    private static boolean m(m mVar, o oVar, int i2, List list, int i3) {
        p e2 = oVar.e(i2);
        SVG.j0 j0Var = (SVG.j0) list.get(i3);
        if (!n(mVar, e2, list, i3, j0Var)) {
            return false;
        }
        Combinator combinator = e2.a;
        if (combinator == Combinator.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (m(mVar, oVar, i2 - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        }
        if (combinator == Combinator.CHILD) {
            return m(mVar, oVar, i2 - 1, list, i3 - 1);
        }
        int a2 = a(list, i3, j0Var);
        if (a2 <= 0) {
            return false;
        }
        return k(mVar, oVar, i2 - 1, list, i3, (SVG.j0) j0Var.b.getChildren().get(a2 - 1));
    }

    private static boolean n(m mVar, p pVar, List list, int i2, SVG.j0 j0Var) {
        List list2;
        String str = pVar.b;
        if (str != null && !str.equals(j0Var.m().toLowerCase(Locale.US))) {
            return false;
        }
        List<b> list3 = pVar.c;
        if (list3 != null) {
            for (b bVar : list3) {
                String str2 = bVar.a;
                str2.hashCode();
                if (str2.equals("id")) {
                    if (!bVar.c.equals(j0Var.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = j0Var.g) == null || !list2.contains(bVar.c)) {
                    return false;
                }
            }
        }
        List list4 = pVar.d;
        if (list4 == null) {
            return true;
        }
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            if (!((d) it2.next()).a(mVar, j0Var)) {
                return false;
            }
        }
        return true;
    }

    private void o(c cVar) {
        int i2 = 0;
        while (!cVar.h()) {
            int intValue = cVar.l().intValue();
            if (intValue == 59 && i2 == 0) {
                return;
            }
            if (intValue == 123) {
                i2++;
            } else if (intValue == 125 && i2 > 0 && i2 - 1 == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    n d(String str) {
        c cVar = new c(str);
        cVar.A();
        return j(cVar);
    }

    CSSParser(MediaType mediaType, Source source) {
        this.c = false;
        this.a = mediaType;
        this.b = source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class o {
        List a;
        int b;

        private o() {
            this.a = null;
            this.b = 0;
        }

        void a(p pVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(pVar);
        }

        void b() {
            this.b += NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        }

        void c() {
            this.b++;
        }

        void d() {
            this.b += 1000000;
        }

        p e(int i) {
            return (p) this.a.get(i);
        }

        boolean f() {
            List list = this.a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                sb.append((p) it2.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
            return sb.toString();
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }
}

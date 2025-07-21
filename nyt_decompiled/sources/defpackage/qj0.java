package defpackage;

/* loaded from: classes3.dex */
public abstract class qj0 implements i16 {

    static abstract class a extends qj0 {
        a() {
        }

        @Override // defpackage.i16
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    private static final class b extends a {
        private final char a;

        b(char c) {
            this.a = c;
        }

        @Override // defpackage.qj0
        public boolean e(char c) {
            return c == this.a;
        }

        public String toString() {
            String g = qj0.g(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(g);
            sb.append("')");
            return sb.toString();
        }
    }

    static abstract class c extends a {
        private final String a;

        c(String str) {
            this.a = (String) b16.k(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    private static final class d extends c {
        static final d b = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // defpackage.qj0
        public int c(CharSequence charSequence, int i) {
            b16.m(i, charSequence.length());
            return -1;
        }

        @Override // defpackage.qj0
        public boolean e(char c) {
            return false;
        }
    }

    protected qj0() {
    }

    public static qj0 d(char c2) {
        return new b(c2);
    }

    public static qj0 f() {
        return d.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        b16.m(i, length);
        while (i < length) {
            if (e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean e(char c2);
}

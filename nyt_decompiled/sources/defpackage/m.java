package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import kotlin.collections.i;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class m {
    private static final ByteString a;
    private static final ByteString b;
    private static final ByteString c;
    private static final ByteString d;
    private static final ByteString e;

    static {
        ByteString.a aVar = ByteString.c;
        a = aVar.d("/");
        b = aVar.d("\\");
        c = aVar.d("/\\");
        d = aVar.d(InstructionFileId.DOT);
        e = aVar.d("..");
    }

    public static final jp5 j(jp5 jp5Var, jp5 jp5Var2, boolean z) {
        zq3.h(jp5Var, "<this>");
        zq3.h(jp5Var2, "child");
        if (jp5Var2.e() || jp5Var2.q() != null) {
            return jp5Var2;
        }
        ByteString m = m(jp5Var);
        if (m == null && (m = m(jp5Var2)) == null) {
            m = s(jp5.c);
        }
        ad0 ad0Var = new ad0();
        ad0Var.m1(jp5Var.b());
        if (ad0Var.h1() > 0) {
            ad0Var.m1(m);
        }
        ad0Var.m1(jp5Var2.b());
        return q(ad0Var, z);
    }

    public static final jp5 k(String str, boolean z) {
        zq3.h(str, "<this>");
        return q(new ad0().V(str), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(jp5 jp5Var) {
        int w = ByteString.w(jp5Var.b(), a, 0, 2, null);
        return w != -1 ? w : ByteString.w(jp5Var.b(), b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString m(jp5 jp5Var) {
        ByteString b2 = jp5Var.b();
        ByteString byteString = a;
        if (ByteString.q(b2, byteString, 0, 2, null) != -1) {
            return byteString;
        }
        ByteString b3 = jp5Var.b();
        ByteString byteString2 = b;
        if (ByteString.q(b3, byteString2, 0, 2, null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(jp5 jp5Var) {
        return jp5Var.b().f(e) && (jp5Var.b().E() == 2 || jp5Var.b().y(jp5Var.b().E() + (-3), a, 0, 1) || jp5Var.b().y(jp5Var.b().E() + (-3), b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(jp5 jp5Var) {
        if (jp5Var.b().E() == 0) {
            return -1;
        }
        if (jp5Var.b().g(0) == 47) {
            return 1;
        }
        if (jp5Var.b().g(0) == 92) {
            if (jp5Var.b().E() <= 2 || jp5Var.b().g(1) != 92) {
                return 1;
            }
            int o = jp5Var.b().o(b, 2);
            return o == -1 ? jp5Var.b().E() : o;
        }
        if (jp5Var.b().E() > 2 && jp5Var.b().g(1) == 58 && jp5Var.b().g(2) == 92) {
            char g = (char) jp5Var.b().g(0);
            if ('a' <= g && g < '{') {
                return 3;
            }
            if ('A' <= g && g < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(ad0 ad0Var, ByteString byteString) {
        if (!zq3.c(byteString, b) || ad0Var.h1() < 2 || ad0Var.r(1L) != 58) {
            return false;
        }
        char r = (char) ad0Var.r(0L);
        return ('a' <= r && r < '{') || ('A' <= r && r < '[');
    }

    public static final jp5 q(ad0 ad0Var, boolean z) {
        ByteString byteString;
        ByteString u0;
        zq3.h(ad0Var, "<this>");
        ad0 ad0Var2 = new ad0();
        ByteString byteString2 = null;
        int i = 0;
        while (true) {
            if (!ad0Var.W(0L, a)) {
                byteString = b;
                if (!ad0Var.W(0L, byteString)) {
                    break;
                }
            }
            byte readByte = ad0Var.readByte();
            if (byteString2 == null) {
                byteString2 = r(readByte);
            }
            i++;
        }
        boolean z2 = i >= 2 && zq3.c(byteString2, byteString);
        if (z2) {
            zq3.e(byteString2);
            ad0Var2.m1(byteString2);
            ad0Var2.m1(byteString2);
        } else if (i > 0) {
            zq3.e(byteString2);
            ad0Var2.m1(byteString2);
        } else {
            long N = ad0Var.N(c);
            if (byteString2 == null) {
                byteString2 = N == -1 ? s(jp5.c) : r(ad0Var.r(N));
            }
            if (p(ad0Var, byteString2)) {
                if (N == 2) {
                    ad0Var2.write(ad0Var, 3L);
                } else {
                    ad0Var2.write(ad0Var, 2L);
                }
            }
        }
        boolean z3 = ad0Var2.h1() > 0;
        ArrayList arrayList = new ArrayList();
        while (!ad0Var.C0()) {
            long N2 = ad0Var.N(c);
            if (N2 == -1) {
                u0 = ad0Var.a1();
            } else {
                u0 = ad0Var.u0(N2);
                ad0Var.readByte();
            }
            ByteString byteString3 = e;
            if (zq3.c(u0, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || zq3.c(i.w0(arrayList), byteString3)))) {
                        arrayList.add(u0);
                    } else if (!z2 || arrayList.size() != 1) {
                        i.M(arrayList);
                    }
                }
            } else if (!zq3.c(u0, d) && !zq3.c(u0, ByteString.d)) {
                arrayList.add(u0);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                ad0Var2.m1(byteString2);
            }
            ad0Var2.m1((ByteString) arrayList.get(i2));
        }
        if (ad0Var2.h1() == 0) {
            ad0Var2.m1(d);
        }
        return new jp5(ad0Var2.a1());
    }

    private static final ByteString r(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString s(String str) {
        if (zq3.c(str, "/")) {
            return a;
        }
        if (zq3.c(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}

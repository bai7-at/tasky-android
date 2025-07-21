package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.common.base.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class ii7 {
    private static final b d = b.d(':');
    private static final b e = b.d('*');
    private final List a = new ArrayList();
    private int b = 0;
    private int c;

    private static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private void a(z72 z72Var, e06 e06Var) {
        yo5 yo5Var = new yo5(8);
        z72Var.readFully(yo5Var.e(), 0, 8);
        this.c = yo5Var.u() + 8;
        if (yo5Var.q() != 1397048916) {
            e06Var.a = 0L;
        } else {
            e06Var.a = z72Var.getPosition() - (this.c - 12);
            this.b = 2;
        }
    }

    private static int b(String str) {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(z72 z72Var, e06 e06Var) {
        long length = z72Var.getLength();
        int i = this.c - 20;
        yo5 yo5Var = new yo5(i);
        z72Var.readFully(yo5Var.e(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            yo5Var.V(2);
            short w = yo5Var.w();
            if (w == 2192 || w == 2816 || w == 2817 || w == 2819 || w == 2820) {
                this.a.add(new a(w, (length - this.c) - yo5Var.u(), yo5Var.u()));
            } else {
                yo5Var.V(8);
            }
        }
        if (this.a.isEmpty()) {
            e06Var.a = 0L;
        } else {
            this.b = 3;
            e06Var.a = ((a) this.a.get(0)).b;
        }
    }

    private void e(z72 z72Var, List list) {
        long position = z72Var.getPosition();
        int length = (int) ((z72Var.getLength() - z72Var.getPosition()) - this.c);
        yo5 yo5Var = new yo5(length);
        z72Var.readFully(yo5Var.e(), 0, length);
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = (a) this.a.get(i);
            yo5Var.U((int) (aVar.b - position));
            yo5Var.V(4);
            int u = yo5Var.u();
            int b = b(yo5Var.E(u));
            int i2 = aVar.c - (u + 8);
            if (b == 2192) {
                list.add(f(yo5Var, i2));
            } else if (b != 2816 && b != 2817 && b != 2819 && b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData f(yo5 yo5Var, int i) {
        ArrayList arrayList = new ArrayList();
        List f = e.f(yo5Var.E(i));
        for (int i2 = 0; i2 < f.size(); i2++) {
            List f2 = d.f((CharSequence) f.get(i2));
            if (f2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong((String) f2.get(0)), Long.parseLong((String) f2.get(1)), 1 << (Integer.parseInt((String) f2.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw ParserException.a(null, e2);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int c(z72 z72Var, e06 e06Var, List list) {
        int i = this.b;
        long j = 0;
        if (i == 0) {
            long length = z72Var.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            e06Var.a = j;
            this.b = 1;
        } else if (i == 1) {
            a(z72Var, e06Var);
        } else if (i == 2) {
            d(z72Var, e06Var);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            e(z72Var, list);
            e06Var.a = 0L;
        }
        return 1;
    }

    public void g() {
        this.a.clear();
        this.b = 0;
    }
}

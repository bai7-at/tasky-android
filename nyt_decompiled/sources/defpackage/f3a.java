package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahj;
import com.google.android.gms.internal.ads.zzcc;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class f3a {
    private static final dhe d = dhe.c(dge.b(':'));
    private static final dhe e = dhe.c(dge.b('*'));
    private final List a = new ArrayList();
    private int b = 0;
    private int c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(ov9 ov9Var, cx9 cx9Var, List list) {
        int i;
        char c;
        char c2;
        int i2 = this.b;
        if (i2 == 0) {
            long zzd = ov9Var.zzd();
            cx9Var.a = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.b = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long zzf = ov9Var.zzf();
                int zzd2 = (int) ((ov9Var.zzd() - ov9Var.zzf()) - this.c);
                b9e b9eVar = new b9e(zzd2);
                ov9Var.i(b9eVar.m(), 0, zzd2);
                for (int i4 = 0; i4 < this.a.size(); i4++) {
                    e3a e3aVar = (e3a) this.a.get(i4);
                    b9eVar.k((int) (e3aVar.a - zzf));
                    b9eVar.l(4);
                    int x = b9eVar.x();
                    Charset charset = ege.c;
                    String a = b9eVar.a(x, charset);
                    switch (a.hashCode()) {
                        case -1711564334:
                            if (a.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1332107749:
                            if (a.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1251387154:
                            if (a.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -830665521:
                            if (a.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1760745220:
                            if (a.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = 2819;
                    } else {
                        if (c != 4) {
                            throw zzcc.a("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = e3aVar.b - (x + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List f = e.f(b9eVar.a(i5, charset));
                        for (int i6 = 0; i6 < f.size(); i6++) {
                            List f2 = d.f((CharSequence) f.get(i6));
                            if (f2.size() != 3) {
                                throw zzcc.a(null, null);
                            }
                            try {
                                arrayList.add(new zzahi(Long.parseLong((String) f2.get(0)), Long.parseLong((String) f2.get(1)), 1 << (Integer.parseInt((String) f2.get(2)) - 1)));
                            } catch (NumberFormatException e2) {
                                throw zzcc.a(null, e2);
                            }
                        }
                        list.add(new zzahj(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                }
                cx9Var.a = 0L;
                return 1;
            }
            long zzd3 = ov9Var.zzd();
            int i7 = this.c - 20;
            b9e b9eVar2 = new b9e(i7);
            ov9Var.i(b9eVar2.m(), 0, i7);
            int i8 = 0;
            while (i8 < i7 / 12) {
                b9eVar2.l(i3);
                short c3 = b9eVar2.c();
                if (c3 == s3 || c3 == s2 || c3 == s || c3 == 2819 || c3 == 2820) {
                    i = i7;
                    this.a.add(new e3a(c3, (zzd3 - this.c) - b9eVar2.x(), b9eVar2.x()));
                } else {
                    b9eVar2.l(8);
                    i = i7;
                }
                i8++;
                i7 = i;
                i3 = 2;
                s = 2817;
                s2 = 2816;
                s3 = 2192;
            }
            if (this.a.isEmpty()) {
                cx9Var.a = 0L;
            } else {
                this.b = 3;
                cx9Var.a = ((e3a) this.a.get(0)).a;
            }
        } else {
            b9e b9eVar3 = new b9e(8);
            ov9Var.i(b9eVar3.m(), 0, 8);
            this.c = b9eVar3.x() + 8;
            if (b9eVar3.v() != 1397048916) {
                cx9Var.a = 0L;
            } else {
                cx9Var.a = ov9Var.zzf() - (this.c - 12);
                this.b = 2;
            }
        }
        return 1;
    }

    public final void b() {
        this.a.clear();
        this.b = 0;
    }
}

package defpackage;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class tk5 extends kotlin.collections.a implements RandomAccess {
    public static final a d = new a(null);
    private final ByteString[] b;
    private final int[] c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j, ad0 ad0Var, int i, List list, int i2, int i3, List list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            ad0 ad0Var2;
            int i8 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (((ByteString) list.get(i9)).E() < i8) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) list.get(i2);
            ByteString byteString2 = (ByteString) list.get(i3 - 1);
            int i10 = -1;
            if (i8 == byteString.E()) {
                int intValue = ((Number) list2.get(i2)).intValue();
                int i11 = i2 + 1;
                ByteString byteString3 = (ByteString) list.get(i11);
                i4 = i11;
                i5 = intValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.g(i8) == byteString2.g(i8)) {
                int min = Math.min(byteString.E(), byteString2.E());
                int i12 = 0;
                for (int i13 = i8; i13 < min && byteString.g(i13) == byteString2.g(i13); i13++) {
                    i12++;
                }
                long c = j + c(ad0Var) + 2 + i12 + 1;
                ad0Var.F(-i12);
                ad0Var.F(i5);
                int i14 = i12 + i8;
                while (i8 < i14) {
                    ad0Var.F(byteString.g(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i14 != ((ByteString) list.get(i4)).E()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ad0Var.F(((Number) list2.get(i4)).intValue());
                    return;
                } else {
                    ad0 ad0Var3 = new ad0();
                    ad0Var.F(((int) (c(ad0Var3) + c)) * (-1));
                    a(c, ad0Var3, i14, list, i4, i3, list2);
                    ad0Var.I0(ad0Var3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (((ByteString) list.get(i16 - 1)).g(i8) != ((ByteString) list.get(i16)).g(i8)) {
                    i15++;
                }
            }
            long c2 = j + c(ad0Var) + 2 + (i15 * 2);
            ad0Var.F(i15);
            ad0Var.F(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte g = ((ByteString) list.get(i17)).g(i8);
                if (i17 == i4 || g != ((ByteString) list.get(i17 - 1)).g(i8)) {
                    ad0Var.F(g & 255);
                }
            }
            ad0 ad0Var4 = new ad0();
            while (i4 < i3) {
                byte g2 = ((ByteString) list.get(i4)).g(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (g2 != ((ByteString) list.get(i19)).g(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == ((ByteString) list.get(i4)).E()) {
                    ad0Var.F(((Number) list2.get(i4)).intValue());
                    i7 = i6;
                    ad0Var2 = ad0Var4;
                } else {
                    ad0Var.F(((int) (c2 + c(ad0Var4))) * i10);
                    i7 = i6;
                    ad0Var2 = ad0Var4;
                    a(c2, ad0Var4, i8 + 1, list, i4, i6, list2);
                }
                ad0Var4 = ad0Var2;
                i4 = i7;
                i10 = -1;
            }
            ad0Var.I0(ad0Var4);
        }

        static /* synthetic */ void b(a aVar, long j, ad0 ad0Var, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.a((i4 & 1) != 0 ? 0L : j, ad0Var, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long c(ad0 ad0Var) {
            return ad0Var.h1() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final defpackage.tk5 d(okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tk5.a.d(okio.ByteString[]):tk5");
        }

        private a() {
        }
    }

    public /* synthetic */ tk5(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    public static final tk5 p(ByteString... byteStringArr) {
        return d.d(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.b.length;
    }

    public /* bridge */ boolean c(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return c((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ByteString get(int i) {
        return this.b[i];
    }

    public final ByteString[] g() {
        return this.b;
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return n((ByteString) obj);
        }
        return -1;
    }

    public final int[] j() {
        return this.c;
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return o((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int n(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public /* bridge */ int o(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    private tk5(ByteString[] byteStringArr, int[] iArr) {
        this.b = byteStringArr;
        this.c = iArr;
    }
}

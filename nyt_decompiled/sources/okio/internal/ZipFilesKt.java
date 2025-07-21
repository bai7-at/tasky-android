package okio.internal;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.cn9;
import defpackage.du8;
import defpackage.gt2;
import defpackage.jp5;
import defpackage.sd0;
import defpackage.tp0;
import defpackage.wm9;
import defpackage.ww8;
import defpackage.zq3;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.h;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public abstract class ZipFilesKt {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(((wm9) obj).b(), ((wm9) obj2).b());
        }
    }

    private static final Map b(List list) {
        jp5 e = jp5.a.e(jp5.b, "/", false, 1, null);
        Map n = t.n(du8.a(e, new wm9(e, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        Iterator it2 = i.N0(list, new a()).iterator();
        while (it2.hasNext()) {
            wm9 wm9Var = (wm9) it2.next();
            if (((wm9) n.put(wm9Var.b(), wm9Var)) == null) {
                while (true) {
                    jp5 i = wm9Var.b().i();
                    if (i != null) {
                        wm9 wm9Var2 = (wm9) n.get(i);
                        if (wm9Var2 != null) {
                            wm9Var2.c().add(wm9Var.b());
                            break;
                        }
                        wm9 wm9Var3 = new wm9(i, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        n.put(i, wm9Var3);
                        wm9Var3.c().add(wm9Var.b());
                        wm9Var = wm9Var3;
                        it2 = it2;
                    }
                }
            }
        }
        return n;
    }

    public static final Long c(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        return Long.valueOf(cn9.a(((i >> 9) & 127) + 1980, (i >> 5) & 15, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1));
    }

    public static final long d(long j) {
        return (j / Constants.MAXIMUM_UPLOAD_PARTS) - 11644473600000L;
    }

    private static final String e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i, kotlin.text.a.a(16));
        zq3.g(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:19:0x004e, B:21:0x005a, B:61:0x0109, B:67:0x00fd, B:79:0x010a, B:99:0x016a, B:106:0x0179, B:120:0x0165, B:10:0x017c, B:14:0x0188, B:15:0x018f, B:124:0x0190, B:125:0x0193, B:126:0x0194, B:127:0x01ae, B:116:0x015f, B:81:0x011b, B:84:0x0123, B:86:0x0133, B:88:0x013f, B:90:0x0146, B:93:0x014a, B:94:0x0151, B:96:0x0152, B:8:0x0038, B:18:0x0041, B:63:0x00f7), top: B:2:0x0019, inners: #1, #2, #10, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.xm9 f(defpackage.jp5 r18, defpackage.we2 r19, defpackage.ss2 r20) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipFilesKt.f(jp5, we2, ss2):xm9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final wm9 g(final sd0 sd0Var) {
        zq3.h(sd0Var, "<this>");
        int f1 = sd0Var.f1();
        if (f1 != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(f1));
        }
        sd0Var.skip(4L);
        short k0 = sd0Var.k0();
        int i = k0 & 65535;
        if ((k0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i));
        }
        int k02 = sd0Var.k0() & 65535;
        int k03 = sd0Var.k0() & 65535;
        int k04 = sd0Var.k0() & 65535;
        long f12 = sd0Var.f1() & 4294967295L;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = sd0Var.f1() & 4294967295L;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = sd0Var.f1() & 4294967295L;
        int k05 = sd0Var.k0() & 65535;
        int k06 = sd0Var.k0() & 65535;
        int k07 = sd0Var.k0() & 65535;
        sd0Var.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = sd0Var.f1() & 4294967295L;
        String s0 = sd0Var.s0(k05);
        if (h.O(s0, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = ref$LongRef2.element == 4294967295L ? 8 : 0L;
        if (ref$LongRef.element == 4294967295L) {
            j += 8;
        }
        if (ref$LongRef3.element == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        i(sd0Var, k06, new gt2() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(int i2, long j3) {
                if (i2 != 1) {
                    if (i2 != 10) {
                        return;
                    }
                    if (j3 < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    sd0Var.skip(4L);
                    final sd0 sd0Var2 = sd0Var;
                    final Ref$ObjectRef<Long> ref$ObjectRef4 = ref$ObjectRef;
                    final Ref$ObjectRef<Long> ref$ObjectRef5 = ref$ObjectRef2;
                    final Ref$ObjectRef<Long> ref$ObjectRef6 = ref$ObjectRef3;
                    ZipFilesKt.i(sd0Var2, (int) (j3 - 4), new gt2() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.Long] */
                        public final void b(int i3, long j4) {
                            if (i3 == 1) {
                                Ref$ObjectRef<Long> ref$ObjectRef7 = Ref$ObjectRef.this;
                                if (ref$ObjectRef7.element != null) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                }
                                if (j4 != 24) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                }
                                ref$ObjectRef7.element = Long.valueOf(sd0Var2.l0());
                                ref$ObjectRef5.element = Long.valueOf(sd0Var2.l0());
                                ref$ObjectRef6.element = Long.valueOf(sd0Var2.l0());
                            }
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            b(((Number) obj).intValue(), ((Number) obj2).longValue());
                            return ww8.a;
                        }
                    });
                    return;
                }
                Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                if (ref$BooleanRef2.element) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                ref$BooleanRef2.element = true;
                if (j3 < j2) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                Ref$LongRef ref$LongRef4 = ref$LongRef2;
                long j4 = ref$LongRef4.element;
                if (j4 == 4294967295L) {
                    j4 = sd0Var.l0();
                }
                ref$LongRef4.element = j4;
                Ref$LongRef ref$LongRef5 = ref$LongRef;
                ref$LongRef5.element = ref$LongRef5.element == 4294967295L ? sd0Var.l0() : 0L;
                Ref$LongRef ref$LongRef6 = ref$LongRef3;
                ref$LongRef6.element = ref$LongRef6.element == 4294967295L ? sd0Var.l0() : 0L;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).intValue(), ((Number) obj2).longValue());
                return ww8.a;
            }
        });
        if (j2 <= 0 || ref$BooleanRef.element) {
            return new wm9(jp5.a.e(jp5.b, "/", false, 1, null).l(s0), h.v(s0, "/", false, 2, null), sd0Var.s0(k07), f12, ref$LongRef.element, ref$LongRef2.element, k02, ref$LongRef3.element, k04, k03, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, (Long) ref$ObjectRef3.element, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final okio.internal.a h(sd0 sd0Var) {
        int k0 = sd0Var.k0() & 65535;
        int k02 = sd0Var.k0() & 65535;
        long k03 = sd0Var.k0() & 65535;
        if (k03 != (sd0Var.k0() & 65535) || k0 != 0 || k02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        sd0Var.skip(4L);
        return new okio.internal.a(k03, 4294967295L & sd0Var.f1(), sd0Var.k0() & 65535);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sd0 sd0Var, int i, gt2 gt2Var) {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int k0 = sd0Var.k0() & 65535;
            long k02 = sd0Var.k0() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < k02) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            sd0Var.o0(k02);
            long h1 = sd0Var.g().h1();
            gt2Var.invoke(Integer.valueOf(k0), Long.valueOf(k02));
            long h12 = (sd0Var.g().h1() + k02) - h1;
            if (h12 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + k0);
            }
            if (h12 > 0) {
                sd0Var.g().skip(h12);
            }
            j = j2 - k02;
        }
    }

    public static final wm9 j(sd0 sd0Var, wm9 wm9Var) {
        zq3.h(sd0Var, "<this>");
        zq3.h(wm9Var, "centralDirectoryZipEntry");
        wm9 k = k(sd0Var, wm9Var);
        zq3.e(k);
        return k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final wm9 k(final sd0 sd0Var, wm9 wm9Var) {
        int f1 = sd0Var.f1();
        if (f1 != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(f1));
        }
        sd0Var.skip(2L);
        short k0 = sd0Var.k0();
        int i = k0 & 65535;
        if ((k0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i));
        }
        sd0Var.skip(18L);
        long k02 = sd0Var.k0() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int k03 = sd0Var.k0() & 65535;
        sd0Var.skip(k02);
        if (wm9Var == null) {
            sd0Var.skip(k03);
            return null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        i(sd0Var, k03, new gt2() { // from class: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r10v9, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
            public final void b(int i2, long j) {
                if (i2 == 21589) {
                    if (j < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte readByte = sd0.this.readByte();
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    sd0 sd0Var2 = sd0.this;
                    long j2 = z ? 5L : 1L;
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j < j2) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        ref$ObjectRef.element = Integer.valueOf(sd0Var2.f1());
                    }
                    if (z2) {
                        ref$ObjectRef2.element = Integer.valueOf(sd0.this.f1());
                    }
                    if (z3) {
                        ref$ObjectRef3.element = Integer.valueOf(sd0.this.f1());
                    }
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).intValue(), ((Number) obj2).longValue());
                return ww8.a;
            }
        });
        return wm9Var.a((Integer) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (Integer) ref$ObjectRef3.element);
    }

    private static final okio.internal.a l(sd0 sd0Var, okio.internal.a aVar) {
        sd0Var.skip(12L);
        int f1 = sd0Var.f1();
        int f12 = sd0Var.f1();
        long l0 = sd0Var.l0();
        if (l0 != sd0Var.l0() || f1 != 0 || f12 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        sd0Var.skip(8L);
        return new okio.internal.a(l0, sd0Var.l0(), aVar.b());
    }

    public static final void m(sd0 sd0Var) {
        zq3.h(sd0Var, "<this>");
        k(sd0Var, null);
    }
}

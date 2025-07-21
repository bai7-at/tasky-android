package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
final class i1g implements r8g, kzf {
    private final Uri b;
    private final c6f c;
    private final c1g d;
    private final sv9 e;
    private final jfd f;
    private volatile boolean h;
    private long j;
    private tx9 l;
    private boolean m;
    final /* synthetic */ p1g n;
    private final cx9 g = new cx9();
    private boolean i = true;
    private final long a = mzf.a();
    private u1f k = g(0);

    public i1g(p1g p1gVar, Uri uri, kye kyeVar, c1g c1gVar, sv9 sv9Var, jfd jfdVar) {
        this.n = p1gVar;
        this.b = uri;
        this.c = new c6f(kyeVar);
        this.d = c1gVar;
        this.e = sv9Var;
        this.f = jfdVar;
    }

    static /* bridge */ /* synthetic */ void f(i1g i1gVar, long j, long j2) {
        i1gVar.g.a = j;
        i1gVar.j = j2;
        i1gVar.i = true;
        i1gVar.m = false;
    }

    private final u1f g(long j) {
        i0f i0fVar = new i0f();
        i0fVar.d(this.b);
        i0fVar.c(j);
        i0fVar.a(6);
        i0fVar.b(p1g.l0);
        return i0fVar.e();
    }

    @Override // defpackage.kzf
    public final void b(b9e b9eVar) {
        long max = !this.m ? this.j : Math.max(p1g.M(this.n, true), this.j);
        int q = b9eVar.q();
        tx9 tx9Var = this.l;
        tx9Var.getClass();
        kx9.b(tx9Var, b9eVar, q);
        tx9Var.c(max, 1, q, 0, null);
        this.m = true;
    }

    @Override // defpackage.r8g
    public final void zzg() {
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec A[EDGE_INSN: B:102:0x01ec->B:80:0x01ec BREAK  A[LOOP:1: B:61:0x01a9->B:72:0x01a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189 A[Catch: all -> 0x018f, TryCatch #8 {all -> 0x018f, blocks: (B:51:0x017e, B:53:0x0189, B:54:0x0193, B:56:0x0197), top: B:50:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #8 {all -> 0x018f, blocks: (B:51:0x017e, B:53:0x0189, B:54:0x0193, B:56:0x0197), top: B:50:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:0: B:2:0x0004->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212  */
    @Override // defpackage.r8g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i1g.zzh():void");
    }
}

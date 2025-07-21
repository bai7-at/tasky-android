package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ls7;
import defpackage.qm8;
import defpackage.ts4;
import defpackage.xo5;
import defpackage.yo5;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class a extends ls7 {
    private final yo5 a = new yo5();
    private final xo5 b = new xo5();
    private qm8 c;

    @Override // defpackage.ls7
    protected Metadata b(ts4 ts4Var, ByteBuffer byteBuffer) {
        qm8 qm8Var = this.c;
        if (qm8Var == null || ts4Var.i != qm8Var.e()) {
            qm8 qm8Var2 = new qm8(ts4Var.e);
            this.c = qm8Var2;
            qm8Var2.a(ts4Var.e - ts4Var.i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.S(array, limit);
        this.b.o(array, limit);
        this.b.r(39);
        long h = (this.b.h(1) << 32) | this.b.h(32);
        this.b.r(20);
        int h2 = this.b.h(12);
        int h3 = this.b.h(8);
        this.a.V(14);
        Metadata.Entry a = h3 != 0 ? h3 != 255 ? h3 != 4 ? h3 != 5 ? h3 != 6 ? null : TimeSignalCommand.a(this.a, h, this.c) : SpliceInsertCommand.a(this.a, h, this.c) : SpliceScheduleCommand.a(this.a) : PrivateCommand.a(this.a, h2, h) : new SpliceNullCommand();
        return a == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(a);
    }
}

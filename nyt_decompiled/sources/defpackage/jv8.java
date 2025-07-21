package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class jv8 extends o26 {
    private byte[] a;
    private int b;

    public /* synthetic */ jv8(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // defpackage.o26
    public /* bridge */ /* synthetic */ Object a() {
        return iv8.a(f());
    }

    @Override // defpackage.o26
    public void b(int i) {
        if (iv8.t(this.a) < i) {
            byte[] bArr = this.a;
            byte[] copyOf = Arrays.copyOf(bArr, uo6.d(i, iv8.t(bArr) * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = iv8.f(copyOf);
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(byte b) {
        o26.c(this, 0, 1, null);
        byte[] bArr = this.a;
        int d = d();
        this.b = d + 1;
        iv8.x(bArr, d, b);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return iv8.f(copyOf);
    }

    private jv8(byte[] bArr) {
        zq3.h(bArr, "bufferWithData");
        this.a = bArr;
        this.b = iv8.t(bArr);
        b(10);
    }
}

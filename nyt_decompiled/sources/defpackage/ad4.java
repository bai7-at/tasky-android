package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;

/* loaded from: classes.dex */
public class ad4 {
    private final String[] a = new String[5];
    private final long[] b = new long[5];
    private int c = 0;
    private int d = 0;

    public void a(String str) {
        int i = this.c;
        if (i == 5) {
            this.d++;
            return;
        }
        this.a[i] = str;
        this.b[i] = System.nanoTime();
        xo8.a(str);
        this.c++;
    }

    public float b(String str) {
        int i = this.d;
        if (i > 0) {
            this.d = i - 1;
            return 0.0f;
        }
        int i2 = this.c - 1;
        this.c = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.a[i2])) {
            xo8.b();
            return (System.nanoTime() - this.b[this.c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.a[this.c] + InstructionFileId.DOT);
    }
}

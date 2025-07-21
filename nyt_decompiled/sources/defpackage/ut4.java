package defpackage;

/* loaded from: classes3.dex */
public class ut4 implements f08 {
    private final int a;
    private final f08[] b;
    private final vt4 c;

    public ut4(int i, f08... f08VarArr) {
        this.a = i;
        this.b = f08VarArr;
        this.c = new vt4(i);
    }

    @Override // defpackage.f08
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (f08 f08Var : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = f08Var.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}

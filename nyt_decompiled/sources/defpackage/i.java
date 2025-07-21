package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class i {
    public static final void a(we2 we2Var, jp5 jp5Var) {
        if (we2Var.j(jp5Var)) {
            return;
        }
        s.d(we2Var.o(jp5Var));
    }

    public static final void b(we2 we2Var, jp5 jp5Var) {
        try {
            IOException iOException = null;
            for (jp5 jp5Var2 : we2Var.k(jp5Var)) {
                try {
                    if (we2Var.l(jp5Var2).e()) {
                        b(we2Var, jp5Var2);
                    }
                    we2Var.h(jp5Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}

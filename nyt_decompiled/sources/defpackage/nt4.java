package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes5.dex */
public class nt4 {
    private final Object a = new Object();
    private final Object b = new Object();
    private final List c = new ArrayList();
    private final Map d;
    private final lm3 e;

    private nt4(lm3 lm3Var, List list) {
        this.e = lm3Var;
        this.d = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new Function() { // from class: mt4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                rt4 c;
                c = nt4.c((yu6) obj);
                return c;
            }
        }));
    }

    public static nt4 b(lm3 lm3Var, List list) {
        return new nt4(lm3Var, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rt4 c(yu6 yu6Var) {
        return new rt4();
    }
}

package defpackage;

import com.nytimes.android.external.store3.util.ParserException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ox4 implements ew3 {
    private final List a = new ArrayList();

    public ox4(List list) {
        e16.e(list, "Parsers can't be null.");
        e16.b(!list.isEmpty(), "Parsers can't be empty.");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            e16.e((ew3) it2.next(), "Parser can't be null.");
        }
        this.a.addAll(list);
    }

    private ParserException a() {
        return new ParserException("One of the provided parsers has a wrong typing. Make sure that parsers are passed in a correct order and the fromTypes match each other.");
    }

    @Override // defpackage.ew3, io.reactivex.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            try {
                obj2 = ((ew3) it2.next()).apply(obj, obj2);
            } catch (ClassCastException unused) {
                throw a();
            }
        }
        return obj2;
    }
}

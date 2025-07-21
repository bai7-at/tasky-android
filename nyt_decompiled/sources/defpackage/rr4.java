package defpackage;

import com.nytimes.android.api.config.model.TextChunk;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import com.nytimes.android.unfear.nytdesignsystem.model.StyledText;
import defpackage.tq4;
import defpackage.ur4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class rr4 {
    private static final MessageProperties b(ur4 ur4Var) {
        String a = ur4Var.a();
        List<ur4.a> b = ur4Var.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(b, 10)), 16));
        for (ur4.a aVar : b) {
            Pair a2 = du8.a(aVar.a(), aVar.b());
            linkedHashMap.put(a2.c(), a2.d());
        }
        return new MessageProperties(a, linkedHashMap);
    }

    private static final StyledText c(tq4.c cVar) {
        return s29.d(new TextChunk(cVar.b(), cVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message d(tq4 tq4Var, String str, String str2, String str3) {
        ur4 a;
        ur4 a2;
        ur4 a3;
        int l = tq4Var.l();
        tq4.f j = tq4Var.j();
        MessageProperties b = (j == null || (a3 = j.a()) == null) ? null : b(a3);
        int d = tq4Var.d();
        MessageProperties b2 = b(tq4Var.i().a());
        tq4.a a4 = tq4Var.a();
        MessageProperties b3 = (a4 == null || (a2 = a4.a()) == null) ? null : b(a2);
        Boolean e = tq4Var.e();
        boolean booleanValue = e != null ? e.booleanValue() : false;
        List c = tq4Var.c();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c.iterator();
        while (it2.hasNext()) {
            StyledText c2 = c((tq4.c) it2.next());
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        String g = tq4Var.g();
        tq4.d h = tq4Var.h();
        return new Message((String) null, str2, str, l, str3, b2, b, d, b3, booleanValue, arrayList, g, (h == null || (a = h.a()) == null) ? null : b(a), tq4Var.b().b(), tq4Var.b().a(), 1, (DefaultConstructorMarker) null);
    }
}

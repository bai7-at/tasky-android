package defpackage;

import com.nytimes.android.media.audio.podcast.Episode;
import com.nytimes.android.utils.TimeDuration;
import defpackage.g22;
import defpackage.h22;
import defpackage.lw5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.TemporalAccessor;

/* loaded from: classes4.dex */
public final class p22 {
    private final DateTimeFormatter a;

    public p22(DateTimeFormatter dateTimeFormatter) {
        zq3.h(dateTimeFormatter, "dateTimeFormatter");
        this.a = dateTimeFormatter;
    }

    private final List a(lw5.b bVar) {
        lw5.f a;
        List c;
        lw5.e a2 = bVar.a();
        if (a2 != null && (a = a2.a()) != null && (c = a.c()) != null) {
            List list = c;
            ArrayList arrayList = new ArrayList(i.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(mb8.b((lw5.h) it2.next()));
            }
            List X0 = i.X0(arrayList);
            if (X0 != null) {
                return X0;
            }
        }
        return i.l();
    }

    private final Pair b(g22.c cVar) {
        String b = cVar.b();
        g22.b a = cVar.a();
        zq3.e(a);
        Object k0 = i.k0(a.a().a());
        zq3.e(k0);
        Object k02 = i.k0(((h22.a) k0).a());
        zq3.e(k02);
        return du8.a(b, f((h22.b) k02));
    }

    private final String c(Instant instant) {
        if (instant != null) {
            return LocalDate.from((TemporalAccessor) instant.atOffset(ZoneOffset.UTC)).format(this.a);
        }
        return null;
    }

    private final Episode d(g22 g22Var, List list) {
        g22.c f = g22Var != null ? g22Var.f() : null;
        zq3.e(f);
        Pair b = b(f);
        String str = (String) b.a();
        d31 d31Var = (d31) b.b();
        g22.a c = g22Var.c();
        zq3.e(c);
        return new Episode(c.a(), g22Var.g(), c(g22Var.b()), g22Var.a(), d31Var.b(), str, new TimeDuration(g22Var.e(), TimeUnit.SECONDS), list);
    }

    private final d31 f(h22.b bVar) {
        return new d31(bVar.b(), bVar.c());
    }

    public final List e(lw5.b bVar) {
        lw5.d a;
        zq3.h(bVar, "query");
        List a2 = a(bVar);
        lw5.e a3 = bVar.a();
        zq3.e(a3);
        lw5.f a4 = a3.a();
        zq3.e(a4);
        lw5.g b = a4.b();
        zq3.e(b);
        List a5 = b.a();
        zq3.e(a5);
        List<lw5.c> list = a5;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (lw5.c cVar : list) {
            arrayList.add(d((cVar == null || (a = cVar.a()) == null) ? null : a.a(), a2));
        }
        return arrayList;
    }
}

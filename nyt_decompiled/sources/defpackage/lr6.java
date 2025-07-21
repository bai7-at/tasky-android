package defpackage;

import com.facebook.AuthenticationTokenClaims;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class lr6 {
    private final aw6[] a;

    public lr6(aw6... aw6VarArr) {
        zq3.h(aw6VarArr, "providers");
        this.a = aw6VarArr;
    }

    public final boolean a(String str) {
        Object obj;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        aw6[] aw6VarArr = this.a;
        ArrayList arrayList = new ArrayList(aw6VarArr.length);
        for (aw6 aw6Var : aw6VarArr) {
            arrayList.add(aw6Var.a(str));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Boolean) obj) != null) {
                break;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Number b(String str) {
        Object obj;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        aw6[] aw6VarArr = this.a;
        ArrayList arrayList = new ArrayList(aw6VarArr.length);
        for (aw6 aw6Var : aw6VarArr) {
            arrayList.add(aw6Var.c(str));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Number) obj) != null) {
                break;
            }
        }
        Number number = (Number) obj;
        if (number == null) {
            return 0;
        }
        return number;
    }

    public final String c(String str) {
        Object obj;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        aw6[] aw6VarArr = this.a;
        ArrayList arrayList = new ArrayList(aw6VarArr.length);
        for (aw6 aw6Var : aw6VarArr) {
            arrayList.add(aw6Var.d(str));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((String) obj) != null) {
                break;
            }
        }
        String str2 = (String) obj;
        return str2 == null ? "" : str2;
    }

    public final void d() {
        aw6[] aw6VarArr = this.a;
        ArrayList arrayList = new ArrayList(aw6VarArr.length);
        for (aw6 aw6Var : aw6VarArr) {
            arrayList.add(aw6Var.b());
        }
        Completable.concat(arrayList).subscribeOn(Schedulers.io()).onErrorComplete().subscribe();
    }

    public final void e(Action action) {
        zq3.h(action, "action");
        aw6[] aw6VarArr = this.a;
        ArrayList arrayList = new ArrayList(aw6VarArr.length);
        for (aw6 aw6Var : aw6VarArr) {
            arrayList.add(aw6Var.b());
        }
        Completable.concat(arrayList).subscribeOn(Schedulers.io()).onErrorComplete().subscribe(action);
    }
}

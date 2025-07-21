package co.datadome.sdk;

import android.app.Application;
import android.content.Context;
import defpackage.ao9;
import defpackage.bo9;
import defpackage.en9;
import defpackage.in9;
import defpackage.nn9;
import defpackage.on9;
import defpackage.pn9;
import defpackage.qn9;
import defpackage.tn9;
import defpackage.xn9;
import defpackage.zn9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
class m extends k {
    private final DataDomeSDKListener a;
    private final WeakReference b;
    private final j c;
    private final a d;

    protected enum a {
        OKHTTP,
        MANUAL
    }

    m(DataDomeSDKListener dataDomeSDKListener, WeakReference weakReference, j jVar, a aVar) {
        this.b = weakReference;
        this.a = dataDomeSDKListener;
        this.c = jVar;
        this.d = aVar;
    }

    RequestBody a() {
        String obj;
        List singletonList;
        String stringOrEmpty = DataDomeUtils.stringOrEmpty(this.c.d);
        String stringOrEmpty2 = DataDomeUtils.stringOrEmpty(this.c.f);
        if (this.c.e == null) {
            obj = "[]";
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.c.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(((DataDomeEvent) it2.next()).customJsonString());
            }
            obj = arrayList.toString();
        }
        FormBody.Builder add = new FormBody.Builder().add("cid", this.c.a).add("ddk", this.c.b).add("request", stringOrEmpty).add("ua", stringOrEmpty2).add("events", obj).add("inte", this.d == a.MANUAL ? "android-java-manual" : "android-java-okhttp");
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            DataDomeSDKListener dataDomeSDKListener = this.a;
            if (dataDomeSDKListener != null) {
                dataDomeSDKListener.onError(504, "Empty application context.");
            }
        } else {
            Context applicationContext = ((Application) this.b.get()).getApplicationContext();
            if (qn9.b.b(e.ADVANCED_SIGNALS_COLLECTION)) {
                singletonList = new ArrayList(Arrays.asList(new nn9(applicationContext), new tn9(), new pn9(applicationContext), new xn9(applicationContext), new ao9(applicationContext), new en9(applicationContext, this.c.c), new zn9()));
                singletonList.add(new in9(applicationContext));
            } else {
                singletonList = Collections.singletonList(new on9(applicationContext, this.c.c));
            }
            Iterator it3 = singletonList.iterator();
            while (it3.hasNext()) {
                for (Map.Entry entry : ((bo9) it3.next()).a().entrySet()) {
                    add.add((String) entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return add.build();
    }
}

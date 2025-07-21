package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class BreadcrumbsJsonAdapter extends JsonAdapter<Breadcrumbs> {
    private volatile Constructor<Breadcrumbs> constructorRef;
    private final JsonAdapter<List<RnActionBreadcrumb>> nullableListOfRnActionBreadcrumbAdapter;
    private final JsonReader.b options;

    public BreadcrumbsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("rna");
        zq3.g(a, "JsonReader.Options.of(\"rna\")");
        this.options = a;
        JsonAdapter<List<RnActionBreadcrumb>> f = iVar.f(j.j(List.class, RnActionBreadcrumb.class), b0.e(), "rnActionBreadcrumbs");
        zq3.g(f, "moshi.adapter(Types.newP…), \"rnActionBreadcrumbs\")");
        this.nullableListOfRnActionBreadcrumbAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Breadcrumbs");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Breadcrumbs fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfRnActionBreadcrumbAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            return new Breadcrumbs(list);
        }
        Constructor<Breadcrumbs> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Breadcrumbs.class.getDeclaredConstructor(List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "Breadcrumbs::class.java.…his.constructorRef = it }");
        }
        Breadcrumbs newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Breadcrumbs breadcrumbs) {
        zq3.h(hVar, "writer");
        if (breadcrumbs == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("rna");
        this.nullableListOfRnActionBreadcrumbAdapter.mo197toJson(hVar, breadcrumbs.getRnActionBreadcrumbs());
        hVar.l();
    }
}

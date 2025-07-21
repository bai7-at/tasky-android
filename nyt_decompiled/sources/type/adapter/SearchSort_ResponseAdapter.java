package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.SearchSort;

/* loaded from: classes5.dex */
public final class SearchSort_ResponseAdapter implements h8 {
    public static final SearchSort_ResponseAdapter INSTANCE = new SearchSort_ResponseAdapter();

    private SearchSort_ResponseAdapter() {
    }

    @Override // defpackage.h8
    public SearchSort fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return SearchSort.Companion.safeValueOf(nextString);
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SearchSort searchSort) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(searchSort, "value");
        lu3Var.value(searchSort.getRawValue());
    }
}

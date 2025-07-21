package zendesk.support;

import com.google.gson.annotations.SerializedName;
import defpackage.mn0;
import java.util.List;

/* loaded from: classes5.dex */
class HelpResponse {
    private List<CategoryItem> categories;

    @SerializedName("category_count")
    private int categoryCount;

    HelpResponse() {
    }

    public List<CategoryItem> getCategories() {
        return mn0.b(this.categories);
    }

    public int getCategoryCount() {
        return this.categoryCount;
    }
}
